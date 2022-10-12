package com.usa.misiontic.reto3.repository.crudRepositoy;

import com.usa.misiontic.reto3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
