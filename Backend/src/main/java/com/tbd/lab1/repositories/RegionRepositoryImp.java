package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class RegionRepositoryImp implements RegionRepository {
    @Autowired
    private Sql2o sql2o;

    /**
     * Método que cuenta la cantidad de regiones en la base de datos
     * @return int
     */
    @Override
    public List<Region> getAllRegions() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Region\"")
                    .executeAndFetch(Region.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que obtiene una región por su id
     * @param gid
     * @return List<Region>
     */
    @Override
    public List<Region> getRegionById(int gid) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Region\" WHERE gid = :gid")
                    .addParameter("gid", gid)
                    .executeAndFetch(Region.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que crea una región en la base de datos
     * @param region
     * @return Region
     */
    @Override
    public Region createRegion(Region region) {
        try(Connection conn = sql2o.open()){
            int insertedId = (int) conn.createQuery("INSERT INTO \"Region\" (nom_reg, geom) VALUES (:nom_reg, :geom)", true)
                    .addParameter("name", region.getNom_reg())
                    .addParameter("description", region.getGeom())
                    .executeUpdate()
                    .getKey();
            region.setGid(insertedId);
            return region;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que edita una región en la base de datos
     * @param region
     * @return boolean
     */
    @Override
    public boolean editRegion(Region region) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Region\" SET nom_reg = :nom_reg, geom = :geom WHERE gid = :gid")
                    .addParameter("gid", region.getGid())
                    .addParameter("nom_reg", region.getNom_reg())
                    .addParameter("geom", region.getGeom())
                    .executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Método que elimina una región en la base de datos
     * @param gid
     * @return boolean
     */
    @Override
    public boolean deleteRegion(int gid) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Region\" WHERE gid = :gid")
                    .addParameter("gid", gid)
                    .executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Método que cuenta la cantidad de regiones en la base de datos
     * @return int
     */
    @Override
    public int deleteAllRegion() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("DELETE FROM \"Region\"").executeUpdate().getResult();
        }
        return total;
    }

}
