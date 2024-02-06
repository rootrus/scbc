package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Frame;

/* renamed from: o.BarCodeDirection */
public class BarCodeDirection extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.ListMenuItemView> {
    public List<convertMemInfoToBytes> IconCompatParcelizer = new ArrayList();
    /* access modifiers changed from: private */
    public final ObjectArrays read;
    public final Frame.Builder write;

    @HmlPinActivity
    public BarCodeDirection(RegularImmutableBiMap regularImmutableBiMap, Frame.Builder builder, ObjectArrays objectArrays) {
        super(regularImmutableBiMap);
        this.write = builder;
        this.read = objectArrays;
    }

    static /* synthetic */ void IconCompatParcelizer(BarCodeDirection barCodeDirection) {
        if (barCodeDirection.RatingCompat != null) {
            barCodeDirection.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(BarCodeDirection barCodeDirection) {
        if (barCodeDirection.RatingCompat != null) {
            barCodeDirection.RatingCompat.aj_();
        }
    }

    static /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(String str, convertMemInfoToBytes convertmeminfotobytes) {
        return convertmeminfotobytes.IconCompatParcelizer.contains(str) || convertmeminfotobytes.MediaBrowserCompat$ItemReceiver.toLowerCase().contains(str.toLowerCase()) || convertmeminfotobytes.read.contains(str) || convertmeminfotobytes.write.toLowerCase().contains(str.toLowerCase());
    }
}
