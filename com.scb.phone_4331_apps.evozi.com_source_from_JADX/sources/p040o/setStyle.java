package p040o;

/* renamed from: o.setStyle */
public final class setStyle<T> {
    public final T IconCompatParcelizer;
    public final int read;

    public setStyle(int i, T t) {
        this.read = i;
        this.IconCompatParcelizer = t;
    }

    public final int hashCode() {
        int i = this.read;
        T t = this.IconCompatParcelizer;
        return ((i + 679) * 97) + (t != null ? t.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setStyle setstyle = (setStyle) obj;
        if (this.read != setstyle.read) {
            return false;
        }
        T t = this.IconCompatParcelizer;
        T t2 = setstyle.IconCompatParcelizer;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntPair[");
        sb.append(this.read);
        sb.append(", ");
        sb.append(this.IconCompatParcelizer);
        sb.append(']');
        return sb.toString();
    }
}
