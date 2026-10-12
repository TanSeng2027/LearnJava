public class Main{
    public static void main(String[]args){
        Student hocsinh1 = new Student("50.01.104.132","Lữ Chiến Tấn Sang", 20, 9.5);
        Student hocsinh2 = new Student("1", "TanSang",19,4.5);

        System.out.println(hocsinh2.toString());
        System.out.println(hocsinh1.getFullName());

    }
}