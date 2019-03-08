package annotationString;

public class AnnotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main function of String on JAVA
		/*--FORMAT:
		 * toLowerCase() -- Transform the string to lower Strings.
		 * toUpperCase() -- Transform the string to lower Strings.
		 * trim() -- Withdraws the begin space and last space of a string.
		 * 
		 * --REPLACE:
		 * replace() -- Replace a letter or word with other letter or word.
		 * 
		 * --CUT OUT: 
		 * substring(index) -- Get the chars starting determined index.
		 * substring(firtIndex,lastIndex) -- cut out the chars beetween determined firstIndex and lastIndex.
		 * split(" ") -- Withdraw the space between the words. You can to create a new vector using this method.
		 * 
		 * --SEARCH:
		 * indexOf("char") -- Return the first occurrence index of the specifield character.
		 * lastIndexOf("char") -- Return the first occurrence index to last to first of the specifield character.
		 */

		String name = "-abc ASFLKAJSDFKG iuoSFSDJW ASDFjfd nfmhSDFdeurdk-- ";
		String s1 = name.toLowerCase();
		String[] vector = name.split(" ");
		System.out.println("Name: " + name);
		System.out.println();
		System.out.println("toLowerCase(): " + s1);
		System.out.println("toUpperCase(): " + name.toUpperCase());
		System.out.println("trim(): " + name.trim());
		System.out.println("replace(): " + name.replace("abc", "xxxx"));
		System.out.println("substring()B: " + name.substring(2));
		System.out.println("substring()B and L:" + name.substring(2, 9));
		System.out.println("indexOf(): " + name.indexOf("F"));
		System.out.println("LastIndexOf(): " + name.lastIndexOf("k"));
		System.out.println("Vector of split(): " + vector[0]);
		System.out.println("Vector of split(): " + vector[1]);
		System.out.println("Vector of split(): " + vector[2]);
		System.out.println("Vector of split(): " + vector[3]);
		System.out.println("Vector of split(): " + vector[4]);
	}

}
