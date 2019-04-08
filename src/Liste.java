public class Liste {

NodeAbs head = null;

NodeAbs tail= null;

public NodeAbs insertFromHead(NodeAbs nodeAbs) {

    if(head == null) {
        head = nodeAbs;
        tail = nodeAbs;
        return nodeAbs;
    }
    head.previous = nodeAbs;
    nodeAbs.next = head;
    head = nodeAbs;
    return nodeAbs;
}

public void udskriv() {

    NodeAbs nodeAbs = head;

    while (nodeAbs != null) {

        System.out.println(nodeAbs.getdata());
        nodeAbs = nodeAbs.next;
    }

}


}
