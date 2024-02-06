package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageSrcID */
public final /* synthetic */ class setImageSrcID implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver read;
    private final /* synthetic */ String write;

    public /* synthetic */ setImageSrcID(getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver getbitsperchannel_mediabrowsercompat_customactionresultreceiver, String str) {
        this.read = getbitsperchannel_mediabrowsercompat_customactionresultreceiver;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver getbitsperchannel_mediabrowsercompat_customactionresultreceiver = this.read;
        String str = this.write;
        toLongArray MediaBrowserCompat$CustomActionResultReceiver = getbitsperchannel_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction;
        onGetStartedClick.write((Object) str, "htmlText");
        ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver, (String) null, (String) null, str, (String) null, true, false, (String) null, 72));
    }
}
