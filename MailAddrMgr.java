
import java.util.HashMap;
public class MailAddrMgr {
    private HashMap map;

    map.put("Kobayashi","tkobayaac.titech.ac.jp");
    map.put("Moriguchi","chiguri@c.titech.ac.Jp");

    public String getMailAddr(String name){
        return map.get(name);
    }
}
    public static void main (String[] args) {
        String name = "Kobayashi";
        String addr = MailAddrMgr.getMailAddr(name);
        System.out.println(addr);

    }
}