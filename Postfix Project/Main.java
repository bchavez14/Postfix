public class Main {

    public static void main (String args[]){


        //create equations for testing and convert them to postfix and evaluate them
        String equation1 = "a+b/c";
        String equation2 = "b/e";
        String equation3 = "a/b-c*d";

        Postfix p = new Postfix();

        String equation1Post = p.convertToPostfix(equation1);
        String equation2Post = p.convertToPostfix(equation2);
        String equation3Post = p.convertToPostfix(equation3);

        System.out.println(equation1Post);
        System.out.println(equation2Post);
        System.out.println(equation3Post);

        int equation1Result = p.evaluatePostfix(equation1Post);
        int equation2Result = p.evaluatePostfix(equation2Post);
        int equation3Result = p.evaluatePostfix(equation3Post);


        //print out results from each equation calculation
        System.out.println(equation1Result);
        System.out.println(equation2Result);
        System.out.println(equation3Result);

    }

}
