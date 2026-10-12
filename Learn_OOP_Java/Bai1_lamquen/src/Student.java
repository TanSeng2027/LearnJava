public class Student {
    // thuoc tinh
    private String ID;
    private String FullName;
    private int Tuoi;
    private double GPA;
    // Contructor (gans gias trij ban dauaf)
    public Student(String ID, String FullName, int Tuoi, double GPA) {
        this.ID = ID;
        this.FullName = FullName;
        this.Tuoi = Tuoi;
        this.GPA = GPA;
    }
    // Getter và Setter
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public boolean isPassed(){
        if(GPA >5){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Student have the following information: ID:"+ ID +
                ", Full name: " + FullName +
                ", Student age: " + Tuoi +
                ", GPA: " + GPA +
                ", Tinh trang hoc tap: " + isPassed();
     }

}
