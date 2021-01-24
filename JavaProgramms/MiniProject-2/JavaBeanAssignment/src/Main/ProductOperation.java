package Main;

import java.util.ArrayList;
import java.util.Scanner;



import Service.*;
import bean.Product;


public class ProductOperation {

	private Object displayAllProduct;

	public static void main(String[] args) {
		int count=0;
		Scanner sc =new Scanner(System.in);
		ProductService PS=new ProductService();
		 ArrayList<Product> arr = PS.retrieveProduct();
		 	ProductService.displayAllProduct();
		 	ArrayList<Product> list =displayAllProduct.list;
		 	System.out.println(list);   
		 
		 //			
//			do {
////				
////				PS.addProduct();//
////				//System.out.println("list ar"+ PS.displayAllProduct());
////				for(Product P:list)
////				{  
////					System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
////				} 
////				break;
//				
//				
//				
//				
//				break;
//			} while (count==0);
	}

}
