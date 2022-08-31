import java.sql.SQLException;
import java.util.HashSet;

public class PerformCalculations {
    public void Perform(DataReader dataReader) throws Exception {
        HashSet<String> names = new HashSet<String>();
        HashSet<String> cities = new HashSet<String>();

        while(dataReader.HasNew()){
            Person person = dataReader.ReadNext();
            names.add(person.get_name());
            cities.add(person.get_city());
        }

        System.out.println("The number of distinct names is: " + names.size());
        System.out.println("The number of distinct cities is: " + cities.size());
    }
}
