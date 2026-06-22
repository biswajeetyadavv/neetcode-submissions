class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }

        StringBuilder revStr = new StringBuilder();
        for(int j = str.length()-1; j>= 0; j--){
            revStr.append(str.charAt(j));
        }

        if(str.toString().equals(revStr.toString())){
            return true;
        }
        return false;
        
    }
}
