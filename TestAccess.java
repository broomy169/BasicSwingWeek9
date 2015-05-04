import other.MyData;

/**
 * Created by jc258876 on 4/05/15.
 */
public class TestAccess {
    public static void main(String[] args) {
        MyData myData = new MyData();
        //myData.secret_data = 42; does not compile
        //myData.inheritedData = 42; no access
        //myData.packageData = 42; no access
        myData.globalData = 42;
    }

}
