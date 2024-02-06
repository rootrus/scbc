package p040o;

/* renamed from: o.onClickChange */
public final class onClickChange implements MwManageReceivingAccountActivity {
    final onBoardingInAppClick MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    public onClickChange(onBoardingInAppClick onboardinginappclick) {
        onGetStartedClick.write((Object) onboardinginappclick, "list");
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardinginappclick;
    }

    public final onBoardingInAppClick read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        return MwChangeCasaSuccessActivity.MediaBrowserCompat$ItemReceiver() ? this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer("New") : super.toString();
    }
}
