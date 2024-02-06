package p040o;

/* renamed from: o.MwSearchMarketMallActivity_ViewBinding */
public final class MwSearchMarketMallActivity_ViewBinding<E> extends showDialogDeletePinLocation<E> {
    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo42858x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean write() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final Object write(E e) {
        MwShopTypeActivity_ViewBinding<?> MediaBrowserCompat$ItemReceiver;
        do {
            Object write = super.write(e);
            if (write == MwReviewActivity_ViewBinding.IconCompatParcelizer) {
                return MwReviewActivity_ViewBinding.IconCompatParcelizer;
            }
            if (write == MwReviewActivity_ViewBinding.write) {
                MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(e);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    return MwReviewActivity_ViewBinding.IconCompatParcelizer;
                }
            } else if (write instanceof MwShopAddressActivity) {
                return write;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(write);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(MediaBrowserCompat$ItemReceiver instanceof MwShopAddressActivity));
        return MediaBrowserCompat$ItemReceiver;
    }
}
