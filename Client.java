// Interfacing (differet from Java Interfaces that you'll study later)

public class Client{
    public static void main(String[] args){


        Student richie = new Student();
        Student j = new Student(21);
        
        System.out.println("Riche's credit hours: " + richie.getCreditHours() + ", stress level: " + richie.getStress());
        System.out.println("J's credit hours: " + j.getCreditHours() + ", stress level: " + j.getStress());
        
        j.dropCreditHours(3);
        
        j = richie;
        
        richie.setCreditHours(15);

        String[] words = {"aa", "av", "we"};
        // System.out.println(word[0]);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

    }
}