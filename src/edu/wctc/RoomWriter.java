package edu.wctc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomWriter {
    public static void writeRoomFile(String fileName, ArrayList<Room> roomList) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Room room : roomList) {
            oos.writeObject(room);
        }

        oos.close();
    }
}
