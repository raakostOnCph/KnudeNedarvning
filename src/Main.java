public class Main {

    public static void main(String[] args) {
        // write your code here
//
//        Liste liste = new Liste();
//
//        liste.insertFromHead(new NodeEng("John"));
//        liste.insertFromHead(new NodeDk());
//        liste.insertFromHead(new NodeDk("søren"));
//        liste.insertFromHead(new NodeEng("Victoria"));
//        liste.insertFromHead(new NodeEng());
//
//        liste.udskriv();

        NodeEng nodeEng = new NodeEng("læskdjf");

        System.out.println(getInfor(nodeEng));
        System.out.println(getInfor(new NodeDk("palle")));
        System.out.println(getInfor(new NodeEng("henning")));
        System.out.println(getInfor(new NodeDk("ole") ));


    }

    // her ligger logikken centralt i stedet for i de enkelte knudetyper
    public static String getInfor(NodeAbs nodeAbs) {

        if (nodeAbs instanceof NodeDk) {
            return "dansk";
        }

        if (nodeAbs instanceof NodeEng) {
            return "english";
        }


        return null;
    }
}