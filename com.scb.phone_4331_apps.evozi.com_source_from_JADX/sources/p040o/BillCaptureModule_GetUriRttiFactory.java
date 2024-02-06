package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetUriRttiFactory */
public final /* synthetic */ class BillCaptureModule_GetUriRttiFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ RttiBillExtractor$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BillCaptureModule_GetUriRttiFactory(RttiBillExtractor$MediaBrowserCompat$ItemReceiver rttiBillExtractor$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = rttiBillExtractor$MediaBrowserCompat$ItemReceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiBillExtractor$MediaBrowserCompat$ItemReceiver rttiBillExtractor$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        CheckedFuture unused = rttiBillExtractor$MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$QueueItem;
        ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver(CheckedFuture.write(rttiBillExtractor$MediaBrowserCompat$ItemReceiver.read.MediaMetadataCompat, rttiBillExtractor$MediaBrowserCompat$ItemReceiver.read.write), rttiBillExtractor$MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$ResultReceiverWrapper);
    }
}
