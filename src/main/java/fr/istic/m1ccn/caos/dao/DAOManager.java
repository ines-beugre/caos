package fr.istic.m1ccn.caos.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import fr.istic.m1ccn.caos.exceptions.DAOConfigurationException;
import org.omg.CORBA.portable.InputStream;

public class DAOManager {

	private String url;
	private String username; 
	private String password;
	static DAOManager instance ;
	
	private static final String FICHIER_PROPERTIES       = "dao.properties";
    private static final String PROPERTY_URL             = "url";
    private static final String PROPERTY_DRIVER          = "driver";
    private static final String PROPERTY_NOM_UTILISATEUR = "username";
    private static final String PROPERTY_MOT_DE_PASSE    = "password";
	
	
	DAOManager(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	// connexion a la base de données 
	Connection getConnection() throws  SQLException {
		return DriverManager.getConnection(url, username,password);
	}
	// 
	public static DAOManager getInstance() throws DAOConfigurationException {
        Properties properties = new Properties();
        String url;
        String driver;
        String username;
        String password;

        if(instance == null) {
        	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream fichierProperties = (InputStream) classLoader.getResourceAsStream( FICHIER_PROPERTIES );

            if ( fichierProperties == null ) {
                throw new DAOConfigurationException( "Le fichier properties " + FICHIER_PROPERTIES + " est introuvable." );
            }

            try {
                properties.load( fichierProperties );
                url = properties.getProperty( PROPERTY_URL );
                driver = properties.getProperty( PROPERTY_DRIVER );
                username = properties.getProperty( PROPERTY_NOM_UTILISATEUR );
                password = properties.getProperty( PROPERTY_MOT_DE_PASSE );
            } catch ( IOException e ) {
                throw new DAOConfigurationException( "Impossible de charger le fichier properties " + FICHIER_PROPERTIES, e );
            }

            try {
                Class.forName( driver );
            } catch ( ClassNotFoundException e ) {
                throw new DAOConfigurationException( "Le driver est introuvable dans le classpath.", e );
            }

            DAOManager instance = new DAOManager(url, username, password);
        }
       
        return instance;
    }

	public CandidatureDAO getCandidatureDAO(){return new CandidatureDAO(this);}


	
}

