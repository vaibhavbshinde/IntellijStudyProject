package utilities;

import org.codehaus.jackson.map.ObjectMapper;
import objects.Staff;
import java.io.File;
import java.io.IOException;

public class JSONConversionToObject {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // JSON file to Java object
            Staff staff = mapper.readValue(new File("staff.json"), Staff.class);
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff));

            // JSON string to Java object
            String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
            Staff staff2 = mapper.readValue(jsonInString, Staff.class);

            // compact print
            System.out.println(staff2);


            // pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);

            System.out.println(prettyStaff1);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


