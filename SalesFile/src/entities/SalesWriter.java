package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalesWriter {
//ATTRIBUTES
	private String salesPath;
	private String outputPath;
	private SalesReader grossSale;
	
//CONSTRUCTOR
	public SalesWriter(SalesReader grossSale, String salesPath) {
		this.salesPath = salesPath;
		this.outputPath = salesPath + "\\output";
		this.grossSale = grossSale;
	}
//METHODS
	public void createOutput() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))){
			String line;
			String grossSaleMatrix[][] = grossSale.getGrossSales();
			
			for(int i = 1; i < grossSaleMatrix.length; i++) {
				double value, unit, total;
				line = grossSaleMatrix[i][1];
					
				unit =  Double.parseDouble(grossSaleMatrix[1][2]);
				value = Double.parseDouble(grossSaleMatrix[1][3]);
				total = value * unit;	
				line += ", "+total;
				
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
