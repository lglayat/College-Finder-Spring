package com.HelloWorld.src;
import java.util.*;
import java.io.*;


public class CollegeList {

	public ArrayList<College> colleges = new ArrayList<College>();

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
            			// use comma as separator
                        String[] arr = line.split(csvSplitBy);

                        College c = new College();
                        
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
                        if(arr[8] == "1") {
                        	   c.addProgram("Agriculture");
                        }
                        if(arr[10] == "1") {
                    			c.addProgram("Architecture");
                        }
                        if(arr[12] == "1") {
                				c.addProgram("Communication");
                        }

                        if(arr[14] == "1") {
            					c.addProgram("Computer and Information Sciences");

                        }
                        if(arr[15] == "1") {
                        		c.addProgram("Culinary Services");
                        }
                        if(arr[16] == "1") {
            					c.addProgram("Education");
                        }
                        if(arr[17] == "1") {
        					c.addProgram("Engineering");
                        }
                        if(arr[21] == "1") {
        					c.addProgram("Legal Professions and Studies");
                        }
                        if(arr[22] == "1") {
        					c.addProgram("English Language and Literature");
                        }
                        if(arr[23] == "1") {
        					c.addProgram("Liberal Arts and Sciences");
                        }
                        if(arr[25] == "1") {
        					c.addProgram("Biological and Biomedial Sciences");
                        }
                        if(arr[26] == "1") {
        					c.addProgram("Mathematics and Statistics");
                        }
                        if(arr[30] == "1") {
        					c.addProgram("Philosophy and Religious Studies");
                        }
                        if(arr[34] == "1") {
        					c.addProgram("Psychology");
                        }
                        if(arr[37] == "1") {
        					c.addProgram("Social Sciences");
                        }
                        
                        if(arr[42] == "1") {
        					c.addProgram("Visual and Performing Arts");
                        }
//                  
//                        if(Integer.valueOf(arr[44]) == 1 ) {
//             				c.addProgram("Business");
//                         }
                       
                        if(arr[45] == "1") {
        					c.addProgram("History");
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
		//END OF METHOD
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
	
	
	
	
	
}
