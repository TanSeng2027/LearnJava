public class Main {
    public static void main(String[] args) {
        classStudent sv1 = new classStudent("001","Sang Dep Trai", 8.5);
        classStudent sv2 = new classStudent("002","Lu Chien Tan Sang",9.5);

        System.out.println(sv1);
        System.out.println(sv2);

        //  thay doi GPA cua sv1
        System.out.println(" ========== Thay doi GPA cua sinh vien 1 ==========");
        sv1.setGpa(3.6);
        System.out.println(sv1);
        System.out.println(sv2);

    }
}