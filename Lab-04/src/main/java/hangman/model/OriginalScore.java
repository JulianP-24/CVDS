package hangman.model;

public class OriginalScore implements GameScore{
    /**
     * @pre Se inicia con 100 puntos, puntaje minimo 0
     * @pos Se penaliza con 10 puntos por cada letra incorrecta
     * @param CorrectCount numero de letras correctas
     * @param IncorrectCount numero de letras incorrectas
     * @return score
     */
    public int CalculateScore(int CorrectCount, int IncorrectCount) throws GameScoreException{
        int score =100;
        if(CorrectCount < 0 || IncorrectCount < 0) {throw new GameScoreException(GameScoreException.INVALID_PARAMETERS);}
        if(IncorrectCount>10){
            score = 0;
        }
        if(0 <= IncorrectCount && IncorrectCount <= 10){
            score-=IncorrectCount*10;

        }
        return score;
    }


    
}
