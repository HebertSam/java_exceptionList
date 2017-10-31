import java.util.ArrayList;
import java.lang.Exception;

public class exceptionList{
    public static void main(String[] args){
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
        for(Object item: myList){
            try{
                Integer castedValue = (Integer) item;
            }
            catch(Exception e){
                System.out.println("can not cast as int");
            }
            
        }
    }
}