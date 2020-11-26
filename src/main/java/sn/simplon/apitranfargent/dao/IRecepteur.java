package sn.simplon.apitranfargent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.simplon.apitranfargent.entities.Recepteur;

@Repository
public interface IRecepteur extends JpaRepository<Recepteur, Integer> {
}
