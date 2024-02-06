package p040o;

import p040o.Lists;
import p040o.buildNameMap;

/* renamed from: o.buildNameMap$MediaBrowserCompat$SearchResultReceiver */
class buildNameMap$MediaBrowserCompat$SearchResultReceiver implements buildNameMap.MediaMetadataCompat {
    private /* synthetic */ buildNameMap write;

    private buildNameMap$MediaBrowserCompat$SearchResultReceiver(buildNameMap buildnamemap) {
        this.write = buildnamemap;
    }

    /* synthetic */ buildNameMap$MediaBrowserCompat$SearchResultReceiver(buildNameMap buildnamemap, byte b) {
        this(buildnamemap);
    }

    public final void write() {
        Lists.RandomAccessListWrapper MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.write.MediaSessionCompat$ResultReceiverWrapper;
        C4926lN lNVar = new C4926lN(this.write);
        FixedAspectRatioDetector fixedAspectRatioDetector = new FixedAspectRatioDetector(this.write);
        onGetStartedClick.write((Object) lNVar, "onSuccess");
        onGetStartedClick.write((Object) fixedAspectRatioDetector, "onError");
        LargestFaceFocusingProcessor largestFaceFocusingProcessor = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.write;
        largestFaceFocusingProcessor.read(largestFaceFocusingProcessor.MediaBrowserCompat$CustomActionResultReceiver(), new Lists.RandomAccessPartition(lNVar), new Lists.RandomAccessPartition(fixedAspectRatioDetector));
    }
}
