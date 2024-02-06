package p040o;

import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment;

/* renamed from: o.writeBundle */
public final /* synthetic */ class writeBundle implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ EBillSubscriptionBillerListFragment.IconCompatParcelizer write;

    public /* synthetic */ writeBundle(EBillSubscriptionBillerListFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(isLockScreenSolved.MediaBrowserCompat$ItemReceiver((fromJsonInputStreamSync) obj));
    }
}
