package p040o;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import p040o.ActivityChooserView;
import p040o.entryRemoved;

/* renamed from: o.get */
public class get extends entryRemoved {
    private boolean IconCompatParcelizer = false;
    private AlertDialogLayout<evictAll, read> MediaBrowserCompat$CustomActionResultReceiver = new AlertDialogLayout<>();
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private ArrayList<entryRemoved.read> MediaBrowserCompat$SearchResultReceiver = new ArrayList<>();
    private entryRemoved.read MediaMetadataCompat;
    private int read = 0;
    private final WeakReference<maxSize> write;

    public get(maxSize maxsize) {
        this.write = new WeakReference<>(maxsize);
        this.MediaMetadataCompat = entryRemoved.read.INITIALIZED;
    }

    public final void write(entryRemoved.write write2) {
        write(MediaBrowserCompat$CustomActionResultReceiver(write2));
    }

    public final void write(entryRemoved.read read2) {
        if (this.MediaMetadataCompat != read2) {
            this.MediaMetadataCompat = read2;
            if (this.IconCompatParcelizer || this.read != 0) {
                this.MediaBrowserCompat$ItemReceiver = true;
                return;
            }
            this.IconCompatParcelizer = true;
            write();
            this.IconCompatParcelizer = false;
        }
    }

    private boolean IconCompatParcelizer() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.read == 0) {
            return true;
        }
        entryRemoved.read read2 = ((read) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getValue()).MediaBrowserCompat$CustomActionResultReceiver;
        entryRemoved.read read3 = ((read) this.MediaBrowserCompat$CustomActionResultReceiver.write.getValue()).MediaBrowserCompat$CustomActionResultReceiver;
        if (read2 == read3 && this.MediaMetadataCompat == read3) {
            return true;
        }
        return false;
    }

    private entryRemoved.read MediaBrowserCompat$CustomActionResultReceiver(evictAll evictall) {
        AlertDialogLayout<evictAll, read> alertDialogLayout = this.MediaBrowserCompat$CustomActionResultReceiver;
        entryRemoved.read read2 = null;
        ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = alertDialogLayout.MediaBrowserCompat$CustomActionResultReceiver.containsKey(evictall) ? alertDialogLayout.MediaBrowserCompat$CustomActionResultReceiver.get(evictall).read : null;
        entryRemoved.read read3 = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver != null ? ((read) activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.getValue()).MediaBrowserCompat$CustomActionResultReceiver : null;
        if (!this.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
            ArrayList<entryRemoved.read> arrayList = this.MediaBrowserCompat$SearchResultReceiver;
            read2 = arrayList.get(arrayList.size() - 1);
        }
        entryRemoved.read read4 = this.MediaMetadataCompat;
        if (read3 == null || read3.compareTo(read4) >= 0) {
            read3 = read4;
        }
        return (read2 == null || read2.compareTo(read3) >= 0) ? read3 : read2;
    }

    public final void IconCompatParcelizer(evictAll evictall) {
        maxSize maxsize;
        read read2 = new read(evictall, this.MediaMetadataCompat == entryRemoved.read.DESTROYED ? entryRemoved.read.DESTROYED : entryRemoved.read.INITIALIZED);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(evictall, read2) == null && (maxsize = this.write.get()) != null) {
            boolean z = this.read != 0 || this.IconCompatParcelizer;
            entryRemoved.read MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(evictall);
            this.read++;
            while (read2.MediaBrowserCompat$CustomActionResultReceiver.compareTo(MediaBrowserCompat$CustomActionResultReceiver2) < 0 && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.containsKey(evictall)) {
                this.MediaBrowserCompat$SearchResultReceiver.add(read2.MediaBrowserCompat$CustomActionResultReceiver);
                read2.IconCompatParcelizer(maxsize, MediaBrowserCompat$CustomActionResultReceiver(read2.MediaBrowserCompat$CustomActionResultReceiver));
                ArrayList<entryRemoved.read> arrayList = this.MediaBrowserCompat$SearchResultReceiver;
                arrayList.remove(arrayList.size() - 1);
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(evictall);
            }
            if (!z) {
                write();
            }
            this.read--;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(evictAll evictall) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(evictall);
    }

    public final entryRemoved.read read() {
        return this.MediaMetadataCompat;
    }

    public static entryRemoved.read MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write write2) {
        switch (C13174.MediaBrowserCompat$ItemReceiver[write2.ordinal()]) {
            case 1:
            case 2:
                return entryRemoved.read.CREATED;
            case 3:
            case 4:
                return entryRemoved.read.STARTED;
            case 5:
                return entryRemoved.read.RESUMED;
            case 6:
                return entryRemoved.read.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(write2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: o.get$4 */
    static /* synthetic */ class C13174 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                o.entryRemoved$read[] r0 = p040o.entryRemoved.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                r1 = 1
                o.entryRemoved$read r2 = p040o.entryRemoved.read.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.entryRemoved$read r3 = p040o.entryRemoved.read.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.entryRemoved$read r4 = p040o.entryRemoved.read.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.entryRemoved$read r5 = p040o.entryRemoved.read.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                o.entryRemoved$read r6 = p040o.entryRemoved.read.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                o.entryRemoved$write[] r5 = p040o.entryRemoved.write.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                MediaBrowserCompat$ItemReceiver = r5
                o.entryRemoved$write r6 = p040o.entryRemoved.write.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0059 }
                o.entryRemoved$write r5 = p040o.entryRemoved.write.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0063 }
                o.entryRemoved$write r1 = p040o.entryRemoved.write.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x006d }
                o.entryRemoved$write r1 = p040o.entryRemoved.write.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0077 }
                o.entryRemoved$write r1 = p040o.entryRemoved.write.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0082 }
                o.entryRemoved$write r1 = p040o.entryRemoved.write.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x008d }
                o.entryRemoved$write r1 = p040o.entryRemoved.write.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.get.C13174.<clinit>():void");
        }
    }

    private static entryRemoved.write MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.read read2) {
        int i = C13174.IconCompatParcelizer[read2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return entryRemoved.write.ON_START;
            }
            if (i == 3) {
                return entryRemoved.write.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(read2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return entryRemoved.write.ON_CREATE;
    }

    private void IconCompatParcelizer(maxSize maxsize) {
        AlertDialogLayout<evictAll, read> alertDialogLayout = this.MediaBrowserCompat$CustomActionResultReceiver;
        ActivityChooserView.InnerLayout.write write2 = new ActivityChooserView.InnerLayout.write();
        alertDialogLayout.IconCompatParcelizer.put(write2, Boolean.FALSE);
        while (write2.hasNext() && !this.MediaBrowserCompat$ItemReceiver) {
            Map.Entry entry = (Map.Entry) write2.next();
            read read2 = (read) entry.getValue();
            while (read2.MediaBrowserCompat$CustomActionResultReceiver.compareTo(this.MediaMetadataCompat) < 0 && !this.MediaBrowserCompat$ItemReceiver) {
                AlertDialogLayout<evictAll, read> alertDialogLayout2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (!alertDialogLayout2.MediaBrowserCompat$CustomActionResultReceiver.containsKey(entry.getKey())) {
                    break;
                }
                this.MediaBrowserCompat$SearchResultReceiver.add(read2.MediaBrowserCompat$CustomActionResultReceiver);
                read2.IconCompatParcelizer(maxsize, MediaBrowserCompat$CustomActionResultReceiver(read2.MediaBrowserCompat$CustomActionResultReceiver));
                ArrayList<entryRemoved.read> arrayList = this.MediaBrowserCompat$SearchResultReceiver;
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(maxSize maxsize) {
        entryRemoved.write write2;
        AlertDialogLayout<evictAll, read> alertDialogLayout = this.MediaBrowserCompat$CustomActionResultReceiver;
        ActivityChooserView.InnerLayout.IconCompatParcelizer iconCompatParcelizer = new ActivityChooserView.InnerLayout.IconCompatParcelizer(alertDialogLayout.write, alertDialogLayout.MediaBrowserCompat$ItemReceiver);
        alertDialogLayout.IconCompatParcelizer.put(iconCompatParcelizer, Boolean.FALSE);
        while (iconCompatParcelizer.hasNext() && !this.MediaBrowserCompat$ItemReceiver) {
            Map.Entry entry = (Map.Entry) iconCompatParcelizer.next();
            read read2 = (read) entry.getValue();
            while (read2.MediaBrowserCompat$CustomActionResultReceiver.compareTo(this.MediaMetadataCompat) > 0 && !this.MediaBrowserCompat$ItemReceiver) {
                AlertDialogLayout<evictAll, read> alertDialogLayout2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (!alertDialogLayout2.MediaBrowserCompat$CustomActionResultReceiver.containsKey(entry.getKey())) {
                    continue;
                    break;
                }
                entryRemoved.read read3 = read2.MediaBrowserCompat$CustomActionResultReceiver;
                int i = C13174.IconCompatParcelizer[read3.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        write2 = entryRemoved.write.ON_DESTROY;
                    } else if (i == 3) {
                        write2 = entryRemoved.write.ON_STOP;
                    } else if (i == 4) {
                        write2 = entryRemoved.write.ON_PAUSE;
                    } else if (i != 5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected state value ");
                        sb.append(read3);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    this.MediaBrowserCompat$SearchResultReceiver.add(MediaBrowserCompat$CustomActionResultReceiver(write2));
                    read2.IconCompatParcelizer(maxsize, write2);
                    ArrayList<entryRemoved.read> arrayList = this.MediaBrowserCompat$SearchResultReceiver;
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    private void write() {
        maxSize maxsize = this.write.get();
        if (maxsize == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!IconCompatParcelizer()) {
            this.MediaBrowserCompat$ItemReceiver = false;
            if (this.MediaMetadataCompat.compareTo(((read) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getValue()).MediaBrowserCompat$CustomActionResultReceiver) < 0) {
                MediaBrowserCompat$CustomActionResultReceiver(maxsize);
            }
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (!this.MediaBrowserCompat$ItemReceiver && activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver != null && this.MediaMetadataCompat.compareTo(((read) activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.getValue()).MediaBrowserCompat$CustomActionResultReceiver) > 0) {
                IconCompatParcelizer(maxsize);
            }
        }
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    static entryRemoved.read write(entryRemoved.read read2, entryRemoved.read read3) {
        return (read3 == null || read3.compareTo(read2) >= 0) ? read2 : read3;
    }

    /* renamed from: o.get$read */
    static class read {
        entryRemoved.read MediaBrowserCompat$CustomActionResultReceiver;
        private createCount write;

        read(evictAll evictall, entryRemoved.read read) {
            this.write = evictionCount.MediaBrowserCompat$CustomActionResultReceiver((Object) evictall);
            this.MediaBrowserCompat$CustomActionResultReceiver = read;
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(maxSize maxsize, entryRemoved.write write2) {
            entryRemoved.read MediaBrowserCompat$CustomActionResultReceiver2 = get.MediaBrowserCompat$CustomActionResultReceiver(write2);
            this.MediaBrowserCompat$CustomActionResultReceiver = get.write(this.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2);
            this.write.MediaBrowserCompat$ItemReceiver(maxsize, write2);
            this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
        }
    }
}
