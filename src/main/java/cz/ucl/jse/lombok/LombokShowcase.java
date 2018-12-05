package cz.ucl.jse.lombok;

import org.apache.commons.lang3.StringUtils;

public class LombokShowcase {

    // this needs Lombok to be installed
	// Eclipse: 
	//  - download Lombok jar (https://projectlombok.org/download)
	//  - run it: java -jar lombok.jar
	//  - select your eclipse installation
	//  - Lombok will automatically install into Eclipse
	//
	// Idea:
	// - download Lombok plugin from plugins menu
	// - check "enable annotation processing" option in
	//   settings/Build, Execution, Deploymen/ Compiler/ Annotation Processing
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("John");
        System.out.println(student.getFirstName());
       
    }


}
