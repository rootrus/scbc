package p040o;

/* renamed from: o.forMap$MediaBrowserCompat$CustomActionResultReceiver */
public final class forMap$MediaBrowserCompat$CustomActionResultReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    private forMap$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ forMap$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public final boolean write(Object obj) {
        onInfoWindowLongClick oninfowindowlongclick = (onInfoWindowLongClick) obj;
        return this.read.equals(oninfowindowlongclick.setBackgroundResource) && this.MediaBrowserCompat$CustomActionResultReceiver.equals(oninfowindowlongclick.write) && this.MediaBrowserCompat$ItemReceiver.equals(oninfowindowlongclick.AppCompatDialogFragment);
    }
}
