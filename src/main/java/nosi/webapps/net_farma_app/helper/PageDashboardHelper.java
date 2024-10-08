package nosi.webapps.net_farma_app.helper;
import nosi.core.webapp.Core;
import nosi.core.webapp.business.IgrpPageHelper;
import nosi.webapps.net_farma_app.dao.Vendas;
import nosi.webapps.net_farma_app.pages.pagina_dashboard.Pagina_dashboard;
import nosi.webapps.net_farma_app.pages.pagina_dashboard.Pagina_dashboardView;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class PageDashboardHelper extends IgrpPageHelper<Pagina_dashboard, Pagina_dashboardView> {

    protected PageDashboardHelper(Session session, Pagina_dashboard model, Pagina_dashboardView view) {
        super(session, model, view);
        // TODO Auto-generated constructor stub
    }

    public static PageDashboardHelper with(Session session, Pagina_dashboard model, Pagina_dashboardView view) {
        return new PageDashboardHelper(session, model, view);
    }

    public static PageDashboardHelper with(Session session, Pagina_dashboard model) {
        return new PageDashboardHelper(session, model,null);
    }

    public void chartsFarmacia(){
        view.chart_1.loadQuery(Core.query(Core.defaultConnection(),
                "SELECT nome as EixoX, Nome as EixoY, estoques as EixoZ FROM tbl_medicamentos"));


        view.chart_2.loadQuery(Core.query(Core.defaultConnection(),
                "SELECT produto_entrege as EixoY, nome_fornecedor as EixoX, SUM(quantidade) as EixoZ "
                        + "FROM fornecedores "
                        + "GROUP BY nome_fornecedor, produto_entrege "
                        + "ORDER BY EixoX"));

        view.chart_3.loadQuery(Core.query(Core.defaultConnection(),
                "SELECT tipo_produto as EixoX, EXTRACT(YEAR FROM data_venda) as EixoY, SUM(quantidade) as EixoZ "
                        + "FROM vendas "
                        + "GROUP BY tipo_produto, EXTRACT(YEAR FROM data_venda)"
                        + " ORDER BY EixoY"));
        /* ======================== Circlestatbox No Dashboard ======================== */

        // Query para pegar o total de medicamentos
        model.setCirclestatbox_produto_val(Core.query(Core.defaultConnection(),
                "SELECT COUNT(*) AS total_medicamentos FROM public.tbl_medicamentos").getResultList().get(0).get(0).toString());

        model.setCirclestatbox_estoque_val(Core.query(Core.defaultConnection(), "SELECT SUM(estoques) FROM tbl_medicamentos").getResultList().get(0).get(0).toString());
    }

    public void dadosTables(){
        List<Vendas> dadosVenda = new Vendas().all();

        if (dadosVenda != null) {
            List<Pagina_dashboard.Table_dados_de_venda> tabelaDadosVenda = new ArrayList<Pagina_dashboard.Table_dados_de_venda>();

            for (Vendas v : dadosVenda){
                Pagina_dashboard.Table_dados_de_venda t = new Pagina_dashboard.Table_dados_de_venda();
                t.setNome_de_produto(v.getProduto());
                t.setTipo_de_produto(v.getTipoProduto());
                t.setQuantidade(v.getQuantidade().toString());
                t.setPreco_unitario(v.getPrecoUnitario().toString());
                t.setData_de_venda(v.getDataVenda().toString());
                t.setMetodo_de_pagamento(v.getMetodoPagamento());
                t.setValor_total_pago(v.getValorTotal().toString());
                t.setEstado(v.getStatus());
                tabelaDadosVenda.add(t);
            }

            model.setTable_dados_de_venda(tabelaDadosVenda);
        }else{
            Core.setMessageError("No Data Found!");
        }

    }

}