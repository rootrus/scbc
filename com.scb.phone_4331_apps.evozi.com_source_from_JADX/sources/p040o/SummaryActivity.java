package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.SummaryActivity */
public final class SummaryActivity<R, T> extends NtbUserInfoActivity<T, R> {
    private DebitPrepaidMenuActivity<? extends R, ? super T> MediaBrowserCompat$ItemReceiver;

    public SummaryActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitPrepaidMenuActivity<? extends R, ? super T> debitPrepaidMenuActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = debitPrepaidMenuActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        try {
            BankingAgentTransactionsDeepLinkActivity<? super Object> write = this.MediaBrowserCompat$ItemReceiver.write();
            StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(" returned a null Observer");
            this.IconCompatParcelizer.subscribe((BankingAgentTransactionsDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(write, sb.toString()));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            AlertController$RecycleListView.read.read(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
