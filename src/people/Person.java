package people;

public abstract class Person {

    private long id;
    private String name;

    private static long idCounter=0;

    public Person(String name) {
        this.name = name;
        idCounter++;
        setId(idCounter);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
