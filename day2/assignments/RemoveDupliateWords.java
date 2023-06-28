package week1.day2.assignments;

public class RemoveDupliateWords {

	public static void main(String[] args) {
		String sentence, result = "";
		String allWords[];
		sentence="We learn Java basics as part of java sessions in java week1";
		
		System.out.print(" GIVEN SENTENCE TO REMOVE DUPLICATE WORDS  is  "); 
		System.out.println(sentence);
		
		// Split the given sentence to get each word as String array
		allWords = sentence.split(" ");
		// Use for loop to remove duplicate words
		for(int i=0; i<allWords.length; i++) {
			for(int j=i+1; j<allWords.length; j++) {
				if(allWords[i].equalsIgnoreCase(allWords[j])) {
					allWords[j] = "remove";
				}
			}
	}
		// Convert to String
				for(String word: allWords) {
					if(word != "remove") {
						result = result + word + " ";
					}
				}
				// Display given String after removing duplicates
				System.out.println("\nSentence after removing duplicate words: " + result);

			}

	}
	