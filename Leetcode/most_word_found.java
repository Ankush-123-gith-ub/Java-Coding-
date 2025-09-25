class most_found_word {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s: sentences){
            String[] words =  s.split(" ");
            int len_s = words.length;
            if(len_s > max){
                max = len_s;
            }
        }
        return max;
    }
}
