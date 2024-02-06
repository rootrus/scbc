package p040o;

import p040o.C10178z;
import p040o.Lists;

/* renamed from: o.buildNameMap$MediaBrowserCompat$ItemReceiver */
class buildNameMap$MediaBrowserCompat$ItemReceiver implements buildNameMap$MediaBrowserCompat$MediaItem {
    private /* synthetic */ buildNameMap write;

    private buildNameMap$MediaBrowserCompat$ItemReceiver(buildNameMap buildnamemap) {
        this.write = buildnamemap;
    }

    /* synthetic */ buildNameMap$MediaBrowserCompat$ItemReceiver(buildNameMap buildnamemap, byte b) {
        this(buildnamemap);
    }

    public final void IconCompatParcelizer(PlaceBuffer placeBuffer) {
        Lists.RandomAccessListWrapper MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.write.MediaSessionCompat$ResultReceiverWrapper;
        C10178z.C548025.C54811 r1 = new FundActionsSuccessActivity() {
            public final Object invoke() {
                return buildNameMap.MediaBrowserCompat$CustomActionResultReceiver(buildNameMap.this);
            }
        };
        C10178z.C54834 r2 = new FundFactSheetActivity() {
            public final Object invoke(Object obj) {
                return buildNameMap.IconCompatParcelizer(buildNameMap.this, (Throwable) obj);
            }
        };
        String write2 = this.write.read;
        String read = this.write.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) r1, "onSuccess");
        onGetStartedClick.write((Object) r2, "onError");
        onGetStartedClick.write((Object) write2, "cardNumber");
        onGetStartedClick.write((Object) read, "pin");
        onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaBrowserCompat$ItemReceiver(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.RatingCompat, new Lists.RandomAccessListWrapper.read(r1), r2, new Ticker$MediaBrowserCompat$CustomActionResultReceiver(write2, read, placeBuffer));
    }
}
