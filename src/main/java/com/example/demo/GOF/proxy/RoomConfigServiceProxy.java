package com.example.demo.GOF.proxy;

import java.util.HashMap;
import java.util.List;

public class RoomConfigServiceProxy implements RoomConfigService {
    private boolean isAuthorizedUser;
    private RoomConfigService roomConfigService;
    private static final HashMap<String, String> authorizedUsers = new HashMap<>();


    static {
        authorizedUsers.put("tsarivka", "password1");
        authorizedUsers.put("incarnate", "password2");
        authorizedUsers.put("marius", "password3");
    }

    public RoomConfigServiceProxy(String userName, String password) {
        var searchedPassword = authorizedUsers.get(userName);
        if (searchedPassword != null && searchedPassword.equals(password)) {
            isAuthorizedUser = true;
        }
        roomConfigService = new RoomConfigServiceImpl();
    }

    @Override
    public void deleteRoom(Long roomId) throws Exception {
        if (isAuthorizedUser) {
            roomConfigService.deleteRoom(roomId);
        } else {
            throw new Exception("Command 'deleteRoom' is not allowed for non-authorized users");
        }
    }

    @Override
    public void deleteAllRooms(List<Long> roomIds) throws Exception {
        if (isAuthorizedUser) {
            roomConfigService.deleteAllRooms(roomIds);
        } else {
            throw new Exception("Command 'deleteAllRooms' is not allowed for non-authorized users");
        }
    }

    @Override
    public void addRoom(String roomName, Long roomId) throws Exception {
        if (isAuthorizedUser) {
            roomConfigService.addRoom(roomName, roomId);
        } else {
            throw new Exception("Command 'addRoom' is not allowed for non-authorized users");
        }
    }

    @Override
    public void updateRoomName(String roomName, Long roomId) throws Exception {
        if (isAuthorizedUser) {
            roomConfigService.updateRoomName(roomName, roomId);
        } else {
            throw new Exception("Command 'updateRoomName' is not allowed for non-authorized users");
        }
    }
}
