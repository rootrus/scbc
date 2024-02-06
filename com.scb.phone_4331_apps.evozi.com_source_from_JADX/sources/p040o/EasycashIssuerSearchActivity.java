package p040o;

import java.util.Iterator;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashIssuerSearchActivity */
public final class EasycashIssuerSearchActivity<T> extends DebitCardResetOtpActivity<T> {
    private Iterable<? extends T> MediaBrowserCompat$ItemReceiver;

    public EasycashIssuerSearchActivity(Iterable<? extends T> iterable) {
        this.MediaBrowserCompat$ItemReceiver = iterable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            Iterator<? extends T> it = this.MediaBrowserCompat$ItemReceiver.iterator();
            try {
                if (!it.hasNext()) {
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                    return;
                }
                C6451xde8e6db2 easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6451xde8e6db2(bankingAgentTransactionsDeepLinkActivity, it);
                bankingAgentTransactionsDeepLinkActivity.onSubscribe(easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
                if (!easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
                    while (!easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                        try {
                            easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.read.next(), "The iterator returned a null value"));
                            if (!easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                                try {
                                    if (!easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.read.hasNext()) {
                                        if (!easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                                            easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    AlertController$RecycleListView.read.write(th);
                                    easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            AlertController$RecycleListView.read.write(th2);
                            easycashIssuerSearchActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                AlertController$RecycleListView.read.write(th3);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th3, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            }
        } catch (Throwable th4) {
            AlertController$RecycleListView.read.write(th4);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th4, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
