
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

    public static void addUsers(int id, String name) {
        for (int i = 0; i < accounts.size(); i++) {
            if (id == accounts.get(i).id)
                accounts.get(i).otherUsers.add(name);

        
      

        }



    public static HashSet<String> showUsers()
    {
        HashSet<String> person = new HashSet<String>();

        System.out.println("Do you want to add a person to account? ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        if(answer.equals("yes") || answer.equals("Yes")) {

            System.out.print("Enter first name: ");
            String firstName = scan.next();

            System.out.print("Enter last name: ");
            String lastName = scan.next();

            person.add("Toe, Pickles");
            person.add(firstName + ", " + lastName);

            System.out.println("List of people on account:");
            Iterator<String> i = person.iterator();
            while (i.hasNext())
                System.out.println(i.next());


        }

        else if (answer.equals("no")) {
            System.out.println("Have a nice day!");

        }

        return person;

    }
    }

    public static void main(String args[]) throws IOException {
        registerTag(8675309, "Pickles, Toe", "Within phone proximity");
        retrieveTag(8675309);
        addUsers(8675309, "my guy");
        retrieveTag(8675309);
    }
}
