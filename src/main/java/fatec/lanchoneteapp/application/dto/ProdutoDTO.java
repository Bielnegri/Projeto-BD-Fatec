package fatec.lanchoneteapp.application.dto;

public record ProdutoDTO(
        Long produtoId,
        String produtoNome,
        int quantidade,
        double precoUnitario,
        double subtotal
) {}
