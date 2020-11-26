package sn.simplon.apitranfargent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.simplon.apitranfargent.dao.IRecepteur;
import sn.simplon.apitranfargent.entities.Recepteur;

@SpringBootApplication
public class ApitranfargentApplication implements CommandLineRunner  {

    @Autowired
    private IRecepteur recepteurdao;

    public static void main(String[] args) {
        SpringApplication.run(ApitranfargentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Recepteur recepteur = new Recepteur();
        recepteur.setNom("Sagna");
        recepteur.setPrenom("Judith");
        recepteur.setTelephone("701452023");

        //recepteurdao.save(recepteur);
        recepteurdao.findAll().forEach(r-> System.out.println(r.getPrenom()));

    }
}
