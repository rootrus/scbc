package p040o;

import java.util.List;
import org.json.JSONObject;
import p040o.AbstractMultimap;
import p040o.ServerProjectProvider;

/* renamed from: o.StreetViewPanoramaOrientation */
public class StreetViewPanoramaOrientation extends IndoorBuilding {
    public C6372x3d677cbb IconCompatParcelizer;
    public findValueIteratorAndKey MediaBrowserCompat$CustomActionResultReceiver;
    public AbstractMultimap.EntryIterator MediaBrowserCompat$ItemReceiver;
    private HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private inject_extractorProvider MediaMetadataCompat;
    private AbstractMultimap.AsMap.AsMapIterator MediaSessionCompat$Token;
    private OnDeviceIdExtractor RatingCompat;
    private final getRegionName read;
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    /* renamed from: o.StreetViewPanoramaOrientation$Builder */
    public final class Builder extends IndoorBuilding {
        public findValueIteratorAndKey IconCompatParcelizer;
        public getFrontException MediaBrowserCompat$CustomActionResultReceiver;
        public LocalProjectProvider MediaBrowserCompat$ItemReceiver;
        private ServerProjectProvider.C70673 MediaMetadataCompat;
        public AbstractMultimap.EntrySet read;
        public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

        @HmlPinActivity
        public Builder(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, findValueIteratorAndKey findvalueiteratorandkey, ServerProjectProvider.C70673 r4, LocalProjectProvider localProjectProvider, AbstractMultimap.EntrySet entrySet, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getFrontException getfrontexception) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.IconCompatParcelizer = findvalueiteratorandkey;
            this.MediaMetadataCompat = r4;
            this.MediaBrowserCompat$ItemReceiver = localProjectProvider;
            this.read = entrySet;
            this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = getfrontexception;
        }

        public final DebitCardResetOtpActivity IconCompatParcelizer() {
            return write(this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver());
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
            for (String equalsIgnoreCase : this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    @HmlPinActivity
    public StreetViewPanoramaOrientation(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, OnDeviceIdExtractor onDeviceIdExtractor, AbstractMultimap.AsMap.AsMapIterator asMapIterator, findValueIteratorAndKey findvalueiteratorandkey, AbstractMultimap.EntryIterator entryIterator, inject_extractorProvider inject_extractorprovider, HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver, getRegionName getregionname) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        this.RatingCompat = onDeviceIdExtractor;
        this.MediaSessionCompat$Token = asMapIterator;
        this.MediaBrowserCompat$CustomActionResultReceiver = findvalueiteratorandkey;
        this.MediaBrowserCompat$ItemReceiver = entryIterator;
        this.MediaMetadataCompat = inject_extractorprovider;
        this.MediaDescriptionCompat = hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver;
        this.read = getregionname;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return write(this.IconCompatParcelizer.write());
    }

    public final DebitCardResetOtpActivity<setStartCap> MediaBrowserCompat$ItemReceiver(zzro zzro) {
        return write(this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(zzro));
    }

    public final DebitCardResetOtpActivity<zzro> read() {
        return write(this.RatingCompat.write());
    }

    public final DebitCardResetOtpActivity write(long j, boolean z) {
        return write(this.MediaSessionCompat$Token.read(j, z));
    }

    public final PlacePhotoMetadataResult read(long j, boolean z) {
        List<PlacePhotoMetadataResult> write2 = this.MediaSessionCompat$Token.write();
        PlacePhotoMetadataResult MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
        if (z && MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            write2.add(0, MediaBrowserCompat$CustomActionResultReceiver2);
        }
        return IconCompatParcelizer(Long.valueOf(j), write2);
    }

    private PlacePhotoMetadataResult IconCompatParcelizer(Long l, List<PlacePhotoMetadataResult> list) {
        for (PlacePhotoMetadataResult next : list) {
            if (next.AppCompatViewInflater == l.longValue()) {
                return next;
            }
            PlacePhotoMetadataResult IconCompatParcelizer2 = IconCompatParcelizer(l, next.setGroupDividerEnabled);
            if (IconCompatParcelizer2 != null) {
                return IconCompatParcelizer2;
            }
        }
        return null;
    }

    public final DebitCardResetOtpActivity read(standardRemove standardremove) {
        return write(this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(standardremove));
    }

    public final DebitCardResetOtpActivity write(toStringImpl tostringimpl) {
        return write(this.MediaSessionCompat$Token.write(tostringimpl));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("movieName")) {
                return write(this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(str));
            }
            if (jSONObject.has("campaignName")) {
                return write(this.read.MediaBrowserCompat$ItemReceiver(str));
            }
            return write(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(str));
        } catch (Exception e) {
            onCheckBoxClick.write((Throwable) e);
            return write(DebitCardResetOtpActivity.error(new Throwable(e.getMessage())));
        }
    }
}
