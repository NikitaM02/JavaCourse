import org.w3c.dom.ls.LSOutput;

public class UserInput {
    public static void main(String[] args) {
        String age_string= args[0];
        int age=Integer.parseInt (age_string);
        String canIvote = age>= 18?   "Yes":"No";
                System.out.println(canIvote);

    }
}
