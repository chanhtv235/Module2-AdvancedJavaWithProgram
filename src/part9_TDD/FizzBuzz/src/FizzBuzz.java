public class FizzBuzz {
    int number;

    public FizzBuzz() {
    }

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String checkNumber(){
        String result="";
        if (this.number%3==0&&this.number%5==0){
            result="FizzBuzz";
        }else if (this.number%5==0){
            result ="Buzz";
        }else if (this.number%3==0){
            result ="Fizz";
        }
        else {
            result =String.valueOf(this.number);
        }
        return result;
    }
}
