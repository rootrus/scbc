package p040o;

import android.app.Notification;
import android.os.RemoteException;
import p040o.setPopupBackgroundResource;

/* renamed from: o.setPopupBackgroundResource$MediaBrowserCompat$ItemReceiver */
class setPopupBackgroundResource$MediaBrowserCompat$ItemReceiver implements setPopupBackgroundResource.IconCompatParcelizer {
    final String IconCompatParcelizer;
    final int MediaBrowserCompat$ItemReceiver;
    final Notification read;
    final String write;

    setPopupBackgroundResource$MediaBrowserCompat$ItemReceiver(String str, int i, String str2, Notification notification) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = str2;
        this.read = notification;
    }

    public void MediaBrowserCompat$ItemReceiver(read read2) throws RemoteException {
        read2.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.write, this.read);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:");
        sb.append(this.IconCompatParcelizer);
        sb.append(", id:");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tag:");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }
}
