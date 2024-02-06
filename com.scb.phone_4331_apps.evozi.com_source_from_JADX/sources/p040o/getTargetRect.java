package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTargetRect */
public final /* synthetic */ class getTargetRect implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.FileIOEngine MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getTargetRect(Image.FileIOEngine fileIOEngine) {
        this.MediaBrowserCompat$ItemReceiver = fileIOEngine;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setPopupCallback) obj).read(Image.FileIOEngine.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.write));
    }
}
