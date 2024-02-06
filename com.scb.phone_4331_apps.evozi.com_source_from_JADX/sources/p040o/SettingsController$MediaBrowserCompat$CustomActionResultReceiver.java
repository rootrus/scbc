package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsController$MediaBrowserCompat$CustomActionResultReceiver */
public final class SettingsController$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ boolean read;
    final /* synthetic */ SettingsController write;

    public SettingsController$MediaBrowserCompat$CustomActionResultReceiver(SettingsController settingsController, boolean z, boolean z2, boolean z3, boolean z4) {
        this.write = settingsController;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z3;
        this.read = z4;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getTopRightCornerHeight gettoprightcornerheight = (getTopRightCornerHeight) obj;
        gettoprightcornerheight.MediaBrowserCompat$ItemReceiver(new CrashlyticsController.BlockingCrashEventListener(!this.IconCompatParcelizer, !this.MediaBrowserCompat$ItemReceiver && !this.MediaBrowserCompat$CustomActionResultReceiver, true ^ this.read), new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ SettingsController$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke() {
                this.IconCompatParcelizer.write.read();
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }, new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ SettingsController$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke() {
                SettingsController.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer.write);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        });
        gettoprightcornerheight.aj_();
    }
}
