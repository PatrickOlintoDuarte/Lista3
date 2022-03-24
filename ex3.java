import javax.swing.JOptionPane;
public class ex3 {
    public static void main(String[] args) {
        int numero, fatorial;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        for (fatorial = 1 ;numero > 1; numero = numero - 1){
            fatorial  = fatorial * numero;
        }
        System.out.println(fatorial);
    }
}
