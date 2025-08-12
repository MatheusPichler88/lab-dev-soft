package Aula_2.Banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento cc = new CartaoCredito("Cartão de Crédito");
        MetodoPagamento pp = new PayPal("Paypal");
        MetodoPagamento pix = new PixPagamento("Pix");
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o método de pagamento");
        System.out.println("1 - Cartão de Credito");
        System.out.println("2 - Paypal ");
        System.out.println("3 - Pix");
        System.out.println("Escolha:");
        switch(sc.nextInt()){
            case 1:
                System.out.println("Digite o valor: ");
                cc.processaPagamento(sc.nextDouble());
                cc.mostrarDetalhesPagamento();
                break;
            case 2:
                System.out.println("Digite o valor: ");
                pp.processaPagamento(sc.nextDouble());
                pp.mostrarDetalhesPagamento();
                break;
            case 3:
                System.out.println("Digite o valor: ");
                pix.processaPagamento(sc.nextDouble());
                pix.mostrarDetalhesPagamento();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
