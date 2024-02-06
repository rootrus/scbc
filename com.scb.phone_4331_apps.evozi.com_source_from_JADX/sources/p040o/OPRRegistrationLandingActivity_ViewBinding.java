package p040o;

import dagger.Lazy;

/* renamed from: o.OPRRegistrationLandingActivity_ViewBinding */
public final class OPRRegistrationLandingActivity_ViewBinding<T> implements HmlReviewDocumentActivity<T>, Lazy<T> {
    private static final Object MediaBrowserCompat$CustomActionResultReceiver = new Object();
    private volatile HmlReviewDocumentActivity<T> IconCompatParcelizer;
    private volatile Object MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;

    private OPRRegistrationLandingActivity_ViewBinding(HmlReviewDocumentActivity<T> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public final T get() {
        T t = this.MediaBrowserCompat$ItemReceiver;
        if (t == MediaBrowserCompat$CustomActionResultReceiver) {
            synchronized (this) {
                t = this.MediaBrowserCompat$ItemReceiver;
                if (t == MediaBrowserCompat$CustomActionResultReceiver) {
                    t = this.IconCompatParcelizer.get();
                    T t2 = this.MediaBrowserCompat$ItemReceiver;
                    if (t2 != MediaBrowserCompat$CustomActionResultReceiver && !(t2 instanceof OPRStatusRewardsLandingActivity)) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.MediaBrowserCompat$ItemReceiver = t;
                    this.IconCompatParcelizer = null;
                }
            }
        }
        return t;
    }

    public static <P extends HmlReviewDocumentActivity<T>, T> HmlReviewDocumentActivity<T> MediaBrowserCompat$ItemReceiver(P p) {
        if (p instanceof OPRRegistrationLandingActivity_ViewBinding) {
            return p;
        }
        return new OPRRegistrationLandingActivity_ViewBinding(p);
    }

    public static <P extends HmlReviewDocumentActivity<T>, T> Lazy<T> IconCompatParcelizer(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        if (p != null) {
            return new OPRRegistrationLandingActivity_ViewBinding((HmlReviewDocumentActivity) p);
        }
        throw null;
    }
}
