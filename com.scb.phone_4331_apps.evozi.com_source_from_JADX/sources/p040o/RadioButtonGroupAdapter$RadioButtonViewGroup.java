package p040o;

/* renamed from: o.RadioButtonGroupAdapter$RadioButtonViewGroup */
public final class RadioButtonGroupAdapter$RadioButtonViewGroup {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int read;
    public int write;

    public RadioButtonGroupAdapter$RadioButtonViewGroup(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.read = i2;
            this.write = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    public final void write(int i) {
        if (i < this.MediaBrowserCompat$CustomActionResultReceiver) {
            StringBuilder sb = new StringBuilder();
            sb.append("pos: ");
            sb.append(i);
            sb.append(" < lowerBound: ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i <= this.read) {
            this.write = i;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pos: ");
            sb2.append(i);
            sb2.append(" > upperBound: ");
            sb2.append(this.read);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Integer.toString(this.MediaBrowserCompat$CustomActionResultReceiver));
        sb.append('>');
        sb.append(Integer.toString(this.write));
        sb.append('>');
        sb.append(Integer.toString(this.read));
        sb.append(']');
        return sb.toString();
    }
}
