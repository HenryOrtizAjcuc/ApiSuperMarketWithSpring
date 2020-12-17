package com.example.market.persistence.crud;

import com.example.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // Tabien se puede hacer de esta forma nativa. Y por consiguiente podriamos llamar a nuestro metodo de cualquier otra forma.
    // @Query(value = "SELECT * from productos where id_categoira = ?", nativeQuery = true)
    // El nombre del paramentro debe ser igual que el atributo;
    List<Producto> findByIdCategoriaOrderByAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
