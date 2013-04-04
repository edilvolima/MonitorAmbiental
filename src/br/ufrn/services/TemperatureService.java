package br.ufrn.services;

import br.ufrn.GUI.MonitorTemperatura;
import br.ufrn.interfaces.atualizacoesTemperatura;
import context.arch.comm.CommunicationsHandler;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;


public class TemperatureService extends Service{
	

    private atualizacoesTemperatura aTemperatura = MonitorTemperatura.getInstance();
    
	public TemperatureService(final Widget widget) {
		super(widget, "temperatureService", 
				new FunctionDescriptions() {
			{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"temperatureControl", 
						"pollution level of the place", 
						widget.getNonConstantAttributes()));
			}
		});
		
	
		
	}

	@Override
	public DataObject execute(ServiceInput input) {
		
		String message = input.getInput().getAttributeValue("message");
		System.out.println(message);
		String v[] = message.split(":");
                
                aTemperatura.setVisible(true);
                
                aTemperatura.atualizar(Integer.parseInt(v[2]), Float.parseFloat(v[0]));
                
		
		
		return null;
	}

}
