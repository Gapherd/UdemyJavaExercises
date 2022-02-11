package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VoteReader {
//ATTRIBUTES
	private String filePath;
	private Map<String, String> votes = new TreeMap<>();
	
//CONSTRUCTOR
	public VoteReader(String filePath) {
		this.filePath = filePath;
		createVoteMap();
	}
	
//METHODS
	private void createVoteMap() {
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String voteSplit[]; 
			
			while(line != null) {
				int voteCount;
				line = br.readLine();
				if(line != null) {
					voteSplit = line.split(",");
					if(votes.containsKey(voteSplit[0])) {
						voteCount = Integer.parseInt(votes.get(voteSplit[0]));
						voteCount += Integer.parseInt(voteSplit[1]);
					} else {
						voteCount = Integer.parseInt(voteSplit[1]);
					}
					
					votes.put(voteSplit[0], Integer.toString(voteCount));
				}
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public Map<String, String> getVotes(){
		return votes;
	}
	
}
