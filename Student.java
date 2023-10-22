public class Student {

    private String id;
    private String name;
    private String datOfBirth;
    private String classList;

    public Student(String id, String name, String datOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.datOfBirth = datOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", datOfBirth='" + datOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
