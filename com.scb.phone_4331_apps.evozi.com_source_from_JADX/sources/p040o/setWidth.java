package p040o;

/* renamed from: o.setWidth */
public final class setWidth {
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setWidth) && this.write == ((setWidth) obj).write;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardResetPinResponse(magneticCardFlag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setWidth(boolean z) {
        this.write = z;
    }
}
