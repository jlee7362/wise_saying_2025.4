package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner sc;
    private int lastId = 0;


    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== Motivation 앱 실행 ==");

        while (true){
            lastId++;
            // 좌우 공백 제거: trim()
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("add")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("인물 : ");
                String name = sc.nextLine().trim();
                System.out.println(lastId+"번 명언이 등록되었습니다.");
            }




            if (cmd.equals("exit")){
                System.out.println("== Motivation 앱 종료==");
                break;
            }

        }

    }
    private void add_cmd(String cmd, String name){
        lastId++;

        System.out.println(1+"번 명언이 등록되었습니다.");
    }
}
