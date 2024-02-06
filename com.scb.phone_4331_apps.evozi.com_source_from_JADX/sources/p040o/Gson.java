package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzqj;

/* renamed from: o.Gson */
final class Gson implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.Gson$FutureTypeAdapter */
    public final /* synthetic */ class FutureTypeAdapter implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ zzqj.zza IconCompatParcelizer;

        public /* synthetic */ FutureTypeAdapter(zzqj.zza zza) {
            this.IconCompatParcelizer = zza;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getLastName) obj).write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        }
    }

    Gson(FundFactSheetActivity fundFactSheetActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.invoke(obj), "invoke(...)");
    }
}
