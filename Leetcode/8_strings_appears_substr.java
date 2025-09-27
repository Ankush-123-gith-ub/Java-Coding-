class string_appear{
    public int numOfStrings(String[] patterns, String word) {
        int sum = 0;
        for(String s : patterns){
            if(word.contains(s)) sum++;
        }
        return sum;
    }
}