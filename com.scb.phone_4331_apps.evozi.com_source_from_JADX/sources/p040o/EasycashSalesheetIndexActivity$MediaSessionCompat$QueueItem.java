package p040o;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaSessionCompat$QueueItem */
public final class EasycashSalesheetIndexActivity$MediaSessionCompat$QueueItem<T, S> implements ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> {
    private DebitCardMarketConductDeepLinkActivity<DebitCardLandingActivity<T>> read;

    public final /* synthetic */ Object read(Object obj, Object obj2) throws Exception {
        this.read.IconCompatParcelizer((DebitCardLandingActivity) obj2);
        return obj;
    }

    public EasycashSalesheetIndexActivity$MediaSessionCompat$QueueItem(DebitCardMarketConductDeepLinkActivity<DebitCardLandingActivity<T>> debitCardMarketConductDeepLinkActivity) {
        this.read = debitCardMarketConductDeepLinkActivity;
    }
}
