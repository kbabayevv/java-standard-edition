package dependencyinjection;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Dictionary> english = ()->new Dictionary("English");
        var lan = new WritingAnalysisDependencyInjection(english);
        lan.isValid();
    }
}
