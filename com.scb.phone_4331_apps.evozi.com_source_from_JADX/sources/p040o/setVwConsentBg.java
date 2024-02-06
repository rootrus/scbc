package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setVwConsentBg */
public final class setVwConsentBg<T> extends AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder> implements DebitCardRequestPayOtpActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder, BulkTransferDeepLinkActivity {
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> MediaBrowserCompat$ItemReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super T> read;
    private DebitCardMarketConductDeepLinkActivity<? super SelectProvinceOrDistrictAdapter$ViewHolder> write;

    public setVwConsentBg(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super SelectProvinceOrDistrictAdapter$ViewHolder> debitCardMarketConductDeepLinkActivity3) {
        this.read = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = dataPrivacyManagementDeepLinkActivity;
        this.write = debitCardMarketConductDeepLinkActivity3;
    }

    public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        if (setVwCrossConsentSeparator.read(this, selectProvinceOrDistrictAdapter$ViewHolder)) {
            try {
                this.write.IconCompatParcelizer(this);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                selectProvinceOrDistrictAdapter$ViewHolder.aQ_();
                onError(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.read.IconCompatParcelizer(t);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                ((SelectProvinceOrDistrictAdapter$ViewHolder) get()).aQ_();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != setVwCrossConsentSeparator.CANCELLED) {
            lazySet(setVwCrossConsentSeparator.CANCELLED);
            try {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th);
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
            }
        } else {
            AlertController$RecycleListView.read.read(th);
        }
    }

    public final void onComplete() {
        if (get() != setVwCrossConsentSeparator.CANCELLED) {
            lazySet(setVwCrossConsentSeparator.CANCELLED);
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == setVwCrossConsentSeparator.CANCELLED;
    }

    public final void write(long j) {
        ((SelectProvinceOrDistrictAdapter$ViewHolder) get()).write(j);
    }

    public final void aQ_() {
        setVwCrossConsentSeparator.write((AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder>) this);
    }

    public final void dispose() {
        setVwCrossConsentSeparator.write((AtomicReference<SelectProvinceOrDistrictAdapter$ViewHolder>) this);
    }
}
