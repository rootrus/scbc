package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p040o.AlertController$RecycleListView;
import p040o.onClickInitStateLayout;

/* renamed from: o.onClickInitStateLayout$MediaBrowserCompat$ItemReceiver */
final class onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    final AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer;
    final BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$CustomActionResultReceiver;
    volatile boolean MediaBrowserCompat$ItemReceiver;
    final AtomicReferenceArray<Object> MediaDescriptionCompat;
    private DirectDebitDeepLinkActivity<? super Object[], R> RatingCompat;
    final HmlBusinessETBPersonalInfoActivity read;
    final onClickInitStateLayout.IconCompatParcelizer[] write;

    onClickInitStateLayout$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super Object[], R> directDebitDeepLinkActivity, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.RatingCompat = directDebitDeepLinkActivity;
        onClickInitStateLayout.IconCompatParcelizer[] iconCompatParcelizerArr = new onClickInitStateLayout.IconCompatParcelizer[i];
        for (int i2 = 0; i2 < i; i2++) {
            iconCompatParcelizerArr[i2] = new onClickInitStateLayout.IconCompatParcelizer(this, i2);
        }
        this.write = iconCompatParcelizerArr;
        this.MediaDescriptionCompat = new AtomicReferenceArray<>(i);
        this.IconCompatParcelizer = new AtomicReference<>();
        this.read = new HmlBusinessETBPersonalInfoActivity();
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.MediaDescriptionCompat;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[(length + 1)];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj != null) {
                    i++;
                    objArr[i] = obj;
                } else {
                    return;
                }
            }
            try {
                AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, HmlLatestPersonalInformationDeepLinkActivity.write(this.RatingCompat.write(objArr), "combiner returned a null value"), (AtomicInteger) this, this.read);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        onClickInitStateLayout.IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            if (i != -1) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr[i]);
            }
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$CustomActionResultReceiver, th, (AtomicInteger) this, this.read);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            onClickInitStateLayout.IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
            for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
                if (i != -1) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr[i]);
                }
            }
            BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.read;
            if (getAndIncrement() == 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                if (read2 != null) {
                    bankingAgentTransactionsDeepLinkActivity.onError(read2);
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                }
            }
        }
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
        for (onClickInitStateLayout.IconCompatParcelizer read2 : this.write) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read2);
        }
    }
}
