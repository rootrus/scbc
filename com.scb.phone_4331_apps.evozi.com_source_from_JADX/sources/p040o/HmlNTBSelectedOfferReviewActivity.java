package p040o;

import android.os.Looper;

/* renamed from: o.HmlNTBSelectedOfferReviewActivity */
public final class HmlNTBSelectedOfferReviewActivity implements HmlNTBLandingActivity {
    private final Looper MediaBrowserCompat$ItemReceiver = Looper.myLooper();
    private final boolean read;

    public HmlNTBSelectedOfferReviewActivity() {
        String name = Thread.currentThread().getName();
        this.read = name != null && name.startsWith("IntentService[");
    }

    public final boolean read() {
        return (this.MediaBrowserCompat$ItemReceiver != null) && !this.read;
    }

    public final void IconCompatParcelizer(String str) {
        if (!(this.MediaBrowserCompat$ItemReceiver != null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append("Realm cannot be automatically updated on a thread without a looper.");
            throw new IllegalStateException(sb.toString());
        } else if (this.read) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append("Realm cannot be automatically updated on an IntentService thread.");
            throw new IllegalStateException(sb2.toString());
        }
    }
}
