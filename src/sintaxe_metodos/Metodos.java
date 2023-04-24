package sintaxe_metodos;

public class Metodos {

	public static void main(String[] args) {
		/**
		 * Todas as ações das aplicações são consideradas métodos.
		 * 
		 *	Uma classe é definida por atributos e métodos.
		 *  Já vimos que atributos são, em sua grande maioria, 
		 *  variáveis de diferentes tipos e valores. 
		 *  Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.
		 *	Critério de nomeação de Métodos
		 *	Esses critérios não são obrigatórios, 
		 *	mas é recomendável que sejam seguidos, 
		 *	pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. 
		 *	Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:
		 *	Deve ser nomeado como verbo;
		 *	Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).
		 *	Exemplos sugeridos para nomenclatura de métodos:
		 * 
		 * 
		 */

		
			// somar(int numero1, int numero2) {}
				
			// abrirConexao(){}
		
			// concluirProcessamento(){}
		
			// findById(int id) nao se assuste, voce verá muito metodo em ingles 
		
			// caucularImprimir(){} ha algo de errado nesse metodo, ele deveria ter uma unica finalidade
		
		/**
		 * ATENÇÃO! Não existe em Java o conceito de métodos globais. 
		 * Todos os métodos devem SEMPRE ser definidos dentro de uma classe.
		 */
	
		
		
			/**
			 * 	Critério de definição de métodos
			 *	Mas, como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, 
			 * 	somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:
			 *	Qual a proposta principal do método? Você deve se perguntar constantemente até compreender
			 *	 a real finalidade do mesmo.
			 *	Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não.
			 */
		
		
//		public double somar(int num1, int num2){
//			//LOGICA - FINALIDADE DO MÉTODO
//			return ... ;
//		}
		
//		public void imprimir(String texto){
			//LOGICA - FINALIDADE DO MÉTODO
			//AQUI NÃO PRECISA DO RETURN
			//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
		}
		// throws Exception : indica que o método ao ser utilizado
		// poderá gerar uma exceção
	//	public void dividir(int dividendo, int divisor) throws Exception{}
		
		// este método não pode ser visto por outras classes no projeto
	//	private void metodoPrivado(){}
		
		//alguns equívocos estruturais
//		public void validar(){
			//este método deveria retornar algum valor
			//no caso boolean (true ou false)
//		}
//		public void calcularEnviar(){
			//um método deve representar uma única responsabilidade
//		}
//		public void gravarCliente(String nome, String cpf, Integer telefone){
			//este método tem a finalidade de gravar
			//informações de um cliente, por que não criar
			//um objeto cliente e passar como parâmetro ?
			//veja abaixo
//		}
//		public void gravarCliente(Cliente cliente){}
		//ou
//		public void gravar(Cliente cliente){}
		
		
	}


