import java.util.Scanner;

public class A_DistinctStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        scanner.close();
        char[] c = S.toCharArray();

        int ans = 0;

        if(c[0] == c[1] && c[1] == c[2]) {
            ans = 1;
        } else if(c[0] == c[1] || c[1] == c[2] || c[2] == c[0]) {
            ans = 3;
        } else {
            ans = 6;
        }
        System.out.println(ans);
    }
}
