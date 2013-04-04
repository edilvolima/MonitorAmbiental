package br.ufrn.services;

import br.ufrn.interfaces.AtualizacoesBombeiros;
import br.ufrn.GUI.Bombeiros;
import context.arch.comm.CommunicationsHandler;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;


public class FireService extends Service{
	
    private AtualizacoesBombeiros atB = Bombeiros.getInstance();

	public FireService(final Widget widget) {
		super(widget, "fireService", 
				new FunctionDescriptions() {
			{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"fireControl", 
						"pollution level of the place", 
						widget.getNonConstantAttributes()));
			}
		});
		
	
		
	}

	@Override
	public DataObject execute(ServiceInput input) {
		
		String message = input.getInput().getAttributeValue("message");
		
                String valores[] = message.split("-");
                
                atB.setVisible(true);
                atB.atualizar(Integer.parseInt(valores[2]), valores[0].equals("isFire"));
                
                
		System.out.println("menssagem : "+message);
		
		return null;
	}

}
