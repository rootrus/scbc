package p040o;

import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getGifts */
public final /* synthetic */ class getGifts implements findFragmentByWho {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getGifts(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return ((EditTextDecorator$MediaBrowserCompat$ItemReceiver) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
