public class classStudent {
    private String id;
    private String name;
    private double gpa;

    // contructors
    public classStudent(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    //Getter and Setter
    public  String getId(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    // Hien thi thong tin
    @Override
    public String toString(){
        return "Ma so sinh vien:" + id + "\n" +
                "Ho va ten: " + name + "\n" +
                "GPA: " + gpa;
    }

}
