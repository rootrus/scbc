package p040o;

import java.security.MessageDigest;

/* renamed from: o.onActivityResult */
public final class onActivityResult implements isStateSaved {
    public final setTextAppearance<noteStateNotSaved<?>, Object> MediaBrowserCompat$CustomActionResultReceiver = new unregisterOnLoadCanceledListener();

    public final boolean equals(Object obj) {
        if (obj instanceof onActivityResult) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.equals(((onActivityResult) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return false;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver.size(); i++) {
            int i2 = i << 1;
            noteStateNotSaved notestatenotsaved = (noteStateNotSaved) this.MediaBrowserCompat$CustomActionResultReceiver.read[i2];
            Object obj = this.MediaBrowserCompat$CustomActionResultReceiver.read[i2 + 1];
            noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<T> notestatenotsaved_mediabrowsercompat_customactionresultreceiver = notestatenotsaved.MediaBrowserCompat$CustomActionResultReceiver;
            if (notestatenotsaved.write == null) {
                notestatenotsaved.write = notestatenotsaved.IconCompatParcelizer.getBytes(isStateSaved.write);
            }
            notestatenotsaved_mediabrowsercompat_customactionresultreceiver.write(notestatenotsaved.write, obj, messageDigest);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
