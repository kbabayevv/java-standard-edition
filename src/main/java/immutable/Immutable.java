package immutable;

public final class Immutable {
    private final String name;
    private final Integer age;
    private final StringBuilder sb;

    public Immutable(String name, Integer age, StringBuilder sb) {
        this.name = name;
        this.age = age;
        // mutable olan (StringBuilder, SringBuffer, Collectionlar ve s.) new ile vermek lazimdir
        this.sb = new StringBuilder(sb.toString());
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public StringBuilder getSb() {
        return new StringBuilder(this.sb.toString());
    }
}

class Test {
    public static void main(String[] args) {

    }
}
