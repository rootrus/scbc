package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ClassifierLibUtil */
public final /* synthetic */ class ClassifierLibUtil implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ClassifierLibUtil(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).RatingCompat(this.MediaBrowserCompat$ItemReceiver);
    }
}
