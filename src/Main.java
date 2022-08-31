import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        try{
            Factory factorySingleton = Factory.getInstance();
            DataReader reader = factorySingleton.getReader();

            PerformCalculations calculator= new PerformCalculations();

            System.out.println("Calculations: ");
            calculator.Perform(reader);
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (SQLException e){
            System.out.println("There was an error with the database");
        }
        catch (Exception e){
e.printStackTrace();
        System.out.printf("There was an error with the system");
        }
    }
}
