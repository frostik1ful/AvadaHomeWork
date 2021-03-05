package homeWork4.collection.user;

import java.util.Objects;

public class Student extends User {
    private final double points;

    public Student(String name, double points) {
        super(name);
        this.points = points;
    }


    @Override
    public String toString() {
        return "Student{" +
                "points=" + points +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.points, points) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), points);
    }


    public double getPoints() {
        return points;
    }
}
