package p040o;

/* renamed from: o.E2EEEncryptionException */
public final class E2EEEncryptionException {
    final int IconCompatParcelizer;
    public final int read;

    public E2EEEncryptionException() {
        this(0, 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2EEEncryptionException)) {
            return false;
        }
        E2EEEncryptionException e2EEEncryptionException = (E2EEEncryptionException) obj;
        return this.read == e2EEEncryptionException.read && this.IconCompatParcelizer == e2EEEncryptionException.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle(height=");
        sb.append(this.read);
        sb.append(", width=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public E2EEEncryptionException(int i, int i2) {
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E2EEEncryptionException(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? -9999999 : i, (i3 & 2) != 0 ? -9999999 : i2);
    }
}
