/**
Perform a HTTP request to the address, specified in function and return text
output. Example:
Task10.urlText("http://httpstat.us/200") == "200 OK"
*/

package groovylab

class Task10 {
    public static String urlText(String url) {
        def postmanGet = new URL(url)
        def getConnection = postmanGet.openConnection()
        return getConnection.getInputStream().getText()
    }
}
