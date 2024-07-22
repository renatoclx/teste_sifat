package br.com.api.cmv.teste_sifat.modules.cmv.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeastSoldProductDTO {

    private Long productId;
    private String productName;
    private Long totalSales;

}
