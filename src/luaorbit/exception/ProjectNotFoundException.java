package luaorbit.exception;

public class ProjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6117135068731831269L;

	public ProjectNotFoundException(){
		super("The project cannot be found or doesn't exists!");
	}
	
	public ProjectNotFoundException(String message){
		super(message);
	}
}
