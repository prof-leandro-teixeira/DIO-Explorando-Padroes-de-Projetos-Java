package DIOExplorandoPadroesdeProjetosJava.service;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, cliente cliente);

    void deletar(Long id);
}
