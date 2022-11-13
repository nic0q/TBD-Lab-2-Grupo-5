package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.Institution;

import java.util.List;

/**
 * Clase que implementa la interfaz InstitutionRepository.
 */
@Repository
public class InstitutionRepositoryImp implements InstitutionRepository {

    @Autowired
    private Sql2o sql2o;

    /** 
     * Método que retorna una lista de todas las instituciones
     * @return List<Institution>
     */
    @Override
    public List<Institution> getAllInstitutions(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Institution\"").
                    executeAndFetch(Institution.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un id y busca una institucion en base a ese id, en caso de que
     * no exista retorna null.
     * @param id
     * @return List<Institution>
     */
    @Override
    public List<Institution> getInstitutionById(int id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Institution\" WHERE id_institution = :id")
                    .addParameter("id",id)
                    .executeAndFetch(Institution.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Métoodo que recibe una institution como objeto y lo inserta en la base de datos,
     * agregando los atributos name y name_coordinator. Si la operación es exitosa retorna
     * el objeto de tipo Institution que se insertó, de lo contrario retorna null.
     * @param institution
     * @return Institution
     */
    @Override
    public Institution createInstitution(Institution institution){
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Institution\" (name, name_coordinator)" +
                    "values (:name, :name_coordinator)")
                    .addParameter("name", institution.getName())
                    .addParameter("name_coordinator", institution.getName_coordinator())
                    .executeUpdate().getKey();
            return institution;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Métoodo que recibe una institution como objeto y lo actualiza en la base de datos,
     * modifica lso atributos name y name_coordinator. Si la operación es exitosa retorna
     * true, de lo contrario retorna false.
     * @param institution
     * @return boolean
     */
    @Override
    public boolean editInstitution(Institution institution){
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Institution\" SET name = :name, name_coordinator = :name_coordinator WHERE id_institution = :id_institution")
                    .addParameter("name", institution.getName())
                    .addParameter("name_coordinator", institution.getName_coordinator())
                    .addParameter("id_institution", institution.getId_institution())
                    .executeUpdate();
            return true;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /** 
     * Método que recibe un id y elimina una institucion en base a ese id, si la operacion tiene
     * exito retorna true y en caso de que no exista retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteInstitution(int id){
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Institution\" WHERE id_institution = :id")
                    .addParameter("id",id)
                    .executeUpdate();
            return true;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
    /** 
     * Método que elimina todas las instituciones de la base de datos.
     * @return int
     */
    @Override
    public int deleteAllInstitution(){
        try(Connection conn = sql2o.open()) {
            conn.createQuery("TRUNCATE \"Institution\" CASCADE")
                    .executeUpdate();
            return 1;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
