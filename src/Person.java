
import static java.lang.Character.UnicodeBlock.of;
import static java.lang.Character.UnicodeBlock.of;
import static java.time.Clock.system;


public abstract class Person {
    private String text1;
    private String text2;
    private String text3;
     private String text4;

    // constructor used when all dimensions specified
    Person(String t1 ,String t2, String t3, String t4) {
         this.text1= text1;
         this.text2= text2;
         this.text3 = text3;
         this.text4= text4;
     }
    
    abstract void main();
}

 class Teacher extends Person {
    
    Teacher(String t1, String t2, String t3, String t4) {
        super(t1, t2, t3, t4);
    } 

    @Override
    void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }

 class text {
    public static void main (String[] args){
        Person person;
        
        person = new Teacher("School of Artificial Intelligence","Big-data Teacher ","Robotics","Teaching Machine Learning");
        System.out.println("School of Artificial Intelligence");
           System.out.println("Big-data Teacher ");
           System.out.println("Robotics");
           System.out.println("Teaching Machine Learning");
         person.main();
        
    }

  
}

    
    
    