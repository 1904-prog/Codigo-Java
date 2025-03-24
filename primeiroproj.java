import javax.swing.JOptionPane;// biblioteca que permite criar caixas de dialogos 

public class primeiroproj {
    public static void main(String[] args) {

        String primeironumero = 
            JOptionPane.showInputDialog("primeiro numero:");
        String segundonumero = 
            JOptionPane.showInputDialog("segundo numero:");

            int numero1 = Integer.parseInt(primeironumero);// transformando o valor inserido pelo usuario em inteiro 
            int numero2 = Integer.parseInt(segundonumero);

            int soma = numero1 + numero2;// soma dos numeros inteiros 

            JOptionPane.showMessageDialog(null, "a soma é" +soma, "soma dos numeros", JOptionPane.PLAIN_MESSAGE);
    }
}
