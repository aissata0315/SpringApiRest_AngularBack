package sn.simplon.apitranfargent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.simplon.apitranfargent.entities.Envoi;

@Repository
public interface IEnvoi extends JpaRepository<Envoi, Integer> {

    @Query("Select e from Envoi e where e.id = :id")
    public Envoi getById(@Param("id") int id);
}
