package sn.simplon.apitranfargent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.simplon.apitranfargent.entities.Emetteur;

@Repository
public interface IEmetteur extends JpaRepository<Emetteur, Integer> {
}
