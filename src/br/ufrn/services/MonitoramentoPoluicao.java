package br.ufrn.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;


public class MonitoramentoPoluicao {
	
	protected Widget indexPollutants;
	
	protected Widget pollution;

	protected Enactor enactor;
	
	protected PollutionService pollutionService;
	

	public MonitoramentoPoluicao() {
		
		

		indexPollutants = WidgetXmlParser.createWidget("Pollution/pollution-widget-input.xml");
		indexPollutants.updateData("enableNotificatons", false);

		pollution = WidgetXmlParser.createWidget("Pollution/pollution-widget-output.xml");
		pollutionService = new PollutionService(pollution);
		pollution.addService(pollutionService);
		

		enactor = EnactorXmlParser.createEnactor("Pollution/pollution-enactor.xml");

	}
	
	public void setLevelPollution(String area, int indexPollution){
		
		indexPollutants.updateData("area", area);
		indexPollutants.updateData("indexPollution", indexPollution);
		indexPollutants.updateData("enableNotificatons", true);
		indexPollutants.updateData("enableNotificatons", false);
		
	}


}
