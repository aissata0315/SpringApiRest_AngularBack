package sn.simplon.apitranfargent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.simplon.apitranfargent.dao.IEmetteur;
import sn.simplon.apitranfargent.dao.IEnvoi;
import sn.simplon.apitranfargent.dao.IRecepteur;
import sn.simplon.apitranfargent.entities.Emetteur;
import sn.simplon.apitranfargent.entities.Envoi;
import sn.simplon.apitranfargent.entities.Recepteur;

import java.util.List;

@RestController
public class TransactionService {
    @Autowired
    private IEmetteur emetteurdao;
    @Autowired
    private IRecepteur recepteurdao;
    @Autowired
    private IEnvoi envoidao;

    @RequestMapping(value = "/emetteur/save",method = RequestMethod.POST)
    public List<Emetteur> save(Emetteur emetteur){
        emetteurdao.save(emetteur);
        return emetteurdao.findAll();
    }

    @RequestMapping(value = "/recepteur/save",method = RequestMethod.POST)
    public List<Recepteur> save(Recepteur recepteur){
        recepteurdao.save(recepteur);
        return recepteurdao.findAll();
    }

    @RequestMapping(value = "/envoi/save",method = RequestMethod.POST)
    public List<Envoi> save(Envoi envoi){
        envoidao.save(envoi);
        return envoidao.findAll();
    }

    @RequestMapping(value = "/envoi/delete/{id}",method = RequestMethod.DELETE)
    public List<Envoi> delete(@PathVariable int id){
        if (envoidao.getById(id) != null){
            envoidao.delete(envoidao.getById(id));
        }
        return envoidao.findAll();
    }

    @RequestMapping(value = "/emetteurs",method = RequestMethod.GET)
    public List<Emetteur> getAllEmetteur(){
        return emetteurdao.findAll();

    }

    @RequestMapping(value = "/recepteurs",method = RequestMethod.GET)
    public List<Recepteur> getAllRecepteur() {
        return recepteurdao.findAll();
    }

    @RequestMapping(value = "/envois",method = RequestMethod.GET)
    public List<Envoi> getAllEnvoi() {
        return envoidao.findAll();
    }
}
