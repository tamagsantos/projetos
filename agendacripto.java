import javax.swing.JOptionPane;

public class agendacripto {
public static void main(String[]ags){
  
    //Solicitando entrada do usuário
    String entrada = JOptionPane.showInputDialog(null, "Olá, insira uma String de entrada: ");

    if (entrada == null || entrada.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida, revise por favor!");
        return; // Saindo para correção caso não for inserido algo.
    }

    JOptionPane.showMessageDialog(null, entrada);

    // Determinando o tamanho da string 
    int tamanho = entrada.length();
    
    //Convertendo a string em um vetor de caracteres
    char[] caracteres = entrada.toCharArray();

    //Convertendo o vetor de caracteres em números inteiros e aplicar a cripto
    StringBuilder criptografado = new StringBuilder();
    for (char c : caracteres){
        int ascii = (int) c + 10; //Soma  ao valor ASCII
        criptografado.append((char) ascii); //Converte de volta para carectere e adiciona a string cripto
    }

    JOptionPane.showMessageDialog(null, "String critografada:\n" + criptografado.toString() + "\nTamanho da String original:" + tamanho);
}
}