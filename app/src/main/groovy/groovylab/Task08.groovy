/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/

package groovylab

class Task08 {
    public static String parseAndFilterJson(String input) {
        def input_json = new groovy.json.JsonSlurper().parseText(input)
        def output = input_json.findAll{ (it.value.toString()[0] as int) + (it.value.toString()[1] as int) == 9}
        def output_json = groovy.json.JsonOutput.toJson(output)
        return output_json.replace("\"","\\\"")
    }
}
