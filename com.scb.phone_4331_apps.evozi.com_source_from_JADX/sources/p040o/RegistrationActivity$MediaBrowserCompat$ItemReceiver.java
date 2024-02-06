package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.RegistrationActivity$MediaBrowserCompat$ItemReceiver */
final class RegistrationActivity$MediaBrowserCompat$ItemReceiver<T, R> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    static write<Object> write = new write<>((RegistrationActivity$MediaBrowserCompat$ItemReceiver) null);
    final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
    final AtomicReference<write<R>> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
    final boolean MediaBrowserCompat$ItemReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$MediaItem;
    private DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> MediaDescriptionCompat;
    private volatile boolean MediaMetadataCompat;
    private volatile boolean RatingCompat;
    BulkTransferDeepLinkActivity read;

    RegistrationActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        this.MediaBrowserCompat$MediaItem = bankingAgentTransactionsDeepLinkActivity;
        this.MediaDescriptionCompat = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
            this.read = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        write<Object> write2;
        write write3 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (write3 != null) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(write3);
        }
        try {
            BaseChangePinWithMaxActivity baseChangePinWithMaxActivity = (BaseChangePinWithMaxActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaDescriptionCompat.write(t), "The mapper returned a null MaybeSource");
            write write4 = new write(this);
            do {
                write2 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                if (write2 == write) {
                    return;
                }
            } while (!this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(write2, write4));
            baseChangePinWithMaxActivity.read(write4);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.read.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(write);
            onError(th);
        }
    }

    public final void onError(Throwable th) {
        write<Object> andSet;
        if (HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
            if (!(this.MediaBrowserCompat$ItemReceiver || (andSet = this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(write)) == null || andSet == write)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
            }
            this.MediaMetadataCompat = true;
            MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        this.MediaMetadataCompat = true;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void dispose() {
        this.RatingCompat = true;
        this.read.dispose();
        write<Object> andSet = this.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(write);
        if (andSet != null && andSet != write) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
        }
    }

    public final boolean isDisposed() {
        return this.RatingCompat;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getAndIncrement() == 0) {
            BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
            HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.IconCompatParcelizer;
            AtomicReference<write<R>> atomicReference = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 1;
            while (!this.RatingCompat) {
                if (hmlBusinessETBPersonalInfoActivity.get() == null || this.MediaBrowserCompat$ItemReceiver) {
                    boolean z = this.MediaMetadataCompat;
                    write write2 = atomicReference.get();
                    boolean z2 = write2 == null;
                    if (z && z2) {
                        Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                        if (read2 != null) {
                            bankingAgentTransactionsDeepLinkActivity.onError(read2);
                            return;
                        } else {
                            bankingAgentTransactionsDeepLinkActivity.onComplete();
                            return;
                        }
                    } else if (z2 || write2.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.compareAndSet(write2, (Object) null);
                        bankingAgentTransactionsDeepLinkActivity.onNext(write2.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
                    return;
                }
            }
        }
    }

    /* renamed from: o.RegistrationActivity$MediaBrowserCompat$ItemReceiver$write */
    static final class write<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BaseChangePinWithMaxActivity_ViewBinding<R> {
        volatile R MediaBrowserCompat$CustomActionResultReceiver;
        private RegistrationActivity$MediaBrowserCompat$ItemReceiver<?, R> write;

        write(RegistrationActivity$MediaBrowserCompat$ItemReceiver<?, R> registrationActivity$MediaBrowserCompat$ItemReceiver) {
            this.write = registrationActivity$MediaBrowserCompat$ItemReceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r;
            this.write.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            RegistrationActivity$MediaBrowserCompat$ItemReceiver<?, R> registrationActivity$MediaBrowserCompat$ItemReceiver = this.write;
            if (!registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, (Object) null) || !HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(registrationActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, th)) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            if (!registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                registrationActivity$MediaBrowserCompat$ItemReceiver.read.dispose();
                write<Object> andSet = registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getAndSet(RegistrationActivity$MediaBrowserCompat$ItemReceiver.write);
                if (!(andSet == null || andSet == RegistrationActivity$MediaBrowserCompat$ItemReceiver.write)) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(andSet);
                }
            }
            registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onComplete() {
            RegistrationActivity$MediaBrowserCompat$ItemReceiver<?, R> registrationActivity$MediaBrowserCompat$ItemReceiver = this.write;
            if (registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, (Object) null)) {
                registrationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }
}
