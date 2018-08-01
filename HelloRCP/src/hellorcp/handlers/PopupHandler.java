package hellorcp.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class PopupHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		HelloWorldPrinter printer = new HelloWorldPrinter();
		String result = printer.printHelloWorld();
		
		System.out.println("result : " + result);
		
		return null;
	}

}
