package p040o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.BasePersonalInfoActivity */
public class BasePersonalInfoActivity extends PinChangeActivity_ViewBinding {
    public PinChangeActivity_ViewBinding IconCompatParcelizer;

    public BasePersonalInfoActivity(PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding) {
        onGetStartedClick.write((Object) pinChangeActivity_ViewBinding, "delegate");
        this.IconCompatParcelizer = pinChangeActivity_ViewBinding;
    }

    public PinChangeActivity_ViewBinding timeout(long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        return this.IconCompatParcelizer.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.IconCompatParcelizer.timeoutNanos();
    }

    public boolean hasDeadline() {
        return this.IconCompatParcelizer.hasDeadline();
    }

    public long deadlineNanoTime() {
        return this.IconCompatParcelizer.deadlineNanoTime();
    }

    public PinChangeActivity_ViewBinding deadlineNanoTime(long j) {
        return this.IconCompatParcelizer.deadlineNanoTime(j);
    }

    public PinChangeActivity_ViewBinding clearTimeout() {
        return this.IconCompatParcelizer.clearTimeout();
    }

    public PinChangeActivity_ViewBinding clearDeadline() {
        return this.IconCompatParcelizer.clearDeadline();
    }

    public void throwIfReached() throws IOException {
        this.IconCompatParcelizer.throwIfReached();
    }
}
