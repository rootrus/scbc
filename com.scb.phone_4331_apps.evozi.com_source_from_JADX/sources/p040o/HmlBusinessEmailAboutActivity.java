package p040o;

import java.util.concurrent.CountDownLatch;

/* renamed from: o.HmlBusinessEmailAboutActivity */
public final class HmlBusinessEmailAboutActivity extends CountDownLatch implements DebitCardMarketConductDeepLinkActivity<Throwable>, DataPrivacyManagementDeepLinkActivity {
    public Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void IconCompatParcelizer(Object obj) throws Exception {
        this.MediaBrowserCompat$CustomActionResultReceiver = (Throwable) obj;
        countDown();
    }

    public HmlBusinessEmailAboutActivity() {
        super(1);
    }

    public final void read() {
        countDown();
    }
}
