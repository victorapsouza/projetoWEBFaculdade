/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.JogoDAO;
import dao.JogoDAOImp;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import modelo.Jogo;

/**
 *
 * @author Victor
 */
@ManagedBean
@SessionScoped
//classe para fornecer dados para a view
public class JogoControle {

    private Jogo jogo = new Jogo();
    private DataModel listaJogos;
    
    //criando um DataModel, para listar os jogos, faz parte do JSF
    public DataModel getListarJogos(){
        List<Jogo> lista = new JogoDAOImp().list();
        listaJogos = new ListDataModel(lista);
        return listaJogos;
    }

    
    public void setLivro(Jogo jogo) {
        this.jogo = jogo;

    }

    public Jogo getJogo() {
      return jogo;
        

    }

    public String adicionarJogo() {
        JogoDAO dao = new JogoDAOImp();
        dao.save(jogo);
        jogo = new Jogo();
        return "sucesso.xhtml";
        
    }

    public String prepararAdicionarJogo() {
        jogo = new Jogo();
        return "";
    }
    public String excluirJogo(){
    Jogo jogoTemp = (Jogo)(listaJogos.getRowData());
    JogoDAO dao = new JogoDAOImp();
    dao.remove(jogoTemp);
    return "index";
}   public String alterarJogo() {
    
    JogoDAO dao = new JogoDAOImp();
    dao.update (jogo);
    return "index";
    
    
    
    
}
public String prepararAlterarJogo(){
jogo = (Jogo)(listaJogos.getRowData());
return "formulario";
}


}
