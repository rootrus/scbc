package p040o;

import java.util.HashMap;
import java.util.Map;
import p039io.realm.internal.OsSchemaInfo;

/* renamed from: o.HmlNTBExternalAuthenticationActivity */
public final class HmlNTBExternalAuthenticationActivity {
    private final OsSchemaInfo IconCompatParcelizer;
    private final Map<Class<? extends HmlNTBCaptureDocumentActivity>, HmlNTBLoanReviewActivity> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private final HmlNTBRepaymentMethodAboutActivity MediaBrowserCompat$ItemReceiver;

    public HmlNTBExternalAuthenticationActivity(HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity, OsSchemaInfo osSchemaInfo) {
        new HashMap();
        this.MediaBrowserCompat$ItemReceiver = hmlNTBRepaymentMethodAboutActivity;
        this.IconCompatParcelizer = osSchemaInfo;
    }

    public final HmlNTBLoanReviewActivity MediaBrowserCompat$ItemReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        HmlNTBLoanReviewActivity hmlNTBLoanReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get(cls);
        if (hmlNTBLoanReviewActivity != null) {
            return hmlNTBLoanReviewActivity;
        }
        HmlNTBLoanReviewActivity read = this.MediaBrowserCompat$ItemReceiver.read(cls, this.IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(cls, read);
        return read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for (Map.Entry next : this.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
            if (z) {
                sb.append(",");
            }
            sb.append(((Class) next.getKey()).getSimpleName());
            sb.append("->");
            sb.append(next.getValue());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
