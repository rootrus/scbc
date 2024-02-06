package p040o;

import p040o.CheckWorkflowActivity;
import p040o.Synchronized;
import p040o.access$2300;

/* renamed from: o.aI */
public class C3972aI extends writeUInt64NoTag<CheckWorkflowActivity.C6401a> {
    public final StreetViewPanoramaOrientation IconCompatParcelizer;
    public discardOldLogFiles read;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedAsMapEntries.C38351 write;

    @HmlPinActivity
    C3972aI(RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedAsMapEntries.C38351 r2, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = streetViewPanoramaOrientation;
        this.write = r2;
    }

    /* renamed from: o.aI$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlacePhotoMetadataResponse> {
        private read() {
        }

        public /* synthetic */ read(C3972aI aIVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            PlacePhotoMetadataResponse placePhotoMetadataResponse = (PlacePhotoMetadataResponse) obj;
            C3972aI.MediaBrowserCompat$CustomActionResultReceiver(C3972aI.this);
            boolean z = true;
            if (C3972aI.this.RatingCompat != null) {
                C3972aI aIVar = C3972aI.this;
                discardOldLogFiles unused = aIVar.read = aIVar.write.MediaBrowserCompat$CustomActionResultReceiver(placePhotoMetadataResponse.MediaBrowserCompat$CustomActionResultReceiver, placePhotoMetadataResponse.MediaBrowserCompat$ItemReceiver, C3972aI.this.IconCompatParcelizer.write.setCheckable());
                C3972aI aIVar2 = C3972aI.this;
                GuidingLine guidingLine = new GuidingLine(this);
                if (aIVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    guidingLine.IconCompatParcelizer(aIVar2.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C3972aI.this.MediaBrowserCompat$ItemReceiver(C3972aI.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C3972aI aIVar) {
        if (aIVar.RatingCompat != null) {
            aIVar.RatingCompat.ay_();
        }
    }
}
