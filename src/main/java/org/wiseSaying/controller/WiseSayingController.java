package org.wiseSaying.controller;

import org.project.Container;
import org.project.Rq;
import org.wiseSaying.service.WiseSayingService;

public class WiseSayingController {

    WiseSayingService wiseSayingService = new WiseSayingService();


    public WiseSayingController() {
    }

    public void add() {
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine().trim();
        System.out.print("인물 : ");
        String person = Container.getScanner().nextLine().trim();

        int id = wiseSayingService.add(content, person);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
    }

    public void list() {
        wiseSayingService.list();
    }

    public void delete(Rq rq) {
        wiseSayingService.delete(rq);
    }

    public void modify(Rq rq) {
        wiseSayingService.modify(rq);

    }
}


