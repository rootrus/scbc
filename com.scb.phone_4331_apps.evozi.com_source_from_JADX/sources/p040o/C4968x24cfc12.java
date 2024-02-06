package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.Futures;
import p040o.md5Hash;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.md5Hash$ActionMenuItemView$MediaBrowserCompat$CustomActionResultReceiver */
final class C4968x24cfc12<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
    private /* synthetic */ zzfe.zze MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ md5Hash.ActionMenuItemView read;

    C4968x24cfc12(md5Hash.ActionMenuItemView actionMenuItemView, zzfe.zze zze) {
        this.read = actionMenuItemView;
        this.MediaBrowserCompat$CustomActionResultReceiver = zze;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
        this.read.IconCompatParcelizer.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        this.read.IconCompatParcelizer.MediaSessionCompat$QueueItem = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat.size();
        processingParameters_Factory.write(this.read.IconCompatParcelizer.MediaMetadataCompat);
        processingParameters_Factory.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        Serialization unused = this.read.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        List<ActivityRecognitionApi> list = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        onGetStartedClick.write((Object) list, "documentList");
        ArrayList arrayList = new ArrayList();
        for (ActivityRecognitionApi activityRecognitionApi : list) {
            onGetStartedClick.write((Object) activityRecognitionApi, "document");
            arrayList.add(new Futures.ListenableFutureAdapter.C34161.read(activityRecognitionApi.MediaBrowserCompat$ItemReceiver, activityRecognitionApi.IconCompatParcelizer));
        }
        processingParameters_Factory.IconCompatParcelizer((List<Futures.ListenableFutureAdapter.C34161.read>) arrayList);
        Serialization unused2 = this.read.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        processingParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(Serialization.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver));
        this.read.IconCompatParcelizer.ParcelableVolumeInfo = true;
    }
}
