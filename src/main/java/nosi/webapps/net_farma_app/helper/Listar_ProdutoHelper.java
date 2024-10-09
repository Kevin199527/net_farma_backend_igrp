package nosi.webapps.net_farma_app.helper;
import nosi.core.webapp.Core;
import nosi.core.webapp.business.IgrpPageHelper;
import nosi.webapps.net_farma_app.dao.TblMedicamentos;
import nosi.webapps.net_farma_app.pages.paginalistarproduto.Paginalistarproduto;
import nosi.webapps.net_farma_app.pages.paginalistarproduto.PaginalistarprodutoView;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listar_ProdutoHelper extends IgrpPageHelper<Paginalistarproduto, PaginalistarprodutoView> {

    protected Listar_ProdutoHelper(Session session, Paginalistarproduto model, PaginalistarprodutoView view) {
        super(session, model, view);
        // TODO Auto-generated constructor stub
    }

    public static Listar_ProdutoHelper with(Session session, Paginalistarproduto model, PaginalistarprodutoView view) {
        return new Listar_ProdutoHelper(session, model, view);
    }

    public static Listar_ProdutoHelper with(Session session, Paginalistarproduto model) {
        return new Listar_ProdutoHelper(session, model,null);
    }

    public void listarProdutos(){
        List<TblMedicamentos> lista_de_produto = new TblMedicamentos().find()
                .andWhere("nome", "LIKE", Core.isNotNull(model.getNome_filter()) ? "%" + model.getNome_filter() + "%" : null)
                .andWhere("tipoDeProduto", "LIKE", Core.isNotNull(model.getTipo_de_produto_filtro()) ?  "%" + model.getTipo_de_produto_filtro() + "%" : null)
                .andWhere("receita", "=", Core.isNotNull(model.getReceita_filter()) ? model.getReceita_filter() : null)
                .all();
        if (lista_de_produto != null){

            List<Paginalistarproduto.Tabela_de_produto> tabelaDeProdutos = new ArrayList<Paginalistarproduto.Tabela_de_produto>();

            for (TblMedicamentos t : lista_de_produto){
                Paginalistarproduto.Tabela_de_produto row = new Paginalistarproduto.Tabela_de_produto();
                row.setId_list(t.getIdProduto().toString());
                row.setNome_do_produto(t.getNome());
                row.setDescricao(t.getDescricao());
                row.setPreco(t.getPreco());
                row.setTipo_de_produto(t.getTipoDeProduto());
                row.setReceita(t.getReceita());

                tabelaDeProdutos.add(row);
            }


            model.setTabela_de_produto(tabelaDeProdutos);
        }else{
            Core.setMessageInfo("No Data Found");
        }
    }

    public void eliminarProd(){
        Integer id = Core.getParamInt("p_id_list");
        if (Core.isNotNullOrZero(id)){
            TblMedicamentos t = new TblMedicamentos().findOne(id);

            if (t != null && !t.hasError()){
                boolean deleted = t.delete(t.getIdProduto());

                if (deleted == true){
                    Core.setMessageSuccess("Produto Eliminado com Sucesso!");
                }else{
                    Core.setMessageError("Erro ao Eliminar o Produto!");
                }
            }else{
                Core.setMessageError("Id Not Valid!");
            }
        }
    }

}