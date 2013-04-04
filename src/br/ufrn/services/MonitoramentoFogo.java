package br.ufrn.services;

import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;

public class MonitoramentoFogo {
	
protected Widget fireWidget;
	
	protected Widget fire;

	protected Enactor enactor;
	
	protected FireService fireService;
	

	public MonitoramentoFogo() {
		// TODO Auto-generated constructor stub
		
		

		fireWidget = WidgetXmlParser.createWidget("Fire/fire-widget-input.xml");
		fireWidget.updateData("enableNotificatons", false);

		fire = WidgetXmlParser.createWidget("Fire/fire-widget-output.xml");
		fireService = new FireService(fire);
		fire.addService(fireService);
		
		enactor = EnactorXmlParser.createEnactor("Fire/fire-enactor.xml");

	}
	
	public void setFire(String area, boolean fire){
		
		fireWidget.updateData("area", area);
		fireWidget.updateData("isFire", fire);
		fireWidget.updateData("enableNotificatons", true);
		fireWidget.updateData("enableNotificatons", false);
		
	}


}
