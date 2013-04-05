/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;
/**
 *
 * @author Madson
 */
public class MonitoramentoLixeira {
    
            protected Widget statusTrash;

            protected Widget trash;

            protected Enactor enactor;
            
            protected TrashService trashService;


            public MonitoramentoLixeira() {



                    trash = WidgetXmlParser.createWidget("Trash/trash-widget-input.xml");
                    trash.updateData("enableNotificatons", false);
                    trash.updateData("near", "agente1");
                    statusTrash = WidgetXmlParser.createWidget("Trash/trash-widget-output.xml");
                    trashService = new TrashService(trash);
                    statusTrash.addService(trashService);


                    enactor = EnactorXmlParser.createEnactor("Trash/trash-enactor.xml");

            }

            public void setTrash(String area, int content){

                    trash.updateData("area", area);
                    trash.updateData("content", content);
                    trash.updateData("enableNotificatons", true);
                    trash.updateData("enableNotificatons", false);

            }


}
