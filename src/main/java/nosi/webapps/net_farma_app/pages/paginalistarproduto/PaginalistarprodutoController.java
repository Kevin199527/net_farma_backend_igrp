package nosi.webapps.net_farma_app.pages.paginalistarproduto;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.net_farma_app.helper.Listar_ProdutoHelper;
/*----#end-code----*/
		
public class PaginalistarprodutoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		var view = new PaginalistarprodutoView();
		view.ativo.setParam(true);
		view.id_list.setParam(true);
		view.tipo_de_produto_filtro.loadDomain("Tipo de Produto","net_farma_app","-- Selecionar --");
		view.receita_filter.loadDomain("Receita","net_farma_app","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTabela_de_produto(Core.query(null,"SELECT '../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as imagem,'Perspiciatis totam omnis rem a' as nome_do_produto,'Consectetur ut aperiam officia unde deserunt aliqua accusantium sit lorem ut lorem voluptatem stract consectetur' as descricao,'Ut accusantium omnis deserunt' as preco,'Sit laudantium adipiscing aper' as tipo_de_produto,'Deserunt mollit sit labore off' as receita,'1' as ativo,'hidden-50b9_4ae4' as id_list "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		Listar_ProdutoHelper.with(Core.getSession(), model).listarProdutos();
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistrar_produtos() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Registrar_medicamento","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (registrar_produtos)  *//* End-Code-Block  */
		/*----#start-code(registrar_produtos)----*/


		/*----#end-code----*/
		return this.redirect("net_farma_app","Registrar_medicamento","index", this.queryString());	
	}
	
	public Response actionListar_produtos() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Paginalistarproduto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (listar_produtos)  *//* End-Code-Block  */
		/*----#start-code(listar_produtos)----*/


		/*----#end-code----*/
		return this.redirect("net_farma_app","Paginalistarproduto","index", this.queryString());	
	}
	
	public Response actionDashboard() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Pagina_dashboard","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (dashboard)  *//* End-Code-Block  */
		/*----#start-code(dashboard)----*/


		/*----#end-code----*/
		return this.redirect("net_farma_app","Pagina_dashboard","index", this.queryString());	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Pagina_de_detalhe_de_produto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
       return this.forward("net_farma_app","Paginalistarproduto","index",this.queryString());
		/*----#end-code----*/
			
	}
	
	public Response actionVisualizar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Pagina_de_detalhe_de_produto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (visualizar)  *//* End-Code-Block  */
		/*----#start-code(visualizar)----*/
		this.addQueryString("p_detalhe", "SIM");
		this.addQueryString("p_id_list", Core.getParam("p_id_list"));
		/*----#end-code----*/
		return this.redirect("net_farma_app","Pagina_de_detalhe_de_produto","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Pagina_de_detalhe_de_produto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  *//* End-Code-Block  */
		/*----#start-code(editar)----*/
		this.addQueryString("p_editar", "SIM");
		this.addQueryString("p_id_list", Core.getParam("p_id_list"));

		/*----#end-code----*/
		return this.redirect("net_farma_app","Pagina_de_detalhe_de_produto","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_ativo",Core.getParam("p_ativo"));
		  this.addQueryString("p_id_list",Core.getParam("p_id_list"));
		  return this.forward("net_farma_app","Paginalistarproduto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  *//* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		//Listar_ProdutoHelper.with(Core.getSession(), model).eliminarProd();
		/*----#end-code----*/
		return this.redirect("net_farma_app","Paginalistarproduto","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}