package p040o;

import p040o.C4381eq;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

/* renamed from: o.ec */
public final /* synthetic */ class C4363ec implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4381eq.write write;

    public /* synthetic */ C4363ec(C4381eq.write write2) {
        this.write = write2;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4381eq.write write2 = this.write;
        getTopLeftCornerWidth.setBackgroundResource setbackgroundresource = (getTopLeftCornerWidth.setBackgroundResource) obj;
        setbackgroundresource.write(C4381eq.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        setbackgroundresource.read(C4381eq.this.MediaBrowserCompat$ItemReceiver.read);
        setbackgroundresource.MediaBrowserCompat$ItemReceiver(C4381eq.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        if (zzmd.zzm.zzb.zza.INDIVIDUAL.equals(C4381eq.this.IconCompatParcelizer.IconCompatParcelizer())) {
            setbackgroundresource.IconCompatParcelizer(C4381eq.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
