package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getDummyAlloc */
final class getDummyAlloc {
    private final boolean IconCompatParcelizer = false;
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final List<forEach> write;

    getDummyAlloc(List<forEach> list, int i, boolean z) {
        this.write = new ArrayList(list);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(this.write);
        sb.append(" }");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getDummyAlloc)) {
            return false;
        }
        getDummyAlloc getdummyalloc = (getDummyAlloc) obj;
        if (!this.write.equals(getdummyalloc.write) || this.IconCompatParcelizer != getdummyalloc.IconCompatParcelizer) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.write.hashCode() ^ Boolean.valueOf(this.IconCompatParcelizer).hashCode();
    }
}
