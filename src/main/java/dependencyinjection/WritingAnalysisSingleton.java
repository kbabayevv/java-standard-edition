package dependencyinjection;

public class WritingAnalysisSingleton {
    private static final Dictionary english = new Dictionary("English");
    public static WritingAnalysisSingleton instance = new WritingAnalysisSingleton();
    private WritingAnalysisSingleton(){}
    public static boolean isValid() {
        return true;
    }
}
