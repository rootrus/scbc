package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MenuItemWrapperICS$CollapsibleActionViewWrapper */
final class C5043xbdf866b5<T> implements DebitCardMarketConductDeepLinkActivity<Boolean> {
    private /* synthetic */ nativeIsTargetRectangleFilled MediaBrowserCompat$ItemReceiver;

    C5043xbdf866b5(nativeIsTargetRectangleFilled nativeistargetrectanglefilled) {
        this.MediaBrowserCompat$ItemReceiver = nativeistargetrectanglefilled;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Boolean bool = (Boolean) obj;
        nativeIsTargetRectangleFilled.read(this.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) bool, "accepted");
        boolean z = true;
        if (bool.booleanValue()) {
            nativeIsTargetRectangleFilled nativeistargetrectanglefilled = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50441.write;
            if (nativeistargetrectanglefilled.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nativeistargetrectanglefilled.RatingCompat);
                return;
            }
            return;
        }
        nativeIsTargetRectangleFilled nativeistargetrectanglefilled2 = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C50452.write;
        if (nativeistargetrectanglefilled2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(nativeistargetrectanglefilled2.RatingCompat);
        }
    }
}
