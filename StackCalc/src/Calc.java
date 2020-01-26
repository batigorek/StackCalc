
import java.util.Scanner;

public class Calc extends Compf {
    private CalcInt s;
    int count;
    private static int char2int(char c) {
        return (int)c - (int)'0';
    }

    @Override
    protected int symOther(char c) {
        if (c < '0' || c > '9') {
            System.out.println("Недопустимый символ: " + c);
            System.exit(0);
        }
        return SYM_OTHER;
    }

    @Override
    protected void nextOper(char c) {

        int second = s.pop();
        if (c=='}') {
                s.push(second * second);
        }
        else {
            int first = s.pop();
            switch (c) {
                case '+':
                    s.push(first + second);
                    break;
                case '-':
                    s.push(first - second);
                    break;
                case '*':
                    s.push(first * second);
                    break;
                case '/':
                    s.push(first / second);
                    break;

            }
        }
    }

    @Override
    protected void nextOther(char c) {
        if (n>1) {
            count=s.pop();
            s.push(count*10+char2int(c));
        }
        else {
            s.push(char2int(c));
        }
    }
    public Calc() {
        s = new CalcInt();
    }

    @Override
    public final void compile(char[] str) {
        super.compile(str);
        System.out.println("" + s.top());
    }

}
