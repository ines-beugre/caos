package fr.istic.m1ccn.caos.models;

/**
 * @author Ines Beugre
 *
 * Session definition
 */
public class Session {

    private String idSession;
    private String intituleSession;
    private TypeUV typeUV;
    private List <String> dates;

    public Session (String idSession, String intituleSession, TypeUV typeUV, List <String> dates){
        this.idSession = idSession;
        this.intituleSession = intituleSession;
        this.typeUV = typeUV;
        this.dates = dates;
    }

    public String getIdSession(){
        return this.idSession;
    }

    public void setIdSession(String idSession){
        this.idSession = idSession;
    }

    public String getIntituleSession(){
        return intituleSession;
    }

    public void setIntituleSession(String intituleSession){
        this.intituleSession = intituleSession;
    }

    public TypeUV getTypeUV(){
        return this.typeUV;
    }

    public void setTypeUV(TypeUV typeUV){
        this.typeUV = typeUV;
    }

    public List<String> getDate(){
        return this.dates;
    }

    public void setDate(List <String> dates){
        this.dates = dates;
    }
}
