package p040o;

import p040o.Synchronized;

/* renamed from: o.multiset */
public final /* synthetic */ class multiset implements findFragmentByWho {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Synchronized.C38331 write;

    public /* synthetic */ multiset(Synchronized.C38331 r1, String str) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object IconCompatParcelizer(Object obj) {
        Synchronized.C38331 r0 = this.write;
        PlaceLikelihoodBuffer placeLikelihoodBuffer = (PlaceLikelihoodBuffer) obj;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = r0.MediaBrowserCompat$ItemReceiver(placeLikelihoodBuffer, this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.RatingCompat = r0.mo26549c_(placeLikelihoodBuffer.MediaSessionCompat$Token);
        return MediaBrowserCompat$ItemReceiver;
    }
}
