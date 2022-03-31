package test_vcamp;

public class Challenge {

// Static torna a variável visível para as demais instâncias, nesse caso específicamente a "ChallengeTeste".
	static String result;
	
// O método "rps" recebe dois parâmetros de tipo String, e verifica-os atrávez de um laço de repetição "while",
// retornando o resultado conforme os parâmetros passados.
	public static String rps(String s1, String s2){
		while(true) {
			if (s1.equals(s2)){
				result = "TIE";
				break;
			} else if(s1.equals("rock") && s2.equals("paper")){
				result = "Player 2 wins";
				break;
			}
			else if(s1.equals("paper") && s2.equals("rock")){
				result = "Player 1 wins";
				break;
			}
			else if(s1.equals("rock") && s2.equals("scissors")){
				result = "Player 1 wins";
				break;
			}
			else if(s1.equals("scissors") && s2.equals("rock")){
				result = "Player 2 wins";
				break;
			}
			else if(s1.equals("paper") && s2.equals("scissors")){
				result = "Player 2 wins";
				break;
			}
			else if(s1.equals("scissors") && s2.equals("paper")){
				result = "Player 1 wins";
				break;
			}
		}
		return result;
	}
}
