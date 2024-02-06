package p040o;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.nContextFinish$MediaBrowserCompat$CustomActionResultReceiver */
class nContextFinish$MediaBrowserCompat$CustomActionResultReceiver implements Runnable {
    private final V IconCompatParcelizer;
    private /* synthetic */ nContextFinish MediaBrowserCompat$ItemReceiver;
    private final CoordinatorLayout write;

    nContextFinish$MediaBrowserCompat$CustomActionResultReceiver(nContextFinish ncontextfinish, CoordinatorLayout coordinatorLayout, V v) {
        this.MediaBrowserCompat$ItemReceiver = ncontextfinish;
        this.write = coordinatorLayout;
        this.IconCompatParcelizer = v;
    }

    public final void run() {
        if (this.IconCompatParcelizer != null && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver != null) {
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.computeScrollOffset()) {
                nContextFinish ncontextfinish = this.MediaBrowserCompat$ItemReceiver;
                ncontextfinish.IconCompatParcelizer(this.write, this.IconCompatParcelizer, ncontextfinish.MediaBrowserCompat$ItemReceiver.getCurrY(), PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, (Runnable) this);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write, this.IconCompatParcelizer);
        }
    }
}
