import java.util.function.Predicate;
public class MainClass {
    //Predicate --Boolean reuslt
    //Functional Interface has 4 types
    public static void main(String[] a){
        Predicate<String> checkLength=str->str.length()>5;
        //check if the length og string>5
        System.out.println(checkLength.test("abcd")); //true
    }
}
