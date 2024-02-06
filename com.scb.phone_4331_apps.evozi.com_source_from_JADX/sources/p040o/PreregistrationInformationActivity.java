package p040o;

/* renamed from: o.PreregistrationInformationActivity */
public abstract class PreregistrationInformationActivity extends PreregistrationLandingActivity implements PrepaidResetPinSuccessActivity_ViewBinding {
    public PrepaidResetOtpActivity write;

    public final PrepaidResetOtpActivity IconCompatParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("Expect");
        return MediaBrowserCompat$CustomActionResultReceiver != null && "100-continue".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
    }

    public Object clone() throws CloneNotSupportedException {
        PreregistrationInformationActivity preregistrationInformationActivity = (PreregistrationInformationActivity) super.clone();
        PrepaidResetOtpActivity prepaidResetOtpActivity = this.write;
        if (prepaidResetOtpActivity != null) {
            preregistrationInformationActivity.write = (PrepaidResetOtpActivity) AlertController$RecycleListView.read(prepaidResetOtpActivity);
        }
        return preregistrationInformationActivity;
    }
}
