public class LuckyNumberClass {
    
    static String getHash(String theString){
        return theString.hashCode();
    }
    public static void main(String args[]) {
        String companyName = "Google";
        String programName = "SPS";
        int currentYear = 2021;
        int companyHash = Integer.parseInt(getHash(companyName));
        int programHash = Integer.parseInt(getHash(programName));
	 int spsLuckyNumber = companyHash + programHash + currentYear;
     System.out.println(spsLuckyNumber);
    }
}