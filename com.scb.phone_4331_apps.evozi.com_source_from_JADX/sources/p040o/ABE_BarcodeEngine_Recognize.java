package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.writeUInt64NoTag;

/* renamed from: o.ABE_BarcodeEngine_Recognize */
public final /* synthetic */ class ABE_BarcodeEngine_Recognize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C9764x43753c2b IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ABE_BarcodeEngine_Recognize(C9764x43753c2b imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
        this.IconCompatParcelizer = imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9764x43753c2b imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        C6394xa3a265ac checkExtractActivity_MembersInjector$MenuItemWrapperICS$CollapsibleActionViewWrapper = (C6394xa3a265ac) obj;
        if (!(th instanceof RetrofitException) || checkExtractActivity_MembersInjector$MenuItemWrapperICS$CollapsibleActionViewWrapper.MediaBrowserCompat$ItemReceiver() == null) {
            imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getCheckDigitLocation(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver)));
            return;
        }
        String MediaMetadataCompat = checkExtractActivity_MembersInjector$MenuItemWrapperICS$CollapsibleActionViewWrapper.MediaBrowserCompat$ItemReceiver().MediaMetadataCompat();
        RetrofitException retrofitException = (RetrofitException) th;
        if (retrofitException.IconCompatParcelizer != null && retrofitException.IconCompatParcelizer.write != null) {
            String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
            String str2 = retrofitException.IconCompatParcelizer.write.write;
            String str3 = retrofitException.IconCompatParcelizer.write.read;
            char c = 65535;
            int hashCode = MediaMetadataCompat.hashCode();
            if (hashCode != -348127329) {
                if (hashCode == 2223327 && MediaMetadataCompat.equals("HOME")) {
                    c = 0;
                }
            } else if (MediaMetadataCompat.equals("PURPOSEFUL")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getCheckDigitLocation(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver)));
                } else if ("9201".equals(str)) {
                    checkExtractActivity_MembersInjector$MenuItemWrapperICS$CollapsibleActionViewWrapper.read(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver(str2, str3, imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write()));
                } else {
                    imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getCheckDigitLocation(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver)));
                }
            } else if ("9202".equals(str) || "9201".equals(str)) {
                checkExtractActivity_MembersInjector$MenuItemWrapperICS$CollapsibleActionViewWrapper.read(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver(str2, str3, imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write()));
            } else {
                imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getCheckDigitLocation(imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver)));
            }
        }
    }
}
