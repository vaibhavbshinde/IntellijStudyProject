/**
 * Created by vaibhav for testing to read the object mapper
 */

package objects;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value={
        "empName",
        "empNo",
        "salary"
})

// This property will ignore unmapped field values if it received in the JSON String
@JsonIgnoreProperties(ignoreUnknown = true)

public class Employee {
    private int empNo;
    private String empName;

    private double salary;

    public int getEmpNo() {
        return this.empNo;
    }

    public String getEmpName() {
        return this.empName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
