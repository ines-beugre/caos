package fr.istic.m1ccn.caos.models;
/**
 * @author Ines Beugre
 */
public class Agent {

    private String name;
    private String login;
    private String password;

    public Agent (String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public Agent (String name, String login){
        this.name = name;
        this.login = login;
    }

    public Agent (String name){
        this.name = name;
    }

    public Agent(){

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
