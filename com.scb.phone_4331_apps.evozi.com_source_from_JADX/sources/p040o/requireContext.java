package p040o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: o.requireContext */
public final class requireContext implements getCheckUsabilityData {
    private static final Bitmap.Config[] IconCompatParcelizer = {Bitmap.Config.ALPHA_8};
    private static final Bitmap.Config[] MediaBrowserCompat$CustomActionResultReceiver;
    private static final Bitmap.Config[] MediaBrowserCompat$ItemReceiver = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] read;
    private static final Bitmap.Config[] write = {Bitmap.Config.ARGB_4444};
    private final write MediaBrowserCompat$MediaItem = new write();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> MediaBrowserCompat$SearchResultReceiver = new HashMap();
    private final performStart<read, Bitmap> MediaDescriptionCompat = new performStart<>();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        read = configArr;
        MediaBrowserCompat$CustomActionResultReceiver = configArr;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap) {
        int IconCompatParcelizer2 = LinearLayoutManager.IconCompatParcelizer(bitmap);
        write write2 = this.MediaBrowserCompat$MediaItem;
        Bitmap.Config config = bitmap.getConfig();
        getMicrAmount getmicramount = (getMicrAmount) write2.read.poll();
        if (getmicramount == null) {
            getmicramount = write2.write();
        }
        read read2 = (read) getmicramount;
        read2.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        read2.read = config;
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(read2, bitmap);
        NavigableMap<Integer, Integer> write3 = write(bitmap.getConfig());
        Integer num = (Integer) write3.get(Integer.valueOf(read2.MediaBrowserCompat$CustomActionResultReceiver));
        int i = read2.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        write3.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int IconCompatParcelizer2 = LinearLayoutManager.IconCompatParcelizer(i, i2, config);
        write write2 = this.MediaBrowserCompat$MediaItem;
        getMicrAmount getmicramount = (getMicrAmount) write2.read.poll();
        if (getmicramount == null) {
            getmicramount = write2.write();
        }
        read read2 = (read) getmicramount;
        read2.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        read2.read = config;
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = C14285.read[config.ordinal()];
            if (i4 == 1) {
                configArr = read;
            } else if (i4 == 2) {
                configArr = MediaBrowserCompat$ItemReceiver;
            } else if (i4 != 3) {
                configArr = i4 != 4 ? new Bitmap.Config[]{config} : IconCompatParcelizer;
            } else {
                configArr = write;
            }
        } else {
            configArr = MediaBrowserCompat$CustomActionResultReceiver;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = write(config2).ceilingKey(Integer.valueOf(IconCompatParcelizer2));
            if (ceilingKey == null || ceilingKey.intValue() > (IconCompatParcelizer2 << 3)) {
                i3++;
            } else if (ceilingKey.intValue() != IconCompatParcelizer2 || (config2 != null ? !config2.equals(config) : config != null)) {
                write write3 = this.MediaBrowserCompat$MediaItem;
                if (write3.read.size() < 20) {
                    write3.read.offer(read2);
                }
                write write4 = this.MediaBrowserCompat$MediaItem;
                int intValue = ceilingKey.intValue();
                getMicrAmount getmicramount2 = (getMicrAmount) write4.read.poll();
                if (getmicramount2 == null) {
                    getmicramount2 = write4.write();
                }
                read2 = (read) getmicramount2;
                read2.MediaBrowserCompat$CustomActionResultReceiver = intValue;
                read2.read = config2;
            }
        }
        Bitmap read3 = this.MediaDescriptionCompat.read(read2);
        if (read3 != null) {
            read(Integer.valueOf(read2.MediaBrowserCompat$CustomActionResultReceiver), read3);
            read3.reconfigure(i, i2, config);
        }
        return read3;
    }

    public final Bitmap MediaBrowserCompat$ItemReceiver() {
        Bitmap MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            read(Integer.valueOf(LinearLayoutManager.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2)), MediaBrowserCompat$ItemReceiver2);
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    private void read(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> write2 = write(bitmap.getConfig());
        Integer num2 = (Integer) write2.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(IconCompatParcelizer(LinearLayoutManager.IconCompatParcelizer(bitmap), bitmap.getConfig()));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            write2.remove(num);
        } else {
            write2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> write(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.MediaBrowserCompat$SearchResultReceiver.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.MediaBrowserCompat$SearchResultReceiver.put(config, treeMap);
        return treeMap;
    }

    public final String write(Bitmap bitmap) {
        return IconCompatParcelizer(LinearLayoutManager.IconCompatParcelizer(bitmap), bitmap.getConfig());
    }

    public final String read(int i, int i2, Bitmap.Config config) {
        return IconCompatParcelizer(LinearLayoutManager.IconCompatParcelizer(i, i2, config), config);
    }

    public final int IconCompatParcelizer(Bitmap bitmap) {
        return LinearLayoutManager.IconCompatParcelizer(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.MediaBrowserCompat$SearchResultReceiver.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: o.requireContext$write */
    static class write extends performStop<read> {
        write() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ getMicrAmount write() {
            return new read(this);
        }
    }

    /* renamed from: o.requireContext$read */
    static final class read implements getMicrAmount {
        int MediaBrowserCompat$CustomActionResultReceiver;
        private final write MediaBrowserCompat$ItemReceiver;
        Bitmap.Config read;

        public read(write write) {
            this.MediaBrowserCompat$ItemReceiver = write;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            write write = this.MediaBrowserCompat$ItemReceiver;
            if (write.read.size() < 20) {
                write.read.offer(this);
            }
        }

        public final String toString() {
            return requireContext.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            if (this.MediaBrowserCompat$CustomActionResultReceiver != read2.MediaBrowserCompat$CustomActionResultReceiver || !LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver((Object) this.read, (Object) read2.read)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            Bitmap.Config config = this.read;
            return (i * 31) + (config != null ? config.hashCode() : 0);
        }
    }

    static String IconCompatParcelizer(int i, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.requireContext$5 */
    static /* synthetic */ class C14285 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.requireContext.C14285.<clinit>():void");
        }
    }
}
