package com.example.demo.GOF.proxy;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        RoomConfigService roomConfigService = new RoomConfigServiceProxy("tsarivka2																", "password1");

        try {
            roomConfigService.addRoom("Pink room", 1L);
            roomConfigService.updateRoomName("Black room", 1L);
            roomConfigService.deleteRoom(1L);
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }

}
