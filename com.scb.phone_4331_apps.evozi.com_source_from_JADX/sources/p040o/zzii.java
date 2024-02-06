package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.zzby;

/* renamed from: o.zzii */
public final /* synthetic */ class zzii implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ onNextTutorialButtonClick write;

    public /* synthetic */ zzii(onNextTutorialButtonClick onnexttutorialbuttonclick) {
        this.write = onnexttutorialbuttonclick;
    }

    public final Object write(Object obj) {
        AnimatableScaleValue animatableScaleValue = (AnimatableScaleValue) obj;
        onGetStartedClick.write((Object) animatableScaleValue, "supportingDocumentTypeEntity");
        zzby.zzb.read read = new zzby.zzb.read();
        List<AnimatablePointValue> list = animatableScaleValue.read;
        ArrayList arrayList = new ArrayList();
        for (AnimatablePointValue next : list) {
            zzby.zza.write write2 = new zzby.zza.write();
            write2.write = next.MediaBrowserCompat$CustomActionResultReceiver;
            write2.MediaBrowserCompat$MediaItem = next.write;
            write2.MediaBrowserCompat$ItemReceiver = next.IconCompatParcelizer;
            arrayList.add(new zzby.zza(write2, (byte) 0));
        }
        read.IconCompatParcelizer = arrayList;
        return new zzby.zzb(read, (byte) 0);
    }
}
