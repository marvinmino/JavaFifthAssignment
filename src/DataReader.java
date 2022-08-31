
public interface DataReader {
    boolean HasNew() throws Exception;
    Person ReadNext() throws Exception;
}
