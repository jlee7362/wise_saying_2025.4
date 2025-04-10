package org.project;

import org.system.controller.SystemController;
import org.wiseSaying.controller.WiseSayingController;

public class App {

    App() {}

    public void run() {

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        System.out.println("== Motivation 앱 실행 ==");

        while (true) {
            // 좌우 공백 제거: trim()
            System.out.print("명령어) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("add")) {
                wiseSayingController.add();
            } else if (cmd.equals("list")) {
                wiseSayingController.list();
            } else if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else {
                System.out.println("존대하지 않는 명령어입니다.");
            }
        }
    }
}
