package p040o;

/* renamed from: o.uploadCroppedImage */
public final class uploadCroppedImage extends clickManageShopInfo<onDoneNicknameClick> implements MediaImagePreviewActivity {
    public final MaintenanceActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uploadCroppedImage(onDoneNicknameClick ondonenicknameclick, MaintenanceActivity maintenanceActivity) {
        super(ondonenicknameclick);
        onGetStartedClick.write((Object) ondonenicknameclick, "parent");
        onGetStartedClick.write((Object) maintenanceActivity, "childJob");
        this.MediaBrowserCompat$CustomActionResultReceiver = maintenanceActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write((MwOnboardInfoActivity_ViewBinding) this.IconCompatParcelizer);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        onGetStartedClick.write((Object) th, "cause");
        return ((onDoneNicknameClick) this.IconCompatParcelizer).read(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildHandle[");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write((MwOnboardInfoActivity_ViewBinding) this.IconCompatParcelizer);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
