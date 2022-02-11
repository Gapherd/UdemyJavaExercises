package application;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entities.VoteReader;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> votes = new TreeMap<>();
		
		System.out.println("Enter file full path: ");
		VoteReader voteR = new VoteReader(sc.next());
		votes = voteR.getVotes();
		
		System.out.println("");
		for(String candidate : votes.keySet()) {
			System.out.print(candidate+ ": "+votes.get(candidate)+" votes.");
			System.out.println("");
		}
 
	}

}
