package com.milkneko.example.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.milkneko.example.model.Customer;
import com.milkneko.example.model.Medic;
import com.milkneko.example.model.Pet;
import com.milkneko.example.model.Veterinary;
import com.milkneko.example.repositories.CustomerRepository;
import com.milkneko.example.repositories.MedicRepository;
import com.milkneko.example.repositories.PetRepository;
import com.milkneko.example.repositories.VeterinaryRepository;

@Component
@Transactional
public class InitializerManager {
	
	@Autowired
	private VeterinaryRepository veterinaryRepository;
	@Autowired
	private MedicRepository medicRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PetRepository petRepository;

	public void initialize(){
		System.out.println("initialize");
		
		Veterinary veterinary = new Veterinary();
		veterinary.setName("Petty pet");
		veterinary.setValue(2f);
		veterinaryRepository.save(veterinary);
		
		for(int i = 0; i < 10; i++){
			Medic medic = new Medic();
			medic.setName("medic" + (i + 1));
			
			medic.setVeterinary(veterinary);
			
			medicRepository.save(medic);
		}
		
		for(int i = 0; i < 10; i++){
			Customer customer = new Customer();
			customer.setName("customer" + (i + 1));
			customer.setVeterinary(veterinary);
			
			customerRepository.save(customer);
			
			for(int j = 0; j < 3; j++){
				Pet pet = new Pet();
				pet.setName("pet" + (i + 1) + "_" + (j + 1));
				pet.setCustomer(customer);
				
				petRepository.save(pet);
			}
		}
	}

	public void testData(){
		//System.out.println(dataSourceTransactionManager);
		Veterinary veterinary = veterinaryRepository.findAll().get(0);

		for (Customer customer : veterinary.getCustomer()) {
			System.out.println(customer.getName());

			customer.getPet().size();

			for (Pet pet : customer.getPet()) {
				System.out.println(pet.getName());
			}
		}
	}
}
