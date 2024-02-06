package p040o;

import android.os.RemoteException;
import p040o.setPopupBackgroundResource;

/* renamed from: o.setPopupBackgroundResource$MediaBrowserCompat$CustomActionResultReceiver */
class C7466xc08e0473 implements setPopupBackgroundResource.IconCompatParcelizer {
    final String IconCompatParcelizer;
    final String MediaBrowserCompat$CustomActionResultReceiver;
    final int read;
    final boolean write = false;

    C7466xc08e0473(String str, int i, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = i;
        this.IconCompatParcelizer = str2;
    }

    public void MediaBrowserCompat$ItemReceiver(read read2) throws RemoteException {
        if (this.write) {
            read2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            read2.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.IconCompatParcelizer);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CancelTask[");
        sb.append("packageName:");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", id:");
        sb.append(this.read);
        sb.append(", tag:");
        sb.append(this.IconCompatParcelizer);
        sb.append(", all:");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }
}
