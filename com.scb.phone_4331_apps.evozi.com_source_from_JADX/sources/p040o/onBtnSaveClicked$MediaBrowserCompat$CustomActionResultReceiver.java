package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onBtnSaveClicked$MediaBrowserCompat$CustomActionResultReceiver */
final class onBtnSaveClicked$MediaBrowserCompat$CustomActionResultReceiver<R, U> extends DebitCardResetOtpActivity<R> {
    private final DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<U>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> MediaBrowserCompat$ItemReceiver;
    private final Callable<? extends HmlConsumerGuidelinesBaseDeepLinkActivity<U>> write;

    onBtnSaveClicked$MediaBrowserCompat$CustomActionResultReceiver(Callable<? extends HmlConsumerGuidelinesBaseDeepLinkActivity<U>> callable, DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<U>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity) {
        this.write = callable;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        try {
            HmlConsumerGuidelinesBaseDeepLinkActivity hmlConsumerGuidelinesBaseDeepLinkActivity = (HmlConsumerGuidelinesBaseDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The connectableFactory returned a null ConnectableObservable");
            DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.write(hmlConsumerGuidelinesBaseDeepLinkActivity), "The selector returned a null ObservableSource");
            PinLockActivity pinLockActivity = new PinLockActivity(bankingAgentTransactionsDeepLinkActivity);
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(pinLockActivity);
            hmlConsumerGuidelinesBaseDeepLinkActivity.MediaBrowserCompat$ItemReceiver(new onBtnSaveClicked$MediaBrowserCompat$ItemReceiver(pinLockActivity));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
