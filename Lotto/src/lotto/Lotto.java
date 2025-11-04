/*
 * Name: Koi
 * Description: a lottery class that generates a 
 */
package lotto;

/**
 *
 * @author 30099423
 */
public class Lotto {

    private String companyName;
    private int[] numbers;

    public Lotto() {
        companyName = "ABC Lottery Co.";
        numbers = new int[6];
        generateNumbers();
    }

    public Lotto(String name) {
        companyName = name;
        numbers = new int[6];
        generateNumbers();
    }

    private void generateNumbers(){

        for (int i = 0; i < 6; i++){
           numbers[i] = (int)(Math.random()*7+1);
        }
    }

    public String playLotto(int[] winningNumbers){
        var output = new StringBuilder();
        
        int matches = 0; 
        for (int i = 0; i< 6; i++){
            if (numbers[i] == winningNumbers[i]){
                matches += 1;
            }
        } 
        double prize = matches == 0 ? 0d : 100 * Math.pow(2,matches-1);

        output.append("### %s ###%n".formatted(companyName));

        output.append("Winning Numbers: ");
        for (int i : winningNumbers){
           output.append(i).append(" ");
        }
        
        output.append("\nLotto Numbers:   ");
        for (int i : numbers){
           output.append(i).append(" ");
        }

        output.append("%nPrize is $%.2f%n%n".formatted(prize));

        return output.toString();

    }
}
