package nosi.webapps.net_farma_app.pages.pagina_dashboard;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.net_farma_app.helper.PageDashboardHelper;

/*----#end-code----*/
		
public class Pagina_dashboardController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_dashboard();
		model.load();
		model.setCirclestatbox_produto_title("Produto");
		model.setCirclestatbox_produto_lbl("percent");
		model.setCirclestatbox_produto_val("62.5");
		model.setCirclestatbox_produto_desc("Some Text Here");
		model.setCirclestatbox_produto_url("http://www.example.com");
		model.setCirclestatbox_produto_bg("cp-cyan");
		model.setCirclestatbox_estoque_title("Total de Produto em Estoque");
		model.setCirclestatbox_estoque_lbl("percent");
		model.setCirclestatbox_estoque_val("51.4");
		model.setCirclestatbox_estoque_desc("Some Text Here");
		model.setCirclestatbox_estoque_url("http://www.example.com");
		model.setCirclestatbox_estoque_bg("cp-cyan");
		model.setCirclestatbox_funcionario_title("Funcionario");
		model.setCirclestatbox_funcionario_lbl("percent");
		model.setCirclestatbox_funcionario_val("51.1");
		model.setCirclestatbox_funcionario_desc("Some Text Here");
		model.setCirclestatbox_funcionario_url("http://www.example.com");
		model.setCirclestatbox_funcionario_bg("cp-field");
		model.setCirclestatbox_fornecedor_title("Fornecedor");
		model.setCirclestatbox_fornecedor_lbl("percent");
		model.setCirclestatbox_fornecedor_val("47.8");
		model.setCirclestatbox_fornecedor_desc("Some Text Here");
		model.setCirclestatbox_fornecedor_url("http://www.example.com");
		model.setCirclestatbox_fornecedor_bg("cp-ink");
		model.setCirclestatbox_venda_title("Venda");
		model.setCirclestatbox_venda_lbl("percent");
		model.setCirclestatbox_venda_val("60.8");
		model.setCirclestatbox_venda_desc("Some Text Here");
		model.setCirclestatbox_venda_url("http://www.example.com");
		model.setCirclestatbox_venda_bg("cp-lavendar");
		model.setCirclestatbox_4_title("Circle Box Title");
		model.setCirclestatbox_4_lbl("percent");
		model.setCirclestatbox_4_val("21.9");
		model.setCirclestatbox_4_desc("Some Text Here");
		model.setCirclestatbox_4_url("http://www.example.com");
		model.setCirclestatbox_4_bg("cp-stylish");
		var view = new Pagina_dashboardView();
		view.status_1.loadDomain("Status","net_farma_app","-- Selecionar --");
		view.tipo_de_produto_filtro.loadDomain("Tipo de Produto","net_farma_app","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_dados_de_venda(Core.query(null,"SELECT 'pendente' as estado,'Sit sit aliqua amet totam' as nome_de_produto,'Sit lorem mollit lorem omnis' as nome_de_produto_1,'Natus perspiciatis ipsum accus' as tipo_de_produto,'Amet accusantium adipiscing ac' as quantidade,'Sit voluptatem anim laudantium' as preco_unitario,'Omnis doloremque sit labore om' as data_de_venda,'Natus iste sed doloremque labo' as metodo_de_pagamento,'Natus doloremque labore ut und' as valor_total_pago "));
		view.chart_3.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.chart_2.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setCirclestatbox_produto_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_estoque_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_funcionario_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_fornecedor_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_venda_url(Core.getIGRPLink("your app","your page","your action"));
		model.setCirclestatbox_4_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
			PageDashboardHelper.with(Core.getSession(), model,view).chartsFarmacia();
			PageDashboardHelper.with(Core.getSession(), model,view).dadosTables();
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistrar_produtos() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Registrar_medicamento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (registrar_produtos)  *//* End-Code-Block  */
		/*----#start-code(registrar_produtos)----*/
		
		
		/*----#end-code----*/
		return this.redirect("net_farma_app","Registrar_medicamento","index", this.queryString());	
	}
	
	public Response actionListar_produtos() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Paginalistarproduto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (listar_produtos)  *//* End-Code-Block  */
		/*----#start-code(listar_produtos)----*/
		
		
		/*----#end-code----*/
		return this.redirect("net_farma_app","Paginalistarproduto","index", this.queryString());	
	}
	
	public Response actionDashboard() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Pagina_dashboard","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (dashboard)  *//* End-Code-Block  */
		/*----#start-code(dashboard)----*/
		
		
		/*----#end-code----*/
		return this.redirect("net_farma_app","Pagina_dashboard","index", this.queryString());	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Pagina_de_detalhe_de_produto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		
		return this.forward("net_farma_app","Pagina_dashboard","index",this.queryString());
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}