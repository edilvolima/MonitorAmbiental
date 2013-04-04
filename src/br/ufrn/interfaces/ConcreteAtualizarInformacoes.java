/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.interfaces;

import br.ufrn.interfaces.AtualizarInformacoes;
import context.arch.discoverer.Discoverer;
import br.ufrn.services.MonitoramentoFogo;
import br.ufrn.services.MonitoramentoLixeira;
import br.ufrn.services.MonitoramentoPoluicao;
import br.ufrn.services.MonitoramentoTempertura;

/**
 *
 * @author Residentes
 */
public class ConcreteAtualizarInformacoes implements AtualizarInformacoes{

    private final MonitoramentoPoluicao mp;
    private final MonitoramentoFogo mf;
    private final MonitoramentoTempertura mt;
    private final MonitoramentoLixeira ml;
    
    public ConcreteAtualizarInformacoes(){
    	Discoverer.start();
    	
    	mp = new MonitoramentoPoluicao();
    	mf = new MonitoramentoFogo();
        mt = new MonitoramentoTempertura();
        ml = new MonitoramentoLixeira();
    }
    
    @Override
    public void atualizarInformacoesPoluicao(int indicePoluicao, String area) {
        mp.setLevelPollution(area, indicePoluicao);
    }

    @Override
    public void atulaizarInformacoesIncendio(boolean isFire, String area) {
       mf.setFire(area, isFire);
    }

    @Override
    public void atualizarTemperatura(int temperatura, String area) {
        mt.setTemperature(area, temperatura);
    }
    
    @Override
    public void atualizarInformacoesLixeira(int content, String area) {
        ml.setTrash(area, content);
    }
}
