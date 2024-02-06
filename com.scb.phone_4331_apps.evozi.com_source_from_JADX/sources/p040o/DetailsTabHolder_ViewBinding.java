package p040o;

/* renamed from: o.DetailsTabHolder_ViewBinding */
public final class DetailsTabHolder_ViewBinding {
    public int read;
    public final int write;

    public DetailsTabHolder_ViewBinding() {
        this.read = 0;
        this.write = 37;
        this.read = 17;
    }

    public DetailsTabHolder_ViewBinding(byte b) {
        this.read = 0;
        this.write = 37;
        this.read = 17;
    }

    public final DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj == null) {
            this.read *= 37;
        } else if (obj.getClass().isArray()) {
            MediaBrowserCompat$ItemReceiver(obj);
        } else {
            this.read = (this.read * 37) + obj.hashCode();
        }
        return this;
    }

    private void MediaBrowserCompat$ItemReceiver(Object obj) {
        int i = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                this.read *= 37;
                return;
            }
            int length = jArr.length;
            while (i < length) {
                long j = jArr[i];
                this.read = (this.read * 37) + ((int) (j ^ (j >> 32)));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                this.read *= 37;
                return;
            }
            int length2 = iArr.length;
            while (i < length2) {
                this.read = (this.read * 37) + iArr[i];
                i++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            if (sArr == null) {
                this.read *= 37;
                return;
            }
            int length3 = sArr.length;
            while (i < length3) {
                this.read = (this.read * 37) + sArr[i];
                i++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (cArr == null) {
                this.read *= 37;
                return;
            }
            int length4 = cArr.length;
            while (i < length4) {
                this.read = (this.read * 37) + cArr[i];
                i++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                this.read *= 37;
                return;
            }
            int length5 = bArr.length;
            while (i < length5) {
                this.read = (this.read * 37) + bArr[i];
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            if (dArr == null) {
                this.read *= 37;
                return;
            }
            int length6 = dArr.length;
            while (i < length6) {
                long doubleToLongBits = Double.doubleToLongBits(dArr[i]);
                this.read = (this.read * 37) + ((int) (doubleToLongBits ^ (doubleToLongBits >> 32)));
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr == null) {
                this.read *= 37;
                return;
            }
            int length7 = fArr.length;
            while (i < length7) {
                this.read = (this.read * 37) + Float.floatToIntBits(fArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null) {
                this.read *= 37;
                return;
            }
            int length8 = zArr.length;
            while (i < length8) {
                this.read = (this.read * 37) + (zArr[i] ^ true ? 1 : 0);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            if (objArr == null) {
                this.read *= 37;
                return;
            }
            int length9 = objArr.length;
            while (i < length9) {
                MediaBrowserCompat$CustomActionResultReceiver(objArr[i]);
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.read;
    }
}
