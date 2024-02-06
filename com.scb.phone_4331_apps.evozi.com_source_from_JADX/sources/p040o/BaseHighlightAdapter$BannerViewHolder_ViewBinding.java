package p040o;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.BaseHighlightAdapter$BannerViewHolder_ViewBinding */
public final class BaseHighlightAdapter$BannerViewHolder_ViewBinding extends AbstractList<Object> {
    final List<URI> read = new ArrayList();
    final Set<URI> write = new HashSet();

    public final int size() {
        return this.read.size();
    }

    public final Object set(int i, Object obj) {
        URI uri = (URI) obj;
        URI uri2 = this.read.set(i, uri);
        this.write.remove(uri2);
        this.write.add(uri);
        if (this.read.size() != this.write.size()) {
            this.write.addAll(this.read);
        }
        return uri2;
    }

    public final void add(int i, Object obj) {
        URI uri = (URI) obj;
        this.read.add(i, uri);
        this.write.add(uri);
    }

    public final boolean contains(Object obj) {
        return this.write.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.read.get(i);
    }

    public final /* synthetic */ Object remove(int i) {
        URI remove = this.read.remove(i);
        this.write.remove(remove);
        if (this.read.size() != this.write.size()) {
            this.write.addAll(this.read);
        }
        return remove;
    }
}
