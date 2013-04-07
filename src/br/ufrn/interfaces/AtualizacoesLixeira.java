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
    
    public void avisar(String area, String status);
    
    public void chamar(String area, String agente);
    
    public void setVisible(boolean v);
    
}
