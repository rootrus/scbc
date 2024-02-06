package p040o;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;
import p040o.EasycashReferralSendDfwActivity;

/* renamed from: o.EasycashReferralSendDfwActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9722x17cfed57<T, K, V> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private static Object MediaBrowserCompat$ItemReceiver = new Object();
    private AtomicBoolean IconCompatParcelizer = new AtomicBoolean();
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends V> MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private Map<Object, EasycashReferralSendDfwActivity.write<K, V>> MediaMetadataCompat;
    private DirectDebitDeepLinkActivity<? super T, ? extends K> RatingCompat;
    private boolean read;
    private BankingAgentTransactionsDeepLinkActivity<? super HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> write;

    public C9722x17cfed57(BankingAgentTransactionsDeepLinkActivity<? super HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, int i, boolean z) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.RatingCompat = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = z;
        this.MediaMetadataCompat = new ConcurrentHashMap();
        lazySet(1);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaDescriptionCompat, bulkTransferDeepLinkActivity)) {
            this.MediaDescriptionCompat = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        Object obj;
        try {
            Object write2 = this.RatingCompat.write(t);
            if (write2 != null) {
                obj = write2;
            } else {
                obj = MediaBrowserCompat$ItemReceiver;
            }
            EasycashReferralSendDfwActivity.write write3 = this.MediaMetadataCompat.get(obj);
            if (write3 == null) {
                if (!this.IconCompatParcelizer.get()) {
                    write3 = EasycashReferralSendDfwActivity.write.IconCompatParcelizer(write2, this.MediaBrowserCompat$CustomActionResultReceiver, this, this.read);
                    this.MediaMetadataCompat.put(obj, write3);
                    getAndIncrement();
                    this.write.onNext(write3);
                } else {
                    return;
                }
            }
            try {
                Object write4 = HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(t), "The value supplied is null");
                EasycashReferralSendDfwActivity.read<T, K> read2 = write3.MediaBrowserCompat$ItemReceiver;
                read2.IconCompatParcelizer.IconCompatParcelizer(write4);
                read2.MediaBrowserCompat$CustomActionResultReceiver();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaDescriptionCompat.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            this.MediaDescriptionCompat.dispose();
            onError(th2);
        }
    }

    public final void onError(Throwable th) {
        ArrayList<EasycashReferralSendDfwActivity.write> arrayList = new ArrayList<>(this.MediaMetadataCompat.values());
        this.MediaMetadataCompat.clear();
        for (EasycashReferralSendDfwActivity.write write2 : arrayList) {
            EasycashReferralSendDfwActivity.read<T, K> read2 = write2.MediaBrowserCompat$ItemReceiver;
            read2.read = th;
            read2.write = true;
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.write.onError(th);
    }

    public final void onComplete() {
        ArrayList<EasycashReferralSendDfwActivity.write> arrayList = new ArrayList<>(this.MediaMetadataCompat.values());
        this.MediaMetadataCompat.clear();
        for (EasycashReferralSendDfwActivity.write write2 : arrayList) {
            EasycashReferralSendDfwActivity.read<T, K> read2 = write2.MediaBrowserCompat$ItemReceiver;
            read2.write = true;
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.write.onComplete();
    }

    public final void dispose() {
        if (this.IconCompatParcelizer.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.MediaDescriptionCompat.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer.get();
    }

    public final void read(K k) {
        if (k == null) {
            k = MediaBrowserCompat$ItemReceiver;
        }
        this.MediaMetadataCompat.remove(k);
        if (decrementAndGet() == 0) {
            this.MediaDescriptionCompat.dispose();
        }
    }
}
