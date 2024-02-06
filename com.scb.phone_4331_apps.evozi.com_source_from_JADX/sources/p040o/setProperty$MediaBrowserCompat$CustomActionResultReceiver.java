package p040o;

import p040o.immediateFailedCheckedFuture;
import p040o.writeUInt64NoTag;

/* renamed from: o.setProperty$MediaBrowserCompat$CustomActionResultReceiver */
public final class setProperty$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIJsonExactionHelperKtaFactory> {
    private /* synthetic */ setProperty IconCompatParcelizer;

    public setProperty$MediaBrowserCompat$CustomActionResultReceiver(setProperty setproperty) {
        this.IconCompatParcelizer = setproperty;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFieldSetter getfieldsetter = this.IconCompatParcelizer.write;
        immediateFailedCheckedFuture.read IconCompatParcelizer2 = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer2.read = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_sensitive_consent_title);
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_sensitive_consent_text);
        IconCompatParcelizer2.IconCompatParcelizer = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_sensitive_consent_positive);
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_sensitive_consent_negative);
        immediateFailedCheckedFuture immediatefailedcheckedfuture = new immediateFailedCheckedFuture(IconCompatParcelizer2, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) immediatefailedcheckedfuture, "hmlConsentDisplayMapper.…DeclineSensitiveDisplay()");
        ((PassportCaptureModule_GetIJsonExactionHelperKtaFactory) obj).read(immediatefailedcheckedfuture, this.IconCompatParcelizer.read.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
