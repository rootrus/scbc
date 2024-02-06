package p040o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.AppCompatImageButton */
public final class AppCompatImageButton implements CheckExtractActivity {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
    private final RecyclerView.IconCompatParcelizer write;

    /* renamed from: o.AppCompatImageButton$IconCompatParcelizer */
    public static class IconCompatParcelizer<T> implements C1139x315f0a97<T> {
        private int IconCompatParcelizer;
        private final Object[] MediaBrowserCompat$CustomActionResultReceiver = new Object[256];

        public final T read() {
            int i = this.IconCompatParcelizer;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            T t = tArr[i2];
            tArr[i2] = null;
            this.IconCompatParcelizer = i2;
            return t;
        }

        public final boolean write(T t) {
            int i = this.IconCompatParcelizer;
            Object[] objArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.IconCompatParcelizer = i + 1;
            return true;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.IconCompatParcelizer;
                Object[] objArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.IconCompatParcelizer = i3 + 1;
                }
            }
        }
    }

    public AppCompatImageButton(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Object obj) {
        this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2, obj);
    }

    public final void read(int i, int i2) {
        this.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        this.write.IconCompatParcelizer.IconCompatParcelizer(i, i2);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        this.write.IconCompatParcelizer.write(i, i2);
    }

    public AppCompatImageButton() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0054 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatImageButton.<clinit>():void");
    }
}
