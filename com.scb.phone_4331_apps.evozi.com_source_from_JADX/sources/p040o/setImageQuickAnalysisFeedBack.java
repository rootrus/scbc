package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.getBitsPerChannel;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageQuickAnalysisFeedBack */
public final /* synthetic */ class setImageQuickAnalysisFeedBack implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getBitsPerChannel.write MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ onCircleClick write;

    public /* synthetic */ setImageQuickAnalysisFeedBack(getBitsPerChannel.write write2, onCircleClick oncircleclick) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.write = oncircleclick;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBitsPerChannel.write write2 = this.MediaBrowserCompat$ItemReceiver;
        ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).read(getBitsPerChannel.this.PlaybackStateCompat$CustomAction.read(getBitsPerChannel.this.MediaSessionCompat$ResultReceiverWrapper.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_verification_ncb_consent_label), this.write, true, false, "NCB_CONSENT"));
    }
}
