package p040o;

import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;

/* renamed from: o.currentThreadTimeMillis$$dflt$$ */
public final /* synthetic */ class currentThreadTimeMillis$$dflt$$ implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ currentThreadTimeMillis$$dflt$$(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        DebitCardResetPinActivity.read read = (DebitCardResetPinActivity.read) obj;
        FragmentBuilder_BindPurchaseFromTabSelectionFragment fragmentBuilder_BindPurchaseFromTabSelectionFragment = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (read.IconCompatParcelizer != null) {
            str = read.IconCompatParcelizer.write;
        } else {
            str = null;
        }
        fragmentBuilder_BindPurchaseFromTabSelectionFragment.IconCompatParcelizer = str;
    }
}
