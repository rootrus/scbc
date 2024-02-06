package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.startSteadyMessage */
public final /* synthetic */ class startSteadyMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ startRotateMessage write;

    public /* synthetic */ startSteadyMessage(startRotateMessage startrotatemessage) {
        this.write = startrotatemessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        startRotateMessage startrotatemessage = this.write;
        ((CheckParameters_MembersInjector.MediaDescriptionCompat) obj).MediaBrowserCompat$ItemReceiver(startrotatemessage.MediaBrowserCompat$ItemReceiver.write(startrotatemessage.IconCompatParcelizer));
    }
}
