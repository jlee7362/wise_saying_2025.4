package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== Motivation 앱 실행 ==");

        // 좌우 공백 제거: trim()
        System.out.print("명령어 : ");
        String cmd = sc.nextLine().trim();
        

        if (cmd.equals("exit")){
            System.out.println("== Motivation 앱 종료==");
        }

    }
}
