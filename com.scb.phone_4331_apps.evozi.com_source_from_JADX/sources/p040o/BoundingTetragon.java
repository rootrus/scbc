package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.BoundingTetragon */
public final /* synthetic */ class BoundingTetragon implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ BoundingTetragon MediaBrowserCompat$ItemReceiver = new BoundingTetragon();

    /* renamed from: o.BoundingTetragon$Rotation */
    public final /* synthetic */ class Rotation implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Rotation MediaBrowserCompat$ItemReceiver = new Rotation();

        private /* synthetic */ Rotation() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C6393xc7fe0382) obj).write(true);
        }
    }

    private /* synthetic */ BoundingTetragon() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6393xc7fe0382) obj).IconCompatParcelizer(false);
    }

    /* renamed from: o.BoundingTetragon$FriendBT */
    public final /* synthetic */ class FriendBT implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ Image$1$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ FriendBT(Image$1$MediaBrowserCompat$CustomActionResultReceiver image$1$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = image$1$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final void IconCompatParcelizer(Object obj) {
            Image$1$MediaBrowserCompat$CustomActionResultReceiver image$1$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
            ((C6393xc7fe0382) obj).read(image$1$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write, image$1$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, image$1$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }
}
