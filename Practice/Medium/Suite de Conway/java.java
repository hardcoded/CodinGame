import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int L = in.nextInt();

        System.out.println(conway(R, L-1));
    }

    static List<String> ligneSuiv(List<String> ligne) {
        List<String> suiv = new ArrayList<String>();
        String lastC = ligne.get(0);
        int cpt = 0;
        for (String c : ligne) {
            if (c.equals(lastC)) {
                cpt++;
            }
            else {
                suiv.add(Integer.toString(cpt));
                suiv.add(lastC);
                lastC = c;
                cpt = 1;
            }
        }
        suiv.add(Integer.toString(cpt));
        suiv.add(lastC);
        return suiv;
    }

    static String conway(int seed, int size) {
        List<String> ligne = new ArrayList<String>(Arrays.asList(Integer.toString(seed)));
        for (int i = 0; i < size; i++) {
            ligne = ligneSuiv(ligne);
        }
        return ligne.size() > 1 ? String.join(" ", ligne) : String.join("", ligne);
    }
}
