// Implementation

public class Student {
    // instance variables
    private int creditHours = 0;

    private static final int MAX_CREDITS = 22;
    private static final int DEFAULT_CREDITS = 15;

    // constructors
    public Student(){
        creditHours = DEFAULT_CREDITS;
        System.out.println("hi");
    }

    public Student(int creditHours){
        this.creditHours = creditHours;
        System.out.println(this.creditHours);
    }

    public int getCreditHours(){
        return creditHours;
    }

    public int getStress(){
        return creditHours * 10;
    }

    public void setCreditHours(int credits){
        if(credits <= MAX_CREDITS){
            creditHours = credits;
            System.out.println("Yay! " + creditHours);
        }
        else
            System.out.println("cannot");
    }

    public void dropCreditHours(int credits){
        if (creditHours - credits >= 15){
            creditHours = creditHours - credits;
            System.out.println("Yay! " + creditHours);
        }
        else{
            System.out.println("cannot");
        }
    }

}
























// // all instance variables are created *private*
//     private int creditHours;
//     public static final int MAX_CREDITS = 22;
//     public static final int DEFAULT_CREDITS = 15;

//     // constructor
//     public Student(int creditHours){
//         this.creditHours = creditHours;
//     }

//     public Student(){
//         this.creditHours = DEFAULT_CREDITS;
//     }

//     public int getStress() {
//         return(units * 10);
//     }

//     // Methods to be used by clients are declared public -- these make up the interface that the class exposes to clients.
//     // Utility methods for the internal use of the class are declared private