package one.digitalinovation.laboojava.entidade;


import one.digitalinovation.laboojava.entidade.constantes.Materiais;

/**
 * Classe que representa um caderno, qual Ã© uma especializaÃ§Ã£o de um produto da loja.
 * @author thiago leite
 */


public class Caderno extends Produto {
    /**
     * Quantidade de matÃ©rias que o caderno pode ter.
     */
    private Materiais tipo;

    public Materiais getTipo() {
        return tipo;
    }

    public void setTipo(Materiais tipo) {
        this.tipo = tipo;
    }


    /**
     * {@inheritDoc}.
     */


    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) +
        tipo.getFator();

    }


    @Override
    public String toString() {
        return "Caderno{" +
                " tipo=" + tipo + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preÃ§o='" + getPreco() + '\'' +
                '}';

    }


    }