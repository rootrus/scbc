package p040o;

/* renamed from: o.EasycashCardInfoCaseModule */
public final class EasycashCardInfoCaseModule {
    final boolean read;
    final boolean write;

    public EasycashCardInfoCaseModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasycashCardInfoCaseModule)) {
            return false;
        }
        EasycashCardInfoCaseModule easycashCardInfoCaseModule = (EasycashCardInfoCaseModule) obj;
        return this.read == easycashCardInfoCaseModule.read && this.write == easycashCardInfoCaseModule.write;
    }

    public final int hashCode() {
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.write;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkState(hasWifi=");
        sb.append(this.read);
        sb.append(", hasInternet=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public EasycashCardInfoCaseModule(boolean z, boolean z2) {
        this.read = z;
        this.write = z2;
    }

    public /* synthetic */ EasycashCardInfoCaseModule(byte b) {
        this(false, false);
    }
}
