package p040o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.PointTabHolder */
public final class PointTabHolder implements PointTabHolder_ViewBinding, Serializable {
    private final List<PrepaidTravelConversionSuccessActivity<String, Object>> write = new ArrayList();

    public final String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (!this.write.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (PrepaidTravelConversionSuccessActivity next : this.write) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(':');
                sb.append((String) next.getKey());
                sb.append("=");
                Object value = next.getValue();
                if (value == null) {
                    sb.append("null");
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Exception thrown on toString(): ");
                        sb2.append(PrepaidConfirmPinActivity.MediaBrowserCompat$ItemReceiver(e));
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }
}
