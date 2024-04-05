package com.example.demo.GOF.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class RoomConfigServiceImpl implements RoomConfigService {

    @Override
    public void deleteRoom(Long roomId) throws Exception {
        log.info("Room with id{} was deleted from room table", roomId);
    }

    @Override
    public void deleteAllRooms(List<Long> roomIds) throws Exception {
        log.info("Rooms with ids{} was deleted from room table", roomIds);
    }

    @Override
    public void addRoom(String roomName, Long roomId) throws Exception {
        log.info("Room with id{} and name {} was added to room table", roomId, roomName);
    }

    @Override
    public void updateRoomName(String roomName, Long roomId) throws Exception {
        log.info("Room with id{} was updated with name{}", roomId, roomName);
    }
}
