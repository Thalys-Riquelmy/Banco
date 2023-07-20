
public class Conta {

		private int numconta;
		private String titular;
		private double saldo;
		static int qtdcontas = 0;
		

	public Conta(String pTitular) {
		this.titular = pTitular;
		qtdcontas++;
		this.numconta = qtdcontas;
		this.saldo = 0;
	}
	
	public void DadosBancarios() {
		System.out.println("");
		System.out.println("--Dados Bancários--");
		System.out.println("-Número da Conta: " + this.numconta);
		System.out.println("-Titular: " + this.titular);
		System.out.println("-Saldo: " + this.saldo);
		System.out.println("----Fim Dados Bancários----");
		System.out.println("");
	}
	
	public void Depositar(double pValor) {
		System.out.println("");
		System.out.println("----Realizando Depósito----");
		System.out.println("-Saldo Anterior: " + this.saldo);
		this.saldo += pValor; //this.saldo = this.saldo + pValor;\\
		System.out.println("-Deposito Realizado com sucesso!-");
		System.out.println("Saldo Atual: " + this.saldo);
		System.out.println("----Fim do Deposito----");	
		System.out.println("");
	}
	
	public void Sacar (double pValor) {
		System.out.println("");
		System.out.println("----Realizando Saque----");
		System.out.println("-Saldo Anterior-" + this.saldo);
		if(pValor <= this.saldo) {
			this.saldo -= pValor;
			System.out.println("-Saldo Realizado Com Sucesso!-");
			System.out.println("Saldo Atual: " + this.saldo);
		}
		else {
			System.out.println("Saldo insuficiente");
		   }
		System.out.println("----Fim do Saque----");
		System.out.println("");
		
		}
	}
	


