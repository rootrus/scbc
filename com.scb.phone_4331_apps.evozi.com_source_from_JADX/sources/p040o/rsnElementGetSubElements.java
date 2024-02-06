package p040o;

import com.scb.phone.data.p033di.easycash.C1067x8ceb5283;
import com.scb.phone.data.p033di.easycash.C1068xa4368296;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p040o.rsnElementGetSubElements.write;

/* renamed from: o.rsnElementGetSubElements */
public final class rsnElementGetSubElements<T extends write> {
    private final int IconCompatParcelizer;
    public Set<T> MediaBrowserCompat$CustomActionResultReceiver;
    public List<rsnElementGetSubElements<T>> read;
    public final C1067x8ceb5283 write;

    /* renamed from: o.rsnElementGetSubElements$write */
    public interface write {
        C1068xa4368296 MediaBrowserCompat$CustomActionResultReceiver();
    }

    public rsnElementGetSubElements() {
        this(new C1067x8ceb5283(0.0d, 1.0d, 0.0d, 1.0d));
    }

    private rsnElementGetSubElements(C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver) {
        this(easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, 0);
    }

    private rsnElementGetSubElements(double d, double d2, double d3, double d4, int i) {
        this(new C1067x8ceb5283(d, d2, d3, d4), i);
    }

    private rsnElementGetSubElements(C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        this.read = null;
        this.write = easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = i;
    }

    public final void read(double d, double d2, T t) {
        rsnElementGetSubElements rsnelementgetsubelements = this;
        while (rsnelementgetsubelements.read != null) {
            if (d2 < rsnelementgetsubelements.write.MediaBrowserCompat$ItemReceiver) {
                if (d < rsnelementgetsubelements.write.MediaBrowserCompat$CustomActionResultReceiver) {
                    rsnelementgetsubelements = rsnelementgetsubelements.read.get(0);
                } else {
                    rsnelementgetsubelements = rsnelementgetsubelements.read.get(1);
                }
            } else if (d < rsnelementgetsubelements.write.MediaBrowserCompat$CustomActionResultReceiver) {
                rsnelementgetsubelements = rsnelementgetsubelements.read.get(2);
            } else {
                rsnelementgetsubelements = rsnelementgetsubelements.read.get(3);
            }
        }
        if (rsnelementgetsubelements.MediaBrowserCompat$CustomActionResultReceiver == null) {
            rsnelementgetsubelements.MediaBrowserCompat$CustomActionResultReceiver = new HashSet();
        }
        rsnelementgetsubelements.MediaBrowserCompat$CustomActionResultReceiver.add(t);
        if (rsnelementgetsubelements.MediaBrowserCompat$CustomActionResultReceiver.size() > 50 && rsnelementgetsubelements.IconCompatParcelizer < 40) {
            rsnelementgetsubelements.read();
        }
    }

    private void read() {
        ArrayList arrayList = new ArrayList(4);
        this.read = arrayList;
        arrayList.add(new rsnElementGetSubElements(this.write.write, this.write.MediaBrowserCompat$CustomActionResultReceiver, this.write.MediaMetadataCompat, this.write.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer + 1));
        this.read.add(new rsnElementGetSubElements(this.write.MediaBrowserCompat$CustomActionResultReceiver, this.write.IconCompatParcelizer, this.write.MediaMetadataCompat, this.write.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer + 1));
        this.read.add(new rsnElementGetSubElements(this.write.write, this.write.MediaBrowserCompat$CustomActionResultReceiver, this.write.MediaBrowserCompat$ItemReceiver, this.write.read, this.IconCompatParcelizer + 1));
        this.read.add(new rsnElementGetSubElements(this.write.MediaBrowserCompat$CustomActionResultReceiver, this.write.IconCompatParcelizer, this.write.MediaBrowserCompat$ItemReceiver, this.write.read, this.IconCompatParcelizer + 1));
        Set<T> set = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        for (T t : set) {
            read(t.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer, t.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver, t);
        }
    }

    public final void write(C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, Collection<T> collection) {
        C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2 = this.write;
        boolean z = true;
        if (easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.write < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer && easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.write < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer && easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.read && easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.read) {
            List<rsnElementGetSubElements<T>> list = this.read;
            if (list != null) {
                for (rsnElementGetSubElements<T> write2 : list) {
                    write2.write(easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, collection);
                }
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                C1067x8ceb5283 easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3 = this.write;
                if (easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.write < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.write || easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer > easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer || easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.MediaMetadataCompat < easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat || easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.read > easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.read) {
                    z = false;
                }
                if (z) {
                    collection.addAll(this.MediaBrowserCompat$CustomActionResultReceiver);
                    return;
                }
                for (T t : this.MediaBrowserCompat$CustomActionResultReceiver) {
                    C1068xa4368296 MediaBrowserCompat$CustomActionResultReceiver2 = t.MediaBrowserCompat$CustomActionResultReceiver();
                    if (easycashBusinessAndMaritalInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver)) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
