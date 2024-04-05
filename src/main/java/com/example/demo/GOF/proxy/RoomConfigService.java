package com.example.demo.GOF.proxy;

import java.util.List;

public interface RoomConfigService {
    void deleteRoom(Long roomId) throws Exception;

    void deleteAllRooms(List<Long> roomIds) throws Exception;

    void addRoom(String roomName, Long roomId) throws Exception;

    void updateRoomName(String roomName, Long roomId) throws Exception;
}
