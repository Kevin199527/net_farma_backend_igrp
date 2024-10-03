package nosi.webapps.net_farma_app.pages.paginalistarproduto;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PaginalistarprodutoView extends View {

	public Field sectionheader_1_text;
	public Field imagem;
	public Field nome_do_produto;
	public Field descricao;
	public Field preco;
	public Field tipo_de_produto;
	public Field receita;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registrar_produtos;
	public IGRPButton btn_listar_produtos;
	public IGRPButton btn_dashboard;
	public IGRPButton btn_visualizar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public PaginalistarprodutoView(){

		this.setPageTitle("PaginaListarProduto");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		table_1 = new IGRPTable("table_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><span style='font-family:Times New Roman,Times,serif;'><strong><span style='font-size:36px;'>Lista de Produto</span></strong></span></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		imagem = new TextField(model,"imagem");
		imagem.setLabel(gt("Imagem"));
		imagem.setValue(gt(""));
		imagem.propertie().add("name","p_imagem").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome_do_produto = new TextField(model,"nome_do_produto");
		nome_do_produto.setLabel(gt("Nome do Produto"));
		nome_do_produto.propertie().add("name","p_nome_do_produto").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		descricao = new TextAreaField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","textarea").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		preco = new TextField(model,"preco");
		preco.setLabel(gt("Preço"));
		preco.propertie().add("name","p_preco").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tipo_de_produto = new TextField(model,"tipo_de_produto");
		tipo_de_produto.setLabel(gt("Tipo de Produto"));
		tipo_de_produto.propertie().add("name","p_tipo_de_produto").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		receita = new TextField(model,"receita");
		receita.setLabel(gt("Receita"));
		receita.propertie().add("name","p_receita").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registrar_produtos = new IGRPButton("Registrar Produtos","net_farma_app","Paginalistarproduto","registrar_produtos","_self","grey|fa-save","","");
		btn_registrar_produtos.propertie.add("type","specific").add("rel","registrar_produtos").add("refresh_components","");

		btn_listar_produtos = new IGRPButton("Listar Produtos","net_farma_app","Paginalistarproduto","listar_produtos","_self","grey|fa-list","","");
		btn_listar_produtos.propertie.add("type","specific").add("rel","listar_produtos").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","net_farma_app","Paginalistarproduto","dashboard","_self","grey|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		btn_visualizar = new IGRPButton("Visualizar","net_farma_app","Paginalistarproduto","visualizar","modal","info|fa-eye","","");
		btn_visualizar.propertie.add("id","button_dd9c_8e6f").add("type","specific").add("class","info").add("rel","visualizar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","net_farma_app","Paginalistarproduto","editar","modal","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_e675_77bd").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","net_farma_app","Paginalistarproduto","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_bf8c_2eee").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		

		sectionheader_1.addField(sectionheader_1_text);

		table_1.addField(imagem);
		table_1.addField(nome_do_produto);
		table_1.addField(descricao);
		table_1.addField(preco);
		table_1.addField(tipo_de_produto);
		table_1.addField(receita);

		toolsbar_1.addButton(btn_registrar_produtos);
		toolsbar_1.addButton(btn_listar_produtos);
		toolsbar_1.addButton(btn_dashboard);
		table_1.addButton(btn_visualizar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_do_produto.setValue(model);
		descricao.setValue(model);
		preco.setValue(model);
		tipo_de_produto.setValue(model);
		receita.setValue(model);	

		table_1.loadModel(((Paginalistarproduto) model).getTable_1());
		}
}