package hangman.model;

public class BonusScore implements GameScore {

    public int CalculateScore(int CorrectCount, int IncorrectCount) throws GameScoreException{
        return 100;
    }
    
}
