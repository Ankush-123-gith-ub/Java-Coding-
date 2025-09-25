class two_string_array_check {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String n1 : word1){
            s1.append(n1);
        }
        for(String n2 : word2){
            s2.append(n2);
        }
        return(s1.toString().equals(s2.toString()));
    }
}