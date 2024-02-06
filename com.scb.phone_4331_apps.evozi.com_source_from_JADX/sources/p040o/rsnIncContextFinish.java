package p040o;

/* renamed from: o.rsnIncContextFinish */
public final class rsnIncContextFinish {
    public final int IconCompatParcelizer;
    public final int read;

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnIncContextFinish)) {
            return false;
        }
        rsnIncContextFinish rsninccontextfinish = (rsnIncContextFinish) obj;
        return this.read == rsninccontextfinish.read && this.IconCompatParcelizer == rsninccontextfinish.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read * 32713) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("x");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
