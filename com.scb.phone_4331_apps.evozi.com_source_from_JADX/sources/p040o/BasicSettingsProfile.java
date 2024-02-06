package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.BasicSettingsProfile */
public final /* synthetic */ class BasicSettingsProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.BasicSettingsProfile$CropType */
    public final /* synthetic */ class CropType implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getNextExpirable write;

        public /* synthetic */ CropType(getNextExpirable getnextexpirable) {
            this.write = getnextexpirable;
        }

        public final void IconCompatParcelizer(Object obj) {
            setMicrData.write(this.write, (CheckExtractActivity_MembersInjector.RatingCompat) obj);
        }
    }

    /* renamed from: o.BasicSettingsProfile$RotateType */
    public final /* synthetic */ class RotateType implements getAllowReturnTransitionOverlap {
        public static final /* synthetic */ RotateType write = new RotateType();

        private /* synthetic */ RotateType() {
        }

        public final boolean write(Object obj) {
            return "FRONT_END_FEE".equals(((setDataCollectionEnabled) obj).MediaBrowserCompat$ItemReceiver);
        }
    }

    public /* synthetic */ BasicSettingsProfile(getLegacySharedPrefs getlegacysharedprefs) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.AppCompatViewInflater) obj).write();
    }

    /* renamed from: o.BasicSettingsProfile$FriendBSP */
    public final /* synthetic */ class FriendBSP implements FundFactSheetActivity {
        private final /* synthetic */ getNextExpirable MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ setMicrData read;

        public /* synthetic */ FriendBSP(setMicrData setmicrdata, getNextExpirable getnextexpirable) {
            this.read = setmicrdata;
            this.MediaBrowserCompat$ItemReceiver = getnextexpirable;
        }

        public final Object invoke(Object obj) {
            setMicrData setmicrdata = this.read;
            CropType cropType = new CropType(this.MediaBrowserCompat$ItemReceiver);
            if (setmicrdata.RatingCompat != null) {
                cropType.IconCompatParcelizer(setmicrdata.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.BasicSettingsProfile$OutputBitDepth */
    public final /* synthetic */ class OutputBitDepth implements FundFactSheetActivity {
        private final /* synthetic */ setMicrData write;

        public /* synthetic */ OutputBitDepth(setMicrData setmicrdata) {
            this.write = setmicrdata;
        }

        public final Object invoke(Object obj) {
            setMicrData setmicrdata = this.write;
            setmicrdata.MediaBrowserCompat$ItemReceiver(setmicrdata.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
