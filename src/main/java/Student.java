public class Student {
    private int id;
    private String name;
    private String surname;
    private String curs_name;

    public Student() {
    }

    public Student(int id, String name, String surname, String curs_name) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.curs_name = curs_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCurs_name() {
        return curs_name;
    }

    public void setCurs_name(String curs_name) {
        this.curs_name = curs_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", curs_name='" + curs_name + '\'' +
                '}';
    }
}
