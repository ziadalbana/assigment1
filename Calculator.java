
package assigment.pkg1;

public class Calculator implements ICalculator {
    int x;int y;
    @Override
    public int add(int x,int y){
        return x+y;
    }
    @Override
    public float divide(int x,int y){
        float result = 0;
        if(y==0){
            System.out.println("Divide by zero:Error");
        }else{
       try {
        result=(float)x/y;
       }catch(RuntimeException e1){
        System.out.println("ERROR");
        }}
       return result;
    }
    
}
