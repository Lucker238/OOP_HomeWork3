package fldr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grade implements Iterable<Student>{

    private List<Student> grade = new ArrayList<>();

    public Grade addStudent(Student student) {
        grade.add(student);
        return this;
    }

    public int size() {
        return grade.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < grade.size();
            }

            @Override
            public Student next() {
                return grade.get(index++);
            }
            
        };
    }

    public List<Student> getStudents() {
        return grade;
    }
    
}
