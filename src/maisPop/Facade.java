package maisPop;

import java.util.List;

import easyaccept.EasyAccept;
import usuariosexceptions.EntradaException;

public class Facade {
	
	private List<Usuario> usuarios;
	
	public static void main(String[] args) {
	    args = new String[] {
	    		"maisPop.Facade",
	    		"resources/Scripts de Teste/usecase_1.txt"};
	    EasyAccept.main(args);
	}
	
	public void iniciaSistema() {
		//iniciar sistema
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNasc, String imagem) throws Exception{
		Usuario novoUsuario = new Usuario(nome, email, senha, dataNasc, imagem);
		if (getUsuarios().contains(novoUsuario))
			throw new EntradaException("Usuario ja esta cadastrado no +Pop.");
		usuarios.add(novoUsuario);
		return email;
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNasc) throws Exception{
		Usuario novoUsuario = new Usuario(nome, email, senha, dataNasc, "resources/default.png");
		if (getUsuarios().contains(novoUsuario))
			throw new EntradaException("Usuario ja esta cadastrado no +Pop.");
		usuarios.add(novoUsuario);
		return email;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
