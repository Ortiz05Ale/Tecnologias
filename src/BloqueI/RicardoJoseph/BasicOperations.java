package BloqueI.RicardoJoseph;

public class BasicOperations  {
    public static class Addition implements Operation{
        public int execute(int a, int b){
            return a+b;
        }
    }

    public static class Subtract implements Operation {
        public int execute(int a, int b){
            return a-b;
        }
    }
    public static class Multiplication implements Operation {
        public int execute(int a, int b){
            return a*b;
        }
    }
    public static class Division implements Operation {
        public int execute(int a, int b){
            return a/b;
        }
    }
}
