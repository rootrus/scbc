package p040o;

/* renamed from: o.HmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver */
class C10400xfa72b0a5 {
    private int read;
    private final byte[] write;

    C10400xfa72b0a5(byte[] bArr) {
        this.read = C6958xd50139e8.read(bArr);
        this.write = bArr;
    }

    public final int hashCode() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10400xfa72b0a5) {
            return C6958xd50139e8.write(this.write, ((C10400xfa72b0a5) obj).write);
        }
        return false;
    }
}
