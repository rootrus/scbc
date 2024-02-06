package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EasycashReferralSendDfwActivity */
public final class EasycashReferralSendDfwActivity<T, K, V> extends NtbUserInfoActivity<T, HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> {
    private DirectDebitDeepLinkActivity<? super T, ? extends V> MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private DirectDebitDeepLinkActivity<? super T, ? extends K> write;

    public EasycashReferralSendDfwActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity2;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9722x17cfed57(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read));
    }

    /* renamed from: o.EasycashReferralSendDfwActivity$write */
    static final class write<K, T> extends HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, T> {
        final read<T, K> MediaBrowserCompat$ItemReceiver;

        public static <T, K> write<K, T> IconCompatParcelizer(K k, int i, C9722x17cfed57<?, K, T> easycashReferralSendDfwActivity$MediaBrowserCompat$CustomActionResultReceiver, boolean z) {
            return new write<>(k, new read(i, easycashReferralSendDfwActivity$MediaBrowserCompat$CustomActionResultReceiver, k, z));
        }

        private write(K k, read<T, K> read) {
            this.MediaBrowserCompat$ItemReceiver = read;
        }

        public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver.subscribe(bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.EasycashReferralSendDfwActivity$read */
    static final class read<T, K> extends AtomicInteger implements BulkTransferDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<T> {
        final HmlBaseEmailAboutActivity<T> IconCompatParcelizer;
        private AtomicReference<BankingAgentTransactionsDeepLinkActivity<? super T>> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        private AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean();
        private AtomicBoolean MediaBrowserCompat$MediaItem = new AtomicBoolean();
        private C9722x17cfed57<?, K, T> MediaBrowserCompat$SearchResultReceiver;
        private K MediaDescriptionCompat;
        private boolean RatingCompat;
        Throwable read;
        volatile boolean write;

        read(int i, C9722x17cfed57<?, K, T> easycashReferralSendDfwActivity$MediaBrowserCompat$CustomActionResultReceiver, K k, boolean z) {
            this.IconCompatParcelizer = new HmlBaseEmailAboutActivity<>(i);
            this.MediaBrowserCompat$SearchResultReceiver = easycashReferralSendDfwActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaDescriptionCompat = k;
            this.RatingCompat = z;
        }

        public final void dispose() {
            if (this.MediaBrowserCompat$ItemReceiver.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaDescriptionCompat);
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.get();
        }

        public final void subscribe(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            if (this.MediaBrowserCompat$MediaItem.compareAndSet(false, true)) {
                bankingAgentTransactionsDeepLinkActivity.onSubscribe(this);
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(bankingAgentTransactionsDeepLinkActivity);
                if (this.MediaBrowserCompat$ItemReceiver.get()) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else {
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new IllegalStateException("Only one Observer allowed!"), (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (getAndIncrement() == 0) {
                HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity = this.IconCompatParcelizer;
                boolean z = this.RatingCompat;
                BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                int i = 1;
                while (true) {
                    if (bankingAgentTransactionsDeepLinkActivity != null) {
                        while (true) {
                            boolean z2 = this.write;
                            T read2 = hmlBaseEmailAboutActivity.read();
                            boolean z3 = read2 == null;
                            if (!IconCompatParcelizer(z2, z3, bankingAgentTransactionsDeepLinkActivity, z)) {
                                if (z3) {
                                    break;
                                }
                                bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (bankingAgentTransactionsDeepLinkActivity == null) {
                            bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        private boolean IconCompatParcelizer(boolean z, boolean z2, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, boolean z3) {
            if (this.MediaBrowserCompat$ItemReceiver.get()) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaDescriptionCompat);
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.read;
                    if (th != null) {
                        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                        bankingAgentTransactionsDeepLinkActivity.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.read;
                    this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                    if (th2 != null) {
                        bankingAgentTransactionsDeepLinkActivity.onError(th2);
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                    }
                    return true;
                }
            }
        }
    }
}
