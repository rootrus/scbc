package p040o;

import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

/* renamed from: o.IsActive */
public final /* synthetic */ class IsActive implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzmd.zzm.zzb.zza IconCompatParcelizer;

    public /* synthetic */ IsActive(zzmd.zzm.zzb.zza zza) {
        this.IconCompatParcelizer = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        validateWithImage.write(this.IconCompatParcelizer, (CheckCaptureModule_GetLookAndFeelParametersFactory.write) obj);
    }
}
