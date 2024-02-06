package p040o;

import p040o.setDomain;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.getLocalPath */
public final /* synthetic */ class getLocalPath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzcz.zzg MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setDomain.write read;

    public /* synthetic */ getLocalPath(setDomain.write write, zzcz.zzg zzg) {
        this.read = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzg;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain.write write = this.read;
        zzcz.zzg zzg = this.MediaBrowserCompat$CustomActionResultReceiver;
        ExtractionParameters_Factory extractionParameters_Factory = (ExtractionParameters_Factory) obj;
        extractionParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(true);
        if (setDomain.this.ParcelableVolumeInfo != 0.0d) {
            extractionParameters_Factory.read();
            setDomain setdomain = setDomain.this;
            setdomain.write(setdomain.ParcelableVolumeInfo, false);
        }
        populateMultimap unused = setDomain.this.IconCompatParcelizer;
        extractionParameters_Factory.IconCompatParcelizer(constrainedListMultimap.MediaBrowserCompat$CustomActionResultReceiver(zzg.IconCompatParcelizer.read));
    }
}
