<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/circlestatbox/circlestatbox.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/highcharts/igrp.charts.css?v={$version}"/><style>.toolsbar_1{  background: #ffffff;  border-block: solid;writing-mode: horizontal-tb;}</style></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-c19f2662"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item toolsbar_1" gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="toolsbar_1" item-name="toolsbar_1"><div class="btns-holder  pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if></div></div></div><div class="row " id="row-c3c69da2"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_produto"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_produto"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_produto/fields"/><div class="circlestatbox {rows/content/circlestatbox_produto/fields/circlestatbox_produto_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_produto/fields/circlestatbox_produto_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_produto/fields/circlestatbox_produto_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_produto/fields/circlestatbox_produto_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_produto/fields/circlestatbox_produto_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_produto/fields/circlestatbox_produto_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_produto/fields/circlestatbox_produto_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_estoque"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_estoque"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_estoque/fields"/><div class="circlestatbox {rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_estoque/fields/circlestatbox_estoque_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div></div><div class="row " id="row-42197f41"><div class="gen-column col-sm-3"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_funcionario"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_funcionario"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_funcionario/fields"/><div class="circlestatbox {rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_funcionario/fields/circlestatbox_funcionario_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div><div class="gen-column col-sm-3"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_fornecedor"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_fornecedor"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_fornecedor/fields"/><div class="circlestatbox {rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_fornecedor/fields/circlestatbox_fornecedor_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div><div class="gen-column col-sm-3"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_venda"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_venda"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_venda/fields"/><div class="circlestatbox {rows/content/circlestatbox_venda/fields/circlestatbox_venda_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_venda/fields/circlestatbox_venda_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_venda/fields/circlestatbox_venda_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_venda/fields/circlestatbox_venda_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_venda/fields/circlestatbox_venda_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_venda/fields/circlestatbox_venda_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_venda/fields/circlestatbox_venda_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div><div class="gen-column col-sm-3"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_4"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_4"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_4/fields"/><div class="circlestatbox {rows/content/circlestatbox_4/fields/circlestatbox_4_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_4/fields/circlestatbox_4_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_4/fields/circlestatbox_4_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_4/fields/circlestatbox_4_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_4/fields/circlestatbox_4_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_4/fields/circlestatbox_4_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_4/fields/circlestatbox_4_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div></div><div class="row " id="row-3eaf833d"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/chart_1"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_1"/><xsl:with-param name="chart_type" select="rows/content/chart_1/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Chart'"/><xsl:with-param name="url" select="rows/content/chart_1/url"/></xsl:call-template></div></div></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/chart_2"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_2"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_2/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_2"/><xsl:with-param name="chart_type" select="rows/content/chart_2/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Chart'"/><xsl:with-param name="url" select="rows/content/chart_2/url"/></xsl:call-template></div></div></xsl:if></div></div></div><div class="row " id="row-b9364f1f"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/chart_3"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_3"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_3/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_3"/><xsl:with-param name="chart_type" select="rows/content/chart_3/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Venda por ano e cada meses'"/><xsl:with-param name="url" select="rows/content/chart_3/url"/></xsl:call-template></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/plugins/circlestatbox/jquery.knob.modified.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/circlestatbox/igrp.circlestatbox.init.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-more.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/exporting.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/funnel.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/heatmap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/treemap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-3d.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/igrp.charts.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-charts.tmpl.xsl?v=3"/></xsl:stylesheet>