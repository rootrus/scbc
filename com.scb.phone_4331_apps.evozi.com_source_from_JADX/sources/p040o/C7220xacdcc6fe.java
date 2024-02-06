package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.lambda$setIntroduction$0$IntroductionActivity$MediaBrowserCompat$ItemReceiver */
final class C7220xacdcc6fe<T> extends AtomicInteger implements DebitCardRequestPayOtpActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder {
    private volatile boolean IconCompatParcelizer;
    private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> MediaBrowserCompat$ItemReceiver;
    private SelectProvinceOrDistrictAdapter$ViewHolder MediaBrowserCompat$MediaItem;
    private AtomicLong MediaMetadataCompat = new AtomicLong();
    private AtomicReference<T> read = new AtomicReference<>();
    private Throwable write;

    C7220xacdcc6fe(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = depositDetailRecyclerViewAdapter$DepositViewHolder;
    }

    public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, selectProvinceOrDistrictAdapter$ViewHolder)) {
            this.MediaBrowserCompat$MediaItem = selectProvinceOrDistrictAdapter$ViewHolder;
            this.MediaBrowserCompat$ItemReceiver.read(this);
            selectProvinceOrDistrictAdapter$ViewHolder.write(Long.MAX_VALUE);
        }
    }

    public final void onNext(T t) {
        this.read.lazySet(t);
        write();
    }

    public final void onError(Throwable th) {
        this.write = th;
        this.IconCompatParcelizer = true;
        write();
    }

    public final void onComplete() {
        this.IconCompatParcelizer = true;
        write();
    }

    public final void write(long j) {
        if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
            AlertController$RecycleListView.write(this.MediaMetadataCompat, j);
            write();
        }
    }

    public final void aQ_() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.MediaBrowserCompat$MediaItem.aQ_();
            if (getAndIncrement() == 0) {
                this.read.lazySet((Object) null);
            }
        }
    }

    private void write() {
        boolean z;
        if (getAndIncrement() == 0) {
            DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder = this.MediaBrowserCompat$ItemReceiver;
            AtomicLong atomicLong = this.MediaMetadataCompat;
            AtomicReference<T> atomicReference = this.read;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    z = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z2 = this.IconCompatParcelizer;
                    T andSet = atomicReference.getAndSet((Object) null);
                    boolean z3 = andSet == null;
                    if (!read(z2, z3, depositDetailRecyclerViewAdapter$DepositViewHolder, atomicReference)) {
                        if (z3) {
                            break;
                        }
                        depositDetailRecyclerViewAdapter$DepositViewHolder.onNext(andSet);
                        j++;
                    } else {
                        return;
                    }
                }
                if (j == atomicLong.get()) {
                    boolean z4 = this.IconCompatParcelizer;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (read(z4, z, depositDetailRecyclerViewAdapter$DepositViewHolder, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    AlertController$RecycleListView.IconCompatParcelizer(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    private boolean read(boolean z, boolean z2, DepositDetailRecyclerViewAdapter$DepositViewHolder<?> depositDetailRecyclerViewAdapter$DepositViewHolder, AtomicReference<T> atomicReference) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            atomicReference.lazySet((Object) null);
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.write;
            if (th != null) {
                atomicReference.lazySet((Object) null);
                depositDetailRecyclerViewAdapter$DepositViewHolder.onError(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                depositDetailRecyclerViewAdapter$DepositViewHolder.onComplete();
                return true;
            }
        }
    }
}
