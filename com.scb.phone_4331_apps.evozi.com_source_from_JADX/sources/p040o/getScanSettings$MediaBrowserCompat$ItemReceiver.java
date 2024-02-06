package p040o;

import p040o.CrashlyticsController;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.getScanSettings$MediaBrowserCompat$ItemReceiver */
public final class getScanSettings$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getScanSettings IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getScanSettings$MediaBrowserCompat$ItemReceiver(getScanSettings getscansettings) {
        super(1);
        this.IconCompatParcelizer = getscansettings;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        MediaBrowserCompat$ItemReceiver((String) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(final String str) {
        int i = StartJobResponse.MediaBrowserCompat$ItemReceiver[this.IconCompatParcelizer.read().ordinal()];
        boolean z = false;
        if (i == 1) {
            getScanSettings getscansettings = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C46492.read;
            if (getscansettings.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getscansettings.RatingCompat);
            }
        } else if (i == 2) {
            getScanSettings getscansettings2 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C46515.IconCompatParcelizer;
            if (getscansettings2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getscansettings2.RatingCompat);
            }
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzcz.zzg>(this) {
            final /* synthetic */ getScanSettings$MediaBrowserCompat$ItemReceiver read;

            /* renamed from: o.getScanSettings$MediaBrowserCompat$ItemReceiver$3$IconCompatParcelizer */
            static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerRtti> {
                private /* synthetic */ C46503 IconCompatParcelizer;
                private /* synthetic */ CrashlyticsController.C322216 read;

                IconCompatParcelizer(C46503 r1, CrashlyticsController.C322216 r2) {
                    this.IconCompatParcelizer = r1;
                    this.read = r2;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    proxyGetIPassportDeserializerRtti proxygetipassportdeserializerrtti = (proxyGetIPassportDeserializerRtti) obj;
                    proxygetipassportdeserializerrtti.MediaBrowserCompat$ItemReceiver(this.read);
                    proxygetipassportdeserializerrtti.read(this.IconCompatParcelizer.read.IconCompatParcelizer.read());
                    if (this.read.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        proxygetipassportdeserializerrtti.IconCompatParcelizer(this.read.MediaBrowserCompat$CustomActionResultReceiver.read, this.read.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
                    }
                    CharSequence charSequence = str;
                    if (charSequence == null || GoodToKnowActivity.read(charSequence)) {
                        proxygetipassportdeserializerrtti.MediaBrowserCompat$ItemReceiver();
                    } else {
                        proxygetipassportdeserializerrtti.read(str);
                    }
                }
            }

            {
                this.read = r1;
            }

            public final /* synthetic */ void onNext(Object obj) {
                zzcz.zzg zzg = (zzcz.zzg) obj;
                onGetStartedClick.write((Object) zzg, "hmlCalculateLoan");
                super.onNext(zzg);
                this.read.IconCompatParcelizer.read = zzg;
                CrashlyticsController.C322216 IconCompatParcelizer2 = this.read.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(zzg);
                getScanSettings getscansettings = this.read.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, IconCompatParcelizer2);
                if (getscansettings.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(getscansettings.RatingCompat);
                }
                getScanSettings.MediaBrowserCompat$ItemReceiver(this.read.IconCompatParcelizer);
            }

            public final void onError(Throwable th) {
                onGetStartedClick.write((Object) th, "e");
                super.onError(th);
                this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        });
    }
}
