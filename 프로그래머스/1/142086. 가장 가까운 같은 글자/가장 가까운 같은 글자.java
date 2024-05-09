class Solution {
    public int[] solution(String s) {
       int[] answer = new int[s.length()];
        A : for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(0, i);
            char c = s.charAt(i);
            if(subString.length() == 0) answer[i] = -1;
            for (int j = 0; j < subString.length(); j++) {
                if (subString.charAt(j)==c) {
                    int index = subString.lastIndexOf(c);
                    answer[i] = i-index;
                    continue A;
                }else{
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}