package p040o;

/* renamed from: o.AdditionDocumentTypeAdapter$DocumentViewHolder */
public final class AdditionDocumentTypeAdapter$DocumentViewHolder implements AdditionDocumentAdapter$DocumentViewHolder {
    private final byte write;

    AdditionDocumentTypeAdapter$DocumentViewHolder(byte b) {
        this.write = b;
    }

    public final boolean IconCompatParcelizer() {
        throw new IllegalStateException("Authorization Role object does not know its type/OID yet. This is a bug.");
    }

    public final byte read() {
        return this.write;
    }
}
