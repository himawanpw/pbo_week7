import java.util.Comparator;

public class IpkComp implements Comparator<set_get> {
    @Override
    public int compare(set_get a, set_get b) {
        return Float.compare(a.getIpk(), b.getIpk());
    }
}
