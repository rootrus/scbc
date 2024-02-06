package p040o;

import p040o.C10062n;
import p040o.access$2300;

/* renamed from: o.n$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class n$1$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<useViewLifecycleInFragment> {
    final /* synthetic */ C10062n.C49941 MediaBrowserCompat$CustomActionResultReceiver;

    private n$1$MediaBrowserCompat$CustomActionResultReceiver(C10062n.C49941 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        useViewLifecycleInFragment useviewlifecycleinfragment = (useViewLifecycleInFragment) obj;
        boolean z = true;
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && useviewlifecycleinfragment != null) {
            getUuidUtf8Bytes MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver(useviewlifecycleinfragment, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            C10062n.C49941 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
            C10088ok okVar = new C10088ok(MediaBrowserCompat$ItemReceiver);
            if (r0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                okVar.IconCompatParcelizer(r0.RatingCompat);
            }
            C10062n.C49941.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = false;
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            boolean z = true;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
                C10062n.C49941 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                C10062n.C49941 r02 = this.MediaBrowserCompat$CustomActionResultReceiver;
                C10087oj ojVar = new C10087oj(this, th);
                if (r02.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ojVar.IconCompatParcelizer(r02.RatingCompat);
                }
                boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = false;
            }
        }
    }
}
