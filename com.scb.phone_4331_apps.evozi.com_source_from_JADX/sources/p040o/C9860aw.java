package p040o;

import p040o.CheckWorkflowActivity;
import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.aw */
public final /* synthetic */ class C9860aw implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutocompleteFilter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver read;

    public /* synthetic */ C9860aw(setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver setcroplinestyle_mediabrowsercompat_customactionresultreceiver, AutocompleteFilter autocompleteFilter) {
        this.read = setcroplinestyle_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = autocompleteFilter;
    }

    public final void IconCompatParcelizer(Object obj) {
        setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver setcroplinestyle_mediabrowsercompat_customactionresultreceiver = this.read;
        AutocompleteFilter autocompleteFilter = this.MediaBrowserCompat$CustomActionResultReceiver;
        StandardTable.C38192 MediaDescriptionCompat = setcroplinestyle_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.PlaybackStateCompat;
        loadInstallerPackageName IconCompatParcelizer = loadInstallerPackageName.IconCompatParcelizer();
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = StandardTable.C38192.MediaBrowserCompat$ItemReceiver(autocompleteFilter.write, new StandardTable.Column(MediaDescriptionCompat));
        ((CheckWorkflowActivity.C64001) obj).write(IconCompatParcelizer);
    }
}
