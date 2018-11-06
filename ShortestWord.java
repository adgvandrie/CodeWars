import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {

        String[] answer = s.split(" ");
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < answer.length; i++) {
          if (answer[i].length() < smallest) {
            smallest = answer[i].length();
          }
        }

        return smallest;
    }
}
