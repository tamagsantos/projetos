import javax.swing.JOptionPane;

public class agendacripto {
public static void main(String[]ags){
  
    //Solicitando entrada do usuário
    String entrada = JOptionPane.showInputDialog(null,"Digite uma seguencia de caracteres para criptografar:");
    
    //Convertendo a string em um vetor de caracteres
    char[] caracteres = entrada.toCharArray();

    //Convertendo o vetor de caracteres em números inteiros e aplicar a cripto
    StringBuilder criptografado = new StringBuilder();
    for (char c : caracteres){
        int ascii = (int) c + 10; //Soma  ao valor ASCII
        criptografado.append((char) ascii); //Converte de volta para carectere e adiciona a string cripto
    }

    JOptionPane.showMessageDialog(null, "String critografada:" + criptografado.toString());
}
}