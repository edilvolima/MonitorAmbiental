/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.interfaces;

/**
 *
 * @author Madson
 */
public interface AtualizacoesLixeira {
    
    public void atualizar(int area, String status);
    
    public void avisar(int area, String status);
    
    public void chamar(String situacao, String agente);
    
    public void setVisible(boolean v);
    
}
