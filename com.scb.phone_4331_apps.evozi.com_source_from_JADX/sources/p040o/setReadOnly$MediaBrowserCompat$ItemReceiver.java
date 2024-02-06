package p040o;

import p040o.immediateFailedCheckedFuture;
import p040o.writeUInt64NoTag;

/* renamed from: o.setReadOnly$MediaBrowserCompat$ItemReceiver */
public final class setReadOnly$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ setReadOnly write;

    public setReadOnly$MediaBrowserCompat$ItemReceiver(setReadOnly setreadonly) {
        this.write = setreadonly;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFieldSetter getfieldsetter = this.write.write;
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_ncb_consent_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_ncb_consent_text);
        IconCompatParcelizer.IconCompatParcelizer = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_ncb_consent_positive);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_decline_ncb_consent_negative);
        immediateFailedCheckedFuture immediatefailedcheckedfuture = new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) immediatefailedcheckedfuture, "hmlConsentDisplayMapper.…formDeclineAlertDisplay()");
        ((PointDouble) obj).read(immediatefailedcheckedfuture, this.write.read.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
