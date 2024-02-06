package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.SelfieBaseCaptureExperience_MembersInjector */
public final /* synthetic */ class SelfieBaseCaptureExperience_MembersInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SelfieBaseCaptureExperience_MembersInjector(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.RttiExceptionResponseDeserializer) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
