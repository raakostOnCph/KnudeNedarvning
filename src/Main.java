public class Main {

    public static void main(String[] args) {
	// write your code here

        Liste liste = new Liste();

        liste.insertFromHead(new NodeEng("John"));
        liste.insertFromHead(new NodeDk());
        liste.insertFromHead(new NodeDk("søren"));
        liste.insertFromHead(new NodeEng("Victoria"));
        liste.insertFromHead(new NodeEng());

        liste.udskriv();


    }
}
