package p040o;

import java.util.List;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.Image$BitmapDataObject$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3463x6a16d4e extends CheckEligibilityActivity implements FundFactSheetActivity<newContinuation, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ Image.BitmapDataObject IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3463x6a16d4e(Image.BitmapDataObject bitmapDataObject) {
        super(1);
        this.IconCompatParcelizer = bitmapDataObject;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final newContinuation newcontinuation = (newContinuation) obj;
        onGetStartedClick.write((Object) newcontinuation, "it");
        Image.BitmapDataObject bitmapDataObject = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCard>(this) {
            private /* synthetic */ C3463x6a16d4e read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                CreditCard creditCard = (CreditCard) obj;
                creditCard.aj_();
                this.read.IconCompatParcelizer.write = newcontinuation.read;
                ignoreResult ignoreresult = newcontinuation.IconCompatParcelizer;
                if (ignoreresult != null) {
                    List<String> MediaBrowserCompat$CustomActionResultReceiver = this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(newcontinuation.read);
                    List MediaBrowserCompat$CustomActionResultReceiver2 = Image.BitmapDataObject.MediaBrowserCompat$ItemReceiver(ignoreresult.MediaBrowserCompat$MediaItem);
                    creditCard.read(MediaBrowserCompat$CustomActionResultReceiver);
                    creditCard.write((List<String>) MediaBrowserCompat$CustomActionResultReceiver2);
                    creditCard.MediaBrowserCompat$CustomActionResultReceiver(Image.BitmapDataObject.MediaBrowserCompat$ItemReceiver(this.read.IconCompatParcelizer, ignoreresult), MediaBrowserCompat$CustomActionResultReceiver2.indexOf(ignoreresult.RatingCompat), MediaBrowserCompat$CustomActionResultReceiver.indexOf(ignoreresult.MediaBrowserCompat$ItemReceiver));
                    Image.BitmapDataObject.MediaBrowserCompat$CustomActionResultReceiver(this.read.IconCompatParcelizer);
                }
            }
        };
        if (bitmapDataObject.RatingCompat != null) {
            r1.IconCompatParcelizer(bitmapDataObject.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
