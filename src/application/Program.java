package application;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("================ TEST 1 ================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
				
		System.out.println(seller);	
		
		
		System.out.println("================ TEST 2 ================");
		
		List<Seller> list = new ArrayList<>();
		Department dep = new Department(2,null);
		
		list = sellerDao.findByDepatment(dep);
		for(Seller sellers : list) {
			System.out.println(sellers);
		}
		
		System.out.println("================ TEST 3 ================");
		
		List<Seller> list1 = new ArrayList<>();
		list1= sellerDao.findAll();
		for(Seller sellers : list1) {
			System.out.println(sellers);
		}
		
		System.out.println("================ TEST 4 ================");
		
		//Seller newSeller = new Seller(null, "maria", "maria@gmail.com", new Date(0), 5000.0, dep);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted, new id = " + newSeller.getId());
		
		
		System.out.println("================ TEST 5 ================");
		seller = sellerDao.findById(10);
		seller.setName("Louis");
		seller.setEmail("louis@gmail.com");
		sellerDao.update(seller);
		
		System.out.println("================ TEST 6 ================");
	
		sellerDao.deleteById(12);
		}
	}

