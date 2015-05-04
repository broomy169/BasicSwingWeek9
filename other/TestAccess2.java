package other;

/**
 * Created by jc258876 on 4/05/15.
 */
public class TestAccess2 {
    public static void main(String[] args) {
        MyData myData = new MyData();
        //myData.secret_data = 42;
        myData.inheritedData = 42;
        myData.packageData = 42;
        myData.globalData = 42;
    }

}
