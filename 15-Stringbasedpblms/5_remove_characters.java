import java.util.Arrays;

class remove_characters{
    public static void main(String[] args){
        String str1 = "ankush";
        String str2 = "anav";
        char[] chararray = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str1.length() ; i++){
            char ch = str1.charAt(i);
            if(!Arrays.asList(chararray).contains(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());


    }
}