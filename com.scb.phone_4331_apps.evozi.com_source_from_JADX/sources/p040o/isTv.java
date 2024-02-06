package p040o;

/* renamed from: o.isTv */
public final /* synthetic */ class isTv implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C6514xb47b5894 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isTv(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = str;
    }

    public final Object write(Object obj) {
        C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        return DebitCardResetOtpActivity.just(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(((ContentModelParser) obj).read, this.IconCompatParcelizer));
    }
}
