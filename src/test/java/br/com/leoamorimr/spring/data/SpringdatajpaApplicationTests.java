package br.com.leoamorimr.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import br.com.leoamorimr.spring.data.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

//		Product product = new Product();
//		product.setId(2L);
//		product.setName("Iphone");
//		product.setDescription("awesome too");
//		product.setPrice(800d);
//		repository.save(product);

//		Optional<Product> result = sy.findById(1L);
//		System.out.println(result);
//		result.get().setPrice(1500d);
//		repository.save(result.get());

//		repository.findAll().forEach(p->{System.out.println(p.getPrice());});

		System.out.println(repository.findByName("Ipod"));
		System.out.println(repository.findByPrice(1500d));

		System.out.println(repository.findByNameAndPrice("Mac", 1500d));
	}

}
