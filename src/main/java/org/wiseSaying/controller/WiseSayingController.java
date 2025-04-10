package org.wiseSaying.controller;
import org.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private Scanner sc;

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }

    List<WiseSaying> wiseSayingList = new ArrayList<>();
    int lastId = 1;

    public void add(){
        System.out.print("명언 : ");
        String content = sc.nextLine().trim();
        System.out.print("인물 : ");
        String person = sc.nextLine().trim();
        System.out.printf("%d번 명언이 등록되었습니다.\n",lastId);

        WiseSaying temp = new WiseSaying(lastId, content, person);
        wiseSayingList.add(temp);

        lastId++;
    }
    public void list(){
        if(wiseSayingList.size() == 0){
            System.out.println("등록된 명언이 없습니다.");
        }
        else{
            System.out.println("번호 / 인물 / 명언");
            System.out.println("=".repeat(30));
            for (int i = wiseSayingList.size()-1; i>=0; i--){
                WiseSaying temp = wiseSayingList.get(i);
                System.out.printf("%d      %s     %s\n", temp.getId(),temp.getName(),temp.getContent());
            }
        }
    }
}
