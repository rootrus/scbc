package p040o;

import java.util.Iterator;

/* renamed from: o.HmlBusinessOwnerReviewSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6884xc9c50c8c implements BaseJuristicPinActivity_ViewBinding<T> {
    private /* synthetic */ Object[] MediaBrowserCompat$ItemReceiver;

    public C6884xc9c50c8c(Object[] objArr) {
        this.MediaBrowserCompat$ItemReceiver = objArr;
    }

    public final Iterator<T> read() {
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) objArr, "array");
        return new NtbDiscoverActivity<>(objArr);
    }
}
