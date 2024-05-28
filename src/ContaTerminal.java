import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, qual o seu nome?");
        String nomeUsuario = scanner.next();

        System.out.println("Poderia me informar o número de sua conta?");
        int contaUsuario = scanner.nextInt();

        System.out.println("Agora, necessito da informação de sua agência, mais precisamente o número dela");
        String agenciaUsuario = scanner.next();
        
        int senhaReal = 1234;
        double saldo = 245.22;

        
        System.out.println("Olá " + nomeUsuario + " seja bem-vindo");
        System.out.println("A sua conta " + contaUsuario + " está localizada na agência " + agenciaUsuario);
        System.out.println("Digite sua senha");
        int senhaPalpite = scanner.nextInt();

        if (senhaPalpite==senhaReal){
            System.out.println("Seu saldo atual é de " + saldo);
        } else{
            System.out.println("Senha errada");
        }

        System.out.println("Gostaria de realizar uma retirada? 1 para sim e 2 para não");
        int retirada = scanner.nextInt();
        int confirmação = 1;

        if (retirada == confirmação){
            System.out.println("De quanto seria a retirada?");
        }  
        else{
            System.out.println("Tenha um ótimo dia então");
        }
            double quantidadeRetirada = scanner.nextDouble();
            System.out.println("Certo, aguarde um momento");
        if (quantidadeRetirada > saldo){
            System.out.println("Você não possui saldo suficiente para a alteração");
        } else { 
            double novoSaldo = saldo - quantidadeRetirada;
            System.out.println("Seu novo saldo é de " + novoSaldo);
        }
    } 
}
