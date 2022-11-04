import java.util.Arrays;
import java.util.Scanner;

public class FileAllocation {

    // HadrDisk Array size 12
    static Object HadrDisk[] = new Object[12];

    // method return true if index is empty otherwise false
    public static boolean checker(int start, int length) {

        int i = start;
        while (i <= start + length - 1) {

            if (HadrDisk[i] == null) {
                i++;
                return true;
            } else {
                System.out.println("Location is already used try again!");
                break;
            }

        }
        return false;
    }

    // the most impotant method that locate the index with its own index number
    static void fuckalltogether(String Name, int length, int start) {

        // for (int i = 0; i <= HadrDisk.length; i++) {

        if (checker(start, length)) {

            int j = start;
            while (j <= start + length - 1) {
                HadrDisk[j] = j;
                j++;

            }

        }

    }

    // helper method to print Allocation blocks
    static void printShit(int start, int length) {

        System.out.print("[");
        for (int p = start; p <= start + length - 1; p++) {
            System.out.print(p + " ");
        }
        System.out.println("]");
    }

    // method to all the information about files
    static void printMotherFucker(String Name, int length, int start) {

        System.out.println("***********************");
        System.out.println("File Name: " + Name);
        System.out.println("Start: " + start);
        System.out.println("Length: " + length);
        System.out.print("Alloc Blocks: ");
        printShit(start, length);
        System.out.println("***********************");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of files: ");
        int Num_of_files;
        Num_of_files = scan.nextInt();

        for (int k = 1; k <= Num_of_files; k++) {
            System.out.println("Enter the File" + k + " name :");
            String File1N;
            File1N = scan.next();

            System.out.println("Enter the start of File" + k + " :");
            int FStart = scan.nextInt();

            System.out.println("Enter the length of File" + k + " :");
            int Flength = scan.nextInt();

            fuckalltogether(File1N, Flength, FStart);
            printMotherFucker(File1N, Flength, FStart);

        }
        System.out.println("***********************");
        System.out.println("Hard Disk in Final Form: ");
        System.out.println(Arrays.toString(HadrDisk));

        scan.close();

    }

}