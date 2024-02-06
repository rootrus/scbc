package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.onGetStartedClick;

public final class Dns$Companion$SYSTEM$1 implements Dns {
    Dns$Companion$SYSTEM$1() {
    }

    public final List<InetAddress> lookup(String str) {
        onGetStartedClick.write((Object) str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            onGetStartedClick.IconCompatParcelizer((Object) allByName, "InetAddress.getAllByName(hostname)");
            return HmlBusinessOwnerReviewSubmissionActivity.write((T[]) allByName);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Broken system behaviour for dns lookup of ");
            sb.append(str);
            UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
