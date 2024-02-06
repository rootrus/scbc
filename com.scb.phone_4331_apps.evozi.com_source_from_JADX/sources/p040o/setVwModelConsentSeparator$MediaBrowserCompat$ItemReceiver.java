package p040o;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.BankingAgentDeepLinkActivity;
import p040o.setVwModelConsentSeparator;

/* renamed from: o.setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver */
final class setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver extends BankingAgentDeepLinkActivity.read {
    volatile boolean IconCompatParcelizer;
    private AtomicInteger MediaBrowserCompat$CustomActionResultReceiver = new AtomicInteger();
    final PriorityBlockingQueue<setVwModelConsentSeparator.write> MediaBrowserCompat$ItemReceiver = new PriorityBlockingQueue<>();
    private final AtomicInteger read = new AtomicInteger();

    setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver() {
    }

    public final BulkTransferDeepLinkActivity IconCompatParcelizer(Runnable runnable) {
        return MediaBrowserCompat$CustomActionResultReceiver(runnable, TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return MediaBrowserCompat$CustomActionResultReceiver(new C7469x977d10fe(runnable, this, convert), convert);
    }

    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j) {
        if (this.IconCompatParcelizer) {
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
        setVwModelConsentSeparator.write write = new setVwModelConsentSeparator.write(runnable, Long.valueOf(j), this.MediaBrowserCompat$CustomActionResultReceiver.incrementAndGet());
        this.MediaBrowserCompat$ItemReceiver.add(write);
        if (this.read.getAndIncrement() == 0) {
            int i = 1;
            while (!this.IconCompatParcelizer) {
                setVwModelConsentSeparator.write poll = this.MediaBrowserCompat$ItemReceiver.poll();
                if (poll == null) {
                    i = this.read.addAndGet(-i);
                    if (i == 0) {
                        return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
                    }
                } else if (!poll.MediaBrowserCompat$ItemReceiver) {
                    poll.MediaBrowserCompat$CustomActionResultReceiver.run();
                }
            }
            this.MediaBrowserCompat$ItemReceiver.clear();
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
        C7470x64488a69 setvwmodelconsentseparator_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver = new C7470x64488a69(this, write);
        HmlLatestPersonalInformationDeepLinkActivity.write(setvwmodelconsentseparator_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver, "run is null");
        return new CreditCardServiceDefaultCardDeepLinkActivity(setvwmodelconsentseparator_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver);
    }

    public final void dispose() {
        this.IconCompatParcelizer = true;
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }
}
