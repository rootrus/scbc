package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.access$2300;

/* renamed from: o.sendImage  reason: case insensitive filesystem */
public class C10859sendImage extends writeUInt64NoTag<getFoldedOrTornDocumentEdges> {
    /* access modifiers changed from: private */
    public final exactMatchFound MediaBrowserCompat$ItemReceiver;
    public String read = null;
    public final StreetViewPanoramaLink write;

    @HmlPinActivity
    public C10859sendImage(StreetViewPanoramaLink streetViewPanoramaLink, exactMatchFound exactmatchfound, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = streetViewPanoramaLink;
        this.MediaBrowserCompat$ItemReceiver = exactmatchfound;
    }

    /* renamed from: o.sendImage$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<getInterval>> {
        private write() {
        }

        public /* synthetic */ write(C10859sendImage sendimage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C10859sendImage.MediaBrowserCompat$CustomActionResultReceiver(C10859sendImage.this);
            ArrayList arrayList = new ArrayList();
            for (getInterval getinterval : (List) obj) {
                arrayList.add(new populateExceptionData(getinterval.MediaBrowserCompat$CustomActionResultReceiver, getinterval.read));
            }
            C10859sendImage sendimage = C10859sendImage.this;
            setKfsHostPort setkfshostport = new setKfsHostPort(arrayList);
            if (sendimage.RatingCompat != null) {
                setkfshostport.IconCompatParcelizer(sendimage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C10859sendImage.MediaBrowserCompat$ItemReceiver(C10859sendImage.this);
            if (!C10859sendImage.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C10859sendImage.this.MediaBrowserCompat$ItemReceiver(C10859sendImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new setkfsPassword(this)));
            }
        }
    }

    /* renamed from: o.sendImage$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<extractLocationAvailability> {
        private read() {
        }

        public /* synthetic */ read(C10859sendImage sendimage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C10859sendImage.IconCompatParcelizer(C10859sendImage.this);
            C10859sendImage sendimage = C10859sendImage.this;
            C10901getTimeout gettimeout = new C10901getTimeout(this, (extractLocationAvailability) obj);
            if (sendimage.RatingCompat != null) {
                gettimeout.IconCompatParcelizer(sendimage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C10859sendImage.read(C10859sendImage.this);
            if (!C10859sendImage.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C10859sendImage.this.MediaBrowserCompat$ItemReceiver(C10859sendImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C10859sendImage sendimage) {
        if (sendimage.RatingCompat != null) {
            sendimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C10859sendImage sendimage) {
        if (sendimage.RatingCompat != null) {
            sendimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(C10859sendImage sendimage) {
        if (sendimage.RatingCompat != null) {
            sendimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C10859sendImage sendimage) {
        if (sendimage.RatingCompat != null) {
            sendimage.RatingCompat.aj_();
        }
    }
}
