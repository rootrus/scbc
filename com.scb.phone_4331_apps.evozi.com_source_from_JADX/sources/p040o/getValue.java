package p040o;

/* renamed from: o.getValue */
public final class getValue extends rsnScriptForEach {
    public final int IconCompatParcelizer;
    public final float write;

    getValue(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private getValue(float f, float f2, float f3, int i) {
        super(f, f2);
        this.write = f3;
        this.IconCompatParcelizer = i;
    }

    /* access modifiers changed from: package-private */
    public final getValue MediaBrowserCompat$ItemReceiver(float f, float f2, float f3) {
        int i = this.IconCompatParcelizer;
        int i2 = i + 1;
        float f4 = (float) i2;
        return new getValue(((((float) i) * this.MediaBrowserCompat$CustomActionResultReceiver) + f2) / f4, ((((float) this.IconCompatParcelizer) * this.read) + f) / f4, ((((float) this.IconCompatParcelizer) * this.write) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer(float f, float f2, float f3) {
        if (Math.abs(f2 - this.read) > f || Math.abs(f3 - this.MediaBrowserCompat$CustomActionResultReceiver) > f) {
            return false;
        }
        float abs = Math.abs(f - this.write);
        if (abs <= 1.0f || abs <= this.write) {
            return true;
        }
        return false;
    }
}
