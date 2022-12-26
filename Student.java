package fldr;

public class Student implements Comparable<Student>{

    String firstName;
    String lastName;
    int age;
    
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private Grade grade = new Grade();

    public Student(String firstName, String lastName, int age, Grade grade) {
        this(firstName, lastName, age);
        this.grade = grade;
    }


    public Grade getGrade(){
        return grade;
    }

    
        public String getFirstName() {
            return firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public int getAge() {
            return age;
        }

    @Override
    public int compareTo(Student o) {
        String stdFullName = this.firstName + " " + this.lastName;
        String oFullName = o.firstName + " " + o.lastName;
        if(stdFullName.equals(oFullName)) {
            return this.age = o.age;
        }
        else {
            return stdFullName.compareTo(oFullName);
        }
    }

    @Override
    public String toString() {
        return String.format("fName: %s, lName: %s, age: %d", firstName, lastName, age);
    }
}
