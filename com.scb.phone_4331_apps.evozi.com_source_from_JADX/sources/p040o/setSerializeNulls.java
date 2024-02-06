package p040o;

/* renamed from: o.setSerializeNulls */
public final /* synthetic */ class setSerializeNulls implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getPtr MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setSerializeNulls(getPtr getptr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getptr;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPtr getptr = this.MediaBrowserCompat$CustomActionResultReceiver;
        getptr.MediaBrowserCompat$ItemReceiver = getptr.write.MediaBrowserCompat$ItemReceiver((DepositTransactionAdapter$GroupItemViewHolder) obj);
        JsonWriter jsonWriter = new JsonWriter(getptr);
        if (getptr.RatingCompat != null) {
            jsonWriter.IconCompatParcelizer(getptr.RatingCompat);
        }
    }
}
