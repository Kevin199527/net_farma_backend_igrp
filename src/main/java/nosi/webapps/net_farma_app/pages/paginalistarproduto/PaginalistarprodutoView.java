package nosi.webapps.net_farma_app.pages.paginalistarproduto;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PaginalistarprodutoView extends View {

	public Field sectionheader_2_text;
	public Field nome_filter;
	public Field tipo_de_produto_filtro;
	public Field receita_filter;
	public Field sectionheader_1_text;
	public Field imagem;
	public Field nome_do_produto;
	public Field descricao;
	public Field preco;
	public Field tipo_de_produto;
	public Field receita;
	public Field id_list;
	public IGRPSectionHeader sectionheader_2;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable tabela_de_produto;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registrar_produtos;
	public IGRPButton btn_listar_produtos;
	public IGRPButton btn_dashboard;
	public IGRPButton btn_pesquisar;
	public IGRPButton btn_visualizar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public PaginalistarprodutoView(){

		this.setPageTitle("PaginaListarProduto");
			
		sectionheader_2 = new IGRPSectionHeader("sectionheader_2","");

		form_1 = new IGRPForm("form_1","Filtro");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		tabela_de_produto = new IGRPTable("tabela_de_produto","");

		sectionheader_2_text = new TextField(model,"sectionheader_2_text");
		sectionheader_2_text.setLabel(gt(""));
		sectionheader_2_text.setValue(gt("<p><span style='font-family:Times New Roman,Times,serif;'><strong><span style='font-size:36px;'>Filtrar Produtos</span></strong></span></p>"));
		sectionheader_2_text.propertie().add("type","text").add("name","p_sectionheader_2_text").add("maxlength","4000");
		
		nome_filter = new TextField(model,"nome_filter");
		nome_filter.setLabel(gt("Nome"));
		nome_filter.propertie().add("name","p_nome_filter").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Filtre por Nome do Produto")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		tipo_de_produto_filtro = new TextField(model,"tipo_de_produto_filtro");
		tipo_de_produto_filtro.setLabel(gt("Tipo de Produto"));
		tipo_de_produto_filtro.propertie().add("name","p_tipo_de_produto_filtro").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Filtre por Tipo de Produto")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		receita_filter = new ListField(model,"receita_filter");
		receita_filter.setLabel(gt("Receita"));
		receita_filter.propertie().add("name","p_receita_filter").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","Receita « net_farma_app").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><span style='font-family:Times New Roman,Times,serif;'><strong><span style='font-size:36px;'>Lista de Produto</span></strong></span></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		imagem = new TextField(model,"imagem");
		imagem.setLabel(gt("Imagem"));
		imagem.setValue(gt(""));
		imagem.propertie().add("name","p_imagem").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome_do_produto = new TextField(model,"nome_do_produto");
		nome_do_produto.setLabel(gt("Produto"));
		nome_do_produto.propertie().add("name","p_nome_do_produto").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		descricao = new TextAreaField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","textarea").add("maxlength","30000").add("showLabel","true").add("group_in","");
		
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

		btn_pesquisar = new IGRPButton("Pesquisar","net_farma_app","Paginalistarproduto","pesquisar","submit_ajax","success|fa-search","","");
		btn_pesquisar.propertie.add("id","button_0bd7_2db5").add("type","form").add("class","success").add("rel","pesquisar").add("refresh_components","");

		btn_visualizar = new IGRPButton("Visualizar","net_farma_app","Paginalistarproduto","visualizar","modal","info|fa-eye","","");
		btn_visualizar.propertie.add("id","button_dd9c_8e6f").add("type","specific").add("class","info").add("rel","visualizar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","net_farma_app","Paginalistarproduto","editar","modal","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_e675_77bd").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","net_farma_app","Paginalistarproduto","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_bf8c_2eee").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		

		sectionheader_2.addField(sectionheader_2_text);

		form_1.addField(nome_filter);
		form_1.addField(tipo_de_produto_filtro);
		form_1.addField(receita_filter);

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
		form_1.addButton(btn_pesquisar);
		tabela_de_produto.addButton(btn_visualizar);
		tabela_de_produto.addButton(btn_editar);
		tabela_de_produto.addButton(btn_eliminar);
		this.addToPage(sectionheader_2);
		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
		this.addToPage(tabela_de_produto);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_filter.setValue(model);
		tipo_de_produto_filtro.setValue(model);
		receita_filter.setValue(model);
		nome_do_produto.setValue(model);
		descricao.setValue(model);
		preco.setValue(model);
		tipo_de_produto.setValue(model);
		receita.setValue(model);
		id_list.setValue(model);	

		tabela_de_produto.loadModel(((Paginalistarproduto) model).getTabela_de_produto());
		}
}