package hangman.model;

public class GameScoreException extends Exception {
    public static final String INVALID_PARAMETERS = "Los parametros son invalidos";
    public GameScoreException(String mensaje){
        super(mensaje);
    }
}
