package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashNCBConsentActivity */
public final class EasycashNCBConsentActivity<T, S> extends DebitCardResetOtpActivity<T> {
    private Callable<S> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super S> MediaBrowserCompat$ItemReceiver;
    private ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> write;

    public EasycashNCBConsentActivity(Callable<S> callable, ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> chequeManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super S> debitCardMarketConductDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = callable;
        this.write = chequeManagementDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            EasycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver = new EasycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.call());
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver);
            S s = easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.read) {
                easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                try {
                    easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(s);
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    AlertController$RecycleListView.read.read(th);
                }
            } else {
                ChequeManagementDeepLinkActivity<S, ? super DebitCardLandingActivity<T>, S> chequeManagementDeepLinkActivity = easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                while (!easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.read) {
                    easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = false;
                    try {
                        s = chequeManagementDeepLinkActivity.read(s, easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver);
                        if (easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver) {
                            easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.read = true;
                            easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                            try {
                                easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(s);
                                return;
                            } catch (Throwable th2) {
                                AlertController$RecycleListView.read.write(th2);
                                AlertController$RecycleListView.read.read(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AlertController$RecycleListView.read.write(th3);
                        AlertController$RecycleListView.read.read(th3);
                        return;
                    }
                }
                easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                try {
                    easycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(s);
                } catch (Throwable th4) {
                    AlertController$RecycleListView.read.write(th4);
                    AlertController$RecycleListView.read.read(th4);
                }
            }
        } catch (Throwable th5) {
            AlertController$RecycleListView.read.write(th5);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th5, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
