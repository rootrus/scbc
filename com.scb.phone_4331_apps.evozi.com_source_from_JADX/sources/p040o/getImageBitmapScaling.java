package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageBitmapScaling */
public final /* synthetic */ class getImageBitmapScaling implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getTotalRamInBytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setBasicSettingsProfileUsed read;

    public /* synthetic */ getImageBitmapScaling(setBasicSettingsProfileUsed setbasicsettingsprofileused, getTotalRamInBytes gettotalraminbytes) {
        this.read = setbasicsettingsprofileused;
        this.MediaBrowserCompat$ItemReceiver = gettotalraminbytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setPadding) obj).MediaBrowserCompat$CustomActionResultReceiver(Multisets.C36852.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, new getImageBitmap(this.read)));
    }
}
