package p040o;

import p040o.ExperimentTokens;
import p040o.IdCaptureModule;

/* renamed from: o.SqlDateTypeAdapter */
public class SqlDateTypeAdapter extends writeUInt64NoTag<IdCaptureModule.OnDeviceExceptionResponseDeserializer> {
    public final ExperimentTokens.zza IconCompatParcelizer;
    public String read;

    @HmlPinActivity
    public SqlDateTypeAdapter(RegularImmutableBiMap regularImmutableBiMap, ExperimentTokens.zza zza) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = zza;
    }

    static /* synthetic */ void write(String str, IdCaptureModule.OnDeviceExceptionResponseDeserializer onDeviceExceptionResponseDeserializer) {
        onDeviceExceptionResponseDeserializer.IconCompatParcelizer(!str.isEmpty());
        onDeviceExceptionResponseDeserializer.MediaBrowserCompat$CustomActionResultReceiver(str.isEmpty());
    }

    static /* synthetic */ void IconCompatParcelizer(SqlDateTypeAdapter sqlDateTypeAdapter) {
        if (sqlDateTypeAdapter.RatingCompat != null) {
            sqlDateTypeAdapter.RatingCompat.aj_();
        }
    }
}
