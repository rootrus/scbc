package p040o;

import java.util.regex.Pattern;
import p040o.LocalProjectProvider;
import p040o.LocalProjectProvider.C69364;

/* renamed from: o.eU */
public class C4353eU<T extends LocalProjectProvider.C69364> extends writeUInt64NoTag<T> {
    private trackSingleFaceJni IconCompatParcelizer;
    boolean MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;
    boolean MediaDescriptionCompat;
    boolean MediaMetadataCompat;
    boolean MediaSessionCompat$ResultReceiverWrapper;
    public setCausedBy MediaSessionCompat$Token;
    boolean ParcelableVolumeInfo;

    public C4353eU(RegularImmutableBiMap regularImmutableBiMap, TaskCompletionSource$MediaBrowserCompat$ItemReceiver taskCompletionSource$MediaBrowserCompat$ItemReceiver, initDetectorJni initdetectorjni, trackSingleFaceJni tracksinglefacejni, finalizeDetectorJni finalizedetectorjni, NativeFaceDetectorV2Creator nativeFaceDetectorV2Creator) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = tracksinglefacejni;
    }

    public final void read(String str, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(str);
        C4352eT eTVar = new C4352eT(this, z, str);
        boolean z2 = true;
        if (this.RatingCompat != null) {
            eTVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4347eM eMVar = new C4347eM(this);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eMVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver(str);
        C4345eK eKVar = new C4345eK(this, z, str);
        boolean z2 = true;
        if (this.RatingCompat != null) {
            eKVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4351eQ eQVar = new C4351eQ(this);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eQVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write(String str, boolean z) {
        this.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver(str);
        C4344eJ eJVar = new C4344eJ(this, z, str);
        boolean z2 = true;
        if (this.RatingCompat != null) {
            eJVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4346eL eLVar = new C4346eL(this);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eLVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if ((str == null || str.length() == 0) || str.length() != 10 || !trackSingleFaceJni.MediaBrowserCompat$CustomActionResultReceiver(str)) {
            return false;
        }
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(onMarkerClick onmarkerclick) {
        boolean z = true;
        if (onmarkerclick.write) {
            C9912eR eRVar = new C9912eR(onmarkerclick);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eRVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (onmarkerclick.IconCompatParcelizer) {
            C9913eS eSVar = C9913eS.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eSVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            C9911eI eIVar = C9911eI.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eIVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        boolean z2 = true;
        this.MediaMetadataCompat = str != null && str.length() >= 5 && str.length() <= 20 && Pattern.compile("^[a-zA-Z0-9]+$").matcher(str).matches();
        C4348eN eNVar = new C4348eN(this, z, str);
        if (this.RatingCompat != null) {
            eNVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4346eL eLVar = new C4346eL(this);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eLVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        boolean z2 = false;
        this.MediaBrowserCompat$MediaItem = !(str == null || str.length() == 0) && str.length() == 17;
        C4350eP ePVar = new C4350eP(this, z, str);
        if (this.RatingCompat != null) {
            ePVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4347eM eMVar = new C4347eM(this);
        if (this.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            eMVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str, boolean z) {
        boolean z2 = true;
        this.ParcelableVolumeInfo = str != null && str.length() >= 3 && str.length() <= 23 && Pattern.compile("^[a-zA-Z0-9]+$").matcher(str).matches();
        C4338eG eGVar = new C4338eG(this, z, str);
        if (this.RatingCompat != null) {
            eGVar.IconCompatParcelizer(this.RatingCompat);
        }
        C4351eQ eQVar = new C4351eQ(this);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eQVar.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
