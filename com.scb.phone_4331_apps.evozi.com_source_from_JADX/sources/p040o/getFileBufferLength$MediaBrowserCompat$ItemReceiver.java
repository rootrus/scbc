package p040o;

import p040o.getFileBufferLength;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFileBufferLength$MediaBrowserCompat$ItemReceiver */
public final class getFileBufferLength$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<BytesBackedNativeSessionFile, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getFileBufferLength MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getFileBufferLength$MediaBrowserCompat$ItemReceiver(getFileBufferLength getfilebufferlength) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = getfilebufferlength;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final BytesBackedNativeSessionFile bytesBackedNativeSessionFile = (BytesBackedNativeSessionFile) obj;
        onGetStartedClick.write((Object) bytesBackedNativeSessionFile, "operativeAccountDisplay");
        getFileBufferLength.write(this.MediaBrowserCompat$CustomActionResultReceiver, bytesBackedNativeSessionFile);
        getFileBufferLength getfilebufferlength = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<Bill>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                Bill bill = (Bill) obj;
                bill.aj_();
                bill.IconCompatParcelizer(bytesBackedNativeSessionFile.IconCompatParcelizer);
            }
        };
        boolean z = true;
        if (getfilebufferlength.RatingCompat != null) {
            r1.IconCompatParcelizer(getfilebufferlength.RatingCompat);
        }
        getFileBufferLength getfilebufferlength2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getfilebufferlength2.read()) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFileBufferLength$MediaBrowserCompat$SearchResultReceiver.read;
            if (getfilebufferlength2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getfilebufferlength2.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFileBufferLength.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfilebufferlength2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getfilebufferlength2.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
