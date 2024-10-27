public class Studentname {
    private int id;
    private String name;
    private String contactNumber;

    public Studentname(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}

