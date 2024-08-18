import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// simple class to show how to read data from network
public class NetworkRead {

    // read from url
    public static void readFromUrl(String surl) throws IOException {
        // read from network
        URL url = new URL(surl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        try (InputStream is = conn.getInputStream()) {
            String response = convertInputStreamToString(is);
            System.out.println("Response from google server ==> " + response);
        }
        conn.disconnect();
        System.out.println("Program complete");
    }

    // convert the data from input stream to a string
    private static String convertInputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        int read = -1;
        do {
            read = is.read();
            if (read != -1) {
                sb.append((char) read);
            }
        } while (read != -1);
        return sb.toString();
    }
}
