package nosi.webapps.net_farma_app.pages.pagina_de_detalhe_de_produto;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.net_farma_app.helper.Pagina_DetalheHelper;
/*----#end-code----*/
		
public class Pagina_de_detalhe_de_produtoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_de_detalhe_de_produto();
		model.load();
		var view = new Pagina_de_detalhe_de_produtoView();
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		Pagina_DetalheHelper.with(Core.getSession(), model, view).receberDadosPageDetalhe();
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionConcluir() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_de_detalhe_de_produto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Paginalistarproduto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (concluir)  *//* End-Code-Block  */
		/*----#start-code(concluir)----*/
		Pagina_DetalheHelper.with(Core.getSession(), model).editarDados();
		/*----#end-code----*/
		return this.redirect("net_farma_app","Paginalistarproduto","index", this.queryString());	
	}
	
	public Response actionFechar_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_de_detalhe_de_produto();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("net_farma_app","Pagina_de_detalhe_de_produto","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (fechar_1)  *//* End-Code-Block  */
		/*----#start-code(fechar_1)----*/

		/*----#end-code----*/
		return this.redirect("net_farma_app","Pagina_de_detalhe_de_produto","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}