class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>stack = new HashSet<>();

        int i = 0;
        int j = 0;

        int max_length = 0;
        while(j < s.length()){
            if(!stack.contains(s.charAt(j))){
                stack.add(s.charAt(j));
                j+=1;

            }else{
                while(stack.contains(s.charAt(j))){
                    stack.remove(s.charAt(i));
                    i+=1;
                }

            }
            max_length = max_length < stack.size() ? stack.size() : max_length;

        }

        return max_length;
    }
}