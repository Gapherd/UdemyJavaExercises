package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalesReader {
//ATTRIBUTES
	private String salesPath;
	private String grossSaleMatrix[][];
	private String products[];

//CONTRUCTOR
	public SalesReader(String salesPath) {
		this.salesPath = salesPath;
		createSalesMatrix();
	}
	
//METHODS
	private void createSalesMatrix() {
		String line = ""; 
		String grossSaleArray[];
		String grossSaleMatrix[][] = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(salesPath))){
			int i = 1;
			while(line != null) {
				line = br.readLine();
				grossSaleArray = line.split(",");
				for(int count = 1; count < grossSaleArray.length; count++) {
					grossSaleMatrix[i][count] = grossSaleArray[count]; 
				}
				i++;
			}
			this.grossSaleMatrix = grossSaleMatrix;
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	
//GETS & SETS
	public String[][] getGrossSales(){
		return grossSaleMatrix;
	}
	
}
