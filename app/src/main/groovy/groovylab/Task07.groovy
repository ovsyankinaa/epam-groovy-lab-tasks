/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
        def result = ""
        def temp_word = ""        
        if (s.length() != 0){
            for(i in s.split(" ").collect()){
              if (i.length() == 1){
                temp_word = (int) i[0]
              }
              if (i.length() == 2){
                temp_word = (int) i[0]+i[1]
              }              
              if (i.length() == 3){
                temp_word = (int) i[0]+i[-1]+i[1]
              }                            
              if (i.length() > 3){
                temp_word = (int) i[0]+i[-1]+i[2..-2]+i[1]
              }                                  
              result += " "+temp_word
            }          
        }
        return result.trim()
    }
}
