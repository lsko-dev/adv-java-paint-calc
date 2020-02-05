package edu.wctc;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RoomReader {
    public static ArrayList<Room> readRoomFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj;
        ArrayList<Room> roomList = new ArrayList<>();

        try {
            while ((obj = ois.readObject()) != null) {
                Room room = (Room) obj;
                roomList.add(room);
            }
        } catch (EOFException e) {

        }

        return roomList;
    }
}
