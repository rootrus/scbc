package p040o;

import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.isAtLeastKitKatWatch */
public final /* synthetic */ class isAtLeastKitKatWatch implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write write;

    public /* synthetic */ isAtLeastKitKatWatch(FragmentBuilder_BindPurchaseProfileManagementFragment.write write2) {
        this.write = write2;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(onStopCallOnce.read((setCurrentItemInternal) obj));
    }
}
