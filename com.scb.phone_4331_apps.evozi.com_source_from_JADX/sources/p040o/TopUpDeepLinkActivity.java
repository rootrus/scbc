package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.MissingBackpressureException;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.TopUpDeepLinkActivity */
public final class TopUpDeepLinkActivity extends DebitCardRequestReviewActivity<Long> {
    private BankingAgentDeepLinkActivity IconCompatParcelizer;
    private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    private long read;
    private long write;

    public TopUpDeepLinkActivity(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.write = j;
        this.read = j2;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
        this.IconCompatParcelizer = bankingAgentDeepLinkActivity;
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super Long> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        write write2 = new write(depositDetailRecyclerViewAdapter$DepositViewHolder);
        depositDetailRecyclerViewAdapter$DepositViewHolder.read(write2);
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.IconCompatParcelizer;
        if (bankingAgentDeepLinkActivity instanceof setVwModelConsentSeparator) {
            BankingAgentDeepLinkActivity.read write3 = bankingAgentDeepLinkActivity.write();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(write2.MediaBrowserCompat$CustomActionResultReceiver, write3);
            write3.MediaBrowserCompat$ItemReceiver(write2, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(write2.MediaBrowserCompat$CustomActionResultReceiver, bankingAgentDeepLinkActivity.write(write2, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.TopUpDeepLinkActivity$write */
    static final class write extends AtomicLong implements SelectProvinceOrDistrictAdapter$ViewHolder, Runnable {
        final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        private long MediaBrowserCompat$ItemReceiver;
        private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super Long> write;

        write(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super Long> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            this.write = depositDetailRecyclerViewAdapter$DepositViewHolder;
        }

        public final void write(long j) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
                AlertController$RecycleListView.write((AtomicLong) this, j);
            }
        }

        public final void aQ_() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final void run() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                return;
            }
            if (get() != 0) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder<? super Long> depositDetailRecyclerViewAdapter$DepositViewHolder = this.write;
                long j = this.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver = j + 1;
                depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(Long.valueOf(j));
                AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, 1);
                return;
            }
            DepositDetailRecyclerViewAdapter$DepositViewHolder<? super Long> depositDetailRecyclerViewAdapter$DepositViewHolder2 = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append("Can't deliver value ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(" due to lack of requests");
            depositDetailRecyclerViewAdapter$DepositViewHolder2.onError(new MissingBackpressureException(sb.toString()));
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
