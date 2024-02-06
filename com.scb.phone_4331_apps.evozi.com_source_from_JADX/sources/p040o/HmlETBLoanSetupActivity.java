package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlETBLoanSetupActivity */
public final class HmlETBLoanSetupActivity<T> extends HmlETBManageEmailVerificationActivity<T> {
    final LifestyleDeepLinkActivity<T> IconCompatParcelizer;
    final AtomicReference<BankingAgentTransactionsDeepLinkActivity<? super T>> MediaBrowserCompat$CustomActionResultReceiver;
    volatile boolean MediaBrowserCompat$ItemReceiver;
    private volatile boolean MediaBrowserCompat$MediaItem;
    private AtomicReference<Runnable> MediaBrowserCompat$SearchResultReceiver;
    private AtomicBoolean MediaDescriptionCompat;
    private Throwable MediaMetadataCompat;
    private boolean RatingCompat;
    final HmlBaseEmailAboutActivity<T> read;
    boolean write;

    public static <T> HmlETBLoanSetupActivity<T> MediaBrowserCompat$ItemReceiver() {
        return new HmlETBLoanSetupActivity<>(bufferSize());
    }

    public static <T> HmlETBLoanSetupActivity<T> MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return new HmlETBLoanSetupActivity<>(i);
    }

    public static <T> HmlETBLoanSetupActivity<T> IconCompatParcelizer(int i, Runnable runnable) {
        return new HmlETBLoanSetupActivity<>(i, runnable);
    }

    private HmlETBLoanSetupActivity(int i) {
        this.read = new HmlBaseEmailAboutActivity<>(HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "capacityHint"));
        this.MediaBrowserCompat$SearchResultReceiver = new AtomicReference<>();
        this.RatingCompat = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        this.MediaDescriptionCompat = new AtomicBoolean();
        this.IconCompatParcelizer = new write();
    }

    private HmlETBLoanSetupActivity(int i, Runnable runnable) {
        this.read = new HmlBaseEmailAboutActivity<>(HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "capacityHint"));
        this.MediaBrowserCompat$SearchResultReceiver = new AtomicReference<>(HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "onTerminate"));
        this.RatingCompat = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        this.MediaDescriptionCompat = new AtomicBoolean();
        this.IconCompatParcelizer = new write();
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        if (this.MediaDescriptionCompat.get() || !this.MediaDescriptionCompat.compareAndSet(false, true)) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new IllegalStateException("Only a single observer allowed."), (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            return;
        }
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(this.IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(bankingAgentTransactionsDeepLinkActivity);
        if (this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
        } else {
            write();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Runnable runnable = this.MediaBrowserCompat$SearchResultReceiver.get();
        if (runnable != null && this.MediaBrowserCompat$SearchResultReceiver.compareAndSet(runnable, (Object) null)) {
            runnable.run();
        }
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (this.MediaBrowserCompat$MediaItem || this.MediaBrowserCompat$ItemReceiver) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void onNext(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.MediaBrowserCompat$MediaItem && !this.MediaBrowserCompat$ItemReceiver) {
            this.read.IconCompatParcelizer(t);
            write();
        }
    }

    public final void onError(Throwable th) {
        HmlLatestPersonalInformationDeepLinkActivity.write(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.MediaBrowserCompat$MediaItem || this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaMetadataCompat = th;
        this.MediaBrowserCompat$MediaItem = true;
        MediaBrowserCompat$CustomActionResultReceiver();
        write();
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$MediaItem && !this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$MediaItem = true;
            MediaBrowserCompat$CustomActionResultReceiver();
            write();
        }
    }

    private boolean read(HmlSuccessfulDeepLinkActivity<T> hmlSuccessfulDeepLinkActivity, BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        Throwable th = this.MediaMetadataCompat;
        if (th == null) {
            return false;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
        hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        bankingAgentTransactionsDeepLinkActivity.onError(th);
        return true;
    }

    private void write() {
        if (this.IconCompatParcelizer.getAndIncrement() == 0) {
            BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            int i = 1;
            while (bankingAgentTransactionsDeepLinkActivity == null) {
                i = this.IconCompatParcelizer.addAndGet(-i);
                if (i != 0) {
                    bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
                } else {
                    return;
                }
            }
            if (this.write) {
                HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity = this.read;
                boolean z = this.RatingCompat;
                int i2 = 1;
                while (!this.MediaBrowserCompat$ItemReceiver) {
                    boolean z2 = this.MediaBrowserCompat$MediaItem;
                    if (!(!z) || !z2 || !read(hmlBaseEmailAboutActivity, bankingAgentTransactionsDeepLinkActivity)) {
                        bankingAgentTransactionsDeepLinkActivity.onNext(null);
                        if (z2) {
                            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                            Throwable th = this.MediaMetadataCompat;
                            if (th != null) {
                                bankingAgentTransactionsDeepLinkActivity.onError(th);
                                return;
                            } else {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                        } else {
                            i2 = this.IconCompatParcelizer.addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                return;
            }
            HmlBaseEmailAboutActivity<T> hmlBaseEmailAboutActivity2 = this.read;
            boolean z3 = this.RatingCompat;
            boolean z4 = true;
            int i3 = 1;
            while (!this.MediaBrowserCompat$ItemReceiver) {
                boolean z5 = this.MediaBrowserCompat$MediaItem;
                T read2 = this.read.read();
                boolean z6 = read2 == null;
                if (z5) {
                    if ((!z3) && z4) {
                        if (!read(hmlBaseEmailAboutActivity2, bankingAgentTransactionsDeepLinkActivity)) {
                            z4 = false;
                        } else {
                            return;
                        }
                    }
                    if (z6) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                        Throwable th2 = this.MediaMetadataCompat;
                        if (th2 != null) {
                            bankingAgentTransactionsDeepLinkActivity.onError(th2);
                            return;
                        } else {
                            bankingAgentTransactionsDeepLinkActivity.onComplete();
                            return;
                        }
                    }
                }
                if (z6) {
                    i3 = this.IconCompatParcelizer.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onNext(read2);
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
            hmlBaseEmailAboutActivity2.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.HmlETBLoanSetupActivity$write */
    final class write extends LifestyleDeepLinkActivity<T> {
        write() {
        }

        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            HmlETBLoanSetupActivity.this.write = true;
            return 2;
        }

        public final T read() throws Exception {
            return HmlETBLoanSetupActivity.this.read.read();
        }

        public final boolean write() {
            return HmlETBLoanSetupActivity.this.read.write();
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            HmlETBLoanSetupActivity.this.read.MediaBrowserCompat$ItemReceiver();
        }

        public final void dispose() {
            if (!HmlETBLoanSetupActivity.this.MediaBrowserCompat$ItemReceiver) {
                HmlETBLoanSetupActivity.this.MediaBrowserCompat$ItemReceiver = true;
                HmlETBLoanSetupActivity.this.MediaBrowserCompat$CustomActionResultReceiver();
                HmlETBLoanSetupActivity.this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                if (HmlETBLoanSetupActivity.this.IconCompatParcelizer.getAndIncrement() == 0) {
                    HmlETBLoanSetupActivity.this.MediaBrowserCompat$CustomActionResultReceiver.lazySet((Object) null);
                    HmlETBLoanSetupActivity.this.read.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return HmlETBLoanSetupActivity.this.MediaBrowserCompat$ItemReceiver;
        }
    }
}
