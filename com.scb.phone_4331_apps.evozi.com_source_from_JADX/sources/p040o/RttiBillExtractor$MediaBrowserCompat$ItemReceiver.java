package p040o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.RttiBillExtractor$MediaBrowserCompat$ItemReceiver */
public final class RttiBillExtractor$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
    final /* synthetic */ RttiBillExtractor read;

    private RttiBillExtractor$MediaBrowserCompat$ItemReceiver(RttiBillExtractor rttiBillExtractor) {
        this.read = rttiBillExtractor;
    }

    public /* synthetic */ RttiBillExtractor$MediaBrowserCompat$ItemReceiver(RttiBillExtractor rttiBillExtractor, byte b) {
        this(rttiBillExtractor);
    }

    public final /* synthetic */ void onNext(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        String str;
        show show = new show((List) obj);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, BillCaptureModule_KtaExceptionResponseDeserializer_Factory.MediaBrowserCompat$ItemReceiver));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        RttiBillExtractor rttiBillExtractor = this.read;
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                str = ((StreetViewPanoramaFragment) t).MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str = "";
        }
        String unused = rttiBillExtractor.write = str;
        if (this.read.MediaBrowserCompat$MediaItem && this.read.MediaMetadataCompat != null) {
            this.read.MediaBrowserCompat$MediaItem = false;
            RttiBillExtractor rttiBillExtractor2 = this.read;
            BillCaptureModule_GetUriRttiFactory billCaptureModule_GetUriRttiFactory = new BillCaptureModule_GetUriRttiFactory(this);
            if (rttiBillExtractor2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureModule_GetUriRttiFactory.IconCompatParcelizer(rttiBillExtractor2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        RegularImmutableBiMap unused = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap.IconCompatParcelizer(th), new Object[0]);
    }
}
