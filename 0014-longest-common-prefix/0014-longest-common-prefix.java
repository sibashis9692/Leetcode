class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int max_length = Math.min(first.length(), last.length());
        System.out.println(max_length);
        for(String he: strs){
            System.out.print(he + " ");
        }
        for(int i = 0; i <= max_length - 1; i++){
            if(first.charAt(i) == last.charAt(i)){
                s += first.charAt(i);
            }else{
                break;
            }
        }

        return s;
    }
}