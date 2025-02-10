import java.util.Hashtable;
import java.util.List;

public class XMLReadingDemo {

    public static void main(String[] args) {

        String xmlFilePath = System.getProperty("user.dir")+"\\XMLReaderDemo\\files\\TestData.xml";

        XMLReader xmlReader = new XMLReader(xmlFilePath);

        List<Hashtable<String, String>> listData = xmlReader.getDataAsList("ForgotPasswordTest");

        System.out.println(listData);

        for(int i=0;i<listData.size();i++) {

            Hashtable<String, String> table = listData.get(i);

            System.out.println("Username is "+table.get("Username"));
            System.out.println("Browser is "+table.get("Browser"));
            System.out.println("Runmode is   "+ table.get("Runmode"));
            System.out.println("Passwors is  "+ table.get("Passsword"));
            System.out.println("_________________");

        }

        System.out.println(listData.get(0).get("Browser"));


    }


}


