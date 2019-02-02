public class Course {

    String name;
    int numberOfStudent;
    Student[] registeredStudents;

    public Course(String title) {
        name = title;
        numberOfStudent = 0;
        registeredStudents = new Student[10];
    }

    public Student[] getStudents() {
        return registeredStudents;
    }

    public boolean isFull() {
        if (numberOfStudent >= 10) {
            return true;
        }

        return false;
    }

    public void registerStudent(Student student) {

        if (!isFull()) {
            registeredStudents[numberOfStudent] = student;
            numberOfStudent += 1;
        }
    }

    public String getTitle() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
