package codingame.easy.test3;

// https://www.codingame.com/ide/puzzle/the-lost-child-episode-1

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now().plusDays(20);
        LocalDate end = LocalDate.now().plusDays(1);
        System.out.println("Today Date = "+ today);
        System.out.println("Date Fin = "+ end);

        if(end.isBefore(today))
            System.out.println("YES !!! It is before.");

    }
}
