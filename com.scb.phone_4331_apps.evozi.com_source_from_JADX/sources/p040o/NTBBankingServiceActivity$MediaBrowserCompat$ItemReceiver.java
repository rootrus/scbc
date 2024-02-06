package p040o;

import java.util.concurrent.atomic.AtomicLong;
import p040o.AlertController$RecycleListView;

/* renamed from: o.NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver */
final class NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicLong implements DebitCardRequestPayOtpActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder {
    private SelectProvinceOrDistrictAdapter$ViewHolder IconCompatParcelizer;
    private DebitCardMarketConductDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> read;
    private boolean write;

    NTBBankingServiceActivity$MediaBrowserCompat$ItemReceiver(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        this.read = depositDetailRecyclerViewAdapter$DepositViewHolder;
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
    }

    public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, selectProvinceOrDistrictAdapter$ViewHolder)) {
            this.IconCompatParcelizer = selectProvinceOrDistrictAdapter$ViewHolder;
            this.read.read(this);
            selectProvinceOrDistrictAdapter$ViewHolder.write(Long.MAX_VALUE);
        }
    }

    public final void onNext(T t) {
        if (!this.write) {
            if (get() != 0) {
                this.read.onNext(t);
                AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, 1);
                return;
            }
            try {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(t);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.IconCompatParcelizer.aQ_();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.write) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.write = true;
        this.read.onError(th);
    }

    public final void onComplete() {
        if (!this.write) {
            this.write = true;
            this.read.onComplete();
        }
    }

    public final void write(long j) {
        if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
            AlertController$RecycleListView.write((AtomicLong) this, j);
        }
    }

    public final void aQ_() {
        this.IconCompatParcelizer.aQ_();
    }
}
