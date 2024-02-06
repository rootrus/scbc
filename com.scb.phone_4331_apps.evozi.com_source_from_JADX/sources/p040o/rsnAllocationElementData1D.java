package p040o;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.rsnAllocationElementData1D */
public final class rsnAllocationElementData1D extends AbstractMap<String, Object> {
    final Object IconCompatParcelizer;
    final rsnAllocationData3D MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        rsnAllocationData2D read2 = this.MediaBrowserCompat$ItemReceiver.read(str);
        StringBuilder sb = new StringBuilder();
        sb.append("no field of key ");
        sb.append(str);
        Preconditions.checkNotNull(read2, sb.toString());
        Object write2 = rsnAllocationData2D.write(read2.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
        read2.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, Preconditions.checkNotNull(obj2));
        return write2;
    }

    public rsnAllocationElementData1D(Object obj, boolean z) {
        this.IconCompatParcelizer = obj;
        this.MediaBrowserCompat$ItemReceiver = rsnAllocationData3D.IconCompatParcelizer(obj.getClass(), z);
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final Object get(Object obj) {
        rsnAllocationData2D read2;
        if (!(obj instanceof String) || (read2 = this.MediaBrowserCompat$ItemReceiver.read((String) obj)) == null) {
            return null;
        }
        return rsnAllocationData2D.write(read2.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
    }

    /* renamed from: o.rsnAllocationElementData1D$read */
    final class read extends AbstractSet<Map.Entry<String, Object>> {
        read() {
        }

        public final int size() {
            int i = 0;
            for (String read2 : rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                rsnAllocationData2D read3 = rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.read(read2);
                if (rsnAllocationData2D.write(read3.MediaBrowserCompat$ItemReceiver, rsnAllocationElementData1D.this.IconCompatParcelizer) != null) {
                    i++;
                }
            }
            return i;
        }

        public final void clear() {
            for (String read2 : rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.read(read2).MediaBrowserCompat$ItemReceiver(rsnAllocationElementData1D.this.IconCompatParcelizer, (Object) null);
            }
        }

        public final boolean isEmpty() {
            for (String read2 : rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                rsnAllocationData2D read3 = rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.read(read2);
                if (rsnAllocationData2D.write(read3.MediaBrowserCompat$ItemReceiver, rsnAllocationElementData1D.this.IconCompatParcelizer) != null) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ Iterator iterator() {
            return new write();
        }
    }

    /* renamed from: o.rsnAllocationElementData1D$write */
    final class write implements Iterator<Map.Entry<String, Object>> {
        private Object IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private int RatingCompat = -1;
        private rsnAllocationData2D read;
        private rsnAllocationData2D write;

        write() {
        }

        public final boolean hasNext() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.IconCompatParcelizer = null;
                while (this.IconCompatParcelizer == null) {
                    int i = this.RatingCompat + 1;
                    this.RatingCompat = i;
                    if (i >= rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.size()) {
                        break;
                    }
                    rsnAllocationData2D read2 = rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.read(rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.get(this.RatingCompat));
                    this.write = read2;
                    this.IconCompatParcelizer = rsnAllocationData2D.write(read2.MediaBrowserCompat$ItemReceiver, rsnAllocationElementData1D.this.IconCompatParcelizer);
                }
            }
            if (this.IconCompatParcelizer == null) {
                return false;
            }
            return true;
        }

        public final void remove() {
            Preconditions.checkState(this.read != null && !this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver = true;
            this.read.MediaBrowserCompat$ItemReceiver(rsnAllocationElementData1D.this.IconCompatParcelizer, (Object) null);
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                rsnAllocationData2D rsnallocationdata2d = this.write;
                this.read = rsnallocationdata2d;
                Object obj = this.IconCompatParcelizer;
                this.MediaBrowserCompat$CustomActionResultReceiver = false;
                this.MediaBrowserCompat$ItemReceiver = false;
                this.write = null;
                this.IconCompatParcelizer = null;
                return new IconCompatParcelizer(rsnallocationdata2d, obj);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: o.rsnAllocationElementData1D$IconCompatParcelizer */
    final class IconCompatParcelizer implements Map.Entry<String, Object> {
        private final rsnAllocationData2D IconCompatParcelizer;
        private Object MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(rsnAllocationData2D rsnallocationdata2d, Object obj) {
            this.IconCompatParcelizer = rsnallocationdata2d;
            this.MediaBrowserCompat$CustomActionResultReceiver = Preconditions.checkNotNull(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: IconCompatParcelizer */
        public String getKey() {
            String str = this.IconCompatParcelizer.read;
            return rsnAllocationElementData1D.this.MediaBrowserCompat$ItemReceiver.read ? str.toLowerCase(Locale.US) : str;
        }

        public final Object getValue() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final Object setValue(Object obj) {
            Object obj2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = Preconditions.checkNotNull(obj);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(rsnAllocationElementData1D.this.IconCompatParcelizer, obj);
            return obj2;
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }
    }

    public final /* synthetic */ Set entrySet() {
        return new read();
    }
}
