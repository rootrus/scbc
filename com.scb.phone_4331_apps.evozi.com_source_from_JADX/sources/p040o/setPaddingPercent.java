package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.setPaddingPercent */
public final /* synthetic */ class setPaddingPercent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setPaddingPercent(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        startRotateMessage.write(this.MediaBrowserCompat$CustomActionResultReceiver, (CheckParameters_MembersInjector.MediaDescriptionCompat) obj);
    }
}
