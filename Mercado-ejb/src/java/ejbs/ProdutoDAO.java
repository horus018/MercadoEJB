package ejbs;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import modelo.Produto;

@Stateless //é stateless pq nao precisa de estado pra só fazer cruds no banco, ele nao precisa guardar nenhuma informação pra isso
public class ProdutoDAO {
    
    //isso é um exemplo, nao faz sentido guardar uma lista com dados em um bean stateless, ele só executa e devolve, nao guarda nada
    public static List<Produto> lista = new LinkedList<>();
    
    public boolean inserir(Produto p){
        if (!lista.contains(p)) {
            lista.add(p);
            return true;
        }
        return false;
    }
    
    public void remover(Produto p){
        lista.remove(p);
    }
    
    public List<Produto> listar(){
        return lista;
    }
    
}
