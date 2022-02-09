public class PejaClass {
    public static void main(String[] args) {

    }
    public void thisTest(){
        System.out.println("This test doesn't do nothing");
    }
    public void thisTest2(){
        System.out.println("This test does smth");
    }

    public String pejaTest(String str){
        if (str.length()<2)
            return str;
        return str.toLowerCase();
    }
}
