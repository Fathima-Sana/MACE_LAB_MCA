import java.io.*;

class File_read {
    public static void main(String arg[]) {
        String filePath = "/home/user/Desktop/sana/java/lab/naruto.txt";

        try (FileReader f1 = new FileReader(filePath);
             BufferedReader r = new BufferedReader(f1)) {

            String s;
            while ((s = r.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
