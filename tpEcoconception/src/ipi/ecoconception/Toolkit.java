package ipi.ecoconception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Toolkit {
	private static Map<String, MaturityLevel> levels;
	private static List<GoodPractice> goodPractices;
	private static List<NbOfGpPerDomain> nbOfGpPerDomains;
	private static Random r;
	private static List<Tool> tools = new ArrayList<>();
	public Toolkit() {
		initGoodPracties();
		initLevels();
		initGoodPracties();
		initNbOfGPperDomain();
		intiTools();
	}
	private static void intiTools() {
		tools= new ArrayList<>();
	}
	private static void initLevels() {
		levels = new HashMap<>();
	}
	private static void initGoodPracties() {
		goodPractices= new ArrayList<>();
	}
	private static void initNbOfGPperDomain() {
		nbOfGpPerDomains = new ArrayList<>();	
	}
	public List<String> getSomeToolNames(char c){
		List<String> list = new ArrayList<>();
		for (Tool tool : tools) {
			if(tool.getname().charAt(0)==c) {
				list.add(tool.getname());
			}
		}
		return list;
	}
	public  List<String> getSomeToolsByWord(String word) {
		List<String> list = new ArrayList<>();
		for (Tool tool: tools) {
			if(tool.getname().toLowerCase().contains(word.toLowerCase()) || tool.getDesc().toLowerCase().contains(word.toLowerCase())) {
				list.add(tool.getname());
			}
		}
		return list;
	}
	public List<String> getsomeLevelsWhichOtherNameContainingAA() {
		List<String> list = new ArrayList<>();
		for(Entry<String, MaturityLevel> level : levels.entrySet()) {
		    MaturityLevel value = level.getValue();
			if(value.getOtherName().contains("aa")) {
				list.add(value.getLevel());
			}
		}
		return list;
	}
	public String getLevelScoreAverage() {
		int res = 0;
		for(Entry<String, MaturityLevel> level : levels.entrySet()) {
			MaturityLevel value = level.getValue();
			res += value.getScore();
		}
		if(levels.size()==0) {
			return null;
		}
		res = res/levels.size();
		return String.valueOf(res); 
	}
	public List<String> getDomainListOrderedByNumberOfGoodPractices() {
		List<String> res = new ArrayList<>();
		for(NbOfGpPerDomain nbOfGpPerDomain :nbOfGpPerDomains) {
			res.add(nbOfGpPerDomain.getDomain());
		}
		Collections.sort(res, new Comparator<>() {

			@Override
			public int compare(String domain1, String domain2) {
				// \\s+ permet de corrigé le probleme des double espace d'apres chatgpt 
				int wordCount1 = domain1.split("\\s+").length;
	            int wordCount2 = domain2.split("\\s+").length;
				return  wordCount1 - wordCount2;
			}
		});
		return res; 
	}
}
