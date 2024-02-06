package p040o;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p039io.realm.exceptions.RealmException;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.Row;
import p039io.realm.internal.Util;

/* renamed from: o.HmlNTBSummaryActivity */
public final class HmlNTBSummaryActivity extends HmlNTBRepaymentMethodAboutActivity {
    private final Map<Class<? extends HmlNTBCaptureDocumentActivity>, HmlNTBRepaymentMethodAboutActivity> IconCompatParcelizer;
    private final Map<String, Class<? extends HmlNTBCaptureDocumentActivity>> read = new HashMap();

    public HmlNTBSummaryActivity(HmlNTBRepaymentMethodAboutActivity... hmlNTBRepaymentMethodAboutActivityArr) {
        HashMap hashMap = new HashMap();
        for (HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity : hmlNTBRepaymentMethodAboutActivityArr) {
            for (Class next : hmlNTBRepaymentMethodAboutActivity.IconCompatParcelizer()) {
                String MediaBrowserCompat$ItemReceiver = hmlNTBRepaymentMethodAboutActivity.MediaBrowserCompat$ItemReceiver(next);
                Class cls = this.read.get(MediaBrowserCompat$ItemReceiver);
                if (cls == null || cls.equals(next)) {
                    hashMap.put(next, hmlNTBRepaymentMethodAboutActivity);
                    this.read.put(MediaBrowserCompat$ItemReceiver, next);
                } else {
                    throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", new Object[]{cls, next, hashMap.get(cls), hmlNTBRepaymentMethodAboutActivity, MediaBrowserCompat$ItemReceiver}));
                }
            }
        }
        this.IconCompatParcelizer = Collections.unmodifiableMap(hashMap);
    }

    public final Map<Class<? extends HmlNTBCaptureDocumentActivity>, OsObjectSchemaInfo> write() {
        HashMap hashMap = new HashMap();
        for (HmlNTBRepaymentMethodAboutActivity write : this.IconCompatParcelizer.values()) {
            hashMap.putAll(write.write());
        }
        return hashMap;
    }

    public final HmlNTBLoanReviewActivity read(Class<? extends HmlNTBCaptureDocumentActivity> cls, OsSchemaInfo osSchemaInfo) {
        return IconCompatParcelizer(cls).read(cls, osSchemaInfo);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        return IconCompatParcelizer(cls).MediaBrowserCompat$ItemReceiver(cls);
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$CustomActionResultReceiver(Class<E> cls, Object obj, Row row, HmlNTBLoanReviewActivity hmlNTBLoanReviewActivity, boolean z, List<String> list) {
        return IconCompatParcelizer(cls).MediaBrowserCompat$CustomActionResultReceiver(cls, obj, row, hmlNTBLoanReviewActivity, z, list);
    }

    public final Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer() {
        return this.IconCompatParcelizer.keySet();
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$ItemReceiver(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, E e, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        return IconCompatParcelizer(Util.MediaBrowserCompat$ItemReceiver((Class<? extends HmlNTBCaptureDocumentActivity>) e.getClass())).MediaBrowserCompat$ItemReceiver(hmlLaserIdAboutActivity, e, z, map, set);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        for (Map.Entry<Class<? extends HmlNTBCaptureDocumentActivity>, HmlNTBRepaymentMethodAboutActivity> value : this.IconCompatParcelizer.entrySet()) {
            if (!((HmlNTBRepaymentMethodAboutActivity) value.getValue()).MediaBrowserCompat$CustomActionResultReceiver()) {
                return false;
            }
        }
        return true;
    }

    private HmlNTBRepaymentMethodAboutActivity IconCompatParcelizer(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity = this.IconCompatParcelizer.get(cls);
        if (hmlNTBRepaymentMethodAboutActivity != null) {
            return hmlNTBRepaymentMethodAboutActivity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append(" is not part of the schema for this Realm");
        throw new RealmException(sb.toString());
    }
}
