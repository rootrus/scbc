package p040o;

import java.nio.ByteBuffer;
import p040o.onCreateOptionsMenu;

/* renamed from: o.setExitTransition */
public final class setExitTransition<Data> implements setSharedElementEnterTransition<byte[], Data> {
    private final setExitTransition$MediaBrowserCompat$ItemReceiver<Data> MediaBrowserCompat$CustomActionResultReceiver;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        byte[] bArr = (byte[]) obj;
        return new C1536x6a517a85(new unregisterListener(bArr), new write(bArr, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public setExitTransition(setExitTransition$MediaBrowserCompat$ItemReceiver<Data> setexittransition_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setexittransition_mediabrowsercompat_itemreceiver;
    }

    /* renamed from: o.setExitTransition$write */
    static class write<Data> implements onCreateOptionsMenu<Data> {
        private final setExitTransition$MediaBrowserCompat$ItemReceiver<Data> IconCompatParcelizer;
        private final byte[] read;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void read() {
        }

        write(byte[] bArr, setExitTransition$MediaBrowserCompat$ItemReceiver<Data> setexittransition_mediabrowsercompat_itemreceiver) {
            this.read = bArr;
            this.IconCompatParcelizer = setexittransition_mediabrowsercompat_itemreceiver;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
            iconCompatParcelizer.read(this.IconCompatParcelizer.write(this.read));
        }

        public final Class<Data> write() {
            return this.IconCompatParcelizer.IconCompatParcelizer();
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }

    /* renamed from: o.setExitTransition$read */
    public static class read implements setReenterTransition<byte[], ByteBuffer> {
        public final setSharedElementEnterTransition<byte[], ByteBuffer> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setExitTransition(new setExitTransition$MediaBrowserCompat$ItemReceiver<ByteBuffer>() {
                public final Class<ByteBuffer> IconCompatParcelizer() {
                    return ByteBuffer.class;
                }

                public final /* synthetic */ Object write(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }
}
