package collectionAPI;

public class CollectionStudent implements Comparable<CollectionStudent> {
    int age;
    String name;

    @Override
    public String toString() {
        return "CollectionStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public CollectionStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(CollectionStudent cs) {
        if(this.age > cs.age)
            return 1;
        else
            return -1;
    }
}
