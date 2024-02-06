package p040o;

/* renamed from: o.nativeGetId */
public final /* synthetic */ class nativeGetId implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ nativeLoadModel MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeGetId(nativeLoadModel nativeloadmodel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeloadmodel;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeLoadModel nativeloadmodel = this.MediaBrowserCompat$CustomActionResultReceiver;
        DepositTransactionAdapter$ChildViewHolder depositTransactionAdapter$ChildViewHolder = (DepositTransactionAdapter$ChildViewHolder) obj;
        nativeloadmodel.IconCompatParcelizer = depositTransactionAdapter$ChildViewHolder.read.MediaSessionCompat$Token;
        boolean z = false;
        nativeloadmodel.MediaBrowserCompat$MediaItem = nativeloadmodel.write.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder, nativeloadmodel.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$ResultReceiverWrapper > 0, true);
        setTables settables = new setTables(nativeloadmodel);
        if (nativeloadmodel.RatingCompat != null) {
            z = true;
        }
        if (z) {
            settables.IconCompatParcelizer(nativeloadmodel.RatingCompat);
        }
    }
}
