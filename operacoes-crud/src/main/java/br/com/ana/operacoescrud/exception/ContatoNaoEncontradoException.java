package br.com.ana.operacoescrud.exception;

public class ContatoNaoEncontradoException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public ContatoNaoEncontradoException (String mensagem) {
		super(mensagem);
	}
	
	

}
