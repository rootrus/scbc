package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ModifyQuickPromptPayActivity */
public class ModifyQuickPromptPayActivity {
    public static final ModifyQuickPromptPayActivity NONE = new ModifyQuickPromptPayActivity() {
        public final ModifyQuickPromptPayActivity deadlineNanoTime(long j) {
            return this;
        }

        public final void throwIfReached() throws IOException {
        }

        public final ModifyQuickPromptPayActivity timeout(long j, TimeUnit timeUnit) {
            return this;
        }
    };
    private boolean anJ;
    private long anK;
    private long anL;

    public ModifyQuickPromptPayActivity timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.anL = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long timeoutNanos() {
        return this.anL;
    }

    public boolean hasDeadline() {
        return this.anJ;
    }

    public long deadlineNanoTime() {
        if (this.anJ) {
            return this.anK;
        }
        throw new IllegalStateException("No deadline");
    }

    public ModifyQuickPromptPayActivity deadlineNanoTime(long j) {
        this.anJ = true;
        this.anK = j;
        return this;
    }

    public final ModifyQuickPromptPayActivity deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("duration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public ModifyQuickPromptPayActivity clearTimeout() {
        this.anL = 0;
        return this;
    }

    public ModifyQuickPromptPayActivity clearDeadline() {
        this.anJ = false;
        return this;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.anJ && this.anK - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
