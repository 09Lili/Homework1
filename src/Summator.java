public class Summator {
    private Long firstNumber, secondNumber;

    public void setFirstNumber(Long firstNumber){
        this.firstNumber = firstNumber;
    };
    public void setSecondNumber(Long secondNumber){
        this.secondNumber = secondNumber;
    };
    public Long sum(){
        return firstNumber + secondNumber;

    }

}
