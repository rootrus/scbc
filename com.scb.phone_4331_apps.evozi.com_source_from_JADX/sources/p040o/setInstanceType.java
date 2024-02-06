package p040o;

import p040o.TaskRunner;

/* renamed from: o.setInstanceType */
public final /* synthetic */ class setInstanceType implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TaskRunner.C3843b.C38441 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setInstanceType(TaskRunner.C3843b.C38441 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.C3843b.C38441 r0 = this.MediaBrowserCompat$ItemReceiver;
        Throwable th = (Throwable) obj;
        boolean z = false;
        r0.IconCompatParcelizer = false;
        if (r0.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r0.RatingCompat.aj_();
        }
        r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getOriginalValue(r0)));
    }
}
