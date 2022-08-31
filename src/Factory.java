public class Factory {
    private static Factory _instance = null;
    private Factory(){}

    public static Factory getInstance(){
        if (_instance == null)
        {
            _instance =  new Factory();
        }

        return _instance;
    }

    public DataReader getReader() throws Exception {
        return ApplicationSettings.getInstance().getReader();
    }
}
