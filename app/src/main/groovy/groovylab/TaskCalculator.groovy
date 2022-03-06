/**
Calculate input expression. Example:
TaskCalculator.exec("6(3+1)") == 24
TaskCalculator.exec("1+9/3") == 4
*/

package groovylab
import groovy.util.Eval;

class TaskCalculator {
    public static Number exec(String expression) {
        return Eval.me(expression.replaceAll(/(\d+)\(/,'$1*('))
    }
}
