package sintaxe_metodos;

public class Metodos {

	public static void main(String[] args) {
		/**
		 * Todas as a��es das aplica��es s�o consideradas m�todos.
		 * 
		 *	Uma classe � definida por atributos e m�todos.
		 *  J� vimos que atributos s�o, em sua grande maioria, 
		 *  vari�veis de diferentes tipos e valores. 
		 *  Os m�todos, por sua vez, correspondem a fun��es ou sub-rotinas dispon�veis dentro de nossas classes.
		 *	Crit�rio de nomea��o de M�todos
		 *	Esses crit�rios n�o s�o obrigat�rios, 
		 *	mas � recomend�vel que sejam seguidos, 
		 *	pois essas conven��es facilitam a vida dos programadores ao trabalharem em c�digos de forma colaborativa. 
		 *	Ao seguir estas conven��es, tornamos o c�digo mais leg�vel para n�s e tamb�m para outras pessoas. Para m�todos, os crit�rios s�o:
		 *	Deve ser nomeado como verbo;
		 *	Seguir o padr�o camelCase (Todas as letras min�sculas com a exce��o da primeira letra da segunda palavra).
		 *	Exemplos sugeridos para nomenclatura de m�todos:
		 * 
		 * 
		 */

		
			// somar(int numero1, int numero2) {}
				
			// abrirConexao(){}
		
			// concluirProcessamento(){}
		
			// findById(int id) nao se assuste, voce ver� muito metodo em ingles 
		
			// caucularImprimir(){} ha algo de errado nesse metodo, ele deveria ter uma unica finalidade
		
		/**
		 * ATEN��O! N�o existe em Java o conceito de m�todos globais. 
		 * Todos os m�todos devem SEMPRE ser definidos dentro de uma classe.
		 */
	
		
		
			/**
			 * 	Crit�rio de defini��o de m�todos
			 *	Mas, como sabemos a melhor forma, de definir os m�todos das nossas classes? Para chegar � essa conclus�o, 
			 * 	somos auxiliados por uma conven��o estrutural para todos os m�todos. Essa conven��o � determinada pelos aspectos abaixo:
			 *	Qual a proposta principal do m�todo? Voc� deve se perguntar constantemente at� compreender
			 *	 a real finalidade do mesmo.
			 *	Qual o tipo de retorno esperado ap�s executar o m�todo? Voc� deve analisar se o m�todo ser� respons�vel por retornar algum valor ou n�o.
			 */
		
		
//		public double somar(int num1, int num2){
//			//LOGICA - FINALIDADE DO M�TODO
//			return ... ;
//		}
		
//		public void imprimir(String texto){
			//LOGICA - FINALIDADE DO M�TODO
			//AQUI N�O PRECISA DO RETURN
			//POIS N�O SER� RETORNADO NENHUM RESULTADO
		}
		// throws Exception : indica que o m�todo ao ser utilizado
		// poder� gerar uma exce��o
	//	public void dividir(int dividendo, int divisor) throws Exception{}
		
		// este m�todo n�o pode ser visto por outras classes no projeto
	//	private void metodoPrivado(){}
		
		//alguns equ�vocos estruturais
//		public void validar(){
			//este m�todo deveria retornar algum valor
			//no caso boolean (true ou false)
//		}
//		public void calcularEnviar(){
			//um m�todo deve representar uma �nica responsabilidade
//		}
//		public void gravarCliente(String nome, String cpf, Integer telefone){
			//este m�todo tem a finalidade de gravar
			//informa��es de um cliente, por que n�o criar
			//um objeto cliente e passar como par�metro ?
			//veja abaixo
//		}
//		public void gravarCliente(Cliente cliente){}
		//ou
//		public void gravar(Cliente cliente){}
		
		
	}


