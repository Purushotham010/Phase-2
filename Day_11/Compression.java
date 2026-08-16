import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Compression {

    public static String compress(String s) {
        if (s == null || s.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static String decompress(String s) {
        if (s == null || s.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);
            i++;

            int count = 0;
            while (i < n && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }

            for (int k = 0; k < count; k++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String modeLine = br.readLine();
        if (modeLine == null) return;
        char mode = modeLine.trim().charAt(0);

        String s = br.readLine();
        if (s == null) s = "";

        if (mode == 'C' || mode == 'c') {
            System.out.println(compress(s.trim()));
        } else if (mode == 'D' || mode == 'd') {
            System.out.println(decompress(s.trim()));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
