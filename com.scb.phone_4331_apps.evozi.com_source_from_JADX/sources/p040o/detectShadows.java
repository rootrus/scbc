package p040o;

import p040o.AppMeasurement;
import p040o.writeUInt64NoTag;

/* renamed from: o.detectShadows */
public final class detectShadows extends writeUInt64NoTag<getCompressedRearImageSize> {
    public final including IconCompatParcelizer;
    public final nullToEmpty MediaBrowserCompat$ItemReceiver;
    public final getRootCause MediaDescriptionCompat;
    public final AppMeasurement.Event read;
    public final synchronizedSupplier write;

    /* renamed from: o.detectShadows$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getCompressedRearImageSize) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.detectShadows$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        private /* synthetic */ String read;

        public MediaMetadataCompat(String str) {
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity;
            getCompressedRearImageSize getcompressedrearimagesize = (getCompressedRearImageSize) obj;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "th", (Object) this.read)) {
                getcompressedrearimagesize.read();
                hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                hmlVerifyPhoneValidateOtpActivity = null;
            }
            if (hmlVerifyPhoneValidateOtpActivity == null) {
                getcompressedrearimagesize.MediaBrowserCompat$CustomActionResultReceiver();
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
    }

    /* renamed from: o.detectShadows$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public RatingCompat(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getCompressedRearImageSize) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.detectShadows$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getCompressedRearImageSize) obj).write();
        }
    }

    /* renamed from: o.detectShadows$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getCompressedRearImageSize) obj).write();
        }
    }

    /* renamed from: o.detectShadows$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getCompressedRearImageSize> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getCompressedRearImageSize) obj).write(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public detectShadows(RegularImmutableBiMap regularImmutableBiMap, AppMeasurement.Event event, including including, getRootCause getrootcause, synchronizedSupplier synchronizedsupplier, nullToEmpty nulltoempty) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) event, "privacyNoticeCase");
        onGetStartedClick.write((Object) including, "cxpCase");
        onGetStartedClick.write((Object) getrootcause, "registrationTcCase");
        onGetStartedClick.write((Object) synchronizedsupplier, "registrationPersonalInfoCase");
        onGetStartedClick.write((Object) nulltoempty, "allowRegistrationCase");
        this.read = event;
        this.IconCompatParcelizer = including;
        this.MediaDescriptionCompat = getrootcause;
        this.write = synchronizedsupplier;
        this.MediaBrowserCompat$ItemReceiver = nulltoempty;
    }
}
