package fr.backyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.backyard.dao.IProduitDao;
import fr.backyard.entities.Produit;

@SpringBootApplication
public class BriquelebackyardApplication implements CommandLineRunner {
	@Autowired
	private IProduitDao produitDao;
	public static void main(String[] args) {
		SpringApplication.run(BriquelebackyardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			produitDao.save(new Produit(null, "Smartphone", 500.00));
			produitDao.save(new Produit(null, "Printer", 200.00));
			produitDao.save(new Produit(null, "PC", 100.00));
			produitDao.save(new Produit(null, "ordinateur", 100.00));
		
		
	}

}
