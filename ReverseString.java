class ReverseString {
    public void reverseString(char[] s) {
        
        int left = 0;               
        int right = s.length - 1;   // end of the array

        
        while (left < right) {
           
            char temp = s[left];   
            s[left] = s[right];    
            s[right] = temp;       

            //  Moving pointers toward center
            left++;                
            right--;
        }
    }
}