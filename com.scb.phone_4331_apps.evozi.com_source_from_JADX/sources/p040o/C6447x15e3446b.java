package p040o;

/* renamed from: o.EasycashCollateralInformationActivity$MediaBrowserCompat$ItemReceiver */
final class C6447x15e3446b<T> extends JuristicStartingPinDeepLinkActivity<T, T> {
    private HmlBaseDeepLinkActivity<? super T> write;

    C6447x15e3446b(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(bankingAgentTransactionsDeepLinkActivity);
        this.write = hmlBaseDeepLinkActivity;
    }

    public final void onNext(T t) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
            try {
                if (this.write.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                    this.read.onNext(t);
                }
            } catch (Throwable th) {
                MediaBrowserCompat$ItemReceiver(th);
            }
        } else {
            this.read.onNext(null);
        }
    }

    public final int write(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final T read() throws java.lang.Exception {
        /*
            r2 = this;
        L_0x0000:
            o.HmlLoanOfferStatusDeepLinkActivity<T> r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r0.read()
            if (r0 == 0) goto L_0x0010
            o.HmlBaseDeepLinkActivity<? super T> r1 = r2.write
            boolean r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r0)
            if (r1 == 0) goto L_0x0000
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6447x15e3446b.read():java.lang.Object");
    }
}
