package p040o;

import java.util.ArrayList;
import p040o.zzqj;

/* renamed from: o.setCheckoutOptions */
public final class setCheckoutOptions extends FragmentBuilder_BindSummaryFragment {
    public static zzqj.zza read(getFontPath getfontpath) {
        AddNewCurrencyActivity addNewCurrencyActivity;
        getFontPath getfontpath2 = getfontpath;
        ArrayList arrayList = new ArrayList();
        ModifyQuickTopUpReviewActivity modifyQuickTopUpReviewActivity = null;
        if (getfontpath2.MediaBrowserCompat$ItemReceiver != null) {
            for (fetchFont next : getfontpath2.MediaBrowserCompat$ItemReceiver) {
                if (next.MediaBrowserCompat$MediaItem != null) {
                    addNewCurrencyActivity = new AddNewCurrencyActivity(next.MediaBrowserCompat$MediaItem.IconCompatParcelizer);
                } else {
                    addNewCurrencyActivity = null;
                }
                arrayList.add(new DetailsTabHolder(next.ParcelableVolumeInfo, next.RatingCompat, next.MediaDescriptionCompat, next.MediaBrowserCompat$CustomActionResultReceiver, next.MediaSessionCompat$ResultReceiverWrapper, next.MediaSessionCompat$Token, next.f2581x50fd9e4a, next.MediaBrowserCompat$SearchResultReceiver, next.MediaSessionCompat$QueueItem, addNewCurrencyActivity, next.read, next.write, next.IconCompatParcelizer, next.MediaBrowserCompat$ItemReceiver, next.Keep, next.PlaybackStateCompat$CustomAction, next.MediaMetadataCompat));
            }
        }
        if (getfontpath2.write != null) {
            cancel cancel = getfontpath2.write;
            modifyQuickTopUpReviewActivity = new ModifyQuickTopUpReviewActivity(cancel.read, cancel.MediaBrowserCompat$ItemReceiver);
        }
        zzqj.zza zza = new zzqj.zza(getfontpath2.IconCompatParcelizer, arrayList, modifyQuickTopUpReviewActivity);
        zza.read(IconCompatParcelizer((setCurrentItemInternal) getfontpath));
        return zza;
    }
}
