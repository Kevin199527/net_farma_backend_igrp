package nosi.webapps.net_farma_app.pages.registrar_medicamento;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import nosi.core.validator.constraints.*;

public class Registrar_medicamento extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	@SeparatorList(name = Separatorlist_registrar.class)
	@Valid
	private List<Separatorlist_registrar> separatorlist_registrar = new ArrayList<>();	
	public void setSeparatorlist_registrar(List<Separatorlist_registrar> separatorlist_registrar){
		this.separatorlist_registrar = separatorlist_registrar;
	}
	public List<Separatorlist_registrar> getSeparatorlist_registrar(){
		return this.separatorlist_registrar;
	}
	@RParam(rParamName = "p_separatorlist_registrar_id")
	private String[] p_separatorlist_registrar_id;
	@RParam(rParamName = "p_separatorlist_registrar_del")
	private String[] p_separatorlist_registrar_del;
	@RParam(rParamName = "p_separatorlist_registrar_edit")
	private String[] p_separatorlist_registrar_edit;
	
	public void setP_separatorlist_registrar_id(String[] p_separatorlist_registrar_id){
		this.p_separatorlist_registrar_id = p_separatorlist_registrar_id;
	}
	public String[] getP_separatorlist_registrar_id(){
		return this.p_separatorlist_registrar_id;
	}
	
	public void setP_separatorlist_registrar_del(String[] p_separatorlist_registrar_del){
		this.p_separatorlist_registrar_del = p_separatorlist_registrar_del;
	}
	public String[] getP_separatorlist_registrar_del(){
		return this.p_separatorlist_registrar_del;
	}
	
	public void setP_separatorlist_registrar_edit(String[] p_separatorlist_registrar_edit){
		this.p_separatorlist_registrar_edit = p_separatorlist_registrar_edit;
	}
	public String[] getP_separatorlist_registrar_edit(){
		return this.p_separatorlist_registrar_edit;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Separatorlist_registrar{
		private Pair separatorlist_registrar_id;
		@PairNotNull()
private Pair nome_medicamento;
private Pair descricao_do_produto;
		@PairNotNull()
private Pair preco_do_produto;
private Pair image;
		@PairNotNull()
private Pair receita;
		@PairNotNull()
private Pair estoque;
		@PairNotNull()
private Pair tipo_de_produto;
private Pair ativo;
		private Pair ativo_check;
		public void setSeparatorlist_registrar_id(Pair separatorlist_registrar_id){
			this.separatorlist_registrar_id = separatorlist_registrar_id;
		}
		public void setSeparatorlist_registrar_id(String key){
			this.setSeparatorlist_registrar_id(key, key);
		}
		public void setSeparatorlist_registrar_id(String key, String value){
			this.separatorlist_registrar_id= new Pair(key, value);
		}

		public Pair getSeparatorlist_registrar_id(){
			return this.separatorlist_registrar_id;
		}
		public void setNome_medicamento(Pair nome_medicamento){
			this.nome_medicamento = nome_medicamento;
		}
		public void setNome_medicamento(String key){
			this.setNome_medicamento(key, key);
		}
		public void setNome_medicamento(String key, String value){
			this.nome_medicamento= new Pair(key, value);
		}

		public Pair getNome_medicamento(){
			return this.nome_medicamento;
		}

		public void setDescricao_do_produto(Pair descricao_do_produto){
			this.descricao_do_produto = descricao_do_produto;
		}
		public void setDescricao_do_produto(String key){
			this.setDescricao_do_produto(key, key);
		}
		public void setDescricao_do_produto(String key, String value){
			this.descricao_do_produto= new Pair(key, value);
		}

		public Pair getDescricao_do_produto(){
			return this.descricao_do_produto;
		}

		public void setPreco_do_produto(Pair preco_do_produto){
			this.preco_do_produto = preco_do_produto;
		}
		public void setPreco_do_produto(String key){
			this.setPreco_do_produto(key, key);
		}
		public void setPreco_do_produto(String key, String value){
			this.preco_do_produto= new Pair(key, value);
		}

		public Pair getPreco_do_produto(){
			return this.preco_do_produto;
		}

		public void setImage(Pair image){
			this.image = image;
		}
		public void setImage(String key){
			this.setImage(key, key);
		}
		public void setImage(String key, String value){
			this.image= new Pair(key, value);
		}

		public Pair getImage(){
			return this.image;
		}

		public void setReceita(Pair receita){
			this.receita = receita;
		}
		public void setReceita(String key){
			this.setReceita(key, key);
		}
		public void setReceita(String key, String value){
			this.receita= new Pair(key, value);
		}

		public Pair getReceita(){
			return this.receita;
		}

		public void setEstoque(Pair estoque){
			this.estoque = estoque;
		}
		public void setEstoque(String key){
			this.setEstoque(key, key);
		}
		public void setEstoque(String key, String value){
			this.estoque= new Pair(key, value);
		}

		public Pair getEstoque(){
			return this.estoque;
		}

		public void setTipo_de_produto(Pair tipo_de_produto){
			this.tipo_de_produto = tipo_de_produto;
		}
		public void setTipo_de_produto(String key){
			this.setTipo_de_produto(key, key);
		}
		public void setTipo_de_produto(String key, String value){
			this.tipo_de_produto= new Pair(key, value);
		}

		public Pair getTipo_de_produto(){
			return this.tipo_de_produto;
		}

		public void setAtivo(Pair ativo){
			this.ativo = ativo;
		}
		public void setAtivo(String key){
			this.setAtivo(key, key);
		}
		public void setAtivo(String key, String value){
			this.ativo= new Pair(key, value);
		}

		public Pair getAtivo(){
			return this.ativo;
		}
		
		public void setAtivo_check(Pair ativo_check){
			this.ativo_check = ativo_check;
		}
		public void setAtivo_check(String key){
			this.setAtivo_check(key, key);
		}
		public void setAtivo_check(String key, String value){
			this.ativo_check= new Pair(key, value);
		}

		public Pair getAtivo_check(){
			return this.ativo_check;
		}

	}

	public void loadSeparatorlist_registrar(BaseQueryInterface query) {
		this.setSeparatorlist_registrar(this.loadFormList(query,Separatorlist_registrar.class));
	}

}