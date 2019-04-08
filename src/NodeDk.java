public class NodeDk extends NodeAbs {


    public NodeDk() {
        this(getInput("skriv dit navn"));
    }

    public NodeDk(String data) {
        super(data);
    }

    @Override
    public String getdata() {
        return data.toUpperCase();
    }

}
