package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hZ */
public final /* synthetic */ class C10005hZ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ showFocusAreas MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10005hZ(showFocusAreas showfocusareas, String str) {
        this.MediaBrowserCompat$ItemReceiver = showfocusareas;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        showFocusAreas showfocusareas = this.MediaBrowserCompat$ItemReceiver;
        ((CheckParameters_MembersInjector$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(showfocusareas.read.IconCompatParcelizer(showfocusareas.MediaBrowserCompat$ItemReceiver, "money", showfocusareas.MediaBrowserCompat$MediaItem.IconCompatParcelizer.AppCompatDialogFragment(), this.IconCompatParcelizer));
    }
}
