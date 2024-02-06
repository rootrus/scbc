package p040o;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.Row;
import p039io.realm.internal.Util;

/* renamed from: o.HmlNTBVerificationMethodsActivity */
public final class HmlNTBVerificationMethodsActivity extends HmlNTBRepaymentMethodAboutActivity {
    private final Set<Class<? extends HmlNTBCaptureDocumentActivity>> MediaBrowserCompat$ItemReceiver;
    private final HmlNTBRepaymentMethodAboutActivity write;

    public HmlNTBVerificationMethodsActivity(HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity, Collection<Class<? extends HmlNTBCaptureDocumentActivity>> collection) {
        this.write = hmlNTBRepaymentMethodAboutActivity;
        HashSet hashSet = new HashSet();
        if (hmlNTBRepaymentMethodAboutActivity != null) {
            Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer = hmlNTBRepaymentMethodAboutActivity.IconCompatParcelizer();
            for (Class next : collection) {
                if (IconCompatParcelizer.contains(next)) {
                    hashSet.add(next);
                }
            }
        }
        this.MediaBrowserCompat$ItemReceiver = Collections.unmodifiableSet(hashSet);
    }

    public final Map<Class<? extends HmlNTBCaptureDocumentActivity>, OsObjectSchemaInfo> write() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.write.write().entrySet()) {
            if (this.MediaBrowserCompat$ItemReceiver.contains(next.getKey())) {
                hashMap.put((Class) next.getKey(), (OsObjectSchemaInfo) next.getValue());
            }
        }
        return hashMap;
    }

    public final HmlNTBLoanReviewActivity read(Class<? extends HmlNTBCaptureDocumentActivity> cls, OsSchemaInfo osSchemaInfo) {
        read(cls);
        return this.write.read(cls, osSchemaInfo);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        read(cls);
        return this.write.MediaBrowserCompat$ItemReceiver(cls);
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$CustomActionResultReceiver(Class<E> cls, Object obj, Row row, HmlNTBLoanReviewActivity hmlNTBLoanReviewActivity, boolean z, List<String> list) {
        read(cls);
        return this.write.MediaBrowserCompat$CustomActionResultReceiver(cls, obj, row, hmlNTBLoanReviewActivity, z, list);
    }

    public final Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$ItemReceiver(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, E e, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        read(Util.MediaBrowserCompat$ItemReceiver((Class<? extends HmlNTBCaptureDocumentActivity>) e.getClass()));
        return this.write.MediaBrowserCompat$ItemReceiver(hmlLaserIdAboutActivity, e, z, map, set);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity = this.write;
        if (hmlNTBRepaymentMethodAboutActivity == null) {
            return true;
        }
        return hmlNTBRepaymentMethodAboutActivity.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void read(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        if (!this.MediaBrowserCompat$ItemReceiver.contains(cls)) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(" is not part of the schema for this Realm");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
