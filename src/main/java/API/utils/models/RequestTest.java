package API.utils.models;


public class RequestTest {

    public String data;
    public String support;
    private Members members;

    public RequestTest(String data, String support, Members members) {
        this.data = data;
        this.support = support;
        this.members = members;
    }

    public static RequestTest getDefaultResponse(){
        return new RequestTest("2021/11/11", "True", new Members());
    }
}
