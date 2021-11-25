package Task2;

import java.io.File;
import java.io.PrintWriter;

public class TryWithResources implements AutoCloseable {

    public void close() throws Exception {
        System.out.println("Closing!");
    }

    public static void main(String[] args) throws Exception {
        try (TryWithResources res = new TryWithResources()) {
            File file = new File("/home/elect/try.txt");
            PrintWriter pw = new PrintWriter(file);

            System.out.println("file has been created");
        }
    }
}