public class StringManipulator {

	public String trimAndConcat(String str1, String str2) {
		return str1.trim() + str2.trim();		
	}

	public Integer getIndexOrNull(String str1, char char1) {
		int idx = str1.indexOf(char1);
		return idx == -1 ? null : idx;

	}

	public Integer getIndexOrNull(String str1, String str2) {
		int idx = str1.indexOf(str2);
		return idx == -1 ? null : idx;
	}

	public String concatSubstring(String str1, int int1, int int2, String str2) {
		String substring = str1.substring(int1, int2);
		return substring + str2;
	}

}