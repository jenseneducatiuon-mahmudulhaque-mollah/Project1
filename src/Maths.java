public class Maths {
    String name;
    int x;
    public Maths(){
        name= "mahmudul";
        int x = 5;
        System.out.println(name);
        System.out.println(x);
        String myString = "stringing";
        private void readString() {
            System.out.println(myString);
        }
   public Maths(boolean morning) {
            if (morning) {
                myString = ("Good morning");
            }
            else {
                myString = ("Good evning");
            }
            readString();
        }
    }
}
