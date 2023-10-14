package immutable;

public final class Immutable {
    private final String name;
    private final Integer age;
    private final StringBuilder sb;

    private Immutable(String name, Integer age, StringBuilder sb) {
        this.name = name;
        this.age = age;
        // mutable olan (StringBuilder, SringBuffer, Collectionlar ve s.) new ile vermek lazimdir
        this.sb = new StringBuilder(sb.toString());
    }

    public static Immutable of(String name, Integer age, StringBuilder sb) {
        return new Immutable(name, age, sb);
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
        StringBuilder sb = new StringBuilder();
        sb.append("salam");
        Immutable m = Immutable.of("KAmran", 24, sb);

        sb.append(" necesen");


        System.out.println(m.getSb().hashCode());
        m.getSb().append(" necesen");
        System.out.println(m.getSb().hashCode());
    }
}
