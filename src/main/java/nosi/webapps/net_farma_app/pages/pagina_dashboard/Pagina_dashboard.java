package nosi.webapps.net_farma_app.pages.pagina_dashboard;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Pagina_dashboard extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_circlestatbox_produto_title")
	private String circlestatbox_produto_title;

	@RParam(rParamName = "p_circlestatbox_produto_lbl")
	private String circlestatbox_produto_lbl;

	@RParam(rParamName = "p_circlestatbox_produto_val")
	private String circlestatbox_produto_val;

	@RParam(rParamName = "p_circlestatbox_produto_desc")
	private String circlestatbox_produto_desc;

	@RParam(rParamName = "p_circlestatbox_produto_url")
	private String circlestatbox_produto_url;

	@RParam(rParamName = "p_circlestatbox_produto_bg")
	private String circlestatbox_produto_bg;

	@RParam(rParamName = "p_circlestatbox_estoque_title")
	private String circlestatbox_estoque_title;

	@RParam(rParamName = "p_circlestatbox_estoque_lbl")
	private String circlestatbox_estoque_lbl;

	@RParam(rParamName = "p_circlestatbox_estoque_val")
	private String circlestatbox_estoque_val;

	@RParam(rParamName = "p_circlestatbox_estoque_desc")
	private String circlestatbox_estoque_desc;

	@RParam(rParamName = "p_circlestatbox_estoque_url")
	private String circlestatbox_estoque_url;

	@RParam(rParamName = "p_circlestatbox_estoque_bg")
	private String circlestatbox_estoque_bg;

	@RParam(rParamName = "p_circlestatbox_funcionario_title")
	private String circlestatbox_funcionario_title;

	@RParam(rParamName = "p_circlestatbox_funcionario_lbl")
	private String circlestatbox_funcionario_lbl;

	@RParam(rParamName = "p_circlestatbox_funcionario_val")
	private String circlestatbox_funcionario_val;

	@RParam(rParamName = "p_circlestatbox_funcionario_desc")
	private String circlestatbox_funcionario_desc;

	@RParam(rParamName = "p_circlestatbox_funcionario_url")
	private String circlestatbox_funcionario_url;

	@RParam(rParamName = "p_circlestatbox_funcionario_bg")
	private String circlestatbox_funcionario_bg;

	@RParam(rParamName = "p_circlestatbox_fornecedor_title")
	private String circlestatbox_fornecedor_title;

	@RParam(rParamName = "p_circlestatbox_fornecedor_lbl")
	private String circlestatbox_fornecedor_lbl;

	@RParam(rParamName = "p_circlestatbox_fornecedor_val")
	private String circlestatbox_fornecedor_val;

	@RParam(rParamName = "p_circlestatbox_fornecedor_desc")
	private String circlestatbox_fornecedor_desc;

	@RParam(rParamName = "p_circlestatbox_fornecedor_url")
	private String circlestatbox_fornecedor_url;

	@RParam(rParamName = "p_circlestatbox_fornecedor_bg")
	private String circlestatbox_fornecedor_bg;

	@RParam(rParamName = "p_circlestatbox_venda_title")
	private String circlestatbox_venda_title;

	@RParam(rParamName = "p_circlestatbox_venda_lbl")
	private String circlestatbox_venda_lbl;

	@RParam(rParamName = "p_circlestatbox_venda_val")
	private String circlestatbox_venda_val;

	@RParam(rParamName = "p_circlestatbox_venda_desc")
	private String circlestatbox_venda_desc;

	@RParam(rParamName = "p_circlestatbox_venda_url")
	private String circlestatbox_venda_url;

	@RParam(rParamName = "p_circlestatbox_venda_bg")
	private String circlestatbox_venda_bg;

	@RParam(rParamName = "p_circlestatbox_4_title")
	private String circlestatbox_4_title;

	@RParam(rParamName = "p_circlestatbox_4_lbl")
	private String circlestatbox_4_lbl;

	@RParam(rParamName = "p_circlestatbox_4_val")
	private String circlestatbox_4_val;

	@RParam(rParamName = "p_circlestatbox_4_desc")
	private String circlestatbox_4_desc;

	@RParam(rParamName = "p_circlestatbox_4_url")
	private String circlestatbox_4_url;

	@RParam(rParamName = "p_circlestatbox_4_bg")
	private String circlestatbox_4_bg;

	@RParam(rParamName = "p_nome_do_produto")
	private String nome_do_produto;

	@RParam(rParamName = "p_status_1")
	private String status_1;

	@RParam(rParamName = "p_data_de")
	private String data_de;

	@RParam(rParamName = "p_data_ate")
	private String data_ate;
	
	private List<Chart_3> chart_3 = new ArrayList<>();	
	public void setChart_3(List<Chart_3> chart_3){
		this.chart_3 = chart_3;
	}
	public List<Chart_3> getChart_3(){
		return this.chart_3;
	}

	
	private List<Chart_2> chart_2 = new ArrayList<>();	
	public void setChart_2(List<Chart_2> chart_2){
		this.chart_2 = chart_2;
	}
	public List<Chart_2> getChart_2(){
		return this.chart_2;
	}

	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	private List<Table_dados_de_venda> table_dados_de_venda = new ArrayList<>();	
	public void setTable_dados_de_venda(List<Table_dados_de_venda> table_dados_de_venda){
		this.table_dados_de_venda = table_dados_de_venda;
	}
	public List<Table_dados_de_venda> getTable_dados_de_venda(){
		return this.table_dados_de_venda;
	}

	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setCirclestatbox_produto_title(String circlestatbox_produto_title){
		this.circlestatbox_produto_title = circlestatbox_produto_title;
	}
	public String getCirclestatbox_produto_title(){
		return this.circlestatbox_produto_title;
	}
	
	public void setCirclestatbox_produto_lbl(String circlestatbox_produto_lbl){
		this.circlestatbox_produto_lbl = circlestatbox_produto_lbl;
	}
	public String getCirclestatbox_produto_lbl(){
		return this.circlestatbox_produto_lbl;
	}
	
	public void setCirclestatbox_produto_val(String circlestatbox_produto_val){
		this.circlestatbox_produto_val = circlestatbox_produto_val;
	}
	public String getCirclestatbox_produto_val(){
		return this.circlestatbox_produto_val;
	}
	
	public void setCirclestatbox_produto_desc(String circlestatbox_produto_desc){
		this.circlestatbox_produto_desc = circlestatbox_produto_desc;
	}
	public String getCirclestatbox_produto_desc(){
		return this.circlestatbox_produto_desc;
	}
	
	public void setCirclestatbox_produto_url(String circlestatbox_produto_url){
		this.circlestatbox_produto_url = circlestatbox_produto_url;
	}
	public String getCirclestatbox_produto_url(){
		return this.circlestatbox_produto_url;
	}
	
	public void setCirclestatbox_produto_bg(String circlestatbox_produto_bg){
		this.circlestatbox_produto_bg = circlestatbox_produto_bg;
	}
	public String getCirclestatbox_produto_bg(){
		return this.circlestatbox_produto_bg;
	}
	
	public void setCirclestatbox_estoque_title(String circlestatbox_estoque_title){
		this.circlestatbox_estoque_title = circlestatbox_estoque_title;
	}
	public String getCirclestatbox_estoque_title(){
		return this.circlestatbox_estoque_title;
	}
	
	public void setCirclestatbox_estoque_lbl(String circlestatbox_estoque_lbl){
		this.circlestatbox_estoque_lbl = circlestatbox_estoque_lbl;
	}
	public String getCirclestatbox_estoque_lbl(){
		return this.circlestatbox_estoque_lbl;
	}
	
	public void setCirclestatbox_estoque_val(String circlestatbox_estoque_val){
		this.circlestatbox_estoque_val = circlestatbox_estoque_val;
	}
	public String getCirclestatbox_estoque_val(){
		return this.circlestatbox_estoque_val;
	}
	
	public void setCirclestatbox_estoque_desc(String circlestatbox_estoque_desc){
		this.circlestatbox_estoque_desc = circlestatbox_estoque_desc;
	}
	public String getCirclestatbox_estoque_desc(){
		return this.circlestatbox_estoque_desc;
	}
	
	public void setCirclestatbox_estoque_url(String circlestatbox_estoque_url){
		this.circlestatbox_estoque_url = circlestatbox_estoque_url;
	}
	public String getCirclestatbox_estoque_url(){
		return this.circlestatbox_estoque_url;
	}
	
	public void setCirclestatbox_estoque_bg(String circlestatbox_estoque_bg){
		this.circlestatbox_estoque_bg = circlestatbox_estoque_bg;
	}
	public String getCirclestatbox_estoque_bg(){
		return this.circlestatbox_estoque_bg;
	}
	
	public void setCirclestatbox_funcionario_title(String circlestatbox_funcionario_title){
		this.circlestatbox_funcionario_title = circlestatbox_funcionario_title;
	}
	public String getCirclestatbox_funcionario_title(){
		return this.circlestatbox_funcionario_title;
	}
	
	public void setCirclestatbox_funcionario_lbl(String circlestatbox_funcionario_lbl){
		this.circlestatbox_funcionario_lbl = circlestatbox_funcionario_lbl;
	}
	public String getCirclestatbox_funcionario_lbl(){
		return this.circlestatbox_funcionario_lbl;
	}
	
	public void setCirclestatbox_funcionario_val(String circlestatbox_funcionario_val){
		this.circlestatbox_funcionario_val = circlestatbox_funcionario_val;
	}
	public String getCirclestatbox_funcionario_val(){
		return this.circlestatbox_funcionario_val;
	}
	
	public void setCirclestatbox_funcionario_desc(String circlestatbox_funcionario_desc){
		this.circlestatbox_funcionario_desc = circlestatbox_funcionario_desc;
	}
	public String getCirclestatbox_funcionario_desc(){
		return this.circlestatbox_funcionario_desc;
	}
	
	public void setCirclestatbox_funcionario_url(String circlestatbox_funcionario_url){
		this.circlestatbox_funcionario_url = circlestatbox_funcionario_url;
	}
	public String getCirclestatbox_funcionario_url(){
		return this.circlestatbox_funcionario_url;
	}
	
	public void setCirclestatbox_funcionario_bg(String circlestatbox_funcionario_bg){
		this.circlestatbox_funcionario_bg = circlestatbox_funcionario_bg;
	}
	public String getCirclestatbox_funcionario_bg(){
		return this.circlestatbox_funcionario_bg;
	}
	
	public void setCirclestatbox_fornecedor_title(String circlestatbox_fornecedor_title){
		this.circlestatbox_fornecedor_title = circlestatbox_fornecedor_title;
	}
	public String getCirclestatbox_fornecedor_title(){
		return this.circlestatbox_fornecedor_title;
	}
	
	public void setCirclestatbox_fornecedor_lbl(String circlestatbox_fornecedor_lbl){
		this.circlestatbox_fornecedor_lbl = circlestatbox_fornecedor_lbl;
	}
	public String getCirclestatbox_fornecedor_lbl(){
		return this.circlestatbox_fornecedor_lbl;
	}
	
	public void setCirclestatbox_fornecedor_val(String circlestatbox_fornecedor_val){
		this.circlestatbox_fornecedor_val = circlestatbox_fornecedor_val;
	}
	public String getCirclestatbox_fornecedor_val(){
		return this.circlestatbox_fornecedor_val;
	}
	
	public void setCirclestatbox_fornecedor_desc(String circlestatbox_fornecedor_desc){
		this.circlestatbox_fornecedor_desc = circlestatbox_fornecedor_desc;
	}
	public String getCirclestatbox_fornecedor_desc(){
		return this.circlestatbox_fornecedor_desc;
	}
	
	public void setCirclestatbox_fornecedor_url(String circlestatbox_fornecedor_url){
		this.circlestatbox_fornecedor_url = circlestatbox_fornecedor_url;
	}
	public String getCirclestatbox_fornecedor_url(){
		return this.circlestatbox_fornecedor_url;
	}
	
	public void setCirclestatbox_fornecedor_bg(String circlestatbox_fornecedor_bg){
		this.circlestatbox_fornecedor_bg = circlestatbox_fornecedor_bg;
	}
	public String getCirclestatbox_fornecedor_bg(){
		return this.circlestatbox_fornecedor_bg;
	}
	
	public void setCirclestatbox_venda_title(String circlestatbox_venda_title){
		this.circlestatbox_venda_title = circlestatbox_venda_title;
	}
	public String getCirclestatbox_venda_title(){
		return this.circlestatbox_venda_title;
	}
	
	public void setCirclestatbox_venda_lbl(String circlestatbox_venda_lbl){
		this.circlestatbox_venda_lbl = circlestatbox_venda_lbl;
	}
	public String getCirclestatbox_venda_lbl(){
		return this.circlestatbox_venda_lbl;
	}
	
	public void setCirclestatbox_venda_val(String circlestatbox_venda_val){
		this.circlestatbox_venda_val = circlestatbox_venda_val;
	}
	public String getCirclestatbox_venda_val(){
		return this.circlestatbox_venda_val;
	}
	
	public void setCirclestatbox_venda_desc(String circlestatbox_venda_desc){
		this.circlestatbox_venda_desc = circlestatbox_venda_desc;
	}
	public String getCirclestatbox_venda_desc(){
		return this.circlestatbox_venda_desc;
	}
	
	public void setCirclestatbox_venda_url(String circlestatbox_venda_url){
		this.circlestatbox_venda_url = circlestatbox_venda_url;
	}
	public String getCirclestatbox_venda_url(){
		return this.circlestatbox_venda_url;
	}
	
	public void setCirclestatbox_venda_bg(String circlestatbox_venda_bg){
		this.circlestatbox_venda_bg = circlestatbox_venda_bg;
	}
	public String getCirclestatbox_venda_bg(){
		return this.circlestatbox_venda_bg;
	}
	
	public void setCirclestatbox_4_title(String circlestatbox_4_title){
		this.circlestatbox_4_title = circlestatbox_4_title;
	}
	public String getCirclestatbox_4_title(){
		return this.circlestatbox_4_title;
	}
	
	public void setCirclestatbox_4_lbl(String circlestatbox_4_lbl){
		this.circlestatbox_4_lbl = circlestatbox_4_lbl;
	}
	public String getCirclestatbox_4_lbl(){
		return this.circlestatbox_4_lbl;
	}
	
	public void setCirclestatbox_4_val(String circlestatbox_4_val){
		this.circlestatbox_4_val = circlestatbox_4_val;
	}
	public String getCirclestatbox_4_val(){
		return this.circlestatbox_4_val;
	}
	
	public void setCirclestatbox_4_desc(String circlestatbox_4_desc){
		this.circlestatbox_4_desc = circlestatbox_4_desc;
	}
	public String getCirclestatbox_4_desc(){
		return this.circlestatbox_4_desc;
	}
	
	public void setCirclestatbox_4_url(String circlestatbox_4_url){
		this.circlestatbox_4_url = circlestatbox_4_url;
	}
	public String getCirclestatbox_4_url(){
		return this.circlestatbox_4_url;
	}
	
	public void setCirclestatbox_4_bg(String circlestatbox_4_bg){
		this.circlestatbox_4_bg = circlestatbox_4_bg;
	}
	public String getCirclestatbox_4_bg(){
		return this.circlestatbox_4_bg;
	}
	
	public void setNome_do_produto(String nome_do_produto){
		this.nome_do_produto = nome_do_produto;
	}
	public String getNome_do_produto(){
		return this.nome_do_produto;
	}
	
	public void setStatus_1(String status_1){
		this.status_1 = status_1;
	}
	public String getStatus_1(){
		return this.status_1;
	}
	
	public void setData_de(String data_de){
		this.data_de = data_de;
	}
	public String getData_de(){
		return this.data_de;
	}
	
	public void setData_ate(String data_ate){
		this.data_ate = data_ate;
	}
	public String getData_ate(){
		return this.data_ate;
	}


	public static class Table_dados_de_venda extends IGRPTable.Table{
		private String estado;
		private String nome_de_produto;
		private String nome_de_produto_1;
		private String tipo_de_produto;
		private String quantidade;
		private String preco_unitario;
		private String data_de_venda;
		private String metodo_de_pagamento;
		private String valor_total_pago;
		public void setEstado(String estado){
			this.estado = estado;
		}
		public String getEstado(){
			return this.estado;
		}

		public void setNome_de_produto(String nome_de_produto){
			this.nome_de_produto = nome_de_produto;
		}
		public String getNome_de_produto(){
			return this.nome_de_produto;
		}

		public void setNome_de_produto_1(String nome_de_produto_1){
			this.nome_de_produto_1 = nome_de_produto_1;
		}
		public String getNome_de_produto_1(){
			return this.nome_de_produto_1;
		}

		public void setTipo_de_produto(String tipo_de_produto){
			this.tipo_de_produto = tipo_de_produto;
		}
		public String getTipo_de_produto(){
			return this.tipo_de_produto;
		}

		public void setQuantidade(String quantidade){
			this.quantidade = quantidade;
		}
		public String getQuantidade(){
			return this.quantidade;
		}

		public void setPreco_unitario(String preco_unitario){
			this.preco_unitario = preco_unitario;
		}
		public String getPreco_unitario(){
			return this.preco_unitario;
		}

		public void setData_de_venda(String data_de_venda){
			this.data_de_venda = data_de_venda;
		}
		public String getData_de_venda(){
			return this.data_de_venda;
		}

		public void setMetodo_de_pagamento(String metodo_de_pagamento){
			this.metodo_de_pagamento = metodo_de_pagamento;
		}
		public String getMetodo_de_pagamento(){
			return this.metodo_de_pagamento;
		}

		public void setValor_total_pago(String valor_total_pago){
			this.valor_total_pago = valor_total_pago;
		}
		public String getValor_total_pago(){
			return this.valor_total_pago;
		}

	}
	public static class Chart_3 extends IGRPChart3D{
		public Chart_3(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_3() {
		}
	}
	public static class Chart_2 extends IGRPChart3D{
		public Chart_2(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_2() {
		}
	}
	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_3(BaseQueryInterface query) {
		this.setChart_3(this.loadTable(query,Chart_3.class));
	}

	public void loadChart_2(BaseQueryInterface query) {
		this.setChart_2(this.loadTable(query,Chart_2.class));
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

	public void loadTable_dados_de_venda(BaseQueryInterface query) {
		this.setTable_dados_de_venda(this.loadTable(query,Table_dados_de_venda.class));
	}

}