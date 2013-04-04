/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.services;

import br.ufrn.GUI.SecretariaServicoUrbano;
import br.ufrn.interfaces.AtualizacoesLixeira;
import context.arch.comm.CommunicationsHandler;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

/**
 *
 * @author Madson
 */
public class TrashService extends Service{
    

    public static final String CONTROL = "trashControl";
    public static final String GATHERING = "trashGathering";
    
    private AtualizacoesLixeira atualizacoesLixeira = SecretariaServicoUrbano.getInstance();

            public TrashService(final Widget widget) {
                    super(widget, "trashService", 
                                    new FunctionDescriptions() {
                            { // constructor
                                    // define function for the service
                                    add(new FunctionDescription(
                                                    CONTROL, 
                                                    "Avisa se uma lixeira encheu", 
                                                    widget.getNonConstantAttributes()));
                                    add(new FunctionDescription(
                                                    GATHERING,
                                                    "chama o service de coleta.",
                                                    widget.getNonConstantAttributes()));
                            }
                    });



            }

            @Override
             public DataObject execute(ServiceInput serviceInput) {

                    String functionName = serviceInput.getFunctionName();

                    if (functionName.equals(CONTROL)) {
                        
                        String message = serviceInput.getInput().getAttributeValue("status");
                        System.out.println(message);
                        
                        String valores[] = message.split("-");
                        atualizacoesLixeira.setVisible(true);
                        atualizacoesLixeira.atualizar(Integer.parseInt(valores[2]), valores[0]);

                    }
                    else if (functionName.equals(GATHERING)) {

                        String message = serviceInput.getInput().getAttributeValue("status");
                        System.out.println(message);
                        
                        String valores[] = message.split("-");

                        if (valores[0].equals("LIMITE")) {
                            atualizacoesLixeira.setVisible(true);
                            atualizacoesLixeira.avisar(Integer.parseInt(valores[2]), valores[0]);

                        }
                        else if (valores[0].equals("CHEIA")){
                            atualizacoesLixeira.setVisible(true);
                            atualizacoesLixeira.chamar(valores[0], valores[3]);

                        }

                    }

                    return null;

            }
}

