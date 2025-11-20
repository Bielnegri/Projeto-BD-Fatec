package fatec.lanchoneteapp.application.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PedidoDTO(
        Long id,
        String codigo,
        LocalDateTime dataCriacao,
        LocalDateTime dataAtualizacao,
        StatusPedidoDTO status,
        ClienteResumoDTO cliente,
        List<ProdutoDTO> produtos,
        double valorTotal
) {}
