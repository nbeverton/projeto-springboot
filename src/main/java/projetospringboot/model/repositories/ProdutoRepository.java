package projetospringboot.model.repositories;

import org.springframework.data.repository.CrudRepository;
import projetospringboot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


}
