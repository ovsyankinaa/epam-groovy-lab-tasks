/**
Insert first input string inside the brackets, near the number, which equals to
the second input parameter (template is set to GSTRING_TEMPLATE static
property). Example:
Task11.gstring("test", 2) == "1() 2(test) 3()"
*/

package groovylab

class Task11 {
    private static final String GSTRING_TEMPLATE = "1() 2() 3()"

    public static String gstring(String text, int num) {
        def temp_arr = GSTRING_TEMPLATE.split(" ")
        def output_str = ""
        for(i in temp_arr){
            def i_element = i.replace("()", "")
            output_str += ( i_element as int == num ? " ${i_element}(${text})":" ${i}")
        }
        return output_str.trim()
    }
}
