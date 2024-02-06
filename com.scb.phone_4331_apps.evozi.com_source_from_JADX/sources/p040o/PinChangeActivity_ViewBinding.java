package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.PinChangeActivity_ViewBinding */
public class PinChangeActivity_ViewBinding {
    public static final read Companion = new read((byte) 0);
    public static final PinChangeActivity_ViewBinding NONE = new C6988xe10d6bc2();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public PinChangeActivity_ViewBinding timeout(long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("timeout < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public PinChangeActivity_ViewBinding deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public final PinChangeActivity_ViewBinding deadline(long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("duration <= 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public PinChangeActivity_ViewBinding clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public PinChangeActivity_ViewBinding clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        onGetStartedClick.write(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public final void intersectWith(PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) pinChangeActivity_ViewBinding, "other");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        long timeoutNanos2 = timeoutNanos();
        timeout(read.IconCompatParcelizer(pinChangeActivity_ViewBinding.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (pinChangeActivity_ViewBinding.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), pinChangeActivity_ViewBinding.deadlineNanoTime()));
            }
            try {
                fundActionsSuccessActivity.invoke();
            } finally {
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (pinChangeActivity_ViewBinding.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
            }
        } else {
            if (pinChangeActivity_ViewBinding.hasDeadline()) {
                deadlineNanoTime(pinChangeActivity_ViewBinding.deadlineNanoTime());
            }
            try {
                fundActionsSuccessActivity.invoke();
            } finally {
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (pinChangeActivity_ViewBinding.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
    }

    /* renamed from: o.PinChangeActivity_ViewBinding$read */
    public static final class read {
        public static long IconCompatParcelizer(long j, long j2) {
            return (j == 0 || (j2 != 0 && j >= j2)) ? j2 : j;
        }

        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
