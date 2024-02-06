package p040o;

import android.widget.Toast;
import com.scb.phone.view.activity.etb.EtbSuccessActivity;

/* renamed from: o.pt */
public final /* synthetic */ class C7387pt implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ EtbSuccessActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7387pt(EtbSuccessActivity etbSuccessActivity) {
        this.MediaBrowserCompat$ItemReceiver = etbSuccessActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        Toast.makeText(this.MediaBrowserCompat$ItemReceiver, ((Throwable) obj).getMessage(), 1).show();
    }
}
