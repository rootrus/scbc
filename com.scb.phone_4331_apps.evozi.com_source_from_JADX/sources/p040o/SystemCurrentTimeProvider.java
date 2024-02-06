package p040o;

/* renamed from: o.SystemCurrentTimeProvider */
public final class SystemCurrentTimeProvider extends persistUserId {
    public final int read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SystemCurrentTimeProvider) && this.read == ((SystemCurrentTimeProvider) obj).read;
        }
        return true;
    }

    public final int hashCode() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilitySummarySectionDisplay(sectionNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public SystemCurrentTimeProvider(int i) {
        super((byte) 0);
        this.read = i;
    }
}
