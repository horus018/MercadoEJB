package beans;

import ejbs.ProdutoDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import modelo.Produto;

@Named(value = "prodBean")
@RequestScoped
public class ProdutoBean {

    Produto produto; //ele consegue usar essa classe pois aq na aplicação bean nas libraries ele usa o ejb do Mercado q tem essa classe
    
    @EJB
    ProdutoDAO dao;
    
    public ProdutoBean() {
        produto = new Produto();
    }
    
    public String confirmar(){
        dao.inserir(produto);
        produto = new Produto();
        return null;
    }
    
    public List<Produto> getProdutos(){
        return dao.listar();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
