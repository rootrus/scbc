package p040o;

/* renamed from: o.setX */
public enum setX {
    ;

    /* access modifiers changed from: package-private */
    public abstract boolean read(int i, int i2);

    public final void IconCompatParcelizer(rsnScriptSetVarI rsnscriptsetvari, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (read(i2, i3)) {
                    int i4 = (rsnscriptsetvari.read * i2) + (i3 / 32);
                    int[] iArr = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr[i4] = (1 << (i3 & 31)) ^ iArr[i4];
                }
            }
        }
    }
}
