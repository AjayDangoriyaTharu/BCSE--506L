interface asbtractExam {
    void learnPython();
    void learnDSA();
    void learnJava();
}
abstract class Learning implements asbtractExam{
    public void learnPython(){
        System.out.println("Learning Python ..... GUI");
    }
    public void learnJava(){
        System.out.println("Learning Java .......... OOPS");
    }
}
class Student extends Learning{
    public void learnDSA(){
        System.out.println("Learning DSA ......... Algorithms and Data Structures");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.learnDSA();
        s1.learnJava();
        s1.learnPython();
    }
}