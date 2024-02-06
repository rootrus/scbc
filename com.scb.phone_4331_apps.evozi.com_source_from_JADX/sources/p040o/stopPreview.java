package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.stopPreview */
public final /* synthetic */ class stopPreview implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ISdkDaggerPerContextComponent IconCompatParcelizer;

    public /* synthetic */ stopPreview(ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent) {
        this.IconCompatParcelizer = iSdkDaggerPerContextComponent;
    }

    public final void IconCompatParcelizer(Object obj) {
        T t;
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.IconCompatParcelizer;
        getListener getlistener = (getListener) obj;
        ByteArrayDataInput byteArrayDataInput = iSdkDaggerPerContextComponent.MediaBrowserCompat$ItemReceiver;
        List<newCameraPosition> list = iSdkDaggerPerContextComponent.read;
        onGetStartedClick.write((Object) list, "idps");
        Iterable<newCameraPosition> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (newCameraPosition newcameraposition : iterable) {
            arrayList.add(newcameraposition.MediaBrowserCompat$CustomActionResultReceiver);
        }
        Iterable<zzui> iterable2 = (List) arrayList;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable2).size());
        for (zzui zzui : iterable2) {
            if (byteArrayDataInput.IconCompatParcelizer.IconCompatParcelizer()) {
                t = zzui.write;
            } else {
                t = zzui.read;
            }
            arrayList2.add((String) t);
        }
        getlistener.write((List) arrayList2);
    }
}
