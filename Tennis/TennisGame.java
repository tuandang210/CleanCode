package Tennis;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
        boolean isScore1EqualsScore2 = m_score1 == m_score2;
        if (isScore1EqualsScore2)
        {
            score = getString(m_score1);
        }
        else {
            boolean isScoreMoreThan4 = m_score1 >= 4 || m_score2 >= 4;
            if (isScoreMoreThan4)
            {
                int minusResult = m_score1-m_score2;
                score = getScore1(minusResult);
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = m_score1;
                    else { score+="-"; tempScore = m_score2;}
                    score = getScore(score, tempScore);
                }
            }
        }
        return score;
    }

    private static String getScore1(int minusResult) {
        String score;
        if (minusResult ==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult >=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getScore(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score += LOVE;
                break;
            case 1:
                score += FIFTEEN;
                break;
            case 2:
                score += THIRTY;
                break;
            case 3:
                score += FORTY;
                break;
        }
        return score;
    }

    private static String getString(int m_score1) {
        String score;
        switch (m_score1)
        {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
        return score;
    }
}
