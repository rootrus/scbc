package p040o;

import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.Predicate */
public final /* synthetic */ class Predicate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ Predicate(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(Boolean.valueOf(((setCurrentItemInternal) obj).getStatus().write().equals(setPageTransformer.SUCCESS.status)));
    }
}
