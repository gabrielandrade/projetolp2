package usuariosexceptions;

public class AtualizaUsuarioException extends EntradaException {
	
	//Todos os tratamentos referentes ao usu�rio

	private String message = "Erro na atualizacao de perfil.";
	
	public AtualizaUsuarioException() {
		super();
	}

	public AtualizaUsuarioException(String message) {
		super(message);
	}
}