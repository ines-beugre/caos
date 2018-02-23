package fr.istic.m1ccn.caos.api;

import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Ines Beugre
 */

@Singleton
@Path("/produits")
@Produces ({MediaType.APPLICATION_JSON}) /*format de données*/
@Consumes ({MediaType.APPLICATION_JSON})

public class SessionManager {
    



}
