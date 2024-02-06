package p040o;

/* renamed from: o.instantiate */
public final class instantiate {
    private static final instantiate IconCompatParcelizer = new instantiate();
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final int write;

    private instantiate() {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.write = 0;
    }

    public static instantiate write() {
        return IconCompatParcelizer;
    }

    private instantiate(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.write = i;
    }

    public static instantiate write(int i) {
        return new instantiate(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof instantiate)) {
            return false;
        }
        instantiate instantiate = (instantiate) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver || !instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
                return true;
            }
        } else if (this.write == instantiate.write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return this.write;
        }
        return 0;
    }

    public final String toString() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.write)});
    }
}
