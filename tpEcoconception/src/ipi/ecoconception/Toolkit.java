package ipi.ecoconception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Toolkit {
	private Map<String, MaturityLevel> levels;
	private List<GoddPractice> goodPractices;
	private List<NbOfGpPerDomain> nbOfGpPerDomains;
	private Random r;
	private List<Tool> tools = new ArrayList<>();
	public static void Toolkit() {
	}
	private void intiTools() {
		tools= new ArrayList<Tool>();
	}
	private void initLevels() {
		levels = new HashMap<>();
	}
	private void initGoodPracties() {
		goodPractices= new ArrayList<>();
	}
	private void initNbOfGPperDomain() {
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
}
