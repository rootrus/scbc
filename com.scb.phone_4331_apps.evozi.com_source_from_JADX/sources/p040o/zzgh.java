package p040o;

import java.util.ArrayList;

/* renamed from: o.zzgh */
public final /* synthetic */ class zzgh implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzgh(zzam zzam) {
    }

    public final Object write(Object obj) {
        addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistener = (addLottieOnCompositionLoadedListener) obj;
        ArrayList arrayList = new ArrayList();
        if (!(addlottieoncompositionloadedlistener == null || addlottieoncompositionloadedlistener.IconCompatParcelizer == null)) {
            for (addValueCallback next : addlottieoncompositionloadedlistener.IconCompatParcelizer) {
                getAction getaction = new getAction();
                getaction.MediaBrowserCompat$ItemReceiver = next.MediaBrowserCompat$CustomActionResultReceiver;
                getaction.read = next.MediaBrowserCompat$ItemReceiver;
                getaction.write = next.write;
                getaction.RatingCompat = next.MediaBrowserCompat$MediaItem;
                getaction.MediaBrowserCompat$CustomActionResultReceiver = next.IconCompatParcelizer;
                getaction.IconCompatParcelizer = next.read;
                arrayList.add(getaction);
            }
        }
        return new GiftingActivity_ViewBinding(arrayList);
    }
}
