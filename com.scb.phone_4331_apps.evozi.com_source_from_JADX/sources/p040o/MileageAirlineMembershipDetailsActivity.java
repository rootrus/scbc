package p040o;

/* renamed from: o.MileageAirlineMembershipDetailsActivity */
public final class MileageAirlineMembershipDetailsActivity {
    public int IconCompatParcelizer = -1;
    public String write = "";

    public MileageAirlineMembershipDetailsActivity(int i, String str) {
        this.IconCompatParcelizer = i;
        this.write = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: ");
        sb2.append(this.IconCompatParcelizer);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; Error message: ");
        sb3.append(this.write);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
