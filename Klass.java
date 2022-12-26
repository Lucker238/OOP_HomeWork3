package fldr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Klass implements Iterable<Student>{

    private Student student;

    public Klass(Student student) {
        this.student = student;
    }


    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            List<Student> students = deepTree(student);
            Iterator<Student> studentIterator = students.iterator();
            @Override
            public boolean hasNext() {
                return studentIterator.hasNext();
            }

            @Override
            public Student next() {
                return studentIterator.next();
            }
            
        };
    }

    private List<Student> deepTree(Student student) {
        List<Student> result = new ArrayList<>();
        result.add(student);
        if (student.getGrade().size()==0) {
            return result;
        }
        else {
            for (Student stud : student.getGrade()) {
                result.addAll(deepTree(stud));
            }
        }
        return result;
    }



}
