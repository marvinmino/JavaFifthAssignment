import java.sql.SQLException;
import java.util.Random;

public class ApplicationSettings {
    private static ApplicationSettings _instance;
    private ApplicationSettings(){}

    public static ApplicationSettings getInstance() {
        if (_instance == null)
        {
            _instance =  new ApplicationSettings();
        }

        return _instance;
    }

    public DataReader getReader() throws Exception {
        Random random = new Random();

        if(random.nextBoolean()){
            return new DbReader();
        }
        return new FileReader("src/file.txt");
    }
}
