public class Moedas {
    private String moedaPrincipal;
    private String moedaDeConversao;
    private String valorConvertido;
    private String taxaDeConversao;

    public Moedas(MoedasExchangeRate minhasMoedasER){
       this.moedaPrincipal = minhasMoedasER.base_code();
       this.moedaDeConversao = minhasMoedasER.target_code();
       this.valorConvertido = minhasMoedasER.conversion_result();
       this.taxaDeConversao = minhasMoedasER.conversion_rate();
    }

    public String getMoedaPrincipal() {
        return moedaPrincipal;
    }

    public void setMoedaPrincipal(String moedaPrincipal) {
        this.moedaPrincipal = moedaPrincipal;
    }

    public String getMoedaDeConversao() {
        return moedaDeConversao;
    }

    public void setMoedaDeConversao(String moedaDeConversao) {
        this.moedaDeConversao = moedaDeConversao;
    }

    public String getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(String valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public String getTaxaDeConversao() {
        return taxaDeConversao;
    }

    public void setTaxaDeConversao(String valorDeConversao) {
        this.taxaDeConversao = valorDeConversao;
    }

    @Override
    public String toString() {
        return "Moeda Principal: '" + moedaPrincipal + '\'' + '\n' +
                "Moeda de Conversão: '" + moedaDeConversao + '\'' + '\n' +
                "Valor Convertido: '" + valorConvertido + '\'' + '\n' +
                "Taxa de Conversão: '" + taxaDeConversao + '\'';
    }
}
