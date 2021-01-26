package br.com.leoamorimr.spring.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.leoamorimr.spring.data.entity.Product;

//Long é o tipo do atributo id
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String name);

	List<Product> findByPrice(Double price);

	List<Product> findByNameAndPrice(String name, Double price);

}
