package p040o;

import java.util.Collection;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DonationsLandingActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9717x656de4d2<T, K> extends JuristicStartingPinDeepLinkActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super T, K> MediaBrowserCompat$SearchResultReceiver;
    private Collection<? super K> write;

    C9717x656de4d2(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity, Collection<? super K> collection) {
        super(bankingAgentTransactionsDeepLinkActivity);
        this.MediaBrowserCompat$SearchResultReceiver = directDebitDeepLinkActivity;
        this.write = collection;
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                try {
                    if (this.write.add(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$SearchResultReceiver.write(t), "The keySelector returned a null key"))) {
                        this.read.onNext(t);
                    }
                } catch (Throwable th) {
                    MediaBrowserCompat$ItemReceiver(th);
                }
            } else {
                this.read.onNext(null);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        this.write.clear();
        this.read.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.write.clear();
            this.read.onComplete();
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
            r4 = this;
        L_0x0000:
            o.HmlLoanOfferStatusDeepLinkActivity<T> r0 = r4.IconCompatParcelizer
            java.lang.Object r0 = r0.read()
            if (r0 == 0) goto L_0x001c
            java.util.Collection<? super K> r1 = r4.write
            o.DirectDebitDeepLinkActivity<? super T, K> r2 = r4.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r2 = r2.write(r0)
            java.lang.String r3 = "The keySelector returned a null key"
            java.lang.Object r2 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r2, r3)
            boolean r1 = r1.add(r2)
            if (r1 == 0) goto L_0x0000
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9717x656de4d2.read():java.lang.Object");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.write.clear();
        super.MediaBrowserCompat$ItemReceiver();
    }
}
