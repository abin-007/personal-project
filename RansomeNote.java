public class RansomeNote {
    public static void main(String arg[]){
	String RansomeNote="ac";
	String Magazine="aab";
	System.out.println(RansomeNoteConstruct(RansomeNote, Magazine));
						}
	public static boolean RansomeNoteConstruct(String RansomeNote, String Magazine){
	
		int[] count= new int[26];
		for(char c:Magazine.toCharArray()){
			count[c-'a']++;
						}
		for(char c:RansomeNote.toCharArray()){
			count[c-'a']--;
			if(count[c-'a']<0){
				return false;
					}
						}
		return true;		}
}
