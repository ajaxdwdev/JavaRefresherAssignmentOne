public class Student {

    private String name;
    private int rollNumber;
    private int marksInEnglish;
    private int marksInMath;
    private int marksInScience;

    public Student(String name, int rollNumber, int marksInEnglish, int marksInMath, int marksInScience) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksInEnglish = marksInEnglish;
        this.marksInMath = marksInMath;
        this.marksInScience = marksInScience;
    }

    public int calculateTotalMarks() {
        return marksInEnglish + marksInMath + marksInScience;
    }

    public String calculateGrade() {

        int totalMarks = calculateTotalMarks();

        if (totalMarks >= 90) {
            return "A";
        } else if (totalMarks >= 80) {
            return "B";
        } else if (totalMarks >= 70) {
            return "C";
        } else if (totalMarks >= 60) {
            return "D";
        } else {
            return "F";
        }

    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

}
