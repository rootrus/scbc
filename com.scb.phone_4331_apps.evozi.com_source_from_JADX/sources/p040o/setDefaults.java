package p040o;

import p040o.access$2300;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDefaults */
public final /* synthetic */ class setDefaults implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassProgram IconCompatParcelizer;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ setDefaults(getSecondPassProgram getsecondpassprogram, Throwable th) {
        this.IconCompatParcelizer = getsecondpassprogram;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassProgram getsecondpassprogram = this.IconCompatParcelizer;
        ((setCvv.IconCompatParcelizer) obj).mo13730i_(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
