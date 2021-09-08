package hangman.model;

public class BonusScore implements GameScore {
        /**
     * @pre Inicia con 0 puntos, puntaje minimo 0
     * @pos Se bonifica con 10 puntos cada letra correcta, se penaliza con -5 puntos letra incorrecta
     * @param CorrectCount numero de filas
     * @param IncorrectCount numero de columnas
     * @return Score
     */

    public int CalculateScore(int CorrectCount, int IncorrectCount) throws GameScoreException{
        if(CorrectCount < 0 || IncorrectCount < 0) {throw new GameScoreException(GameScoreException.INVALID_PARAMETERS);}
        int score = 0;
        if(IncorrectCount <= CorrectCount * 2 ){ 
            score = (CorrectCount*10)-(IncorrectCount*5);
        }
        if(CorrectCount*2 < IncorrectCount){
            score = 0;
        }
        return score;
    }
    
}
