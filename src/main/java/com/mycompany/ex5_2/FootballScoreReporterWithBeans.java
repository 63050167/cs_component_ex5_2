package com.mycompany.ex5_2;

import java.util.Scanner;

public class FootballScoreReporterWithBeans {
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        liveScoreBean.addPropertyChangeListener(subscriber1);
        liveScoreBean.addPropertyChangeListener(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            liveScoreBean.setScoreLine("live result: " + input);
        }

        scanner.close();
    }
}

