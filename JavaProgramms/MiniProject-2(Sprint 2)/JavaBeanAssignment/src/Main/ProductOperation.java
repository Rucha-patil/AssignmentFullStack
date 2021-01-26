package Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Service.ProductService;
import bean.Product;

public class ProductOperation {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int ch=0;
		String name;
		float price;
		boolean flag = true;
		int a = 1,id;
	
		ProductService ps = new ProductService();
	    ArrayList<Product> al=new ArrayList<Product>();
		
		
		do
		{
			System.out.println("Enter the Appropriate Option");
			System.out.println("1. Add Product");
			System.out.println("2. Update the Product Price");
			System.out.println("3. Delete the Product");
			System.out.println("4. View All Product");
			System.out.println("5. View Price of the Product");
			System.out.println("6. Exit");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
						al = ps.displayAllProduct();
						
						Iterator it1 = al.iterator();
						System.out.println("\nEnter Your Product Name and Price here");
						name = sc.next();
						price = sc.nextFloat();
						boolean inflag = true;
						while(it1.hasNext())
						{
							Product pct = (Product)it1.next();
							if(pct.getPname().equals(name))
							{
								System.out.println(" This Product is already Present - " + pct.getPname());
								System.out.println();
								inflag=false;
								break;
							}						
						}
						if(inflag)
						{
							id = ps.addproduct(a,name, price);
							a++;
							System.out.println("\nProduct Added Successfully.... ");
							ch=0;
						}
						break;
				case 2:
						System.out.println("Enter Your Product Id :");
						id = sc.nextInt();
						System.out.println("Enter Your Product Price Here :");
						price = sc.nextFloat();
						ps.updateProduct(id, price);
						System.out.println("\nUpdated Product Price is :");
						break;
				case 3:
						System.out.println("Enter Your Product Id Here :");
						id = sc.nextInt();
						ps.deleteProduct(id);
						System.out.println("\nProduct Deleted Successfully..");
						break;
				case 4:
						al = ps.displayAllProduct();
						Iterator it = al.iterator();
						while(it.hasNext())
						{
							System.out.println(it.next()); ;
						}
						break;
				case 5:
						System.out.println("\n Enter Your Product Id");
						id = sc.nextInt();
						System.out.println(ps.retrieveProductPrice(id));
						break;
				case 6:
						
						
						break;
				default:
						System.out.println("\n Enter Appropriate option");
						
			}
		    try
	        {
	            FileOutputStream fos = new FileOutputStream("employeeData");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(al);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
			
		}while(flag);
		System.out.println("test 1");

	}

}
