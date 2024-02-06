package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.aj */
public final /* synthetic */ class C9854aj implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver read;

    /* renamed from: o.aj$a */
    public final /* synthetic */ class C9855a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ onMarkerDragEnd MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C9855a(onMarkerDragEnd onmarkerdragend) {
            this.MediaBrowserCompat$ItemReceiver = onmarkerdragend;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getBarcodes) obj).read(Boolean.valueOf(this.MediaBrowserCompat$ItemReceiver.read), Boolean.valueOf(this.MediaBrowserCompat$ItemReceiver.write));
        }
    }

    public /* synthetic */ C9854aj(addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver) {
        this.read = addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver;
    }

    public final boolean write(Object obj) {
        addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver = this.read;
        return ((setAlwaysShow) obj).MediaBrowserCompat$MediaItem.equals(addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver.IconCompatParcelizer.read).RatingCompat);
    }
}
