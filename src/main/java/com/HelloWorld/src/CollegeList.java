package com.HelloWorld.src;
import java.util.*;
import java.io.*;


public class CollegeList {

	public ArrayList<College> colleges = new ArrayList<College>();
	public String[] programs = new String[] {"English Language and Literature", "Education", "Architecture", "Agriculture", 
	                        	"Communications and Journalism", "Computer and Information Sciences", "Culinary Services", 
	                        	"Engineering", "Legal Professions and Studies", "Liberal Arts and Sciences", "Biological and Biomedical Sciences",
	                        	"Mathematics and Statistics", "Philosophy and Religious Studies", "Psychology", "Social Sciences",
	                        	"Visual and Performing Arts", "Business", "History"};


	public CollegeList() {
		this.populateList();
	}
	
	public void populateList() {
		String csvFile = "/Users/mac/Documents/workspace-sts-3.9.0.RELEASE/HelloWorld/src/main/java/com/HelloWorld/src/data.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy =",";
		int counter = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            		if(counter > 0) {
                        String[] arr = line.split(csvSplitBy);

                        College c = new College();
                        
                        c.id = counter + 1;
                        
                        if(arr[0] != "NULL") {
                        	c.setName(arr[0]);
                        }
                        if(arr[2] != "NULL") {
                           c.setState(arr[2]);
                        }
                        if(arr[6] != "NULL") {
                           c.setSAT(arr[6]);
                        }
                        if(arr[7] != "NULL") {
                            c.setACT(arr[7]);
                        }
                        if(arr[8].equals("1")) {
                        	   c.addProgram("Agriculture");
                        }
                        if(arr[10].equals("1")) {
                    			c.addProgram("Architecture");
                        }
                        if(arr[12].equals("1")) {
                				c.addProgram("Communication");
                        }
                        if(arr[14].equals("1")) {
                          	c.addProgram("Computer and Information Sciences");
                        }
                        if(arr[15].equals("1")) {
                        		c.addProgram("Culinary Services");
                        }
                        if(arr[16].equals("1")) {
            					c.addProgram("Education");
                        }
                        if(arr[17].equals("1")) {
        					c.addProgram("Engineering");
                        }
                        if(arr[21].equals("1")) {
        					c.addProgram("Legal Professions and Studies");
                        }
                        if(arr[22].equals("1")) {
        					c.addProgram("English Language and Literature");
                        }
                        if(arr[23].equals("1")) {
        					c.addProgram("Liberal Arts and Sciences");
                        }
                        if(arr[25].equals("1")) {
        					c.addProgram("Biological and Biomedial Sciences");
                        }
                        if(arr[26].equals("1")) {
        					c.addProgram("Mathematics and Statistics");
                        }
                        if(arr[30].equals("1")) {
        					c.addProgram("Philosophy and Religious Studies");
                        }
                        if(arr[34].equals("1")) {
        					c.addProgram("Psychology");
                        }
                        if(arr[37].equals("1")) {
        					c.addProgram("Social Sciences");
                        }
                        if(arr[42].equals("1")) {
        					c.addProgram("Visual and Performing Arts");
                        }
                        if(arr[44].equals("1")) {
             				c.addProgram("Business");
                         }
                        if(arr[45].equals("1")) {
        					c.addProgram("History");
                        }
                        if(arr[46].equals("NULL") == false) {
        						c.setCost(Integer.parseInt(arr[46]));
                        }

                        this.colleges.add(c);
            		}
                counter++;
            }
        	} catch (FileNotFoundException e) {
                e.printStackTrace();
         } catch (IOException e) {
                e.printStackTrace(); 
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }	
	}
	
	public void showColleges() {
		for(int i = 0; i < this.colleges.size()/3 ; i++) {
			System.out.println("College: " + colleges.get(i).name);
			System.out.println(colleges.get(i).state);
			System.out.println(colleges.get(i).SAT);
			System.out.println(colleges.get(i).ACT);
			System.out.println(colleges.get(i).programs.toString());
			System.out.println("------------------------------------------");
		}
	}
	
	public ArrayList getColleges() {
		return this.colleges;
	}
	
	public String[] getNames() {
		String[] names = new String[7705];
		
		for(int i = 0; i < this.colleges.size(); i++) {
			names[i] = this.colleges.get(i).name;
		}
		
		return names;
	}
	
	public ArrayList advancedSearch(HashMap<String,String> formInput) {

		ArrayList<College> results = new ArrayList<College>();

		//Save input from search query		
		String state = formInput.get("state");
		String major = formInput.get("major");
		int ACT = 0;
		int SAT = 0;
		
		if(formInput.get("sat").equals("") == false) {
			SAT = Integer.parseInt(formInput.get("sat"));
		} else if(formInput.get("act").equals("") == false) {
			ACT = Integer.parseInt(formInput.get("act"));
		}		
		
		System.out.println("State: " + state);
		System.out.println("Sat: " + SAT);
		System.out.println("Act: " + ACT);
		System.out.println("major: " + major);

		for(int i = 0; i < this.colleges.size(); i++ ) {			
			//Check for major			
			if(this.colleges.get(i).programs.contains(major) == true) {
				//Check for state
				if(this.colleges.get(i).state.equals(state)) {	
					//Check for SAT					
					if( this.colleges.get(i).ACT.equals("NULL") == false ) {
						if(SAT > 0 && Integer.valueOf(this.colleges.get(i).SAT) < SAT) {
							results.add(this.colleges.get(i));
						}
					}
					//Check for ACT					  
					if( this.colleges.get(i).ACT.equals("NULL") == false ) {
						if(Integer.valueOf(this.colleges.get(i).ACT) < ACT) {
							results.add(this.colleges.get(i));
						}
					}
			
				}
			}
			
		}
		
		return results;
	}
	
}
