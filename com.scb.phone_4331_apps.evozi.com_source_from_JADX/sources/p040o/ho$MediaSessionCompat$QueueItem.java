package p040o;

import java.util.List;
import p040o.GoogleMap;
import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.ho$MediaSessionCompat$QueueItem */
public final class ho$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.IconCompatParcelizer> {
    private /* synthetic */ C4778ho MediaBrowserCompat$CustomActionResultReceiver;

    public ho$MediaSessionCompat$QueueItem(C4778ho hoVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hoVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        OnDeviceIdExtractor.C6966a.IconCompatParcelizer iconCompatParcelizer = (OnDeviceIdExtractor.C6966a.IconCompatParcelizer) obj;
        iconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        flushQuietly MediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver.f2864x50fd9e4a;
        List MediaBrowserCompat$ItemReceiver = C4778ho.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "mGetUserProfileUseCase.userProfile");
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat.read(MediaBrowserCompat$ItemReceiver, AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0, this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token, false));
    }
}
