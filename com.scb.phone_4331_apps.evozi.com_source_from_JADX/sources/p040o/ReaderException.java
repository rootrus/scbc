package p040o;

/* renamed from: o.ReaderException */
public final /* synthetic */ class ReaderException implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getStringValues write;

    public /* synthetic */ ReaderException(getStringValues getstringvalues) {
        this.write = getstringvalues;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.write;
        DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding depositAccountSelectorAdapter$ItemViewHolder_ViewBinding = (DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding) obj;
        nativeDispose nativedispose = nativeDispose.write;
        boolean z = true;
        if (getstringvalues.RatingCompat != null) {
            nativedispose.IconCompatParcelizer(getstringvalues.RatingCompat);
        }
        if (depositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null && depositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.contains("CARD_UNLOCK")) {
            WriterException writerException = WriterException.write;
            if (getstringvalues.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writerException.IconCompatParcelizer(getstringvalues.RatingCompat);
            }
        } else if (depositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null && depositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.contains("CARD_LOCK")) {
            setFramingRectSize setframingrectsize = setFramingRectSize.IconCompatParcelizer;
            if (getstringvalues.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setframingrectsize.IconCompatParcelizer(getstringvalues.RatingCompat);
            }
        }
    }
}
