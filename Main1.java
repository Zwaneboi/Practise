
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Main1 {
        public static void main(String[] args) {



            try {
                File files = new File  ("C:\\Users\\zanez\\Downloads\\ src \\that file.txt");
                Scanner scan = new Scanner(files);
                Scanner p = new Scanner(System.in);
                System.out.println("Please enter the staring point");
                int start = p.nextInt();
                System.out.println("Please enter the end point");
                int end = p.nextInt();
                String[] list = new String[end + 1];

                for (int i = start;  i <= end ; i ++) {
                    list[i] = scan.nextLine();
                    System.out.println(list[i]);

                }



            } catch (FileNotFoundException e) {
                System.out.println("Cannot find logfile!");
                System.out.println("Exiting..");
            }
        }
    }



