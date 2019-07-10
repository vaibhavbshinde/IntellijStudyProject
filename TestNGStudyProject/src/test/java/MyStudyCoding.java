import com.java.general.study.TryCatchScenario;

public class MyStudyCoding {

    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[2] = "abc";

        System.out.println(arr[2]);
        System.out.println(arr[1]);

        TryCatchScenario tryobj1 = new TryCatchScenario();
        try {
            tryobj1.doStuff();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace(); // to get fullstack trace
            e.getMessage();
        }
    }
}