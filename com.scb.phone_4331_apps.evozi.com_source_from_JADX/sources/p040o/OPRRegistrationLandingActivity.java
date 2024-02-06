package p040o;

import dagger.Lazy;

/* renamed from: o.OPRRegistrationLandingActivity */
public final class OPRRegistrationLandingActivity<T> implements OPRStatusRewardsLandingActivity_ViewBinding<T>, Lazy<T> {
    private final T IconCompatParcelizer;

    public static <T> OPRStatusRewardsLandingActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(T t) {
        if (t != null) {
            return new OPRRegistrationLandingActivity(t);
        }
        throw new NullPointerException("instance cannot be null");
    }

    static {
        new OPRRegistrationLandingActivity((Object) null);
    }

    private OPRRegistrationLandingActivity(T t) {
        this.IconCompatParcelizer = t;
    }

    public final T get() {
        return this.IconCompatParcelizer;
    }
}
