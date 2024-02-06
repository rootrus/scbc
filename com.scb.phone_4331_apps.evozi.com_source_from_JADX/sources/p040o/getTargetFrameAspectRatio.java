package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTargetFrameAspectRatio */
public final /* synthetic */ class getTargetFrameAspectRatio implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.FileIOEngine read;

    public /* synthetic */ getTargetFrameAspectRatio(Image.FileIOEngine fileIOEngine) {
        this.read = fileIOEngine;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setPopupCallback) obj).MediaBrowserCompat$ItemReceiver(this.read.IconCompatParcelizer);
    }
}
