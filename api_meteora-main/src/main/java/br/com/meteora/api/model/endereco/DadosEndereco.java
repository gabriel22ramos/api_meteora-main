package br.com.meteora.api.model.endereco;

public record DadosEndereco(
    String logradouro, 
    String bairro, 
    String cep, 
    String cidade, 
    String uf, 
    String numero, 
    String complemento) {
    
}
