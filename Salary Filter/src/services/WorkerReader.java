package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Worker;

public class WorkerReader {
//ATTRIBUTES
	private String filePath;
	private List<Worker> workers = new ArrayList<>();
	
//CONSTRUCTOR
	public WorkerReader(String filePath) {
		this.filePath = filePath;
		createWorkersArray();
	}
	
//METHODS
	private void createWorkersArray() {
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String data[]; 
			
			while(line != null) {
				line = br.readLine();
				if(line != null) {
					data = line.split(",");
					workers.add(new Worker(data[0], data[1], data[2]));
				}
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public List<Worker> getWorkers(){
		return workers;
	}
	
}
