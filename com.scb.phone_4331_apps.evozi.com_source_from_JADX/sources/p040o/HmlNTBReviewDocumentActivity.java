package p040o;

import android.os.Handler;
import android.os.Looper;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.RealmNotifier;

/* renamed from: o.HmlNTBReviewDocumentActivity */
public final class HmlNTBReviewDocumentActivity extends RealmNotifier {
    public HmlNTBReviewDocumentActivity(OsSharedRealm osSharedRealm, HmlNTBLandingActivity hmlNTBLandingActivity) {
        super(osSharedRealm);
        if (hmlNTBLandingActivity.read()) {
            new Handler(Looper.myLooper());
        }
    }
}
