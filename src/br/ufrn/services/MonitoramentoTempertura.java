package br.ufrn.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;

public class MonitoramentoTempertura {
	
protected Widget temperatureWidget;
	
	protected Widget temperature;

	protected Enactor enactor;
	
	protected TemperatureService temperatureService;
	

	public MonitoramentoTempertura() { 
		// TODO Auto-generated constructor stub
		
		

		temperatureWidget = WidgetXmlParser.createWidget("Temperature/temperature-widget-input.xml");
		temperatureWidget.updateData("enableNotificatons", false);

		temperature = WidgetXmlParser.createWidget("Temperature/temperature-widget-output.xml");
		temperatureService = new TemperatureService(temperature);
		temperature.addService(temperatureService);
		
		enactor = EnactorXmlParser.createEnactor("Temperature/temperature-enactor.xml");

	}
	
	public void setTemperature(String area, float temperature){
		
		temperatureWidget.updateData("area", area);
		temperatureWidget.updateData("temperature", temperature);
		temperatureWidget.updateData("enableNotificatons", true);
		temperatureWidget.updateData("enableNotificatons", false);
		
	}


}
