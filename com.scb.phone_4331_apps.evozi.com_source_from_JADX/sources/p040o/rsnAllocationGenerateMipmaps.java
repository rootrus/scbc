package p040o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p040o.RttiJsonBill_MembersInjector;
import p040o.rsnAllocationElementData1D;

/* renamed from: o.rsnAllocationGenerateMipmaps */
public class rsnAllocationGenerateMipmaps extends AbstractMap<String, Object> implements Cloneable {
    public final rsnAllocationData3D classInfo;
    Map<String, Object> unknownFields;

    public rsnAllocationGenerateMipmaps() {
        this(EnumSet.noneOf(read.class));
    }

    /* renamed from: o.rsnAllocationGenerateMipmaps$read */
    public enum read {
        ;

        private read(String str) {
        }
    }

    public rsnAllocationGenerateMipmaps(EnumSet<read> enumSet) {
        this.unknownFields = rsnAllocationCreateFromAssetStream.MediaBrowserCompat$CustomActionResultReceiver();
        this.classInfo = rsnAllocationData3D.IconCompatParcelizer(getClass(), enumSet.contains(read.IGNORE_CASE));
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        rsnAllocationData2D read2 = this.classInfo.read(str);
        if (read2 != null) {
            return rsnAllocationData2D.write(read2.MediaBrowserCompat$ItemReceiver, this);
        }
        if (this.classInfo.read) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.get(str);
    }

    public final Object put(String str, Object obj) {
        rsnAllocationData2D read2 = this.classInfo.read(str);
        if (read2 != null) {
            Object write = rsnAllocationData2D.write(read2.MediaBrowserCompat$ItemReceiver, this);
            read2.MediaBrowserCompat$ItemReceiver(this, obj);
            return write;
        }
        if (this.classInfo.read) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.put(str, obj);
    }

    public rsnAllocationGenerateMipmaps set(String str, Object obj) {
        rsnAllocationData2D read2 = this.classInfo.read(str);
        if (read2 != null) {
            read2.MediaBrowserCompat$ItemReceiver(this, obj);
        } else {
            if (this.classInfo.read) {
                str = str.toLowerCase(Locale.US);
            }
            this.unknownFields.put(str, obj);
        }
        return this;
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            set((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.classInfo.read(str) == null) {
            if (this.classInfo.read) {
                str = str.toLowerCase(Locale.US);
            }
            return this.unknownFields.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new IconCompatParcelizer();
    }

    public rsnAllocationGenerateMipmaps clone() {
        try {
            rsnAllocationGenerateMipmaps rsnallocationgeneratemipmaps = (rsnAllocationGenerateMipmaps) super.clone();
            RttiJsonBill_MembersInjector.read.MediaBrowserCompat$ItemReceiver(this, rsnallocationgeneratemipmaps);
            rsnallocationgeneratemipmaps.unknownFields = (Map) RttiJsonBill_MembersInjector.read.MediaBrowserCompat$CustomActionResultReceiver(this.unknownFields);
            return rsnallocationgeneratemipmaps;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final Map<String, Object> getUnknownKeys() {
        return this.unknownFields;
    }

    public final void setUnknownKeys(Map<String, Object> map) {
        this.unknownFields = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof rsnAllocationGenerateMipmaps)) {
            return false;
        }
        rsnAllocationGenerateMipmaps rsnallocationgeneratemipmaps = (rsnAllocationGenerateMipmaps) obj;
        if (!super.equals(rsnallocationgeneratemipmaps) || !Objects.equals(this.classInfo, rsnallocationgeneratemipmaps.classInfo)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.classInfo});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenericData{classInfo=");
        sb.append(this.classInfo.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }

    public final rsnAllocationData3D getClassInfo() {
        return this.classInfo;
    }

    /* renamed from: o.rsnAllocationGenerateMipmaps$IconCompatParcelizer */
    final class IconCompatParcelizer extends AbstractSet<Map.Entry<String, Object>> {
        private final rsnAllocationElementData1D.read MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer() {
            this.MediaBrowserCompat$ItemReceiver = new rsnAllocationElementData1D.read();
        }

        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new C10129xd388b9b6(rsnAllocationGenerateMipmaps.this, this.MediaBrowserCompat$ItemReceiver);
        }

        public final int size() {
            return rsnAllocationGenerateMipmaps.this.unknownFields.size() + this.MediaBrowserCompat$ItemReceiver.size();
        }

        public final void clear() {
            rsnAllocationGenerateMipmaps.this.unknownFields.clear();
            this.MediaBrowserCompat$ItemReceiver.clear();
        }
    }
}
