package fr.istic.m1ccn.caos.api;

import com.sun.jersey.spi.resource.Singleton;
import fr.istic.m1ccn.caos.dao.DAOManager;
import fr.istic.m1ccn.caos.models.Candidature;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ines Beugre
 */

@Singleton
@Path("/candidature")
@Produces ({MediaType.APPLICATION_JSON}) /*format de données*/
@Consumes ({MediaType.APPLICATION_JSON})

    public class CandidatureManager { //

    @DELETE
    @Path("{idSessionUV}")
    public String deleteCandidature (@PathParam("idSessionUV") String idSessionUV ){
       //on recupère le DAOManager du candidature
        DAOManager.getInstance().getCandidatureDAO().delete(idSessionUV);
        //verifier que l'utilisateur est connecté
        return "";
    }



}
