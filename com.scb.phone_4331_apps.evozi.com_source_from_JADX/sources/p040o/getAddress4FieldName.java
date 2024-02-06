package p040o;

import com.scb.phone.data.network.service.FindUsService;
import java.util.List;
import p040o.GoogleMap;
import p040o.Lists;
import p040o.access$2300;
import p040o.newOnDeviceIdExtractor;
import p040o.onNotNowClick;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress4FieldName */
public final class getAddress4FieldName extends writeUInt64NoTag<newOnDeviceIdExtractor.write> {
    public List<GoogleMap.OnCircleClickListener> IconCompatParcelizer;
    public final Lists.CharSequenceAsList MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final LittleEndianDataInputStream read;

    /* renamed from: o.getAddress4FieldName$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getAddress4FieldName IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(getAddress4FieldName getaddress4fieldname) {
            super(1);
            this.IconCompatParcelizer = getaddress4fieldname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getAddress4FieldName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newOnDeviceIdExtractor.write> {
        private /* synthetic */ onNotNowClick.read MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ GoogleMap.OnCircleClickListener write;

        public write(onNotNowClick.read read, GoogleMap.OnCircleClickListener onCircleClickListener) {
            this.MediaBrowserCompat$CustomActionResultReceiver = read;
            this.write = onCircleClickListener;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newOnDeviceIdExtractor.write) obj).IconCompatParcelizer((generateBinaryImagesJsonString) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, getLibraryFile.MORE_OPTIONS, this.write.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public static final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver(getAddress4FieldName getaddress4fieldname) {
        List<GoogleMap.OnCircleClickListener> list = getaddress4fieldname.IconCompatParcelizer;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrivacyList");
        }
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getAddress4FieldName(Lists.CharSequenceAsList charSequenceAsList, LittleEndianDataInputStream littleEndianDataInputStream, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) charSequenceAsList, "mController");
        onGetStartedClick.write((Object) littleEndianDataInputStream, "mPrivacyManagementLandingMapper");
        this.MediaBrowserCompat$ItemReceiver = charSequenceAsList;
        this.read = littleEndianDataInputStream;
    }

    /* renamed from: o.getAddress4FieldName$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public FindUsService IconCompatParcelizer;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(FindUsService findUsService) {
            this.IconCompatParcelizer = findUsService;
        }
    }

    public static final /* synthetic */ void write(getAddress4FieldName getaddress4fieldname) {
        if (getaddress4fieldname.RatingCompat != null) {
            getaddress4fieldname.RatingCompat.aj_();
        }
    }
}
