class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            boolean alldiv = true;
            int temp = i;
            while(temp > 0 ){
                int rem = temp % 10;
                if(rem == 0 || i % rem != 0){
                    alldiv = false;
                    break;
                }
                temp = temp /10;
            }
            if(alldiv) list.add(i);
        }
            return list;
    }
}