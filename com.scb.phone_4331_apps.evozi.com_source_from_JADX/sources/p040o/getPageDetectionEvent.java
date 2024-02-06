package p040o;

import p040o.CheckCaptureExperience;
import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPageDetectionEvent */
public final /* synthetic */ class getPageDetectionEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CheckCaptureExperience.C11501 read;
    private final /* synthetic */ getPanoramaCamera write;

    public /* synthetic */ getPageDetectionEvent(CheckCaptureExperience.C11501 r1, getPanoramaCamera getpanoramacamera) {
        this.read = r1;
        this.write = getpanoramacamera;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureExperience.C11501 r0 = this.read;
        getPanoramaCamera getpanoramacamera = this.write;
        StandardTable.Column.Values.C38221 IconCompatParcelizer = CheckCaptureExperience.this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) getpanoramacamera, "securitiesRegistrationsOtp");
        String IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", getpanoramacamera.write));
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "transformToDateMonthYear…Otp.transactionDateTime))");
        String str = getpanoramacamera.read;
        String str2 = getpanoramacamera.MediaBrowserCompat$ItemReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getpanoramacamera.MediaBrowserCompat$CustomActionResultReceiver, true);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "transformDepositAccountN…tionsOtp.accountNo, true)");
        ((getFaceImageField) obj).IconCompatParcelizer(new persistEvent(IconCompatParcelizer2, str, str2, MediaBrowserCompat$CustomActionResultReceiver, getpanoramacamera.IconCompatParcelizer));
    }
}
