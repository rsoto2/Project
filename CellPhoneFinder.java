import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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
        }
    }
