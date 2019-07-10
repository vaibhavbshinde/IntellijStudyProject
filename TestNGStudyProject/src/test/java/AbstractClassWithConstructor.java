import com.java.general.study.AbstractClassConstructor;
import com.java.general.study.AbstractClassConstructorImplementation;

public class AbstractClassWithConstructor {

    public static void main(String[] args){
        AbstractClassConstructorImplementation obj1 =  new AbstractClassConstructorImplementation("vaibhav",101,35);

        System.out.println("this is Test Class when we are calling the object  hashcode "+ obj1.hashCode());
    }
}
