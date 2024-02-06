package p040o;

import android.content.Context;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageBarCodes */
public final /* synthetic */ class getImageBarCodes implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Context MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getImageOriginalDateTime read;

    public /* synthetic */ getImageBarCodes(getImageOriginalDateTime getimageoriginaldatetime, Context context) {
        this.read = getimageoriginaldatetime;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getImageOriginalDateTime getimageoriginaldatetime = this.read;
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckExtractActivity_MembersInjector.setVisibility setvisibility = (CheckExtractActivity_MembersInjector.setVisibility) obj;
        int i = Iterables$3$MediaBrowserCompat$MediaItem.purposeful_feature_input_amount_maximum_validation_error;
        Object[] objArr = new Object[1];
        if (getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView == null) {
            str = "0.00";
        } else {
            str = getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView;
        }
        objArr[0] = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(str).doubleValue());
        setvisibility.IconCompatParcelizer(context.getString(i, objArr));
    }
}
