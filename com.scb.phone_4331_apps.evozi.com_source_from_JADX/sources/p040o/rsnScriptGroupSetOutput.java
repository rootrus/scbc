package p040o;

import java.util.LinkedList;
import okhttp3.internal.http2.Settings;

/* renamed from: o.rsnScriptGroupSetOutput */
final class rsnScriptGroupSetOutput {
    static final rsnScriptGroupSetOutput MediaBrowserCompat$CustomActionResultReceiver = new rsnScriptGroupSetOutput(rsnScriptIntrinsicBLAS_Double.MediaBrowserCompat$CustomActionResultReceiver, 0, 0, 0);
    private final rsnScriptIntrinsicBLAS_Double IconCompatParcelizer;
    final int MediaBrowserCompat$ItemReceiver;
    final int read;
    final int write;

    private rsnScriptGroupSetOutput(rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double, int i, int i2, int i3) {
        this.IconCompatParcelizer = rsnscriptintrinsicblas_double;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = i2;
        this.read = i3;
    }

    /* access modifiers changed from: package-private */
    public final rsnScriptGroupSetOutput MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        int i3 = this.read;
        rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double = this.IconCompatParcelizer;
        if (i != this.MediaBrowserCompat$ItemReceiver) {
            int i4 = rsnScriptGroupCreate.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$ItemReceiver][i];
            int i5 = i4 >> 16;
            i3 += i5;
            rsnscriptintrinsicblas_double = new rsnScriptGroupExecute(rsnscriptintrinsicblas_double, i4 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i5);
        }
        int i6 = i == 2 ? 4 : 5;
        return new rsnScriptGroupSetOutput(new rsnScriptGroupExecute(rsnscriptintrinsicblas_double, i2, i6), i, 0, i3 + i6);
    }

    /* access modifiers changed from: package-private */
    public final rsnScriptGroupSetOutput IconCompatParcelizer(int i, int i2) {
        rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double = this.IconCompatParcelizer;
        int i3 = this.MediaBrowserCompat$ItemReceiver == 2 ? 4 : 5;
        return new rsnScriptGroupSetOutput(new rsnScriptGroupExecute(new rsnScriptGroupExecute(rsnscriptintrinsicblas_double, rsnScriptGroupCreate.MediaBrowserCompat$CustomActionResultReceiver[this.MediaBrowserCompat$ItemReceiver][i], i3), i2, 5), this.MediaBrowserCompat$ItemReceiver, 0, this.read + i3 + 5);
    }

    /* access modifiers changed from: package-private */
    public final rsnScriptGroupSetOutput read(int i) {
        rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        int i3 = this.read;
        if (i2 == 4 || i2 == 2) {
            int i4 = rsnScriptGroupCreate.MediaBrowserCompat$ItemReceiver[i2][0];
            int i5 = i4 >> 16;
            rsnScriptGroupExecute rsnscriptgroupexecute = new rsnScriptGroupExecute(rsnscriptintrinsicblas_double, i4 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i5);
            i3 += i5;
            i2 = 0;
            rsnscriptintrinsicblas_double = rsnscriptgroupexecute;
        }
        int i6 = this.write;
        rsnScriptGroupSetOutput rsnscriptgroupsetoutput = new rsnScriptGroupSetOutput(rsnscriptintrinsicblas_double, i2, this.write + 1, i3 + ((i6 == 0 || i6 == 31) ? 18 : i6 == 62 ? 9 : 8));
        return rsnscriptgroupsetoutput.write == 2078 ? rsnscriptgroupsetoutput.MediaBrowserCompat$CustomActionResultReceiver(i + 1) : rsnscriptgroupsetoutput;
    }

    /* access modifiers changed from: package-private */
    public final rsnScriptGroupSetOutput MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = this.write;
        if (i2 == 0) {
            return this;
        }
        return new rsnScriptGroupSetOutput(new rsnScriptGroupSetInput(this.IconCompatParcelizer, i - i2, i2), this.MediaBrowserCompat$ItemReceiver, 0, this.read);
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer(rsnScriptGroupSetOutput rsnscriptgroupsetoutput) {
        int i;
        int i2 = this.read + (rsnScriptGroupCreate.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$ItemReceiver][rsnscriptgroupsetoutput.MediaBrowserCompat$ItemReceiver] >> 16);
        int i3 = rsnscriptgroupsetoutput.write;
        if (i3 > 0 && ((i = this.write) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= rsnscriptgroupsetoutput.read;
    }

    /* access modifiers changed from: package-private */
    public final rsnScriptIntrinsicCreate MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        LinkedList<rsnScriptIntrinsicBLAS_Double> linkedList = new LinkedList<>();
        for (rsnScriptIntrinsicBLAS_Double rsnscriptintrinsicblas_double = MediaBrowserCompat$CustomActionResultReceiver(bArr.length).IconCompatParcelizer; rsnscriptintrinsicblas_double != null; rsnscriptintrinsicblas_double = rsnscriptintrinsicblas_double.IconCompatParcelizer) {
            linkedList.addFirst(rsnscriptintrinsicblas_double);
        }
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate();
        for (rsnScriptIntrinsicBLAS_Double write2 : linkedList) {
            write2.write(rsnscriptintrinsiccreate, bArr);
        }
        return rsnscriptintrinsiccreate;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{rsnScriptGroupCreate.read[this.MediaBrowserCompat$ItemReceiver], Integer.valueOf(this.read), Integer.valueOf(this.write)});
    }
}
