package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToMeStep1Fragment */
public final class FragmentBuilder_BindTransferToMeStep1Fragment {
    int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public long MediaBrowserCompat$ItemReceiver;
    String read;
    private String write;

    public FragmentBuilder_BindTransferToMeStep1Fragment(int i, String str, long j, String str2, String str3) {
        this.IconCompatParcelizer = i;
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReleaseDataModel{releaseType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", id='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", lastModifiedDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", lastModifiedByName='");
        sb.append(this.write);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
