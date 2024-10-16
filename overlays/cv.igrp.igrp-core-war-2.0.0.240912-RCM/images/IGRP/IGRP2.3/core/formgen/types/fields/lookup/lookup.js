var LOOKUPFIELD = function(type,params){
	Field.call(this,type,params);
	
	var field = this;
	var GEN = VARS.getGen();
	var proprieties = params.properties;
	
	field.includes = {
			
		js :[{path:'/plugins/lookup/igrp.lookup.js'}]
	
	}

	field.ready = function(){
		
		GEN.setBtnActionAttr(field,{
			value: proprieties && proprieties.action ? proprieties.action : '',
			xmlAttr:function(){
				var action = field.action.action ? field.action.action : '',
					page   = field.action.page   ? field.action.page   : '',
					app    = field.action.app    ? field.action.app    : '';

				return 'action="'+action+'" page="'+page+'" app="'+app+'"';
			}
		});

		var pageFields = function(){
			var rtn = [];
			GEN.getAllFields().forEach(function(f){
			
				var val = f.GET.name ? f.GET.name() : 'p_'+f.GET.tag();
		
				if(f.formField || f.hidden)
					rtn.push({
						value : val,
						label : f.GET.tag()
					});
			});
			
			return rtn;
		}

		field.setPropriety({
			name : 'field_param',
			label : 'Lookup Params',
			order : 3,
			value:{
				value : '',
				options : pageFields(),
				multiple:true,
			}
		});
		
		field.setProperty({
			name : 'lookupParams',
			label: 'Field mapping to set values',
			type : 'formlist',
			order : 4,
			size : 12,
			value : {
				
				value : proprieties && proprieties.lookupParams || [],
				
				setter:function(){
					
					var actionID = field.GET.action();
					
					var holder = $('<div class="box clean box-table-contents loading" item-name="lookupParams"><div class="box-body table-box"></div></div>');

				
					var setFormlist = function(){
						
						GEN.getPageJSON(actionID,function(containers,data){
							
							var fields = [];
							
							if(containers){
								
								containers.forEach(function(c){
									
									if(GEN.lookupMaps && GEN.lookupMaps.containers[c.proprieties.type]){
										
										var _f = GEN.lookupMaps.containers[c.proprieties.type].getFields( c );
										
										fields = fields.concat(_f);
										
									}
									if(c.fields && c.fields[0]){
//										console.log(c.fields)
										c.fields.forEach(function(f){
										
											var tag   = f.properties.tag,
												label = tag;
											

											fields.push({
												value : tag,
												label : label
											});
											
										});
									}
								});
							}
							
							holder.find('.IGRP_formlist').remove();
							
							var flist = GEN.attributes.get({
								type : 'formlist',
								name : 'lookupParams',
								fields : {
									target_field : {
										type : 'select',
										label : 'Target Field',
										options : pageFields()
									},
									value_field : {
										type : 'select',
										label : 'Value Field',
										options : fields
									}
								},
								
								data : field.GET.lookupParams()
								
							});
							
							holder.append(flist);
							
						});
						
					}

					$('.propriety-setter[rel="action"]',$('.gen-properties-setts-holder')).on('change',function(){
						actionID = $(this).val();
						setFormlist();
					});
					
					setFormlist();
					
					return holder;
					
					
				}
			}
		});

		
		
		field.setProperty({
			label 	: 'Clear mapped field value',
			name  	:'lookup_eraser',
			value 	:true,
			xslValue:function(){
				return '<span class="lookup-eraser"><i class="fa fa-times"></i></span>';
			}
		});
		
		field.setProperty({
			name:'lookup_type',
			label:'Lookup Type',
			editable : false,
			order : 3,
			value:{
				value: 'LOOKUP',
				options:[
					{
						label:'',
						value:'LOOKUP'
					},
					{
						label:'NIF',
						value:'LOOKUP_NIF'
					},
					{
						label:'B.I',
						value:'LOOKUP_BI'
					},
					{
						label:'CAE',
						value:'LOOKUP_CAE'
					},
					{
						label:'NIC',
						value:'LOOKUP_NIC'
					},
					{
						label:'Geografia',
						value:'LOOKUP_GEOG'
					},
					{
						label:'Nascimento',
						value:'LOOKUP_NASC'
					},
					{
						label:'Orgância',
						value:'LOOKUP_ORG'
					}
				]


			}
		});

		GEN.setBTNClass(field);
	}
	
}

this[VARS.name].declareField({
	type:'lookup',
	field:LOOKUPFIELD
});