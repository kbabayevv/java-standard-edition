package dependencyinjection;

import java.util.function.Supplier;

public class WritingAnalysisDependencyInjection {

    private final Dictionary language;

    public WritingAnalysisDependencyInjection(Supplier<Dictionary> language) {
        this.language = language.get();
    }

    public boolean isValid() {
        return true;
    }
}
