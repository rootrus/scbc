package p040o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.IntroductionActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C6922x25028937<T> extends AtomicReference<Thread> implements DebitCardRequestPayOtpActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder, Runnable {
    private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private InformationPanelAdapter$ItemHolder_ViewBinding<T> MediaBrowserCompat$ItemReceiver;
    private BankingAgentDeepLinkActivity.read MediaMetadataCompat;
    private AtomicLong read = new AtomicLong();
    private AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder> write = new AtomicReference<>();

    C6922x25028937(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder, BankingAgentDeepLinkActivity.read read2, InformationPanelAdapter$ItemHolder_ViewBinding<T> informationPanelAdapter$ItemHolder_ViewBinding, boolean z) {
        this.IconCompatParcelizer = depositDetailRecyclerViewAdapter$DepositViewHolder;
        this.MediaMetadataCompat = read2;
        this.MediaBrowserCompat$ItemReceiver = informationPanelAdapter$ItemHolder_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = !z;
    }

    public final void run() {
        lazySet(Thread.currentThread());
        InformationPanelAdapter$ItemHolder_ViewBinding<T> informationPanelAdapter$ItemHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = null;
        informationPanelAdapter$ItemHolder_ViewBinding.write(this);
    }

    public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        if (setVwCrossConsentSeparator.read(this.write, selectProvinceOrDistrictAdapter$ViewHolder)) {
            long andSet = this.read.getAndSet(0);
            if (andSet != 0) {
                write(andSet, selectProvinceOrDistrictAdapter$ViewHolder);
            }
        }
    }

    public final void onNext(T t) {
        this.IconCompatParcelizer.onNext(t);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.onError(th);
        this.MediaMetadataCompat.dispose();
    }

    public final void onComplete() {
        this.IconCompatParcelizer.onComplete();
        this.MediaMetadataCompat.dispose();
    }

    public final void write(long j) {
        if (setVwCrossConsentSeparator.MediaBrowserCompat$CustomActionResultReceiver(j)) {
            SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder = this.write.get();
            if (selectProvinceOrDistrictAdapter$ViewHolder != null) {
                write(j, selectProvinceOrDistrictAdapter$ViewHolder);
                return;
            }
            AlertController$RecycleListView.write(this.read, j);
            SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder2 = this.write.get();
            if (selectProvinceOrDistrictAdapter$ViewHolder2 != null) {
                long andSet = this.read.getAndSet(0);
                if (andSet != 0) {
                    write(andSet, selectProvinceOrDistrictAdapter$ViewHolder2);
                }
            }
        }
    }

    private void write(long j, SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver || Thread.currentThread() == get()) {
            selectProvinceOrDistrictAdapter$ViewHolder.write(j);
        } else {
            this.MediaMetadataCompat.IconCompatParcelizer(new IconCompatParcelizer(selectProvinceOrDistrictAdapter$ViewHolder, j));
        }
    }

    public final void aQ_() {
        setVwCrossConsentSeparator.write(this.write);
        this.MediaMetadataCompat.dispose();
    }

    /* renamed from: o.IntroductionActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private SelectProvinceOrDistrictAdapter$ViewHolder MediaBrowserCompat$CustomActionResultReceiver;
        private long MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder, long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver = selectProvinceOrDistrictAdapter$ViewHolder;
            this.MediaBrowserCompat$ItemReceiver = j;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
