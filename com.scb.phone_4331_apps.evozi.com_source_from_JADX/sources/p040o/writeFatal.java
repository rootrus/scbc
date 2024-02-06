package p040o;

import java.util.List;

/* renamed from: o.writeFatal */
public final class writeFatal {
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<writeSessionOS> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeFatal)) {
            return false;
        }
        writeFatal writefatal = (writeFatal) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writefatal.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writefatal.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<writeSessionOS> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentUploadedListDisplay(expiryDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", documentList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public writeFatal(String str, List<? extends writeSessionOS> list) {
        onGetStartedClick.write((Object) str, "expiryDate");
        onGetStartedClick.write((Object) list, "documentList");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = list;
    }
}
