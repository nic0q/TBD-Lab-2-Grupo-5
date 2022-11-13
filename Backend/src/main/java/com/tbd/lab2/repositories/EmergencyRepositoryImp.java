package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.Emergency;

import java.util.List;

/**
 * Clase que implementa la interfaz EmergencyRepository.
 */
@Repository
public class EmergencyRepositoryImp implements EmergencyRepository {

    @Autowired
    private Sql2o sql2o;


    /**
     * Método que retorna una lista de todas las emergencias
     * @return List<Emergency>
     */
    @Override
    public List<Emergency> getAllEmergencies(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT em.id_emergency, em.name, em.id_institution, ST_X(ST_Transform(em.ubication_emergency, 4326)) AS longitud, ST_Y(ST_Transform(em.ubication_emergency, 4326)) AS latitud, em.status FROM \"Emergency\" AS em").
                    executeAndFetch(Emergency.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    /**
     * Método que recibe un id y busca una emergencia especifica. Si la emergencia
     * existe entonces la retorna, de lo contrario retorna null.
     * @param id
     * @return List<Emergency>
     */
    @Override
    public List<Emergency> getEmergencyById(int id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT em.id_emergency, em.name, em.id_institution, ST_X(ST_Transform(em.ubication_emergency, 4326)) AS longitud, ST_Y(ST_Transform(em.ubication_emergency, 4326)) AS latitud, em.status FROM \"Emergency\" AS em WHERE em.id_emergency = :id")
                    .addParameter("id",id)
                    .executeAndFetch(Emergency.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }



    /**
     * Método que recibe un objeto de tipo Emergency y lo inserta en la base de datos.
     * Luego agrega los atributos especificados en la tabla de la base de datos. Retorna
     * el objeto de tipo Emergency que se insertó. Si no se pudo insertar retorna null.
     * @param emergency
     * @return Emergency
     */
    @Override

    public Emergency createEmergency(Emergency emergency){
        String coordenadas = emergency.getLongitud().toString() + " " + emergency.getLatitud().toString();
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Emergency\" (id_emergency, name, id_institution, status, ubication_emergency)" +
                            "values (:id_emergency, :emergencyName, :emergencyInstitution, :emergencyStatus,  ST_GeomFromText(POINT(" + coordenadas + ") , 4326 ))")
                    .addParameter("id_emergency", emergency.getId_emergency())
                    .addParameter("emergencyName", emergency.getName())
                    .addParameter("emergencyInstitution", emergency.getId_institution())
                    .addParameter("emergencyStatus", emergency.getStatus())
                    .executeUpdate().getKey();
            return emergency;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    /**
     * Método que recibe un objeto de tipo Emergency y lo actualiza en la base de datos.
     * Modifica los atributos especificados en la tabla de la base de datos. Retorna
     * true si se pudo actualizar, de lo contrario retorna false.
     * @param emergency
     * @return boolean
     */
    @Override
    public boolean editEmergency(Emergency emergency){
        try(Connection conn = sql2o.open()){
            String coordenadas = emergency.getLongitud().toString() + " " + emergency.getLatitud().toString();
            conn.createQuery("UPDATE \"Emergency\" SET name = :emergencyName, id_institution = :emergencyInstitution, status = :emergencyStatus," +
                            "ubication_emergency = ST_GeomFromText(POINT(" + coordenadas + ") , 4326 ) WHERE id_emergency = :emergencyId")
                    .addParameter("emergencyName", emergency.getName())
                    .addParameter("emergencyInstitution", emergency.getId_institution())
                    .addParameter("emergencyStatus", emergency.getStatus())
                    .addParameter("emergencyId", emergency.getId_emergency())
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


    /**
     * Método que recibe un id y elimina una emergencia especifica. Si la emergencia
     * existe entonces la elimina, de lo contrario retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteEmergency(int id){
        int deletedEmergency;
        try(Connection conn = sql2o.open()){
            deletedEmergency = conn.createQuery("DELETE FROM \"Emergency\" WHERE id_emergency = :id")
                    .addParameter("id", id)
                    .executeUpdate().getResult();
        }
        return deletedEmergency == 1;
    }


    /**
     * Método que elimina todas las emergencias de la base de datos.
     * Retorna 1 si se pudo eliminar, de lo contrario retorna 0.
     * @return int
     */
    @Override
    public int deleteAllEmergency(){
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Emergency\"")
                    .executeUpdate();
            return 1;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }


    /**
     * Método que obtiene todas las emergencias por id de región.
     * Retorna una lista con las emergencias.
     * @param id
     * @return list
     */
    @Override
    public List<Emergency> obtieneEmergenciasPorRegion(Integer id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT em.id_emergency, em.name, em.id_institution, ST_X(ST_Transform(em.ubication_emergency, 4326)) AS longitud, ST_Y(ST_Transform(em.ubication_emergency, 4326)) AS latitud, em.status FROM \"Emergency\" AS em INNER JOIN \"Region\" AS r ON ST_WITHIN(em.ubication_emergency, ST_SetSRID(r.geom,4326)) WHERE r.gid = :id;")
                    .addParameter("id",id)
                    .executeAndFetch(Emergency.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
