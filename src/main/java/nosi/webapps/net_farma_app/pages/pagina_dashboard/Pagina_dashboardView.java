package nosi.webapps.net_farma_app.pages.pagina_dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pagina_dashboardView extends View {

	public Field sectionheader_1_text;
	public Field circlestatbox_produto_title;
	public Field circlestatbox_produto_lbl;
	public Field circlestatbox_produto_val;
	public Field circlestatbox_produto_desc;
	public Field circlestatbox_produto_url;
	public Field circlestatbox_produto_bg;
	public Field circlestatbox_estoque_title;
	public Field circlestatbox_estoque_lbl;
	public Field circlestatbox_estoque_val;
	public Field circlestatbox_estoque_desc;
	public Field circlestatbox_estoque_url;
	public Field circlestatbox_estoque_bg;
	public Field circlestatbox_funcionario_title;
	public Field circlestatbox_funcionario_lbl;
	public Field circlestatbox_funcionario_val;
	public Field circlestatbox_funcionario_desc;
	public Field circlestatbox_funcionario_url;
	public Field circlestatbox_funcionario_bg;
	public Field circlestatbox_fornecedor_title;
	public Field circlestatbox_fornecedor_lbl;
	public Field circlestatbox_fornecedor_val;
	public Field circlestatbox_fornecedor_desc;
	public Field circlestatbox_fornecedor_url;
	public Field circlestatbox_fornecedor_bg;
	public Field circlestatbox_venda_title;
	public Field circlestatbox_venda_lbl;
	public Field circlestatbox_venda_val;
	public Field circlestatbox_venda_desc;
	public Field circlestatbox_venda_url;
	public Field circlestatbox_venda_bg;
	public Field circlestatbox_4_title;
	public Field circlestatbox_4_lbl;
	public Field circlestatbox_4_val;
	public Field circlestatbox_4_desc;
	public Field circlestatbox_4_url;
	public Field circlestatbox_4_bg;
	public IGRPSectionHeader sectionheader_1;
	public IGRPCircleStatBox circlestatbox_produto;
	public IGRPCircleStatBox circlestatbox_estoque;
	public IGRPCircleStatBox circlestatbox_funcionario;
	public IGRPCircleStatBox circlestatbox_fornecedor;
	public IGRPCircleStatBox circlestatbox_venda;
	public IGRPCircleStatBox circlestatbox_4;
	public IGRPChart chart_1;
	public IGRPChart chart_2;
	public IGRPChart chart_3;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registrar_produtos;
	public IGRPButton btn_listar_produtos;
	public IGRPButton btn_dashboard;

	public Pagina_dashboardView(){

		this.setPageTitle("Pagina Dashboard");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		circlestatbox_produto = new IGRPCircleStatBox("circlestatbox_produto","");

		circlestatbox_estoque = new IGRPCircleStatBox("circlestatbox_estoque","");

		circlestatbox_funcionario = new IGRPCircleStatBox("circlestatbox_funcionario","");

		circlestatbox_fornecedor = new IGRPCircleStatBox("circlestatbox_fornecedor","");

		circlestatbox_venda = new IGRPCircleStatBox("circlestatbox_venda","");

		circlestatbox_4 = new IGRPCircleStatBox("circlestatbox_4","");

		chart_1 = new IGRPChart("chart_1","Chart");

		chart_2 = new IGRPChart("chart_2","Chart");

		chart_3 = new IGRPChart("chart_3","Venda por ano e cada meses");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong><span style='font-family:Times New Roman,Times,serif;'><span style='font-size:36px;'>Dashboarde Farmacia</span></span></strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		circlestatbox_produto_title = new TextField(model,"circlestatbox_produto_title");
		circlestatbox_produto_title.setLabel(gt("Circle Box Title"));
		circlestatbox_produto_title.propertie().add("name","p_circlestatbox_produto_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_produto_lbl = new TextField(model,"circlestatbox_produto_lbl");
		circlestatbox_produto_lbl.setLabel(gt("Percent Text"));
		circlestatbox_produto_lbl.propertie().add("name","p_circlestatbox_produto_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_produto_val = new TextField(model,"circlestatbox_produto_val");
		circlestatbox_produto_val.setLabel(gt("Percent Value"));
		circlestatbox_produto_val.propertie().add("name","p_circlestatbox_produto_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_produto_desc = new TextField(model,"circlestatbox_produto_desc");
		circlestatbox_produto_desc.setLabel(gt("Description"));
		circlestatbox_produto_desc.propertie().add("name","p_circlestatbox_produto_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_produto_url = new TextField(model,"circlestatbox_produto_url");
		circlestatbox_produto_url.setLabel(gt("Link"));
		circlestatbox_produto_url.propertie().add("name","p_circlestatbox_produto_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_produto_bg = new TextField(model,"circlestatbox_produto_bg");
		circlestatbox_produto_bg.setLabel(gt("Background"));
		circlestatbox_produto_bg.propertie().add("name","p_circlestatbox_produto_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_title = new TextField(model,"circlestatbox_estoque_title");
		circlestatbox_estoque_title.setLabel(gt("Circle Box Title"));
		circlestatbox_estoque_title.propertie().add("name","p_circlestatbox_estoque_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_lbl = new TextField(model,"circlestatbox_estoque_lbl");
		circlestatbox_estoque_lbl.setLabel(gt("Percent Text"));
		circlestatbox_estoque_lbl.propertie().add("name","p_circlestatbox_estoque_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_val = new TextField(model,"circlestatbox_estoque_val");
		circlestatbox_estoque_val.setLabel(gt("Percent Value"));
		circlestatbox_estoque_val.propertie().add("name","p_circlestatbox_estoque_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_desc = new TextField(model,"circlestatbox_estoque_desc");
		circlestatbox_estoque_desc.setLabel(gt("Description"));
		circlestatbox_estoque_desc.propertie().add("name","p_circlestatbox_estoque_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_url = new TextField(model,"circlestatbox_estoque_url");
		circlestatbox_estoque_url.setLabel(gt("Link"));
		circlestatbox_estoque_url.propertie().add("name","p_circlestatbox_estoque_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_estoque_bg = new TextField(model,"circlestatbox_estoque_bg");
		circlestatbox_estoque_bg.setLabel(gt("Background"));
		circlestatbox_estoque_bg.propertie().add("name","p_circlestatbox_estoque_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_title = new TextField(model,"circlestatbox_funcionario_title");
		circlestatbox_funcionario_title.setLabel(gt("Circle Box Title"));
		circlestatbox_funcionario_title.propertie().add("name","p_circlestatbox_funcionario_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_lbl = new TextField(model,"circlestatbox_funcionario_lbl");
		circlestatbox_funcionario_lbl.setLabel(gt("Percent Text"));
		circlestatbox_funcionario_lbl.propertie().add("name","p_circlestatbox_funcionario_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_val = new TextField(model,"circlestatbox_funcionario_val");
		circlestatbox_funcionario_val.setLabel(gt("Percent Value"));
		circlestatbox_funcionario_val.propertie().add("name","p_circlestatbox_funcionario_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_desc = new TextField(model,"circlestatbox_funcionario_desc");
		circlestatbox_funcionario_desc.setLabel(gt("Description"));
		circlestatbox_funcionario_desc.propertie().add("name","p_circlestatbox_funcionario_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_url = new TextField(model,"circlestatbox_funcionario_url");
		circlestatbox_funcionario_url.setLabel(gt("Link"));
		circlestatbox_funcionario_url.propertie().add("name","p_circlestatbox_funcionario_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_funcionario_bg = new TextField(model,"circlestatbox_funcionario_bg");
		circlestatbox_funcionario_bg.setLabel(gt("Background"));
		circlestatbox_funcionario_bg.propertie().add("name","p_circlestatbox_funcionario_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_title = new TextField(model,"circlestatbox_fornecedor_title");
		circlestatbox_fornecedor_title.setLabel(gt("Circle Box Title"));
		circlestatbox_fornecedor_title.propertie().add("name","p_circlestatbox_fornecedor_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_lbl = new TextField(model,"circlestatbox_fornecedor_lbl");
		circlestatbox_fornecedor_lbl.setLabel(gt("Percent Text"));
		circlestatbox_fornecedor_lbl.propertie().add("name","p_circlestatbox_fornecedor_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_val = new TextField(model,"circlestatbox_fornecedor_val");
		circlestatbox_fornecedor_val.setLabel(gt("Percent Value"));
		circlestatbox_fornecedor_val.propertie().add("name","p_circlestatbox_fornecedor_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_desc = new TextField(model,"circlestatbox_fornecedor_desc");
		circlestatbox_fornecedor_desc.setLabel(gt("Description"));
		circlestatbox_fornecedor_desc.propertie().add("name","p_circlestatbox_fornecedor_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_url = new TextField(model,"circlestatbox_fornecedor_url");
		circlestatbox_fornecedor_url.setLabel(gt("Link"));
		circlestatbox_fornecedor_url.propertie().add("name","p_circlestatbox_fornecedor_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_fornecedor_bg = new TextField(model,"circlestatbox_fornecedor_bg");
		circlestatbox_fornecedor_bg.setLabel(gt("Background"));
		circlestatbox_fornecedor_bg.propertie().add("name","p_circlestatbox_fornecedor_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_title = new TextField(model,"circlestatbox_venda_title");
		circlestatbox_venda_title.setLabel(gt("Circle Box Title"));
		circlestatbox_venda_title.propertie().add("name","p_circlestatbox_venda_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_lbl = new TextField(model,"circlestatbox_venda_lbl");
		circlestatbox_venda_lbl.setLabel(gt("Percent Text"));
		circlestatbox_venda_lbl.propertie().add("name","p_circlestatbox_venda_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_val = new TextField(model,"circlestatbox_venda_val");
		circlestatbox_venda_val.setLabel(gt("Percent Value"));
		circlestatbox_venda_val.propertie().add("name","p_circlestatbox_venda_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_desc = new TextField(model,"circlestatbox_venda_desc");
		circlestatbox_venda_desc.setLabel(gt("Description"));
		circlestatbox_venda_desc.propertie().add("name","p_circlestatbox_venda_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_url = new TextField(model,"circlestatbox_venda_url");
		circlestatbox_venda_url.setLabel(gt("Link"));
		circlestatbox_venda_url.propertie().add("name","p_circlestatbox_venda_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_venda_bg = new TextField(model,"circlestatbox_venda_bg");
		circlestatbox_venda_bg.setLabel(gt("Background"));
		circlestatbox_venda_bg.propertie().add("name","p_circlestatbox_venda_bg").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_title = new TextField(model,"circlestatbox_4_title");
		circlestatbox_4_title.setLabel(gt("Circle Box Title"));
		circlestatbox_4_title.propertie().add("name","p_circlestatbox_4_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_lbl = new TextField(model,"circlestatbox_4_lbl");
		circlestatbox_4_lbl.setLabel(gt("Percent Text"));
		circlestatbox_4_lbl.propertie().add("name","p_circlestatbox_4_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_val = new TextField(model,"circlestatbox_4_val");
		circlestatbox_4_val.setLabel(gt("Percent Value"));
		circlestatbox_4_val.propertie().add("name","p_circlestatbox_4_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_desc = new TextField(model,"circlestatbox_4_desc");
		circlestatbox_4_desc.setLabel(gt("Description"));
		circlestatbox_4_desc.propertie().add("name","p_circlestatbox_4_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_url = new TextField(model,"circlestatbox_4_url");
		circlestatbox_4_url.setLabel(gt("Link"));
		circlestatbox_4_url.propertie().add("name","p_circlestatbox_4_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_4_bg = new TextField(model,"circlestatbox_4_bg");
		circlestatbox_4_bg.setLabel(gt("Background"));
		circlestatbox_4_bg.propertie().add("name","p_circlestatbox_4_bg").add("type","text").add("maxlength","4000");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registrar_produtos = new IGRPButton("Registrar Produtos","net_farma_app","Pagina_dashboard","registrar_produtos","_self","grey|fa-save","","");
		btn_registrar_produtos.propertie.add("type","specific").add("rel","registrar_produtos").add("refresh_components","");

		btn_listar_produtos = new IGRPButton("Listar Produtos","net_farma_app","Pagina_dashboard","listar_produtos","_self","grey|fa-list","","");
		btn_listar_produtos.propertie.add("type","specific").add("rel","listar_produtos").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","net_farma_app","Pagina_dashboard","dashboard","_self","grey|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		
		chart_1.setCaption("");
		chart_1.setChart_type("column");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#f037a8").addColor("#313480").addColor("#b986a2").addColor("#a3d07b");

		chart_2.setCaption("");
		chart_2.setChart_type("pie");
		chart_2.setXaxys("Eixo de X");
		chart_2.setYaxys("Eixo de Y");
		chart_2.setUrl("#");
		//ex: chart_2.addColor("#c98ac1").addColor("#c21d53").addColor("#65d9e0").addColor("#1df1cd");

		chart_3.setCaption("");
		chart_3.setChart_type("line");
		chart_3.setXaxys("Eixo de X");
		chart_3.setYaxys("Eixo de Y");
		chart_3.setUrl("#");
		//ex: chart_3.addColor("#0aec90").addColor("#102351").addColor("#a02ae6").addColor("#ad1f29");

	}
		
	@Override
	public void render(){
		

		sectionheader_1.addField(sectionheader_1_text);

		circlestatbox_produto.addField(circlestatbox_produto_title);
		circlestatbox_produto.addField(circlestatbox_produto_lbl);
		circlestatbox_produto.addField(circlestatbox_produto_val);
		circlestatbox_produto.addField(circlestatbox_produto_desc);
		circlestatbox_produto.addField(circlestatbox_produto_url);
		circlestatbox_produto.addField(circlestatbox_produto_bg);

		circlestatbox_estoque.addField(circlestatbox_estoque_title);
		circlestatbox_estoque.addField(circlestatbox_estoque_lbl);
		circlestatbox_estoque.addField(circlestatbox_estoque_val);
		circlestatbox_estoque.addField(circlestatbox_estoque_desc);
		circlestatbox_estoque.addField(circlestatbox_estoque_url);
		circlestatbox_estoque.addField(circlestatbox_estoque_bg);

		circlestatbox_funcionario.addField(circlestatbox_funcionario_title);
		circlestatbox_funcionario.addField(circlestatbox_funcionario_lbl);
		circlestatbox_funcionario.addField(circlestatbox_funcionario_val);
		circlestatbox_funcionario.addField(circlestatbox_funcionario_desc);
		circlestatbox_funcionario.addField(circlestatbox_funcionario_url);
		circlestatbox_funcionario.addField(circlestatbox_funcionario_bg);

		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_title);
		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_lbl);
		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_val);
		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_desc);
		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_url);
		circlestatbox_fornecedor.addField(circlestatbox_fornecedor_bg);

		circlestatbox_venda.addField(circlestatbox_venda_title);
		circlestatbox_venda.addField(circlestatbox_venda_lbl);
		circlestatbox_venda.addField(circlestatbox_venda_val);
		circlestatbox_venda.addField(circlestatbox_venda_desc);
		circlestatbox_venda.addField(circlestatbox_venda_url);
		circlestatbox_venda.addField(circlestatbox_venda_bg);

		circlestatbox_4.addField(circlestatbox_4_title);
		circlestatbox_4.addField(circlestatbox_4_lbl);
		circlestatbox_4.addField(circlestatbox_4_val);
		circlestatbox_4.addField(circlestatbox_4_desc);
		circlestatbox_4.addField(circlestatbox_4_url);
		circlestatbox_4.addField(circlestatbox_4_bg);




		toolsbar_1.addButton(btn_registrar_produtos);
		toolsbar_1.addButton(btn_listar_produtos);
		toolsbar_1.addButton(btn_dashboard);
		this.addToPage(sectionheader_1);
		this.addToPage(circlestatbox_produto);
		this.addToPage(circlestatbox_estoque);
		this.addToPage(circlestatbox_funcionario);
		this.addToPage(circlestatbox_fornecedor);
		this.addToPage(circlestatbox_venda);
		this.addToPage(circlestatbox_4);
		this.addToPage(chart_1);
		this.addToPage(chart_2);
		this.addToPage(chart_3);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		circlestatbox_produto_title.setValue(model);
		circlestatbox_produto_lbl.setValue(model);
		circlestatbox_produto_val.setValue(model);
		circlestatbox_produto_desc.setValue(model);
		circlestatbox_produto_url.setValue(model);
		circlestatbox_produto_bg.setValue(model);
		circlestatbox_estoque_title.setValue(model);
		circlestatbox_estoque_lbl.setValue(model);
		circlestatbox_estoque_val.setValue(model);
		circlestatbox_estoque_desc.setValue(model);
		circlestatbox_estoque_url.setValue(model);
		circlestatbox_estoque_bg.setValue(model);
		circlestatbox_funcionario_title.setValue(model);
		circlestatbox_funcionario_lbl.setValue(model);
		circlestatbox_funcionario_val.setValue(model);
		circlestatbox_funcionario_desc.setValue(model);
		circlestatbox_funcionario_url.setValue(model);
		circlestatbox_funcionario_bg.setValue(model);
		circlestatbox_fornecedor_title.setValue(model);
		circlestatbox_fornecedor_lbl.setValue(model);
		circlestatbox_fornecedor_val.setValue(model);
		circlestatbox_fornecedor_desc.setValue(model);
		circlestatbox_fornecedor_url.setValue(model);
		circlestatbox_fornecedor_bg.setValue(model);
		circlestatbox_venda_title.setValue(model);
		circlestatbox_venda_lbl.setValue(model);
		circlestatbox_venda_val.setValue(model);
		circlestatbox_venda_desc.setValue(model);
		circlestatbox_venda_url.setValue(model);
		circlestatbox_venda_bg.setValue(model);
		circlestatbox_4_title.setValue(model);
		circlestatbox_4_lbl.setValue(model);
		circlestatbox_4_val.setValue(model);
		circlestatbox_4_desc.setValue(model);
		circlestatbox_4_url.setValue(model);
		circlestatbox_4_bg.setValue(model);	

		chart_1.loadModel(((Pagina_dashboard) model).getChart_1());
		chart_2.loadModel(((Pagina_dashboard) model).getChart_2());
		chart_3.loadModel(((Pagina_dashboard) model).getChart_3());
		}
}