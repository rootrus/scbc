package p040o;

import java.util.List;

/* renamed from: o.synthesizeSessionFile */
public final class synthesizeSessionFile {
    public final boolean IconCompatParcelizer;
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    public final List<listSessionPartFilesFor> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof synthesizeSessionFile)) {
            return false;
        }
        synthesizeSessionFile synthesizesessionfile = (synthesizeSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) synthesizesessionfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) synthesizesessionfile.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == synthesizesessionfile.IconCompatParcelizer;
    }

    public final int hashCode() {
        List<listSessionPartFilesFor> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (num != null) {
            i = num.hashCode();
        }
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        return (((hashCode * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCompanyListDisplay(list=");
        sb.append(this.write);
        sb.append(", nextPageNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hasMorePages=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public synthesizeSessionFile(List<listSessionPartFilesFor> list, Integer num, boolean z) {
        onGetStartedClick.write((Object) list, "list");
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.IconCompatParcelizer = z;
    }
}
