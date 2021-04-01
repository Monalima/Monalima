import java.io.*;

public class JavaSerial{
 
    public static void main(String args[]) throws Exception{

        VulnObj vulnObj = new VulnObj("ls");
 
        FileOutputStream fos = new FileOutputStream("/tmp/normalObj.serial");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(vulnObj);
        os.close();

    }
}
class VulnObj implements Serializable{
    public String cmd;
    public VulnObj(String cmd){
    this.cmd = cmd;
}
}
