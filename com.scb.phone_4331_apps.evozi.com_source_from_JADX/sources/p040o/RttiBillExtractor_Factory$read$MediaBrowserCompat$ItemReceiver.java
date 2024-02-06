package p040o;

import p040o.RttiBillExtractor_Factory;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.RttiBillExtractor_Factory$read$MediaBrowserCompat$ItemReceiver */
final class RttiBillExtractor_Factory$read$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setTitle> {
    private /* synthetic */ RttiBillExtractor_Factory.read read;

    RttiBillExtractor_Factory$read$MediaBrowserCompat$ItemReceiver(RttiBillExtractor_Factory.read read2) {
        this.read = read2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckedFuture unused = RttiBillExtractor_Factory.this.f3161x50fd9e4a;
        ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver(CheckedFuture.write(RttiBillExtractor_Factory.this.read, RttiBillExtractor_Factory.this.MediaBrowserCompat$SearchResultReceiver), RttiBillExtractor_Factory.this.MediaBrowserCompat$MediaItem);
    }
}
