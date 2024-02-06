package p040o;

import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import java.util.List;
import p040o.Collections2;

/* renamed from: o.LatLngBounds */
public final class LatLngBounds extends IndoorBuilding {
    private int MediaBrowserCompat$CustomActionResultReceiver = 4;
    public IdType MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.LatLngBounds$Builder */
    public class Builder extends IndoorBuilding {
        public C7514tY IconCompatParcelizer;

        public Builder(C7514tY tYVar, CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.IconCompatParcelizer = tYVar;
        }

        public final String write(String str) throws Exception {
            PlaceBuffer MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            String str2 = "";
            if (MediaBrowserCompat$ItemReceiver == null) {
                return str2;
            }
            C1189xa6547b7b fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper = new C1189xa6547b7b();
            String str3 = MediaBrowserCompat$ItemReceiver.write;
            if (str3 != null) {
                str2 = str3;
            }
            String write = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write(AlertController$RecycleListView.read(str2), MediaBrowserCompat$ItemReceiver.read, str, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
            if (fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write == 0) {
                return write;
            }
            throw new E2EEEncryptionException();
        }
    }

    @HmlPinActivity
    public LatLngBounds(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$ItemReceiver = idType;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        List<getStartCap> IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str);
        if (IconCompatParcelizer != null) {
            return write(DebitCardResetOtpActivity.just(IconCompatParcelizer));
        }
        IdType idType = this.MediaBrowserCompat$ItemReceiver;
        Collections2.TransformedCollection write = Collections2.TransformedCollection.write();
        write.MediaBrowserCompat$ItemReceiver = str;
        write.read = 1;
        DebitCardResetOtpActivity<getStartCap> IconCompatParcelizer2 = idType.IconCompatParcelizer(write);
        IdType idType2 = this.MediaBrowserCompat$ItemReceiver;
        Collections2.TransformedCollection write2 = Collections2.TransformedCollection.write();
        write2.MediaBrowserCompat$ItemReceiver = str;
        write2.read = 2;
        DebitCardResetOtpActivity<getStartCap> IconCompatParcelizer3 = idType2.IconCompatParcelizer(write2);
        IdType idType3 = this.MediaBrowserCompat$ItemReceiver;
        Collections2.TransformedCollection write3 = Collections2.TransformedCollection.write();
        write3.MediaBrowserCompat$ItemReceiver = str;
        write3.read = 3;
        DebitCardResetOtpActivity<getStartCap> IconCompatParcelizer4 = idType3.IconCompatParcelizer(write3);
        IdType idType4 = this.MediaBrowserCompat$ItemReceiver;
        Collections2.TransformedCollection write4 = Collections2.TransformedCollection.write();
        write4.MediaBrowserCompat$ItemReceiver = str;
        write4.read = 4;
        return write(DebitCardResetOtpActivity.zip(IconCompatParcelizer2, IconCompatParcelizer3, IconCompatParcelizer4, idType4.IconCompatParcelizer(write4), new IStreetViewPanoramaDelegate(this, str)).take((long) this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
