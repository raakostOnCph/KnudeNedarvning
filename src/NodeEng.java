public class NodeEng extends NodeAbs{


    public NodeEng() {
        this(getInput("enter your name"));
    }

    public NodeEng(String data) {
        super(data);
    }

    @Override
    public String getdata() {
        return data.toLowerCase();
    }
}
