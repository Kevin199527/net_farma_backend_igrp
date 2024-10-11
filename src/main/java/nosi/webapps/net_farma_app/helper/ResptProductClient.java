package nosi.webapps.net_farma_app.helper;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import nosi.webapps.net_farma_app.dao.TblMedicamentos;

import java.util.List;

public class ResptProductClient {
    private static final String REST_URL = "http://localhost:8080/net_farma_backend_igrp/app/webapps?r=net_farma_app/Paginalistarproduto/index&dad=net_farma_app&target=_blank&isPublic=1&lang=pt_PT";
    private Client client;

    public ResptProductClient(){
        this.client = ClientBuilder.newClient();
    }

    public TblMedicamentos getProduct(Integer id){
        return this.client.target(REST_URL).path(String.valueOf(id)).request(MediaType.APPLICATION_JSON).get(TblMedicamentos.class);
    }

    public List<TblMedicamentos> getProducts(){
        return this.client.target(REST_URL).request(MediaType.APPLICATION_JSON).get(new GenericType<List<TblMedicamentos>>() {});
    }
}
