class q_4 {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(Character.toString(ch))) return word;
        StringBuilder sb = new StringBuilder();
        int f = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == ch && f==0){
                sb.append(ch);
                sb.reverse();
                f++;
            }
            else{sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }
}

class Q_4 {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(Character.toString(ch))) return word;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
            
        }
        StringBuilder sub1 = new StringBuilder();
        sub1.append(word.substring(0,index+1)).reverse();
        sb.append(sub1);
        sb.append(word.substring(index+1));
        return sb.toString();
    }
}