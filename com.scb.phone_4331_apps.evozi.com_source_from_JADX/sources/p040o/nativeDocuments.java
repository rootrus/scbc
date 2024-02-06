package p040o;

import java.util.List;
import p040o.AbstractMultimap;
import p040o.IdParameters;
import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeDocuments */
public final /* synthetic */ class nativeDocuments implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ requireActivity$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ nativeDocuments(nativeConfigureFromFile.IconCompatParcelizer iconCompatParcelizer, requireActivity$MediaBrowserCompat$CustomActionResultReceiver requireactivity_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.write = requireactivity_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        requireActivity$MediaBrowserCompat$CustomActionResultReceiver requireactivity_mediabrowsercompat_customactionresultreceiver = this.write;
        IdParameters.C6915a aVar = (IdParameters.C6915a) obj;
        getPlace getplace = requireactivity_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        nativeConfigureFromFile nativeconfigurefromfile = nativeConfigureFromFile.this;
        discardOldLogFiles unused = nativeconfigurefromfile.Keep = nativeconfigurefromfile.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver(getplace.MediaDescriptionCompat, getplace.MediaBrowserCompat$CustomActionResultReceiver, nativeConfigureFromFile.this.MediaMetadataCompat.setCheckable());
        if (requireactivity_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer != null) {
            nativeConfigureFromFile nativeconfigurefromfile2 = nativeConfigureFromFile.this;
            List unused2 = nativeconfigurefromfile2.read = nativeconfigurefromfile2.PlaybackStateCompat.write(requireactivity_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer, nativeConfigureFromFile.this.MediaMetadataCompat.setCheckable());
        }
        aVar.MediaBrowserCompat$CustomActionResultReceiver(nativeConfigureFromFile.this.Keep.read);
        if (getplace.write == AbstractMultimap.AsMap.AsMapEntries.SUCCESS) {
            aVar.AppCompatDelegateImpl$ListMenuDecorView();
            aVar.AppCompatActivity();
            aVar.read(true);
            nativeConfigureFromFile nativeconfigurefromfile3 = nativeConfigureFromFile.this;
            nativeConfigureFromFile.IconCompatParcelizer(nativeconfigurefromfile3, (List) nativeconfigurefromfile3.Keep.read);
            aVar.AppCompatDialogFragment();
        } else if (getplace.write == AbstractMultimap.AsMap.AsMapEntries.LOADING) {
            aVar.setIcon();
            aVar.AppCompatActivity();
            aVar.read(false);
        } else {
            aVar.AppCompatDelegateImpl$ListMenuDecorView();
            aVar.setShortcut();
            aVar.read(false);
        }
    }
}
