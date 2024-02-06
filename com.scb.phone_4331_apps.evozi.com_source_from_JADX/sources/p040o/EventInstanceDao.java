package p040o;

import p040o.onFrontImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.EventInstanceDao */
public final /* synthetic */ class EventInstanceDao implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ EventInstanceDao(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((onFrontImageProcessed.IconCompatParcelizer) obj).RatingCompat(this.MediaBrowserCompat$ItemReceiver);
    }
}
