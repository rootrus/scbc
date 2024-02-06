package p040o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* renamed from: o.PrepaidCashOutSuccessActivity */
public final class PrepaidCashOutSuccessActivity extends Hashtable {
    private int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private final ReferenceQueue read = new ReferenceQueue();

    public final boolean containsKey(Object obj) {
        return super.containsKey(new PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(obj, (byte) 0));
    }

    public final Enumeration elements() {
        read();
        return super.elements();
    }

    public final Set entrySet() {
        read();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object obj = ((PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver) entry.getKey()).read.get();
            Object value = entry.getValue();
            if (obj != null) {
                hashSet.add(new write(obj, value, (byte) 0));
            }
        }
        return hashSet;
    }

    public final Object get(Object obj) {
        return super.get(new PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(obj, (byte) 0));
    }

    public final Enumeration keys() {
        read();
        return new PrepaidTravelConversionLandingActivity(super.keys());
    }

    public final Set keySet() {
        read();
        Set<PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver : keySet) {
            Object obj = prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver.read.get();
            if (obj != null) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this) {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed");
            } else if (obj2 != null) {
                int i = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = i + 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = i2;
                if (i > 100) {
                    read();
                    this.MediaBrowserCompat$CustomActionResultReceiver = 0;
                } else if (i2 % 10 == 0) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
                put = super.put(new PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(obj, this.read, (byte) 0), obj2);
            } else {
                throw new NullPointerException("Null values are not allowed");
            }
        }
        return put;
    }

    public final void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Collection values() {
        read();
        return super.values();
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = i + 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            if (i > 100) {
                read();
                this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            } else if (i2 % 10 == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            remove = super.remove(new PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(obj, (byte) 0));
        }
        return remove;
    }

    public final boolean isEmpty() {
        read();
        return super.isEmpty();
    }

    public final int size() {
        read();
        return super.size();
    }

    public final String toString() {
        read();
        return super.toString();
    }

    /* access modifiers changed from: protected */
    public final void rehash() {
        read();
        super.rehash();
    }

    private void read() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.read) {
            while (true) {
                read read2 = (read) this.read.poll();
                if (read2 != null) {
                    arrayList.add(read2.write);
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.remove(arrayList.get(i));
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this.read) {
            read read2 = (read) this.read.poll();
            if (read2 != null) {
                super.remove(read2.write);
            }
        }
    }

    /* renamed from: o.PrepaidCashOutSuccessActivity$write */
    static final class write implements Map.Entry {
        private final Object read;
        private final Object write;

        /* synthetic */ write(Object obj, Object obj2, byte b) {
            this(obj, obj2);
        }

        private write(Object obj, Object obj2) {
            this.read = obj;
            this.write = obj2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L_0x0040
                boolean r1 = r4 instanceof java.util.Map.Entry
                if (r1 == 0) goto L_0x0040
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r1 = r3.getKey()
                if (r1 != 0) goto L_0x0016
                java.lang.Object r1 = r4.getKey()
                if (r1 != 0) goto L_0x0040
                goto L_0x0024
            L_0x0016:
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r2 = r4.getKey()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0040
            L_0x0024:
                java.lang.Object r1 = r3.getValue()
                if (r1 != 0) goto L_0x0031
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0040
                goto L_0x003f
            L_0x0031:
                java.lang.Object r1 = r3.getValue()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r1.equals(r4)
                if (r4 == 0) goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCashOutSuccessActivity.write.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = getKey() == null ? 0 : getKey().hashCode();
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public final Object getValue() {
            return this.write;
        }

        public final Object getKey() {
            return this.read;
        }
    }

    /* renamed from: o.PrepaidCashOutSuccessActivity$read */
    static final class read extends WeakReference {
        final PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver write;

        /* synthetic */ read(Object obj, ReferenceQueue referenceQueue, PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver, byte b) {
            this(obj, referenceQueue, prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver);
        }

        private read(Object obj, ReferenceQueue referenceQueue, PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver) {
            super(obj, referenceQueue);
            this.write = prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver;
        }
    }
}
