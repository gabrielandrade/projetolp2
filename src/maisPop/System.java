package maisPop;

import java.util.List;

import usuariosexceptions.EntradaException;

public class System {
	
	private List<Usuario> usuarios;
	
	public void iniciaSistema() {
		//iniciar sistema
	}
	
	public String cadastraUsuario(String nome, String email, String senha, String dataNasc, String imagem) throws Exception {
		Usuario novoUsuario = new Usuario(nome, email, senha, dataNasc, imagem);
		if (getUsuarios().contains(novoUsuario))
			throw new EntradaException("Usuario ja esta cadastrado no +Pop.");
		usuarios.add(novoUsuario);
		return email;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
}
