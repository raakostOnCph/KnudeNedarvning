import java.util.Scanner;

public abstract class NodeAbs {

    NodeAbs next = null;
    NodeAbs previous = null;

    public String data;

    public NodeAbs(String data) {
        this.data = data;
    }

    public static String getInput(String s) {

        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

    public abstract String getdata();


}
