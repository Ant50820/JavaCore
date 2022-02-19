import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson10 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fullName = bf.readLine();

        String[] users = new String[5];

        for (int i = 0; i < 5; i++) {
            users[i] = bf.readLine();
        }
        String user_regex = "[a-zA-Z0-9]{3,15}";
        Pattern p = Pattern.compile(user_regex);

        Matcher m;

        for (int i = 0; i < 5; i++) {
            m = p.matcher(users[i]);
            if (m.matches()){
                System.out.printf("%s is valid\n", users[i]);
            } else {
                System.out.printf("%s is invalid\n", users[i]);
            }
        }




//        String[] partName = fullName.split("");
//
//        System.out.println("%s, %s, %s", partName[0], partName[1]);
//        System.out.println(partName[1]);
//        System.out.println("%s, %s, %s", partName[0], partName[1]);


    }
}

