package p040o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.HmlDocumentListActivity */
public class HmlDocumentListActivity<T> extends HmlConsumerReviewSubmissionDeepLinkPushActivity<T, HmlDocumentListActivity<T>> implements BankingAgentTransactionsDeepLinkActivity<T>, BaseChangePinWithMaxActivity_ViewBinding<T>, ActivateChequeDeepLinkActivity<T>, DebitCardRequestInputActivity {
    private final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$SearchResultReceiver;
    private final AtomicReference<BulkTransferDeepLinkActivity> MediaDescriptionCompat;

    public HmlDocumentListActivity() {
        this(HmlDocumentListActivity$MediaBrowserCompat$ItemReceiver.INSTANCE);
    }

    private HmlDocumentListActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaDescriptionCompat = new AtomicReference<>();
        this.MediaBrowserCompat$SearchResultReceiver = bankingAgentTransactionsDeepLinkActivity;
    }

    public void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (bulkTransferDeepLinkActivity == null) {
            this.MediaBrowserCompat$ItemReceiver.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.MediaDescriptionCompat.compareAndSet((Object) null, bulkTransferDeepLinkActivity)) {
            bulkTransferDeepLinkActivity.dispose();
            if (this.MediaDescriptionCompat.get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                List<Throwable> list = this.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(bulkTransferDeepLinkActivity);
                list.add(new IllegalStateException(sb.toString()));
            }
        } else {
            this.MediaBrowserCompat$SearchResultReceiver.onSubscribe(bulkTransferDeepLinkActivity);
        }
    }

    public void onNext(T t) {
        if (!this.read) {
            this.read = true;
            if (this.MediaDescriptionCompat.get() == null) {
                this.MediaBrowserCompat$ItemReceiver.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.IconCompatParcelizer.add(t);
        if (t == null) {
            this.MediaBrowserCompat$ItemReceiver.add(new NullPointerException("onNext received a null value"));
        }
        this.MediaBrowserCompat$SearchResultReceiver.onNext(t);
    }

    public void onError(Throwable th) {
        if (!this.read) {
            this.read = true;
            if (this.MediaDescriptionCompat.get() == null) {
                this.MediaBrowserCompat$ItemReceiver.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        if (th == null) {
            try {
                this.MediaBrowserCompat$ItemReceiver.add(new NullPointerException("onError received a null Throwable"));
            } catch (Throwable th2) {
                this.write.countDown();
                throw th2;
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.add(th);
        }
        this.MediaBrowserCompat$SearchResultReceiver.onError(th);
        this.write.countDown();
    }

    public void onComplete() {
        if (!this.read) {
            this.read = true;
            if (this.MediaDescriptionCompat.get() == null) {
                this.MediaBrowserCompat$ItemReceiver.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver++;
            this.MediaBrowserCompat$SearchResultReceiver.onComplete();
        } finally {
            this.write.countDown();
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaDescriptionCompat);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.get());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        onNext(t);
        onComplete();
    }
}
