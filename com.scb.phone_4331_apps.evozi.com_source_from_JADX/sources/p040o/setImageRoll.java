package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;
import p040o.zzcb;

/* renamed from: o.setImageRoll */
public final /* synthetic */ class setImageRoll implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzcb.zze IconCompatParcelizer;
    private final /* synthetic */ getBitsPerChannel$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ setImageRoll(getBitsPerChannel$MediaBrowserCompat$ItemReceiver getbitsperchannel_mediabrowsercompat_itemreceiver, zzcb.zze zze) {
        this.read = getbitsperchannel_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = zze;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBitsPerChannel$MediaBrowserCompat$ItemReceiver getbitsperchannel_mediabrowsercompat_itemreceiver = this.read;
        ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).write(getbitsperchannel_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer), getbitsperchannel_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
    }
}
