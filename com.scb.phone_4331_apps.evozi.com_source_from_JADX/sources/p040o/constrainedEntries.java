package p040o;

import com.scb.phone.presentation.p037di.PresenterModule;
import p040o.Iterables;

/* renamed from: o.constrainedEntries */
public final class constrainedEntries implements OPRStatusRewardsLandingActivity_ViewBinding<Iterables.C352212> {
    private final PresenterModule MediaBrowserCompat$ItemReceiver;

    private constrainedEntries(PresenterModule presenterModule) {
        this.MediaBrowserCompat$ItemReceiver = presenterModule;
    }

    public static constrainedEntries write(PresenterModule presenterModule) {
        return new constrainedEntries(presenterModule);
    }

    public final /* synthetic */ Object get() {
        Iterables.C352212 write = this.MediaBrowserCompat$ItemReceiver.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
