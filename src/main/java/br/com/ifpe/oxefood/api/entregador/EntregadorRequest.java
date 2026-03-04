package br.com.ifpe.oxefood.api.entregador;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EntregadorRequest {

    private Long idCategoria; 
    
    private String codigo;

    private String titulo;

    private String descricao;

    private Double valorUnitario;

    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;

    public Entregador build() {

        return Entregador.builder()
            
            .codigo(codigo)
            .titulo(titulo)
            .descricao(descricao)
            .valorUnitario(valorUnitario)
            .tempoEntregaMinimo(tempoEntregaMinimo)
            .tempoEntregaMaximo(tempoEntregaMaximo)
            .build();
    }  
    
}