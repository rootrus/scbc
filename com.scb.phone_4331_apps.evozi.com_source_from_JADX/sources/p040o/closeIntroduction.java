package p040o;

import java.util.concurrent.atomic.AtomicLong;
import p039io.reactivex.exceptions.MissingBackpressureException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.closeIntroduction */
public final class closeIntroduction<T> extends SCBBillPaymentDeepLinkActivity<T, T> {
    public closeIntroduction(DebitCardRequestReviewActivity<T> debitCardRequestReviewActivity) {
        super(debitCardRequestReviewActivity);
    }

    public final void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.write.MediaBrowserCompat$ItemReceiver(new write(depositDetailRecyclerViewAdapter$DepositViewHolder));
    }

    /* renamed from: o.closeIntroduction$write */
    static final class write<T> extends AtomicLong implements DebitCardRequestPayOtpActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder {
        private SelectProvinceOrDistrictAdapter$ViewHolder IconCompatParcelizer;
        private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private boolean read;

        write(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
            this.MediaBrowserCompat$CustomActionResultReceiver = depositDetailRecyclerViewAdapter$DepositViewHolder;
        }

        public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, selectProvinceOrDistrictAdapter$ViewHolder)) {
                this.IconCompatParcelizer = selectProvinceOrDistrictAdapter$ViewHolder;
                this.MediaBrowserCompat$CustomActionResultReceiver.read(this);
                selectProvinceOrDistrictAdapter$ViewHolder.write(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.read) {
                if (get() != 0) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
                    AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public final void onError(Throwable th) {
            if (this.read) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            if (!this.read) {
                this.read = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
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
}
