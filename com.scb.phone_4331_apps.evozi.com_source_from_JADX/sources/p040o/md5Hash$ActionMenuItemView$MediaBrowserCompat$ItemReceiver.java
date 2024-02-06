package p040o;

import p040o.CrashlyticsController;
import p040o.md5Hash;
import p040o.writeUInt64NoTag;
import p040o.zzfe;
import p040o.zzfy;

/* renamed from: o.md5Hash$ActionMenuItemView$MediaBrowserCompat$ItemReceiver */
final class md5Hash$ActionMenuItemView$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
    private /* synthetic */ md5Hash.ActionMenuItemView MediaBrowserCompat$ItemReceiver;

    md5Hash$ActionMenuItemView$MediaBrowserCompat$ItemReceiver(md5Hash.ActionMenuItemView actionMenuItemView) {
        this.MediaBrowserCompat$ItemReceiver = actionMenuItemView;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        zzfe.zzc zzc;
        ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
        processingParameters_Factory.write();
        processingParameters_Factory.MediaBrowserCompat$MediaItem();
        zzfy.zzd zzd = zzfy.zzd.SUBMITTED;
        CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaDescriptionCompat;
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            zzc = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver;
        } else {
            zzc = null;
        }
        processingParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(zzd, zzc);
    }
}
