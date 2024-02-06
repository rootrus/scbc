package p040o;

/* renamed from: o.AppMeasurementInstallReferrerReceiver */
public final class AppMeasurementInstallReferrerReceiver extends IndoorBuilding {
    private C7515tZ MediaBrowserCompat$CustomActionResultReceiver;
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;
    private classificationConfidence write;

    @HmlPinActivity
    public AppMeasurementInstallReferrerReceiver(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, C7515tZ tZVar, classificationConfidence classificationconfidence, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$CustomActionResultReceiver = tZVar;
        this.write = classificationconfidence;
        this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final DebitCardResetOtpActivity write(String str, String str2) {
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str, str2));
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(String str) {
        return write(this.write.write(str, (String) null));
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(Interners interners) {
        return write(this.write.MediaBrowserCompat$ItemReceiver(interners));
    }
}
