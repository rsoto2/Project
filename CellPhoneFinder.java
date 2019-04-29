import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.*;

public class CellPhoneFinder 
{
        
        public static void registerTag(List<String> a) throws IOException
        {
            /*This method will create a file that contains
             *important user info like the owner's name, tag number, 
             *and an empty string that might be filled by another method?
             *Once this location is changed by one of us in some
             *other method...or something...the flag should change?
             *Let me know how you guys feel about this.
             */
            
            a.add("Owner: Pickles, Toe");
            a.add("ID: 8675309");
            a.add("Location: Within phone proximity");
            
            FileOutputStream fWrite = new FileOutputStream("customerData.txt");
            ObjectOutputStream fObject = new ObjectOutputStream(fWrite);
            fObject.writeObject(a);
            fObject.close();
            
            for(String s: a)
            {
                System.out.println(s);
            }
            
        }
        
        public static void main(String args[]) throws IOException
        {
            List<String> tagInfo = new ArrayList<String>();
            registerTag(tagInfo);
            showUsers();
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
