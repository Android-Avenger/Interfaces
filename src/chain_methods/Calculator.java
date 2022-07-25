package chain_methods;

class Calculator {

    private int number;

    private Calculator(int number) {
        this.number = number;
    }

    public static Calculator startFrom(int initNum){
        return new Calculator(initNum);
   }

   public Calculator incrementByOne(){
        number = number+1;
        return  this;
    }

   public Calculator add(int num){
        number += num;
        return this;
   }

    public Calculator subtract(int num){
        number -= num;
        return this;
    }

    public  Calculator multiply(int num){
        number *= num;
        return this;
    }

    public Calculator divide(int num){
        number /= num;
        return this;
    }
    public void print(){
        System.out.println("result" );
    }
    public void result(){
        System.out.println("result : " + number);
    }

}
