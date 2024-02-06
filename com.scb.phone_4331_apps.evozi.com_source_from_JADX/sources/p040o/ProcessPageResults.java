package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.MapView;
import p040o.OcrEventListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.ProcessPageResults */
public final /* synthetic */ class ProcessPageResults implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ MapView.zzb read;
    private final /* synthetic */ OcrEventListener.C37034 write;

    public /* synthetic */ ProcessPageResults(OcrEventListener.C37034 r1, Throwable th, MapView.zzb zzb) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
        this.read = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPassportNumber) obj).read(((RetrofitException) this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer.write.read, OcrEventListener.read(this.read.write).booleanValue());
    }
}
