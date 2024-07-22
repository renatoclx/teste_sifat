package br.com.api.cmv.teste_sifat.modules.cmv.projections;

public interface LeastSoldProductProjection {

    Long getProductId();
    String getProductName();
    Long getTotalQuantity();

}
