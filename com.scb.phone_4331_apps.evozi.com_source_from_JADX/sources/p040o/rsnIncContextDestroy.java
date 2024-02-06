package p040o;

/* renamed from: o.rsnIncContextDestroy */
public final class rsnIncContextDestroy extends rsnIncElementCreate {
    private final rsnIncElementCreate read;

    public final byte[] read(int i, byte[] bArr) {
        byte[] read2 = this.read.read(i, bArr);
        int i2 = this.IconCompatParcelizer;
        for (int i3 = 0; i3 < i2; i3++) {
            read2[i3] = (byte) (255 - (read2[i3] & 255));
        }
        return read2;
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        byte[] MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver();
        int i = this.IconCompatParcelizer * this.MediaBrowserCompat$ItemReceiver;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (MediaBrowserCompat$ItemReceiver[i2] & 255));
        }
        return bArr;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final rsnIncElementCreate IconCompatParcelizer() {
        return this.read;
    }

    public final rsnIncElementCreate read() {
        return new rsnIncContextDestroy(this.read.read());
    }

    public rsnIncContextDestroy(rsnIncElementCreate rsnincelementcreate) {
        super(rsnincelementcreate.IconCompatParcelizer, rsnincelementcreate.MediaBrowserCompat$ItemReceiver);
        this.read = rsnincelementcreate;
    }
}
