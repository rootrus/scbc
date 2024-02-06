package p040o;

import java.util.List;
import p040o.GoogleMap;
import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.ho$PlaybackStateCompat$CustomAction */
final class ho$PlaybackStateCompat$CustomAction<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.IconCompatParcelizer> {
    private /* synthetic */ C4778ho read;

    ho$PlaybackStateCompat$CustomAction(C4778ho hoVar) {
        this.read = hoVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        OnDeviceIdExtractor.C6966a.IconCompatParcelizer iconCompatParcelizer = (OnDeviceIdExtractor.C6966a.IconCompatParcelizer) obj;
        iconCompatParcelizer.IconCompatParcelizer(C4778ho.RatingCompat(this.read));
        flushQuietly MediaDescriptionCompat = this.read.f2864x50fd9e4a;
        List MediaBrowserCompat$ItemReceiver = C4778ho.MediaBrowserCompat$ItemReceiver(this.read);
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = this.read.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "mGetUserProfileUseCase.userProfile");
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat.read(MediaBrowserCompat$ItemReceiver, AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0, this.read.MediaSessionCompat$Token, false));
    }
}
