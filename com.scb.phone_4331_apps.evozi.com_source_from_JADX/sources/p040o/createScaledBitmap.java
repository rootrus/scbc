package p040o;

import android.content.Context;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.createScaledBitmap */
public final /* synthetic */ class createScaledBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getImageOriginalDateTime MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context read;

    public /* synthetic */ createScaledBitmap(getImageOriginalDateTime getimageoriginaldatetime, Context context) {
        this.MediaBrowserCompat$ItemReceiver = getimageoriginaldatetime;
        this.read = context;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getImageOriginalDateTime getimageoriginaldatetime = this.MediaBrowserCompat$ItemReceiver;
        Context context = this.read;
        CheckExtractActivity_MembersInjector.setVisibility setvisibility = (CheckExtractActivity_MembersInjector.setVisibility) obj;
        int i = Iterables$3$MediaBrowserCompat$MediaItem.purposeful_feature_input_amount_minimum_validation_error;
        Object[] objArr = new Object[1];
        if (getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView == null) {
            str = "0.00";
        } else {
            str = getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction;
        }
        objArr[0] = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(str).doubleValue());
        setvisibility.IconCompatParcelizer(context.getString(i, objArr));
    }
}
