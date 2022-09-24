package genspark.assignments.section4;

import genspark.assignments.Assignment;
import kotlin.jvm.internal.Lambda;
import org.eclipse.jdt.internal.compiler.ast.LambdaExpression;

public class FactorialComputation implements Assignment {
    public int solution(int n) {

        //PYTHON CODE
        // factorial = lambda x : x * factorial(x-1) if x-1 > 0 else 1

        //FAILURE LAMBDA :(
        //int fact = (int x) -> x * fact(x-1)  if (x == 1) return 1 ;
        // return fact(n);

        if (n == 1 ) return 1;
        return n * solution(n-1);

    }


}
