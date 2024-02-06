package p040o;

import p039io.reactivex.exceptions.ProtocolViolationException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlConsumerGuidelinesDeepLinkPushActivity */
public abstract class HmlConsumerGuidelinesDeepLinkPushActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
    private BulkTransferDeepLinkActivity read;

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        boolean z;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.read;
        Class<?> cls = getClass();
        HmlLatestPersonalInformationDeepLinkActivity.write(bulkTransferDeepLinkActivity, "next is null");
        if (bulkTransferDeepLinkActivity2 != null) {
            bulkTransferDeepLinkActivity.dispose();
            if (bulkTransferDeepLinkActivity2 != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                AlertController$RecycleListView.read.read((Throwable) new ProtocolViolationException(AlertController$RecycleListView.m3034x50fd9e4a(cls.getName())));
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.read = bulkTransferDeepLinkActivity;
        }
    }
}
