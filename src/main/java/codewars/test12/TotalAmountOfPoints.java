package codewars.test12;

public class TotalAmountOfPoints {
    public static void main(String[] args) {

    }

    public static int points(String[] games) {
        int result = 0;
        for (String match : games) {
            String mat[] = match.split(":");
            int res1 = Integer.parseInt(mat[0]);
            int res2 = Integer.parseInt(mat[1]);
            if (res1 > res2) result += 3;
            else if (res1 == res2) result += 1;
        }
        return result;
    }
}
