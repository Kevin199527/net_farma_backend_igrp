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
	public Field id_list;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable tabela_de_produto;

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

		tabela_de_produto = new IGRPTable("tabela_de_produto","");

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
		
		id_list = new HiddenField(model,"id_list");
		id_list.setLabel(gt(""));
		id_list.propertie().add("name","p_id_list").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_list");
		

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

		tabela_de_produto.addField(imagem);
		tabela_de_produto.addField(nome_do_produto);
		tabela_de_produto.addField(descricao);
		tabela_de_produto.addField(preco);
		tabela_de_produto.addField(tipo_de_produto);
		tabela_de_produto.addField(receita);
		tabela_de_produto.addField(id_list);

		toolsbar_1.addButton(btn_registrar_produtos);
		toolsbar_1.addButton(btn_listar_produtos);
		toolsbar_1.addButton(btn_dashboard);
		tabela_de_produto.addButton(btn_visualizar);
		tabela_de_produto.addButton(btn_editar);
		tabela_de_produto.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(tabela_de_produto);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_do_produto.setValue(model);
		descricao.setValue(model);
		preco.setValue(model);
		tipo_de_produto.setValue(model);
		receita.setValue(model);
		id_list.setValue(model);	

		tabela_de_produto.loadModel(((Paginalistarproduto) model).getTabela_de_produto());
		}
}