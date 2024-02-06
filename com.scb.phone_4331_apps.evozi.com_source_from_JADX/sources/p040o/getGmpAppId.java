package p040o;

/* renamed from: o.getGmpAppId */
public class getGmpAppId extends getUserProperties {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String read;
    public String write;

    protected getGmpAppId(getGmpAppId$MediaBrowserCompat$CustomActionResultReceiver getgmpappid_mediabrowsercompat_customactionresultreceiver) {
        super(getgmpappid_mediabrowsercompat_customactionresultreceiver);
        this.read = getgmpappid_mediabrowsercompat_customactionresultreceiver.write;
        this.write = getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = getgmpappid_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = getgmpappid_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$MediaItem = getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
    }
}
