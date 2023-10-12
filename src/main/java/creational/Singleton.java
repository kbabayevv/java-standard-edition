package creational;

public class Singleton {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1.hashCode());//1521118594
        System.out.println(db2.hashCode());//1521118594
    }
}

class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {

        if (dbObject == null) {
            dbObject = new Database();
        }
        return dbObject;
    }

}

