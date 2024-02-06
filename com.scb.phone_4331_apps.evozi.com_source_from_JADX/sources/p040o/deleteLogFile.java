package p040o;

/* renamed from: o.deleteLogFile */
public final /* synthetic */ class deleteLogFile implements dump {
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int MediaBrowserCompat$MediaItem;
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver read;
    private final /* synthetic */ int write;

    public /* synthetic */ deleteLogFile(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver, int i, int i2, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver2, int i3, int i4) {
        this.IconCompatParcelizer = discardoldlogfiles_mediabrowsercompat_itemreceiver;
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.read = discardoldlogfiles_mediabrowsercompat_itemreceiver2;
        this.MediaBrowserCompat$ItemReceiver = i3;
        this.MediaBrowserCompat$MediaItem = i4;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        int i = this.write;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver2 = this.read;
        int i3 = this.MediaBrowserCompat$ItemReceiver;
        int i4 = this.MediaBrowserCompat$MediaItem;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver3 = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj;
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver3.setBackgroundResource == discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource) {
            discardoldlogfiles_mediabrowsercompat_itemreceiver3.setIcon = i;
            discardoldlogfiles_mediabrowsercompat_itemreceiver3.Keep = i2;
        } else if (discardoldlogfiles_mediabrowsercompat_itemreceiver3.setBackgroundResource == discardoldlogfiles_mediabrowsercompat_itemreceiver2.setBackgroundResource) {
            discardoldlogfiles_mediabrowsercompat_itemreceiver3.setIcon = i3;
            discardoldlogfiles_mediabrowsercompat_itemreceiver3.Keep = i4;
        }
    }
}
