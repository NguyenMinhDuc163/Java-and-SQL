package ThucHanh.Lan3.Bai3;

public class Subject {
    private String subjectID, subjectName, credit;

    public Subject(String subjectID, String subjectName, String credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}