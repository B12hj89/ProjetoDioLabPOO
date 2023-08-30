package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * @author thiago leite
 */
public class ClienteNegocio {

    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */
    public Optional<Cliente> consultar(String cpf) {

        if (bancoDados.getcliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getcliente());
        } else {
            return Optional.empty();
        }
    }

    /**
     * Cadastra um novo cliente.
     * @param cliente Novo cliente que terá acesso a aplicação
     */
    public void cadastrar(Cliente cliente) {
        bancoDados.adicionarCliente(cliente);
    }

    /**
     * Exclui um cliente específico.
     * @param cpf CPF do cliente
     */

    public void excluir(String cpf) {
        bancoDados.removerClientePorCpf(cpf);
    }

}
