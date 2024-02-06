package p040o;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaSessionCompat$Token */
public final class EasycashSalesheetIndexActivity$MediaSessionCompat$Token<T, S> implements ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> {
    private CreditCardDeepLinkActivity<S, DebitCardLandingActivity<T>> write;

    public final /* synthetic */ Object read(Object obj, Object obj2) throws Exception {
        this.write.IconCompatParcelizer(obj, (DebitCardLandingActivity) obj2);
        return obj;
    }

    public EasycashSalesheetIndexActivity$MediaSessionCompat$Token(CreditCardDeepLinkActivity<S, DebitCardLandingActivity<T>> creditCardDeepLinkActivity) {
        this.write = creditCardDeepLinkActivity;
    }
}
