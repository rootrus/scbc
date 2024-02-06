package p040o;

/* renamed from: o.createInvokeID */
public final class createInvokeID {
    public final int[] IconCompatParcelizer;
    public final rsnScriptForEach[] MediaBrowserCompat$CustomActionResultReceiver;
    public final int write;

    public createInvokeID(int i, int[] iArr, int i2, int i3, int i4) {
        this.write = i;
        this.IconCompatParcelizer = iArr;
        float f = (float) i2;
        float f2 = (float) i4;
        this.MediaBrowserCompat$CustomActionResultReceiver = new rsnScriptForEach[]{new rsnScriptForEach(f, f2), new rsnScriptForEach((float) i3, f2)};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof createInvokeID) && this.write == ((createInvokeID) obj).write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.write;
    }
}
