package ioOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		String inputFileName = "C:\\Users\\chauh\\eclipse-workspace\\IO-Operations\\src\\inputFileForQuest3";
		String outputFileName = "C:\\Users\\chauh\\eclipse-workspace\\IO-Operations\\src\\outputFileForQuest3";

		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			FileReader fr = new FileReader(inputFile);
			FileWriter fw = new FileWriter(outputFile);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			String line;

			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
//				int lengthOfWords = words.length;

				for (String word : words) {
					if (map.containsKey(word)) {
						Integer value = map.get(word);
						value++;
						map.put(word, value);
					} else {
						map.put(word, 1);
					}

				}

			}
			
		   for(Map.Entry<String, Integer> entry : map.entrySet()) {
			   bw.write(entry.getKey()+" : "+entry.getValue()+"\n");
		   }
           System.out.println("Process Complete.");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
