import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

    void divideByZero()  {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } finally {
            System.out.println("Print");
        }
    }

    public static void main(String[] args) throws MyException {
    ExceptionHandling ex = new ExceptionHandling();

    ex.divideByZero();
    }
}

 class MyException extends Exception {
    public MyException(String string,Throwable cause ){
        super(string,cause);
    }
}