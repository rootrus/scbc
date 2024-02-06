package p040o;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.Row;
import p039io.realm.internal.Util;

/* renamed from: o.HmlNTBRepaymentMethodAboutActivity */
public abstract class HmlNTBRepaymentMethodAboutActivity {
    public abstract Set<Class<? extends HmlNTBCaptureDocumentActivity>> IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract String MediaBrowserCompat$CustomActionResultReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls);

    public abstract <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$CustomActionResultReceiver(Class<E> cls, Object obj, Row row, HmlNTBLoanReviewActivity hmlNTBLoanReviewActivity, boolean z, List<String> list);

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return false;
    }

    public abstract <E extends HmlNTBCaptureDocumentActivity> E MediaBrowserCompat$ItemReceiver(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, E e, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set);

    public abstract HmlNTBLoanReviewActivity read(Class<? extends HmlNTBCaptureDocumentActivity> cls, OsSchemaInfo osSchemaInfo);

    public abstract Map<Class<? extends HmlNTBCaptureDocumentActivity>, OsObjectSchemaInfo> write();

    public final String MediaBrowserCompat$ItemReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        return MediaBrowserCompat$CustomActionResultReceiver(Util.MediaBrowserCompat$ItemReceiver(cls));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HmlNTBRepaymentMethodAboutActivity)) {
            return false;
        }
        return IconCompatParcelizer().equals(((HmlNTBRepaymentMethodAboutActivity) obj).IconCompatParcelizer());
    }

    public int hashCode() {
        return IconCompatParcelizer().hashCode();
    }
}
