package p040o;

import kotlin.TypeCastException;

/* renamed from: o.BaseLivenessCheckActivity_ViewBinding */
public final class BaseLivenessCheckActivity_ViewBinding<T> {
    public int IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    private Object[] write = new Object[16];

    public final void MediaBrowserCompat$ItemReceiver(T t) {
        onGetStartedClick.write((Object) t, "element");
        Object[] objArr = this.write;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.MediaBrowserCompat$CustomActionResultReceiver = length;
        if (length == this.IconCompatParcelizer) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final T IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        if (i == this.MediaBrowserCompat$CustomActionResultReceiver) {
            return null;
        }
        T[] tArr = this.write;
        T t = tArr[i];
        tArr[i] = null;
        this.IconCompatParcelizer = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver() {
        Object[] objArr = this.write;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(objArr, objArr2, 0, this.IconCompatParcelizer, 0, 10);
        Object[] objArr3 = this.write;
        int length2 = objArr3.length;
        int i = this.IconCompatParcelizer;
        HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(objArr3, objArr2, length2 - i, 0, i, 4);
        this.write = objArr2;
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = length;
    }
}
