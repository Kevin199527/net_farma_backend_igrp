package nosi.webapps.net_farma_app.pages.paginalistarproduto;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.net_farma_app.dao.TblMedicamentos;
import nosi.webapps.net_farma_app.helper.Listar_ProdutoHelper;
import java.util.ArrayList;
import java.util.List;
/*----#end-code----*/
		
public class PaginalistarprodutoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Paginalistarproduto();
		model.load();
		var view = new PaginalistarprodutoView();
		view.id_list.setParam(true);
		view.receita_filter.loadDomain("Receita","net_farma_app","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTabela_de_produto(Core.query(null,"SELECT '../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as imagem,'Totam officia magna totam anim' as nome_do_produto,'Rem magna aperiam laudantium ut elit natus officia natus anim voluptatem sit dolor amet dolor' as descricao,'Sit accusantium natus amet des' as preco,'Voluptatem natus lorem consect' as tipo_de_produto,'Adipiscing sit labore aliqua u' as receita,'hidden-8d5e_0269' as id_list "));
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