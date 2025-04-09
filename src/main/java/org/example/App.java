package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== Motivation 앱 실행 ==");
        int lastId = 1;
        int listCount = 0;
        List<WiseSaying> wiseSayingList = new ArrayList<>();


        while (true){
            // 좌우 공백 제거: trim()
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("add")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("인물 : ");
                String person = sc.nextLine().trim();
                System.out.printf("%d번 명언이 등록되었습니다.\n",lastId);

                WiseSaying temp = new WiseSaying(lastId, content, person);
                wiseSayingList.add(temp);
                lastId++;
                listCount++;

            }
            else if (cmd.equals("list")){
                if(lastId == 0)
                    System.out.println("등록된 명언이 없습니다.");
                else{
                    System.out.printf("등록된 명언이 %d개 있습니다.\n",listCount);
                }
            }
            else if (cmd.equals("exit")){
                System.out.println("== Motivation 앱 종료==");
                break;
            }
            else{
                System.out.println("존대하지 않는 명령어입니다.");
            }
        }
    }
}
