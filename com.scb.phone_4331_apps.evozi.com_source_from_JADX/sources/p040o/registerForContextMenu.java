package p040o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p040o.CheckParameters;

/* renamed from: o.registerForContextMenu */
public final class registerForContextMenu implements CheckParameters.CheckCountry {
    private final int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private final performStart<registerForContextMenu$MediaBrowserCompat$ItemReceiver, Object> MediaBrowserCompat$ItemReceiver;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> MediaMetadataCompat;
    private final write read;
    private final Map<Class<?>, performResume<?>> write;

    public registerForContextMenu() {
        this.MediaBrowserCompat$ItemReceiver = new performStart<>();
        this.read = new write();
        this.MediaMetadataCompat = new HashMap();
        this.write = new HashMap();
        this.IconCompatParcelizer = 4194304;
    }

    public registerForContextMenu(int i) {
        this.MediaBrowserCompat$ItemReceiver = new performStart<>();
        this.read = new write();
        this.MediaMetadataCompat = new HashMap();
        this.write = new HashMap();
        this.IconCompatParcelizer = i;
    }

    public final <T> void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        synchronized (this) {
            Class<?> cls = t.getClass();
            performResume<?> IconCompatParcelizer2 = IconCompatParcelizer(cls);
            int IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(t);
            int MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver() * IconCompatParcelizer3;
            int i = 1;
            if (MediaBrowserCompat$CustomActionResultReceiver2 <= this.IconCompatParcelizer / 2) {
                write write2 = this.read;
                getMicrAmount getmicramount = (getMicrAmount) write2.read.poll();
                if (getmicramount == null) {
                    getmicramount = write2.write();
                }
                registerForContextMenu$MediaBrowserCompat$ItemReceiver registerforcontextmenu_mediabrowsercompat_itemreceiver = (registerForContextMenu$MediaBrowserCompat$ItemReceiver) getmicramount;
                registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
                registerforcontextmenu_mediabrowsercompat_itemreceiver.write = cls;
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(registerforcontextmenu_mediabrowsercompat_itemreceiver, t);
                NavigableMap<Integer, Integer> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(cls);
                Integer num = (Integer) MediaBrowserCompat$ItemReceiver2.get(Integer.valueOf(registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver));
                int i2 = registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
                if (num != null) {
                    i = 1 + num.intValue();
                }
                MediaBrowserCompat$ItemReceiver2.put(Integer.valueOf(i2), Integer.valueOf(i));
                this.MediaBrowserCompat$CustomActionResultReceiver += MediaBrowserCompat$CustomActionResultReceiver2;
                read(this.IconCompatParcelizer);
            }
        }
    }

    public final <T> T read(Class<T> cls) {
        T MediaBrowserCompat$CustomActionResultReceiver2;
        synchronized (this) {
            write write2 = this.read;
            getMicrAmount getmicramount = (getMicrAmount) write2.read.poll();
            if (getmicramount == null) {
                getmicramount = write2.write();
            }
            registerForContextMenu$MediaBrowserCompat$ItemReceiver registerforcontextmenu_mediabrowsercompat_itemreceiver = (registerForContextMenu$MediaBrowserCompat$ItemReceiver) getmicramount;
            registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = 8;
            registerforcontextmenu_mediabrowsercompat_itemreceiver.write = cls;
            MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(registerforcontextmenu_mediabrowsercompat_itemreceiver, cls);
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T read(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.MediaBrowserCompat$ItemReceiver((java.lang.Class<?>) r7)     // Catch:{ all -> 0x0065 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0065 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0065 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            int r3 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x001f
            int r4 = r5.IconCompatParcelizer     // Catch:{ all -> 0x0065 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 >= r3) goto L_0x001f
            r3 = r2
            goto L_0x0020
        L_0x001f:
            r3 = r1
        L_0x0020:
            if (r3 != 0) goto L_0x002c
            int r3 = r0.intValue()     // Catch:{ all -> 0x0065 }
            int r4 = r6 << 3
            if (r3 > r4) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0049
            o.registerForContextMenu$write r6 = r5.read     // Catch:{ all -> 0x0065 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0065 }
            java.util.Queue<T> r1 = r6.read     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0065 }
            o.getMicrAmount r1 = (p040o.getMicrAmount) r1     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0042
            o.getMicrAmount r1 = r6.write()     // Catch:{ all -> 0x0065 }
        L_0x0042:
            o.registerForContextMenu$MediaBrowserCompat$ItemReceiver r1 = (p040o.registerForContextMenu$MediaBrowserCompat$ItemReceiver) r1     // Catch:{ all -> 0x0065 }
            r1.MediaBrowserCompat$ItemReceiver = r0     // Catch:{ all -> 0x0065 }
            r1.write = r7     // Catch:{ all -> 0x0065 }
            goto L_0x005f
        L_0x0049:
            o.registerForContextMenu$write r0 = r5.read     // Catch:{ all -> 0x0065 }
            java.util.Queue<T> r1 = r0.read     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0065 }
            o.getMicrAmount r1 = (p040o.getMicrAmount) r1     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0059
            o.getMicrAmount r1 = r0.write()     // Catch:{ all -> 0x0065 }
        L_0x0059:
            o.registerForContextMenu$MediaBrowserCompat$ItemReceiver r1 = (p040o.registerForContextMenu$MediaBrowserCompat$ItemReceiver) r1     // Catch:{ all -> 0x0065 }
            r1.MediaBrowserCompat$ItemReceiver = r6     // Catch:{ all -> 0x0065 }
            r1.write = r7     // Catch:{ all -> 0x0065 }
        L_0x005f:
            java.lang.Object r6 = r5.MediaBrowserCompat$CustomActionResultReceiver(r1, r7)     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return r6
        L_0x0065:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.registerForContextMenu.read(int, java.lang.Class):java.lang.Object");
    }

    private <T> T MediaBrowserCompat$CustomActionResultReceiver(registerForContextMenu$MediaBrowserCompat$ItemReceiver registerforcontextmenu_mediabrowsercompat_itemreceiver, Class<T> cls) {
        performResume<T> IconCompatParcelizer2 = IconCompatParcelizer(cls);
        T read2 = this.MediaBrowserCompat$ItemReceiver.read(registerforcontextmenu_mediabrowsercompat_itemreceiver);
        if (read2 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver -= IconCompatParcelizer2.IconCompatParcelizer(read2) * IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver();
            IconCompatParcelizer(IconCompatParcelizer2.IconCompatParcelizer(read2), cls);
        }
        if (read2 != null) {
            return read2;
        }
        if (Log.isLoggable(IconCompatParcelizer2.IconCompatParcelizer(), 2)) {
            String IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
            sb.append(" bytes");
            Log.v(IconCompatParcelizer3, sb.toString());
        }
        return IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(registerforcontextmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final void write() {
        synchronized (this) {
            read(0);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void MediaBrowserCompat$ItemReceiver(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x0011
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            r2 = 0
            r1.read((int) r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r2     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            goto L_0x0022
        L_0x0011:
            r0 = 20
            if (r2 >= r0) goto L_0x0019
            r0 = 15
            if (r2 != r0) goto L_0x0020
        L_0x0019:
            int r2 = r1.IconCompatParcelizer     // Catch:{ all -> 0x000f }
            int r2 = r2 / 2
            r1.read((int) r2)     // Catch:{ all -> 0x000f }
        L_0x0020:
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.registerForContextMenu.MediaBrowserCompat$ItemReceiver(int):void");
    }

    private void read(int i) {
        while (this.MediaBrowserCompat$CustomActionResultReceiver > i) {
            Object MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                performResume<?> IconCompatParcelizer2 = IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2.getClass());
                this.MediaBrowserCompat$CustomActionResultReceiver -= IconCompatParcelizer2.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2) * IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver();
                IconCompatParcelizer(IconCompatParcelizer2.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2), MediaBrowserCompat$ItemReceiver2.getClass());
                if (Log.isLoggable(IconCompatParcelizer2.IconCompatParcelizer(), 2)) {
                    String IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer();
                    StringBuilder sb = new StringBuilder();
                    sb.append("evicted: ");
                    sb.append(IconCompatParcelizer2.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2));
                    Log.v(IconCompatParcelizer3, sb.toString());
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
    }

    private void IconCompatParcelizer(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(cls);
        Integer num = (Integer) MediaBrowserCompat$ItemReceiver2.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            MediaBrowserCompat$ItemReceiver2.remove(Integer.valueOf(i));
        } else {
            MediaBrowserCompat$ItemReceiver2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> MediaBrowserCompat$ItemReceiver(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.MediaMetadataCompat.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.MediaMetadataCompat.put(cls, treeMap);
        return treeMap;
    }

    private <T> performResume<T> IconCompatParcelizer(Class<T> cls) {
        performResume<T> performresume = this.write.get(cls);
        if (performresume == null) {
            if (cls.equals(int[].class)) {
                performresume = new requestPermissions();
            } else if (cls.equals(byte[].class)) {
                performresume = new performSaveInstanceState();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.write.put(cls, performresume);
        }
        return performresume;
    }

    /* renamed from: o.registerForContextMenu$write */
    static final class write extends performStop<registerForContextMenu$MediaBrowserCompat$ItemReceiver> {
        write() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ getMicrAmount write() {
            return new registerForContextMenu$MediaBrowserCompat$ItemReceiver(this);
        }
    }
}
