package projetospringboot.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import projetospringboot.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
