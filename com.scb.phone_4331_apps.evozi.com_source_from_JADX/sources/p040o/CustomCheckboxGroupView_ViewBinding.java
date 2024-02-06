package p040o;

/* renamed from: o.CustomCheckboxGroupView_ViewBinding */
public abstract class CustomCheckboxGroupView_ViewBinding<T> implements CustomCheckboxGroupView<T>, CustomDoubleCircleBorderView {
    private final CustomCheckboxGroupView_ViewBinding<?> IconCompatParcelizer;
    private ColorChangeableNumberPicker MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    public final DraggableFloatingActionButton read;

    public void read() {
    }

    public CustomCheckboxGroupView_ViewBinding() {
        this((CustomCheckboxGroupView_ViewBinding<?>) null, false);
    }

    public CustomCheckboxGroupView_ViewBinding(CustomCheckboxGroupView_ViewBinding<?> customCheckboxGroupView_ViewBinding) {
        this(customCheckboxGroupView_ViewBinding, true);
    }

    public CustomCheckboxGroupView_ViewBinding(CustomCheckboxGroupView_ViewBinding<?> customCheckboxGroupView_ViewBinding, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = Long.MIN_VALUE;
        this.IconCompatParcelizer = customCheckboxGroupView_ViewBinding;
        this.read = (!z || customCheckboxGroupView_ViewBinding == null) ? new DraggableFloatingActionButton() : customCheckboxGroupView_ViewBinding.read;
    }

    public final void write() {
        this.read.write();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read.read;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(long r7) {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0031
            monitor-enter(r6)
            o.ColorChangeableNumberPicker r2 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0012
            o.ColorChangeableNumberPicker r0 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x002e }
            monitor-exit(r6)
            r0.write(r7)
            return
        L_0x0012:
            long r2 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x002e }
            r4 = -9223372036854775808
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            r6.MediaBrowserCompat$ItemReceiver = r7     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x001d:
            long r2 = r2 + r7
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x002a
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.MediaBrowserCompat$ItemReceiver = r7     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x002a:
            r6.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r6)
            return
        L_0x002e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0031:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "number requested cannot be negative: "
            r0.append(r1)
            r0.append(r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CustomCheckboxGroupView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(long):void");
    }

    public void write(ColorChangeableNumberPicker colorChangeableNumberPicker) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = colorChangeableNumberPicker;
            z = this.IconCompatParcelizer != null && j == Long.MIN_VALUE;
        }
        if (z) {
            this.IconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else if (j == Long.MIN_VALUE) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(Long.MAX_VALUE);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(j);
        }
    }
}
