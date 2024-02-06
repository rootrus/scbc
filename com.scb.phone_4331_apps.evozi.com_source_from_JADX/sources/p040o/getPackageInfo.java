package p040o;

import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.getPackageInfo */
public final /* synthetic */ class getPackageInfo implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ orderValuesBy MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write write;

    public /* synthetic */ getPackageInfo(FragmentBuilder_BindPurchaseProfileManagementFragment.write write2, orderValuesBy ordervaluesby) {
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = ordervaluesby;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(Boolean.valueOf(((setCurrentItemInternal) obj).getStatus().write().equals("1000"))).doOnNext(new isAtLeastLollipopMR1(this.write, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
