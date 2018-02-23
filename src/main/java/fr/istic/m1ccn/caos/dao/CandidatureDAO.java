package fr.istic.m1ccn.caos.dao;

import fr.istic.m1ccn.caos.models.Candidature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ines Beugre
 *
 * contient toutes les methodes qui seront utlisées par la manager
 */
public class CandidatureDAO extends DAO{

    private DAOManager daoManager;

    public CandidatureDAO( DAOManager daoManager){
        this.daoManager = daoManager;
    }

    public Candidature create (Candidature cand){
        String query = "INSERT INTO candidature ";
        return cand;
    }

    public Candidature find (String idAgent){ // =read
        Candidature cand =  null;
        /*paramètre de connection à la base de données*/
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM candidature WHERE idagent=? ";

        /*connection à la base de données*/
        try{
            /* Récupération d'une connexion depuis la Factory */
            connexion = this.daoManager.getConnection();
            preparedStatement = initialisationRequetePreparee( connexion, query, false, idAgent );
            resultSet = (ResultSet) preparedStatement.executeQuery();

            /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
            while( resultSet.next() ) {
                cand = map(resultSet);
            }
        }//end try
        catch ( SQLException e ) {
        }
        finally{

        }
        return cand ;
    }

    public void uptdate (Candidature candidature){

        /*paramètre de connection à la base de données*/
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        /*Requete de mise à jour*/
        String query = "UPDATE candidature SET idAgent=?, idSession=?, statut=?, qualite=?, position=? WHERE id=?"; //doit correspondre aux champs dans la bdd

        /*connection à la base de données*/
        try{
            /* Récupération d'une connexion depuis la Factory */
            connexion = this.daoManager.getConnection();
            preparedStatement = initialisationRequetePreparee( connexion, query, false, candidature.getIdAgent(), candidature.getIdSession(), candidature.getStatut(), candidature.getQualite(), candidature.getPosition(), candidature.getId());
            resultSet = (ResultSet) preparedStatement.executeQuery();

        }//end try
        catch ( SQLException e ) {
            e.printStackTrace();
        }
        finally{
            try {
                connexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(String idSessionUV) { //variable a envoyer
    }

         //utile convertion outils Sting (from BDD) to Java object
         private static Candidature map( ResultSet resultSet ) throws SQLException {
             Candidature cand = new Candidature();
            cand.setIdAgent( resultSet.getString( "idagent" ) );
            cand.setIdSession(resultSet.getString("idsession"));
            cand.setStatut(resultSet.getString("statut"));
            cand.setQualite(resultSet.getString("qualite"));
            cand.setPosition(resultSet.getInt("qosition")); //tel que dans la base de donnee

            return cand;
        }


}
