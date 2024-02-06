package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onBtnSendEmailVerificationClicked */
public final class onBtnSendEmailVerificationClicked {
    public static <T, R> boolean MediaBrowserCompat$ItemReceiver(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        if (!(debitCardResetPinSuccessActivity_ViewBinding instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) debitCardResetPinSuccessActivity_ViewBinding).call();
            if (call == null) {
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                return true;
            }
            try {
                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding2 = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity.write(call), "The mapper returned a null ObservableSource");
                if (debitCardResetPinSuccessActivity_ViewBinding2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) debitCardResetPinSuccessActivity_ViewBinding2).call();
                        if (call2 == null) {
                            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                            return true;
                        }
                        C7302xdc8a7a62 onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver = new C7302xdc8a7a62(bankingAgentTransactionsDeepLinkActivity, call2);
                        bankingAgentTransactionsDeepLinkActivity.onSubscribe(onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver);
                        onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver.run();
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                        return true;
                    }
                } else {
                    debitCardResetPinSuccessActivity_ViewBinding2.subscribe(bankingAgentTransactionsDeepLinkActivity);
                }
                return true;
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                return true;
            }
        } catch (Throwable th3) {
            AlertController$RecycleListView.read.write(th3);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th3, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            return true;
        }
    }

    /* renamed from: o.onBtnSendEmailVerificationClicked$read */
    public static final class read<T, R> extends DebitCardResetOtpActivity<R> {
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$ItemReceiver;
        private T write;

        public read(T t, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
            this.write = t;
            this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        }

        public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
            try {
                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.write(this.write), "The mapper returned a null ObservableSource");
                if (debitCardResetPinSuccessActivity_ViewBinding instanceof Callable) {
                    try {
                        Object call = ((Callable) debitCardResetPinSuccessActivity_ViewBinding).call();
                        if (call == null) {
                            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                            return;
                        }
                        C7302xdc8a7a62 onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver = new C7302xdc8a7a62(bankingAgentTransactionsDeepLinkActivity, call);
                        bankingAgentTransactionsDeepLinkActivity.onSubscribe(onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver);
                        onbtnsendemailverificationclicked_mediabrowsercompat_customactionresultreceiver.run();
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                    }
                } else {
                    debitCardResetPinSuccessActivity_ViewBinding.subscribe(bankingAgentTransactionsDeepLinkActivity);
                }
            } catch (Throwable th2) {
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            }
        }
    }
}
