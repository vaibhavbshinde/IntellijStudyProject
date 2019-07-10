/**
 * Created Class for to verify how we can use the File with json
 */

package objects;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder(value={
        "name",
        "age",
        "position",
        "skills",
        "salary"
})

//	ignore null fields , class level
//  ignore all null fields
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Staff {
    private String name;
    private int age;

    @JsonInclude(JsonInclude.Include.NON_NULL) //ignore null field on this property only
    private String[] position;              //  Array
    private List<String> skills;            //  List
    private Map<String, BigDecimal> salary; //  Map


 //   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
 //   private Date createDate;


    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String[] getPosition(){
        return this.position;
    }

    public void setPosition(String[] position){
        this.position=position;
    }

    public void setSalary(Map<String,BigDecimal> salary){
        this.salary=salary;
    }

    public Map<String,BigDecimal> getSalary(){
        return this.salary;
    }

    public void setSkills(List<String> skills){
        this.skills=skills;
    }

    public List<String> getSkills(){
        return this.skills;
    }



    /*@Override
    public String toString() {

        return "Staff{" +
                "name :'" + name + '\'' +
                ", age :" + age + '\'' +
                ", position :" + position+ '\'' +
                ", skills :" + skills+ '\'' +
                ", salary :" + salary+
                '}';

    }*/
}
