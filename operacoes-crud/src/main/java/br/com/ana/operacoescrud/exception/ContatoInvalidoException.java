package br.com.ana.operacoescrud.exception;

public class ContatoInvalidoException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public ContatoInvalidoException (String mensagem) {
		super(mensagem);
	}
	
	

}
