import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public static void replaceSentence(List<String> dictionary, String sentence){
        String[] sentenceArr = sentence.split(" ");
        for (int i=0; i<sentenceArr.length; i++){
            String str = sentenceArr[i];
            for (int j=0; j<dictionary.size(); j++){
                String root = dictionary.get(j);
                if (str.contains(root) && str.substring(0, root.length()).equals(root)){
                    if (sentenceArr[i].length() > root.length()) {
                        sentenceArr[i] = root;
                    }
                }
            }
        }
        String out = "";
        for (int k=0; k< sentenceArr.length; k++){
            out += sentenceArr[k];
            if (k != sentenceArr.length-1){
                out += " ";
            }
        }
        System.out.println(out);
    }
    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        temp.add("catt");
        temp.add("cat");
        temp.add("bat");
        temp.add("rat");
        String str = "the cattle was rattled by the battery";
        replaceSentence(temp, str);
    }
}
