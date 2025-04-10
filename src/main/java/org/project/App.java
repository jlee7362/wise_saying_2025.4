package org.project;

import org.system.controller.SystemController;
import org.wiseSaying.controller.WiseSayingController;
import org.wiseSaying.entity.WiseSaying;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

    App() {
    }

    public void run() {

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        System.out.println("== Motivation 앱 실행 ==");

        while (true) {
            // 좌우 공백 제거: trim()
            System.out.print("명령어) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.startsWith("delete")) {
                // parsing start
                String[] cmdBits = cmd.split("\\?", 2);
//                 for (String i : cmdBits){
//                     System.out.println(i);
//                 }
                String actionCode = cmdBits[0];

                Map<String, String> params = new HashMap<>();

                String[] paramBits = cmdBits[1].split("=", 2);

                String key = paramBits[0];
                String value = paramBits[1];
                params.put(key, value);
                System.out.println(Arrays.toString(cmdBits));
                System.out.println("actioncode : "+actionCode);
                System.out.println("key : " + key);
                System.out.println("value : " + value);
                // parsing end
                wiseSayingController.remove();


            } else if (cmd.equals("add")) {
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
