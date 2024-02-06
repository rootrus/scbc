package okhttp3.repackaged.internal.framed;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class Ping {
    private final CountDownLatch akK = new CountDownLatch(1);
    private long akL = -1;
    private long akM = -1;

    Ping() {
    }

    /* access modifiers changed from: package-private */
    public final void send() {
        if (this.akL == -1) {
            this.akL = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: uR */
    public final void mo58776uR() {
        if (this.akM != -1 || this.akL == -1) {
            throw new IllegalStateException();
        }
        this.akM = System.nanoTime();
        this.akK.countDown();
    }

    /* access modifiers changed from: package-private */
    public final void cancel() {
        if (this.akM == -1) {
            long j = this.akL;
            if (j != -1) {
                this.akM = j - 1;
                this.akK.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final long roundTripTime() throws InterruptedException {
        this.akK.await();
        return this.akM - this.akL;
    }

    public final long roundTripTime(long j, TimeUnit timeUnit) throws InterruptedException {
        if (this.akK.await(j, timeUnit)) {
            return this.akM - this.akL;
        }
        return -2;
    }
}
