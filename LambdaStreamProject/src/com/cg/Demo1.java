package com.cg;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Candidate> clist=InterviewRepository.getCandidateList();
		System.out.println("==========================");
		System.out.println("Citywise count");
		Stream<Candidate> cstream=clist.stream();
		Map<String,Long> citywisecount=cstream.collect(Collectors.groupingBy(candidate->candidate.getCity() , Collectors.counting()) );
		
		citywisecount.forEach((key,value)->System.out.println("City ->"+key + ", Number of candidate count "+value));
		
		System.out.println("==========================");
		System.out.println("Citywise avarage of yearsOfExperience");
		Stream<Candidate> cstream1=clist.stream();
		Map<String,Double> citywiseavgexp=cstream1.collect(Collectors.groupingBy(candidate->candidate.getCity() , Collectors.averagingInt(Candidate::getYearsOfExperience)) );

		citywiseavgexp.forEach((key,value)->System.out.println("City ->"+key + ", Avrage Experience "+value));
		System.out.println("==========================");

	}

}
