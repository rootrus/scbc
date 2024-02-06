package p040o;

import p040o.C4316e;

/* renamed from: o.e$1$MediaBrowserCompat$ItemReceiver */
public final class e$1$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Integer> {
    final /* synthetic */ C4316e.C43171 MediaBrowserCompat$CustomActionResultReceiver;

    public e$1$MediaBrowserCompat$ItemReceiver(C4316e.C43171 r1, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void onError(Throwable th) {
        C4316e.C43171.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            C4316e.C43171 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
            C10122rO rOVar = new C10122rO(this, th);
            if (r0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                rOVar.IconCompatParcelizer(r0.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4316e.C43171.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            C4316e.C43171 r5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            C10121rN rNVar = new C10121rN(this);
            if (r5.RatingCompat == null) {
                z = false;
            }
            if (z) {
                rNVar.IconCompatParcelizer(r5.RatingCompat);
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setPadding();
    }
}
