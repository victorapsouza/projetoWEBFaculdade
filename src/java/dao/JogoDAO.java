/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Jogo;

/**
 *
 * @author Victor
 */
//classe para criar um "contratado", assim a classe JogoDAOIMP, tem que obedecer
public interface JogoDAO {
    
    public void save (Jogo jogo);
    public void remove(Jogo jogo);
    public void update(Jogo jogo);
    
}
