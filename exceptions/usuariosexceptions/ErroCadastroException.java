package usuariosexceptions;

public class ErroCadastroException extends EntradaException {
	
	//Erros referentes ao cadastro de usuarios.
	
	private String message = "Erro no cadastro de Usuarios.";
	
	public ErroCadastroException(){
		super();
	}
	
	public ErroCadastroException(String message){
		super(message);
	}

}
