package p040o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.QuickOperationSuccessActivity */
public class QuickOperationSuccessActivity extends ModifyQuickPromptPayActivity {
    public ModifyQuickPromptPayActivity write;

    public QuickOperationSuccessActivity(ModifyQuickPromptPayActivity modifyQuickPromptPayActivity) {
        if (modifyQuickPromptPayActivity != null) {
            this.write = modifyQuickPromptPayActivity;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public ModifyQuickPromptPayActivity timeout(long j, TimeUnit timeUnit) {
        return this.write.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.write.timeoutNanos();
    }

    public boolean hasDeadline() {
        return this.write.hasDeadline();
    }

    public long deadlineNanoTime() {
        return this.write.deadlineNanoTime();
    }

    public ModifyQuickPromptPayActivity deadlineNanoTime(long j) {
        return this.write.deadlineNanoTime(j);
    }

    public ModifyQuickPromptPayActivity clearTimeout() {
        return this.write.clearTimeout();
    }

    public ModifyQuickPromptPayActivity clearDeadline() {
        return this.write.clearDeadline();
    }

    public void throwIfReached() throws IOException {
        this.write.throwIfReached();
    }
}
