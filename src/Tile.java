import java.util.*;
import java.io.*;

/*
 *  Holds user data, variables are public, they are accessbike
 *  through dot operator. EX: tile.id would equal the value.
*/
public class Tile {
    public int id;
    public String owner, location;
    public ArrayList<String> otherUsers = new ArrayList<String>();

    public Tile(int id, String owner, String location) {
        this.id = id;
        this.owner = owner;
        this.location = location;
    }

    /*
     * Simple toString() method, could possibly save time later on. It's also a way
     * to easily display information.
     */
    public void print() {
        System.out.println(this.id + "\n" + this.owner + "\n" + this.location);
        for (int i = 0; i < otherUsers.size(); i++)
            System.out.println(this.otherUsers.get(i));
    }
}