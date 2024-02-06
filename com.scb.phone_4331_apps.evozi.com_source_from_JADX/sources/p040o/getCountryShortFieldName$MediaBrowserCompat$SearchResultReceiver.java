package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCountryShortFieldName$MediaBrowserCompat$SearchResultReceiver */
final class getCountryShortFieldName$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getCountryShortFieldName MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getCountryShortFieldName$MediaBrowserCompat$SearchResultReceiver(getCountryShortFieldName getcountryshortfieldname) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = getcountryshortfieldname;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        getCountryShortFieldName.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        getCountryShortFieldName getcountryshortfieldname = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1248xd65c1f32>(this) {
            private /* synthetic */ getCountryShortFieldName$MediaBrowserCompat$SearchResultReceiver write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C1248xd65c1f32) obj).write(this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        };
        if (getcountryshortfieldname.RatingCompat != null) {
            r1.IconCompatParcelizer(getcountryshortfieldname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
