package application;

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
		
		
	}
}
