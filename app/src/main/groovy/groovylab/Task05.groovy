/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab

class Task05 {
    public static boolean isIp(String ip) {
        return ip ==~ /\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}/
    }
}
