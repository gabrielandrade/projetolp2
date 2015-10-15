package maisPop;

import java.text.ParseException;
import java.util.Date;

import usuariosexceptions.AtualizaUsuarioException;

public class Usuario {
	
	private String email, senha, nome;
	private Date dataNasc;
	private String imagem;
	
	public Usuario(String email, String senha, String nome, String dataNasc, String imagem) throws Exception {
		super();
		setEmail(email);
		setSenha(senha);
		setNome(nome);
		this.dataNasc = UsuarioAux.formataData(dataNasc);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws AtualizaUsuarioException {
		if (UsuarioAux.validaEmail(email) == false)
			if (email != null){
				throw new AtualizaUsuarioException(
						"Erro na atualizacao de perfil. Formato de e-mail esta invalido.");
			}else{
				throw new AtualizaUsuarioException("Email nao pode ser nulo ou vazio.");
			}
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws AtualizaUsuarioException {
		if (nome == null || nome.equals(""))
			throw new AtualizaUsuarioException(
					"Erro na atualizacao de perfil. Nome dx usuarix nao pode ser vazio.");
		this.nome = nome;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String novaDataNasc) throws AtualizaUsuarioException, ParseException{
		if (UsuarioAux.validaDiaDaData(novaDataNasc) == true
				|| UsuarioAux.validaIntervalosDeData(novaDataNasc) == false)
			throw new AtualizaUsuarioException(
					"Erro na atualizacao de perfil. Formato de data esta invalida.");
		if (UsuarioAux.isDateValid(novaDataNasc) == false)
			throw new AtualizaUsuarioException(
					"Erro na atualizacao de perfil. Data nao existe.");
		this.dataNasc = UsuarioAux.formataData(novaDataNasc);
	}

	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) throws AtualizaUsuarioException {
		if (nome == null || nome.equals(""))
			throw new AtualizaUsuarioException("Imagem nao pode ser nula ou vazia.");
		this.imagem = imagem;
	}
}
