import com.java.general.study.FinalClassTestScenario;

public class TestFinalClassDemo {

    public static void main(String[] args ){
        FinalClassTestScenario obj1 = new FinalClassTestScenario();
        System.out.println("return value is "+obj1.displayPIvalue());
        System.out.println("class name"+obj1.getClass().getName());
    }
}


/*
public class TestFinalClassDemo extends FinalClassTestScenario
{
    public double displayPIvalue(){
        return 500.00;
    }
}

//Error Should be get : Error:(14, 41) java: cannot inherit from final com.java.general.study.FinalClassTestScenario
*/