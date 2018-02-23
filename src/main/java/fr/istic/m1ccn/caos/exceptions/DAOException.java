package fr.istic.m1ccn.caos.exceptions;

/**
 * @author Ines Beugre
 */
public class DAOException extends RuntimeException {
    /**
     * Constructeur
     */

    public DAOException (String message){
        super(message);
    }

    public DAOException(String message, Throwable cause){
        super(message, cause);
    }

    public DAOException (Throwable cause){
        super(cause);

    }
}
