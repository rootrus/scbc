package p040o;

import p040o.MapDifference;
import p040o.getImageDimensionMismatch;

/* renamed from: o.convertStreamToString */
public class convertStreamToString extends C3970aH<getImageDimensionMismatch.IconCompatParcelizer> {
    private MapDifference.ValueDifference MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    convertStreamToString(RegularImmutableBiMap regularImmutableBiMap, MapDifference.ValueDifference valueDifference, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        super(regularImmutableBiMap, streetViewPanoramaOrientation);
        this.MediaBrowserCompat$ItemReceiver = valueDifference;
    }

    public void read() {
        C5062nh nhVar = new C5062nh(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.PlaybackStateCompat$CustomAction.write.AppCompatActivity()));
        if (this.RatingCompat != null) {
            nhVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.convertStreamToString$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setStartCap> {
        private read() {
        }

        /* synthetic */ read(convertStreamToString convertstreamtostring, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            convertStreamToString convertstreamtostring = convertStreamToString.this;
            C5060nf nfVar = new C5060nf((setStartCap) obj);
            if (convertstreamtostring.RatingCompat != null) {
                nfVar.IconCompatParcelizer(convertstreamtostring.RatingCompat);
            }
        }
    }

    /* renamed from: o.convertStreamToString$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzro> {
        private write() {
        }

        public /* synthetic */ write(convertStreamToString convertstreamtostring, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            convertStreamToString.MediaBrowserCompat$ItemReceiver(convertStreamToString.this, (zzro) obj);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(convertStreamToString convertstreamtostring, zzro zzro) {
        convertstreamtostring.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver(zzro);
        convertstreamtostring.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new read(convertstreamtostring, (byte) 0));
    }
}
