package exercises;

import java.util.Collections;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		Collections.sort(JobCandidate.jobCandidates, (c1, c2) -> c1.getSalaryRequired() - c2.getSalaryRequired());
		System.out.println(JobCandidate.jobCandidates);

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		JobCandidate.jobCandidates.removeIf(c -> !c.getTeacherName().contains("June"));
		System.out.println(JobCandidate.jobCandidates);

	}
}
