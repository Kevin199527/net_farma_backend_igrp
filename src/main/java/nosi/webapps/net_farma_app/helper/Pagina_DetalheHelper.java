package nosi.webapps.net_farma_app.helper;

import nosi.core.webapp.Core;
import nosi.core.webapp.business.IgrpPageHelper;
import nosi.webapps.net_farma_app.dao.TblMedicamentos;
import nosi.webapps.net_farma_app.pages.pagina_de_detalhe_de_produto.Pagina_de_detalhe_de_produto;
import nosi.webapps.net_farma_app.pages.pagina_de_detalhe_de_produto.Pagina_de_detalhe_de_produtoView;
import org.hibernate.Session;

public class Pagina_DetalheHelper extends IgrpPageHelper<Pagina_de_detalhe_de_produto, Pagina_de_detalhe_de_produtoView> {

    protected Pagina_DetalheHelper(Session session, Pagina_de_detalhe_de_produto model, Pagina_de_detalhe_de_produtoView view) {
        super(session, model, view);
        // TODO Auto-generated constructor stub
    }

    public static Pagina_DetalheHelper with(Session session, Pagina_de_detalhe_de_produto model, Pagina_de_detalhe_de_produtoView view) {
        return new Pagina_DetalheHelper(session, model, view);
    }

    public static Pagina_DetalheHelper with(Session session, Pagina_de_detalhe_de_produto model) {
        return new Pagina_DetalheHelper(session, model,null);
    }

    public void receberDadosPageDetalhe() {
        /*Obtém uma instância de TblMedicamentos com base no ID fornecido no model
		 O método Core.toInt é usado para converter o valor de model.getId_list(), que é uma String, para um Integer
		 Isso é necessário porque o campo ID em TblMedicamentos é do tipo Integer*/
        TblMedicamentos t = new TblMedicamentos().findOne(Core.toInt(model.getId_list()));

        // Verificar se o param de p_detalhe é igual a SIM dentro do /*----#start-code(visualizar)----*/
        // na class PaginalistarprodutoController para ocultar o botão de concluir.
        if (Core.getParam("p_detalhe").equals("SIM")){
            view.btn_concluir.setVisible(false);
            view.nome_do_produto.propertie().add("disabled","true");
            view.preco_do_produto.propertie().add("disabled","true");
            view.descricao_do_produto.propertie().add("disabled","true");
            view.contem_receita.propertie().add("disabled","true");
            view.tipo_de_produto.propertie().add("disabled","true");
        }

        if (Core.isNotNullOrZero(model.getId_list())) {
            // Verifica se a instância de TblMedicamentos não é nula
            if (Core.isNotNull(t) && !t.hasError()) {
                // Define os dados do produto no model recuperado da instância de TblMedicamentos
                model.setNome_do_produto(t.getNome());
                model.setPreco_do_produto(t.getPreco());
                model.setTipo_de_produto(t.getTipoDeProduto());
                model.setContem_receita(t.getReceita());
                model.setDescricao_do_produto(t.getDescricao());

                t.update().where("id = " + Core.getParam("p_id_list"));
            }
        }
    }

    public void editarDados(){
        try{
            TblMedicamentos t = new TblMedicamentos().findOne(Core.toInt(model.getId_list()));
            if (Core.isNotNullOrZero(model.getId_list())) {
                // Verifica se a instância de TblMedicamentos não é nula
                if (Core.isNotNull(t) && !t.hasError()) {
                    // Define os dados do produto no model recuperado da instância de TblMedicamentos
                    t.setNome(model.getNome_do_produto());
                    t.setPreco(model.getPreco_do_produto());
                    t.setTipoDeProduto(model.getTipo_de_produto());
                    t.setReceita(model.getContem_receita());
                    t.setDescricao(model.getDescricao_do_produto());

                    t.update().where("id = " + Core.getParam("p_id_list"));
                }
            }
        } catch (Exception e) {
            Core.setMessageError(""+e);
        }

    }

}