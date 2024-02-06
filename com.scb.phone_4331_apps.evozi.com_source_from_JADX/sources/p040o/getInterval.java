package p040o;

/* renamed from: o.getInterval */
public final class getInterval implements Comparable<getInterval> {
    private int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.IconCompatParcelizer, ((getInterval) obj).IconCompatParcelizer);
    }

    public getInterval(int i, String str, String str2) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskDetails{sortSequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", riskLevel='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", label='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
