package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class OtherHelloHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		NewPrinter newPrinter = new NewPrinter();
		String result = newPrinter.printHello();
		
		System.out.println("result : " + result);
		
		return null;
	}

}
