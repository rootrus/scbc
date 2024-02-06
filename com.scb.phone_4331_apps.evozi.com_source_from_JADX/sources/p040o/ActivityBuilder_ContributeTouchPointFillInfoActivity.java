package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeTouchPointFillInfoActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTouchPointFillInfoActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ FixedTransferSuccessFragment read;

    public /* synthetic */ ActivityBuilder_ContributeTouchPointFillInfoActivity(FixedTransferSuccessFragment fixedTransferSuccessFragment, boolean z) {
        this.read = fixedTransferSuccessFragment;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.read;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        C5174qT qTVar = fixedTransferSuccessFragment.presenter;
        String obj2 = ((Uri) obj).toString();
        qTVar.write(true ^ (obj2 == null || obj2.length() == 0), new C5254sb(z, obj2));
    }
}
