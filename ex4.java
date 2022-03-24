import javax.swing.JOptionPane;
public class ex4 {
    public static void main(String[] args) {
        int numero, resultado = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        for (int i = 2;i <= numero / 2; i++){
            if (numero % i == 0){
                resultado++;
                break;
            }
        }
        if (resultado == 0){
            System.out.printf("%d é um numero primo \n", numero);
        }
        else 
            System.out.printf("%d não é um numero primo \n", numero);
    }
}
