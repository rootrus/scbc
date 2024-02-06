package p040o;

import java.util.List;

/* renamed from: o.NavigationView */
public final class NavigationView implements C4602xca7af99c {
    public final List<String> IconCompatParcelizer;
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final Boolean write;

    public NavigationView() {
        this((byte) 0);
    }

    public NavigationView(String str, Boolean bool, String str2, List<String> list, List<String> list2) {
        this.read = str;
        this.write = bool;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = list2;
    }

    private /* synthetic */ NavigationView(byte b) {
        this((String) null, (Boolean) null, (String) null, (List<String>) null, (List<String>) null);
    }
}
