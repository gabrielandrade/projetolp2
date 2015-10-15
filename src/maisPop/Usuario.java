package maisPop;

import java.text.ParseException;
import java.util.Date;

import usuariosexceptions.AtualizaPerfilException;

public class Usuario {
	
	private String email, senha, nome;
	private Date dataNasc;
	private String imagem;
	
	public Usuario(String email, String senha, String nome, String dataNasc, String imagem) throws Exception {
		super();
		setEmail(email);
		setSenha(senha);
		setNome(nome);
		this.dataNasc = UtilUsuario.formataData(dataNasc);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws AtualizaPerfilException {
		if (UtilUsuario.validaEmail(email) == false)
			throw new AtualizaPerfilException(
					"Erro na atualizacao de perfil. Formato de e-mail esta invalido.");
		if (email == null || email.equals(""))
			throw new AtualizaPerfilException("Email nao pode ser nulo ou vazio.");
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
	public void setNome(String nome) throws AtualizaPerfilException {
		if (nome == null || nome.equals(""))
			throw new AtualizaPerfilException(
					"Erro na atualizacao de perfil. Nome dx usuarix nao pode ser vazio.");
		this.nome = nome;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String novaDataNasc) throws AtualizaPerfilException, ParseException{
		if (UtilUsuario.validaDiaDaData(novaDataNasc) == true
				|| UtilUsuario.validaIntervalosDeData(novaDataNasc) == false)
			throw new AtualizaPerfilException(
					"Erro na atualizacao de perfil. Formato de data esta invalida.");
		if (UtilUsuario.isDateValid(novaDataNasc) == false)
			throw new AtualizaPerfilException(
					"Erro na atualizacao de perfil. Data nao existe.");
		this.dataNasc = UtilUsuario.formataData(novaDataNasc);
	}

	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) throws AtualizaPerfilException {
		if (nome == null || nome.equals(""))
			throw new AtualizaPerfilException("Imagem nao pode ser nula ou vazia.");
		this.imagem = imagem;
	}
}
