package p040o;

import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.isAtLeastQ */
public final /* synthetic */ class isAtLeastQ implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write read;

    public /* synthetic */ isAtLeastQ(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.read = write;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.read.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((TiffProcessingException) obj));
    }
}
