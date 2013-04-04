package br.ufrn.services;

import br.ufrn.interfaces.AtualizacoesPoluicao;
import br.ufrn.GUI.SecretariaMeioAmbiente;
import context.arch.comm.CommunicationsHandler;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;


public class PollutionService extends Service{
	
    private AtualizacoesPoluicao atualizacoesPoluicao = SecretariaMeioAmbiente.getInstance();

	public PollutionService(final Widget widget) {
		super(widget, "pollutionService", 
				new FunctionDescriptions() {
			{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"pollutionControl", 
						"pollution level of the place", 
						widget.getNonConstantAttributes()));
			}
		});
		
	
		
	}

	@Override
	public DataObject execute(ServiceInput input) {
		
		String message = input.getInput().getAttributeValue("classification");
		
                String valores[] = message.split("-");
                atualizacoesPoluicao.setVisible(true);
                atualizacoesPoluicao.atualizar(Integer.parseInt(valores[2]), valores[0]);
  
		
		return null;
	}

}
