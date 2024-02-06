package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositExportStatementActivity_ViewBinding */
public final class DepositExportStatementActivity_ViewBinding<T> extends DebitCardResetOtpActivity<T> {
    private AccountSummaryDeepLinkActivity<T> IconCompatParcelizer;

    public DepositExportStatementActivity_ViewBinding(AccountSummaryDeepLinkActivity<T> accountSummaryDeepLinkActivity) {
        this.IconCompatParcelizer = accountSummaryDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        C6429x164a8dfa depositExportStatementActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C6429x164a8dfa(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(depositExportStatementActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        try {
            this.IconCompatParcelizer.read(depositExportStatementActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            if (!depositExportStatementActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}
