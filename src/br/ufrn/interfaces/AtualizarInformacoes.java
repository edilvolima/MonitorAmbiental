/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.interfaces;

/**
 *
 * @author Residentes
 */
public interface AtualizarInformacoes {
    
    public void atualizarInformacoesPoluicao(int indicePoluicao, String area);
    
    public void atulaizarInformacoesIncendio(boolean isFire, String area);
    
    public void atualizarTemperatura(int temperatura, String area);
    
    public void atualizarInformacoesLixeira (int content, String area);
    
}
