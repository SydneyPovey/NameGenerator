
import javax.swing.JOptionPane;

//Sydney Povey
//Name Generator
//July 2022 started
public class NameGenerator {
    
    public static int RandomC(){
        int random = 0;
        random = (int)((55*Math.random())); //Randomly generates a coordonate on the 8 by 8 grid (random number between 1-8)
        return random;
    }
    
    public static int RandomV(){
        int random = 0;
        random = (int)((7*Math.random())); //Randomly generates a coordonate on the 8 by 8 grid (random number between 1-8)
        return random;
    }

    
    public static void main (String []args){
        String input = "";
        try{
            do{
                int nameLength = 0;
                int Switch = (int)((1*Math.random()));
                String name = "";
                String[] consonants = { "q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k", 
                    "l", "z", "x", "c", "v", "b", "n", "m", "y", "sl", "sh", "sc", "sw", "sn", "st", "sp",
                    "sk", "sm", "cr", "cl", "ch", "fr", "fl", "str", "tr", "tl", "th", "ts", "nt", "gr", "gl", "qu", "br", "bl", "vr", "vl", "pr"
                    , "pl", "dr", "dl", "kr", "kl", "zl", "ll"};
                String[] vowels = {"a", "e", "i", "o", "u", "y", "oo", "ee"};

                JOptionPane.showMessageDialog(null,"Welcome to Name Generator!");
                input = JOptionPane.showInputDialog("Please input the name length you want :");
                
                if(input == "q"){
                    
                }else{
                    nameLength= Integer.parseInt(input);

                    for (int i=0; i<nameLength; i++){
                        if (Switch == 0){
                            name = name + consonants[RandomC()];
                            Switch = 1;
                        }else if (Switch == 1){
                            name = name + vowels[RandomV()];
                            Switch = 0;
                        }
                    }

                    String output = name.substring(0, 1).toUpperCase() + name.substring(1);
                    JOptionPane.showMessageDialog(null, output);

                }
            }while(input != "q");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong! Try again.");
        }
    
    }
}
