import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map types = new HashMap();

        for (int i = 0; i < N; i++) {
            String extension = in.next(); // file extension
            String mime = in.next(); // MIME type.
            types.put(extension.toLowerCase(), mime);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String fileName = in.nextLine().toLowerCase(); // One file name per line.
            if (fileName.indexOf(".") > -1) {
                String type = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                System.out.println(types.containsKey(type) ? types.get(type) : "UNKNOWN");
            }
            else {
                System.out.println("UNKNOWN");
            }
        }
    }
}
