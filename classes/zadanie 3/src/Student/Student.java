package Student;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private int[] marks;

    public Student(String firstName, String lastName, String group, int[] marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("First name: " + firstName);
        builder.append("\nLast name: " + lastName);
        builder.append("\nGroup: " + group);
        builder.append("\nMarks: ");
        for (int i = 0; i < marks.length; i++) {
            builder.append(marks[i] + " ");

        }
        builder.append("\n");
        return builder.toString();
    }

}
