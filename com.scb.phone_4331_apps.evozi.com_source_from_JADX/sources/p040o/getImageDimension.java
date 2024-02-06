package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getImageDimension */
public final /* synthetic */ class getImageDimension implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ listSessionBeginFiles MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getImageDimension(listSessionBeginFiles listsessionbeginfiles) {
        this.MediaBrowserCompat$ItemReceiver = listsessionbeginfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters_Factory) obj).write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat);
    }
}
