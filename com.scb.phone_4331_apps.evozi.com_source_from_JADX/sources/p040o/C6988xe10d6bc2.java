package p040o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.PinChangeActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6988xe10d6bc2 extends PinChangeActivity_ViewBinding {
    public final void throwIfReached() {
    }

    C6988xe10d6bc2() {
    }

    public final PinChangeActivity_ViewBinding timeout(long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        return this;
    }

    public final PinChangeActivity_ViewBinding deadlineNanoTime(long j) {
        return this;
    }
}
