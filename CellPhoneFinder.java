
import java.util.*;
import java.io.*;



public class CellPhoneFinder {
    private static ArrayList<Tile> accounts = new ArrayList<Tile>();

    public static void registerTag(int id, String owner, String location) throws IOException {
        accounts.add(new Tile(id, owner, location));
    }

    public static void retrieveTag(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (id == accounts.get(i).id)
                accounts.get(i).print();
        }

    }

    public static void bypasser(int id, string loc)
    {
        for(int i = 0; i < accounts.size(); i++)
        {
            if(accounts.get(i).id == id)
            {
                accounts.get(i).location = loc;
                retrieveTag(id);
            }
        }
    }


    public static void addUsers(int id, String name) {
        for (int i = 0; i < accounts.size(); i++) {
            if (id == accounts.get(i).id)
                accounts.get(i).otherUsers.add(name);

        }
    }

            //delete users
        public static void deleteUser(int id, String user){
            for(int i = 0; i < accounts.size(); i++)
            {
                if(accounts.get(i).id == id)
                {
                    for(j = 0; j < accounts.get(i).otherUsers.size(); j++)
                    {
                        if(accounts.get(i).otherUsers.get(j) == user)
                            accounts.get(i).otherUsers.remove(j);
                    }
                }
            }
        }


    public static void deleteAccount(int id)
    {
        for(int i = 0; i < accounts.size(); i++)
        {
            if(accounts.get(i).id == id)
            {
                accounts.remove(i);
            }
        }
    }



    public static void main(String args[]) throws IOException {
        registerTag(8675309, "Pickles, Toe", "Within phone proximity");
        retrieveTag(8675309);
        addUsers(8675309, "my guy");
        retrieveTag(8675309);
    }
}
