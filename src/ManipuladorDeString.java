import java.util.Scanner;


public class ManipuladorDeString {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while(true){
			System.out.print("Digite uma frase: ");
			String frase = entrada.nextLine();

			System.out.println("Palavras em ordem crescente: "+ordenaFrase(frase));
		}
	}

	public static String ordenaFrase(String frase) {
		String[] fraseSeparada = frase.split(" ");
		String armazenaPalavras = "";
		String montaFrase = "";
			
		for(int i = 0; i < fraseSeparada.length -1; i++){
			for(int x = 0; x < fraseSeparada.length -1 ; x++){
				if(fraseSeparada[x].length() > fraseSeparada[x+1].length()){
					armazenaPalavras = fraseSeparada[x];
					fraseSeparada[x] = fraseSeparada[x+1];
					fraseSeparada[x+1] = armazenaPalavras;	
				}
			}
		}			
		for(int i = 0; i < fraseSeparada.length; i++){
			montaFrase = montaFrase+ fraseSeparada[i]+" ";
		}
		return montaFrase.trim();
	}
}
