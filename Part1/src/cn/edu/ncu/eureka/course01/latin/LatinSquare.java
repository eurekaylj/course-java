package cn.edu.ncu.eureka.course01.latin;

public class LatinSquare {
    public static void main(String[] args){

    }

    public String[][][] generateLatin(int n){
        if (n<=0) return null;
        String[][][] cards = new String[n][n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n;j++){
                cards[i][j][0] = switch ((i+j)%n+1) {
                    case 1->"A";
                    case 11->"J";
                    case 12->"Q";
                    case 13->"K";
                    default ->String.valueOf((i+j)%n+1);
                };
                cards[i][j][1] = switch ((i+j)%4) {
                    case 0->"♣";
                    case 1->"♠";
                    case 2->"♥";
                    case 3->"♦";
                    default -> " ";
                };
            }
        }
        return cards;
    }
}
