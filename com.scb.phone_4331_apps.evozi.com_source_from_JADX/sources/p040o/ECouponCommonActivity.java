package p040o;

import com.thunderhead.android.infrastructure.server.entitys.Property;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ECouponCommonActivity */
public class ECouponCommonActivity implements Serializable {
    private static final long MediaBrowserCompat$CustomActionResultReceiver = -630721674597631924L;
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public HashMap<String, String> read;
    public long write;

    public /* synthetic */ ECouponCommonActivity() {
    }

    public ECouponCommonActivity(String str, Map<String, String> map) {
        this.read = null;
        this.IconCompatParcelizer = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.IconCompatParcelizer = str;
        this.read = new HashMap<>();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                if (str2 == null) {
                    MyECouponActivity_ViewBinding.write("Send custom properties array: key is null");
                } else {
                    this.read.put(str2, str3 == null ? "" : str3);
                }
            }
        }
    }

    public final Property[] MediaBrowserCompat$CustomActionResultReceiver(Property[] propertyArr) {
        ArrayList arrayList = new ArrayList();
        if (propertyArr != null) {
            Collections.addAll(arrayList, propertyArr);
        }
        for (Map.Entry next : this.read.entrySet()) {
            arrayList.add(new Property((String) next.getKey(), (String) next.getValue()));
        }
        if (arrayList.isEmpty()) {
            return new Property[0];
        }
        return (Property[]) arrayList.toArray(new Property[arrayList.size()]);
    }
}
