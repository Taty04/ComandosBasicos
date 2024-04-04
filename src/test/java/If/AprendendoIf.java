package If;

public class AprendendoIf {

	public static void main(String[] args) {
		

		
		System.out.println("Bem vindo ao Banco Champions");
		
		int boleto = 1100;
		int saldo= 1000;
		int limite= 200;
		int saldolimite= saldo + limite;
		int saldofinal = boleto-saldo;
		System.out.println(" Sistema de pagamento do banco");
		if (boleto<= saldolimite) {
			
			System.out.println("seu boleto no valor de " + boleto + " Reais");
			System.out.println("Foi pago com sucesso!");
			System.out.println("saldo restante é de:  ");
			System.out.println(saldolimite-boleto + " Reais");
		} else {
            System.out.println("saldo insuficiente");
		}
	}

}
