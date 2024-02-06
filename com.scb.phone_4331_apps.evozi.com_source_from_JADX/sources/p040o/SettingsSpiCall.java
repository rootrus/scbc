package p040o;

import java.util.List;
import p040o.C4414f_;
import p040o.asEnumeration;
import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsSpiCall */
public final class SettingsSpiCall extends writeUInt64NoTag<C6380xa0b57534> {
    private final asEnumeration read;
    public String write;

    /* renamed from: o.SettingsSpiCall$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends sameThreadExecutor>, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ SettingsSpiCall write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(SettingsSpiCall settingsSpiCall) {
            super(1);
            this.write = settingsSpiCall;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final List list = (List) obj;
            onGetStartedClick.write((Object) list, "list");
            SettingsSpiCall settingsSpiCall = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C6380xa0b57534>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((C6380xa0b57534) obj).read(list);
                }
            };
            if (settingsSpiCall.RatingCompat != null) {
                r1.IconCompatParcelizer(settingsSpiCall.RatingCompat);
            }
            SettingsSpiCall.IconCompatParcelizer(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public SettingsSpiCall(asEnumeration asenumeration, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) asenumeration, "bankingAgentsController");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = asenumeration;
    }

    public static final /* synthetic */ void IconCompatParcelizer(SettingsSpiCall settingsSpiCall) {
        if (settingsSpiCall.RatingCompat != null) {
            settingsSpiCall.RatingCompat.ay_();
        }
    }

    public final void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        asEnumeration asenumeration = this.read;
        String str = this.write;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("postingType");
        }
        FundFactSheetActivity read2 = new read(this);
        FundFactSheetActivity settingsSpiCall$MediaBrowserCompat$ItemReceiver = new SettingsSpiCall$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) str, "postingType");
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) settingsSpiCall$MediaBrowserCompat$ItemReceiver, "onError");
        asenumeration.write.read(read2, settingsSpiCall$MediaBrowserCompat$ItemReceiver, new C4414f_.write(str), new asEnumeration.write(asenumeration), asenumeration.MediaBrowserCompat$ItemReceiver);
    }
}
