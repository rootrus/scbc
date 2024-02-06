package p040o;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.Iterables;

/* renamed from: o.bw */
public class C4120bw extends C4066bA<getExtractSignatureImage> {
    private final equivalent MediaBrowserCompat$ItemReceiver;
    private String MediaMetadataCompat;
    private String read;

    @HmlPinActivity
    public C4120bw(RegularImmutableBiMap regularImmutableBiMap, readUTF readutf, equivalent equivalent, Tile tile) {
        super(regularImmutableBiMap, tile);
        this.MediaBrowserCompat$ItemReceiver = equivalent;
    }

    public final void MediaBrowserCompat$ItemReceiver(File file) {
        RequestBody requestBody;
        String valueOf = String.valueOf(System.currentTimeMillis());
        String read2 = read(file, valueOf);
        equivalent equivalent = this.MediaBrowserCompat$ItemReceiver;
        String str = this.read;
        String str2 = this.MediaMetadataCompat;
        newLatLngBounds newlatlngbounds = this.IconCompatParcelizer;
        String absolutePath = file.getAbsolutePath();
        onGetStartedClick.write((Object) str, "ndidType");
        onGetStartedClick.write((Object) newlatlngbounds, "faceDetectFrame");
        onGetStartedClick.write((Object) absolutePath, "imagePath");
        onGetStartedClick.write((Object) read2, "imageHash");
        onGetStartedClick.write((Object) valueOf, "timestamp");
        onGetStartedClick.write((Object) str, "text");
        RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str);
        if (str2 != null) {
            onGetStartedClick.write((Object) str2, "text");
            requestBody = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str2);
        } else {
            requestBody = null;
        }
        RequestBody requestBody2 = requestBody;
        onGetStartedClick.write((Object) "jpg", "text");
        RequestBody create2 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), "jpg");
        MultipartBody.Part MediaBrowserCompat$ItemReceiver2 = Iterables.C351810.MediaBrowserCompat$ItemReceiver("imageData", absolutePath);
        String valueOf2 = String.valueOf(newlatlngbounds.IconCompatParcelizer);
        onGetStartedClick.write((Object) valueOf2, "text");
        RequestBody create3 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf2);
        String valueOf3 = String.valueOf(newlatlngbounds.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) valueOf3, "text");
        RequestBody create4 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf3);
        String valueOf4 = String.valueOf(newlatlngbounds.RatingCompat);
        onGetStartedClick.write((Object) valueOf4, "text");
        RequestBody create5 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf4);
        String valueOf5 = String.valueOf(newlatlngbounds.MediaMetadataCompat);
        onGetStartedClick.write((Object) valueOf5, "text");
        RequestBody create6 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf5);
        String valueOf6 = String.valueOf(newlatlngbounds.read);
        onGetStartedClick.write((Object) valueOf6, "text");
        equivalent equivalent2 = equivalent;
        RequestBody create7 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf6);
        String valueOf7 = String.valueOf(newlatlngbounds.write);
        onGetStartedClick.write((Object) valueOf7, "text");
        valueComparator valuecomparator = r3;
        valueComparator valuecomparator2 = new valueComparator(create, requestBody2, create2, MediaBrowserCompat$ItemReceiver2, create3, create4, create5, create6, create7, RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf7), read2, valueOf);
        equivalent2.write(valuecomparator);
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new write(this, (byte) 0));
    }

    /* renamed from: o.bw$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        /* synthetic */ write(C4120bw bwVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((Boolean) obj);
            C4120bw.IconCompatParcelizer(C4120bw.this);
            C4120bw bwVar = C4120bw.this;
            setOuterOverlayFrameColor setouteroverlayframecolor = setOuterOverlayFrameColor.IconCompatParcelizer;
            if (bwVar.RatingCompat != null) {
                setouteroverlayframecolor.IconCompatParcelizer(bwVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            C4120bw.MediaBrowserCompat$CustomActionResultReceiver(C4120bw.this);
            C4120bw bwVar = C4120bw.this;
            getOnCompleteListener getoncompletelistener = new getOnCompleteListener(this, th);
            if (bwVar.RatingCompat != null) {
                getoncompletelistener.IconCompatParcelizer(bwVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4120bw bwVar) {
        if (bwVar.RatingCompat != null) {
            bwVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4120bw bwVar) {
        if (bwVar.RatingCompat != null) {
            bwVar.RatingCompat.aj_();
        }
    }

    public final void MediaMetadataCompat(Throwable th) {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        getDrawVideoFramesFlag getdrawvideoframesflag = new getDrawVideoFramesFlag(this, th);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getdrawvideoframesflag.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        IOException iOException = IOException.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (this.RatingCompat != null) {
            iOException.IconCompatParcelizer(this.RatingCompat);
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        this.read = z ? "RP" : "IDP";
        this.MediaMetadataCompat = str;
    }
}
