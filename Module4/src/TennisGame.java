public class TennisGame {
    public static final int Zero = 0;
    public static final int Fifteen = 1;
    public static final int Thirty = 2;
    public static final int Forty = 3;
    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";
        int tempScore =0;
        if (player1_score==player2_score)
        {
            switch (player1_score)
            {
                case Zero:
                    score = "Zero-All";
                    break;
                case Fifteen:
                    score = "Fifteen-All";
                    break;
                case Thirty:
                    score = "Thirty-All";
                    break;
                case Forty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1_score>=4 || player2_score>=4)
        {
            int ResultMath =player1_score-player2_score;
            if ( ResultMath==1) score ="Advantage player1";
            else if (ResultMath ==-1) score ="Advantage player2";
            else if (ResultMath >=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1_score;
                else { score+="-"; tempScore = player2_score;}
                switch(tempScore)
                {

                    case 0:
                        score+="Zero";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
