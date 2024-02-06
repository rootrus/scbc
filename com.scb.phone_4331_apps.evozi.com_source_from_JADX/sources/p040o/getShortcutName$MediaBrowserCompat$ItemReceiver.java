package p040o;

import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.getShortcutName;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.getShortcutName$MediaBrowserCompat$ItemReceiver */
public final class getShortcutName$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getShortcutName MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getShortcutName$MediaBrowserCompat$ItemReceiver(getShortcutName getshortcutname) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = getshortcutname;
    }

    public final /* synthetic */ Object invoke() {
        LinkedListMultimap.C35754.C35761.C35771 read = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        FundFactSheetActivity r1 = new FundFactSheetActivity<zzjx.zza.C10770zza, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ getShortcutName$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                final zzjx.zza.C10770zza zza = (zzjx.zza.C10770zza) obj;
                onGetStartedClick.write((Object) zza, "flags");
                getShortcutName getshortcutname = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer>() {
                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        getShortcutName.read.write write2 = getShortcutName.read.Companion;
                        ((newOnDevicePassportDeserializer) obj).read(getShortcutName.read.write.write(zza.MediaBrowserCompat$ItemReceiver, zza.read));
                    }
                };
                if (getshortcutname.RatingCompat != null) {
                    r1.IconCompatParcelizer(getshortcutname.RatingCompat);
                }
                getShortcutName.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        };
        FundFactSheetActivity r2 = new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
            final /* synthetic */ getShortcutName$MediaBrowserCompat$ItemReceiver read;

            {
                this.read = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                final Throwable th = (Throwable) obj;
                onGetStartedClick.write((Object) th, "throwable");
                getShortcutName getshortcutname = this.read.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer>(this) {
                    private /* synthetic */ C99843 MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    }
                };
                if (getshortcutname.RatingCompat != null) {
                    r1.IconCompatParcelizer(getshortcutname.RatingCompat);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        };
        onGetStartedClick.write((Object) r1, "onSuccess");
        onGetStartedClick.write((Object) r2, "onError");
        setExpandedTitleTextAppearance setexpandedtitletextappearance = read.IconCompatParcelizer;
        setexpandedtitletextappearance.write(setexpandedtitletextappearance.IconCompatParcelizer(), new LinkedListMultimap.C35754.C35761.C35771.write(r2, r1));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
