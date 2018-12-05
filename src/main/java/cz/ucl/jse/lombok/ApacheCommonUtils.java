package cz.ucl.jse.lombok;

import org.apache.commons.lang3.StringUtils;

public class ApacheCommonUtils {
	
	public static void main(String[] args) {  
        String nic = null;
        String prazdny = "";
        String mezera = " ";

        System.out.println(StringUtils.isNotEmpty(nic));
        System.out.println(StringUtils.isNotEmpty(prazdny));
        System.out.println(StringUtils.isNumeric(mezera));
    }

}
