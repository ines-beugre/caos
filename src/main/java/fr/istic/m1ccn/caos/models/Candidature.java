package fr.istic.m1ccn.caos.models;

/**
 * @author Ines Beugre
 *
 * candidature definition
 */
public class Candidature {

    private Integer id;
    private String idAgent;
    private String idSession;
    private String statut;
    private String qualite;
    private int position;

    public Candidature(String idAgent, String idSession, String statut, String qualite, int position) {
        super();
        this.idAgent = idAgent;
        this.idSession = idSession;
        this.statut = statut;
        this.qualite = qualite;
        this.position = position;
    }

    public Candidature() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(String idAgent) {
        this.idAgent = idAgent;
    }

    public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
