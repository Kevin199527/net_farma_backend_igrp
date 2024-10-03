package nosi.webapps.net_farma_app.pages.pagemenu;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;

public class PagemenuView extends View {


	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registrar_produtos;
	public IGRPButton btn_listar_produtos;
	public IGRPButton btn_dashboard;

	public PagemenuView(){

		this.setPageTitle("pageMenu");
			

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registrar_produtos = new IGRPButton("Registrar Produtos","net_farma_app","Pagemenu","registrar_produtos","_self","grey|fa-save","","");
		btn_registrar_produtos.propertie.add("type","specific").add("rel","registrar_produtos").add("refresh_components","");

		btn_listar_produtos = new IGRPButton("Listar Produtos","net_farma_app","Pagemenu","listar_produtos","_self","grey|fa-list","","");
		btn_listar_produtos.propertie.add("type","specific").add("rel","listar_produtos").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","net_farma_app","Pagemenu","dashboard","_self","grey|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		toolsbar_1.addButton(btn_registrar_produtos);
		toolsbar_1.addButton(btn_listar_produtos);
		toolsbar_1.addButton(btn_dashboard);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
			

		}
}