package p040o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ScbsOnboardingTcActivity */
public final class ScbsOnboardingTcActivity<T> implements BaseJuristicPinActivity_ViewBinding<T> {
    private final AtomicReference<BaseJuristicPinActivity_ViewBinding<T>> MediaBrowserCompat$ItemReceiver;

    public ScbsOnboardingTcActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        this.MediaBrowserCompat$ItemReceiver = new AtomicReference<>(baseJuristicPinActivity_ViewBinding);
    }

    public final Iterator<T> read() {
        BaseJuristicPinActivity_ViewBinding andSet = this.MediaBrowserCompat$ItemReceiver.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.read();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
