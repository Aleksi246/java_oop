import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;



public class task1 {
    public static void main(String[] args) {
        String date = "01.01.2023";

        URL myUrl;
        String[] splitline = new String[0];
        double temptemp = 0;
        int counter = 0;
        String temp;

        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }
        try {
            InputStream istream = myUrl.openStream();

            InputStreamReader istreamreader = new InputStreamReader(istream);

            BufferedReader reader = new BufferedReader(istreamreader);

            String line;


            // here we read the content of the web page line by line




            while ((line = reader.readLine()) != null) {
                splitline = line.split(";");
                if(splitline[0].contains(date)){
                    temp = splitline[1].replace(",",".");

                    temptemp += Double.parseDouble(temp);
                    counter++;
                }

            }

            // now it is time to print the result
            reader.close();
            System.out.println(temptemp/counter);
        } catch (IOException e) {
            System.err.println(e);
        }


    }
}

