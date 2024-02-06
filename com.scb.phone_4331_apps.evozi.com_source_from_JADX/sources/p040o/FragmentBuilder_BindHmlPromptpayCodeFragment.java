package p040o;

/* renamed from: o.FragmentBuilder_BindHmlPromptpayCodeFragment */
public final class FragmentBuilder_BindHmlPromptpayCodeFragment {
    public final long write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlPromptpayCodeFragment) && this.write == ((FragmentBuilder_BindHmlPromptpayCodeFragment) obj).write;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.write;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceLocationLastUpdate(value=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlPromptpayCodeFragment(long j) {
        this.write = j;
    }
}
