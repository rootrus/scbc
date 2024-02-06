package p040o;

import p040o.registerForContextMenu;

/* renamed from: o.registerForContextMenu$MediaBrowserCompat$ItemReceiver */
final class registerForContextMenu$MediaBrowserCompat$ItemReceiver implements getMicrAmount {
    private final registerForContextMenu.write IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    Class<?> write;

    registerForContextMenu$MediaBrowserCompat$ItemReceiver(registerForContextMenu.write write2) {
        this.IconCompatParcelizer = write2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof registerForContextMenu$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        registerForContextMenu$MediaBrowserCompat$ItemReceiver registerforcontextmenu_mediabrowsercompat_itemreceiver = (registerForContextMenu$MediaBrowserCompat$ItemReceiver) obj;
        if (this.MediaBrowserCompat$ItemReceiver == registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver && this.write == registerforcontextmenu_mediabrowsercompat_itemreceiver.write) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Key{size=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("array=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        registerForContextMenu.write write2 = this.IconCompatParcelizer;
        if (write2.read.size() < 20) {
            write2.read.offer(this);
        }
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        Class<?> cls = this.write;
        return (i * 31) + (cls != null ? cls.hashCode() : 0);
    }
}
