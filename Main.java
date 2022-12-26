package fldr;

public class Main {
    public static void main(String[] args) {
        Grade firstGrade = new Grade();
        firstGrade.addStudent(new Student("Ivan", "Ivanov", 12))
                    .addStudent(new Student("Petr", "Petrov", 11))
                    .addStudent(new Student("Vasya", "Petrov", 12));

                    
        Student firstGradaCapitan = new Student("Soso", "Pavliashvilli", 22, firstGrade);

        Klass all = new Klass(firstGradaCapitan);

        for (Student item : all) {
            System.out.println(item);
        }
    }

    
}
