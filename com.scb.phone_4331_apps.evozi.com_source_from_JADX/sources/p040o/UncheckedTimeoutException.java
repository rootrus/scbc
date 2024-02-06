package p040o;

/* renamed from: o.UncheckedTimeoutException */
public enum UncheckedTimeoutException {
    DEEJUNG_INSTALLMENT(Iterables$3$MediaBrowserCompat$MediaItem.deejung_installment_plan, Iterables$3$MediaBrowserCompat$MediaItem.deejung_installment_about),
    DEEJUNG_TRANSFER(Iterables$3$MediaBrowserCompat$MediaItem.deejung_transfer, Iterables$3$MediaBrowserCompat$MediaItem.deejung_transfer_about),
    DEEJUNG_TRANSFER_SPEEDY_CASH(Iterables$3$MediaBrowserCompat$MediaItem.deejung_transfer, Iterables$3$MediaBrowserCompat$MediaItem.deejung_transfer_speedy_cash_about);
    
    public final int infoResId;
    public final int titleResId;

    private UncheckedTimeoutException(int i, int i2) {
        this.titleResId = i;
        this.infoResId = i2;
    }
}
