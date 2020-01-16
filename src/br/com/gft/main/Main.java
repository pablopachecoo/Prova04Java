package br.com.gft.main;
import br.com.gft.model.Funcionario;
import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("fabio", 40, 10000);
		Supervisor superviso = new Supervisor("Gios", 30, 5000);
		Vendedor vendedor = new Vendedor("Lois", 23, 3000);
		
		System.out.println("Nome gerente: " + gerente.getNome() + "\n" +  "Idade gerente: " + gerente.getIdade() + "\n" +  "Gerente salario: " + gerente.bonificacao());
		System.out.println("____________________________________________________________");
		System.out.println("Nome supervisor: " + superviso.getNome() + "\n" +  "Idade supervisor: " + superviso.getIdade() + "\n" +  "supervisor salario: " + superviso.bonificacao());
		System.out.println("____________________________________________________________");
		System.out.println("Nome vendedor: " + vendedor.getNome() + "\n" +  "Idade vendedor: " + vendedor.getIdade() + "\n" +  "vendedor salario: " + vendedor.bonificacao());
		
			
		}
		
		
	}


