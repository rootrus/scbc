package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.PdfViewerActivity_ViewBinding */
public final class PdfViewerActivity_ViewBinding<T, U extends Collection<? super T>> extends BScanCNotificationDeepLinkActivity<U> implements HmlLatestLoanOfferStatusDeepLinkActivity<U> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$CustomActionResultReceiver;
    private Callable<U> write;

    public PdfViewerActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public PdfViewerActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<U> callable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = callable;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super U> activateChequeDeepLinkActivity) {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(new PdfViewerActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write(th, activateChequeDeepLinkActivity);
        }
    }

    public final DebitCardResetOtpActivity<U> MediaBrowserCompat$CustomActionResultReceiver() {
        return new FastPayBillPaymentReviewActivity(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
