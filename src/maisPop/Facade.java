package maisPop;

import easyaccept.EasyAccept;

public class Facade {
	
	private System system;
	
	public static void main(String[] args) {
	    args = new String[] {
	    		"maisPop.Facade",
	    		"resources/Scripts de Teste/usecase_1.txt"};
	    EasyAccept.main(args);
	}
	
	public void iniciaSistema(){
			system.iniciaSistema();
		}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNasc, String imagem) throws Exception{
		return system.cadastraUsuario(nome, email, senha, dataNasc, imagem);
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNasc) throws Exception{
		return this.cadastraUsuario(nome, email, senha, dataNasc, "resources/default.jpg");
	}
}
