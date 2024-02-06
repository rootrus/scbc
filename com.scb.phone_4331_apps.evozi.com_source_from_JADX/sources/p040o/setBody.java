package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityTransition;
import p040o.zzcz;
import p040o.zziu;

/* renamed from: o.setBody */
public final class setBody extends getSignInClient {
    private static ActivityRecognitionResult MediaBrowserCompat$ItemReceiver(matchesName matchesname) {
        zzcz.zzb zzb;
        zzcz.zzb zzb2;
        String str;
        matchesName matchesname2 = matchesname;
        String str2 = matchesname2.MediaBrowserCompat$MediaItem;
        String str3 = matchesname2.RatingCompat;
        String str4 = matchesname2.MediaDescriptionCompat;
        String str5 = matchesname2.MediaSessionCompat$ResultReceiverWrapper;
        String str6 = matchesname2.MediaBrowserCompat$CustomActionResultReceiver;
        String str7 = matchesname2.IconCompatParcelizer;
        LottieCompositionCache lottieCompositionCache = matchesname2.MediaMetadataCompat;
        requestActivityTransitionUpdates requestactivitytransitionupdates = new requestActivityTransitionUpdates(lottieCompositionCache.IconCompatParcelizer, lottieCompositionCache.MediaBrowserCompat$CustomActionResultReceiver);
        String str8 = matchesname2.MediaSessionCompat$Token;
        StrokeContent strokeContent = matchesname2.MediaBrowserCompat$ItemReceiver;
        List list = null;
        if (strokeContent != null) {
            zzb = new zzcz.zzb(strokeContent.MediaBrowserCompat$CustomActionResultReceiver, strokeContent.write);
        } else {
            zzb = null;
        }
        StrokeContent strokeContent2 = matchesname2.write;
        if (strokeContent2 != null) {
            zzb2 = new zzcz.zzb(strokeContent2.MediaBrowserCompat$CustomActionResultReceiver, strokeContent2.write);
        } else {
            zzb2 = null;
        }
        String str9 = matchesname2.PlaybackStateCompat$CustomAction;
        String str10 = matchesname2.ParcelableVolumeInfo;
        List<getGradientColor> list2 = matchesname2.f2891x50fd9e4a;
        if (list2 != null) {
            Iterable iterable = list2;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                getGradientColor getgradientcolor = (getGradientColor) it.next();
                onGetStartedClick.write((Object) getgradientcolor, "entity");
                arrayList.add(new ActivityTransitionRequest(getgradientcolor.read, getgradientcolor.MediaBrowserCompat$CustomActionResultReceiver));
                it = it;
                str10 = str10;
            }
            str = str10;
            list = (List) arrayList;
        } else {
            str = str10;
        }
        return new ActivityRecognitionResult(str2, str3, str4, str5, str6, str7, requestactivitytransitionupdates, str8, zzb, zzb2, str9, str, list, matchesname2.MediaBrowserCompat$SearchResultReceiver, matchesname2.MediaSessionCompat$QueueItem, matchesname2.AlertController$RecycleListView, matchesname2.read);
    }

    public final zziu.zza write(getFontFamily getfontfamily) {
        List list;
        String str;
        String str2;
        String str3;
        OffsetDateTime offsetDateTime;
        List list2;
        ActivityTransition.Builder builder;
        String str4;
        getTime gettime;
        ActivityRecognitionClient activityRecognitionClient;
        String str5;
        AnimatableFloatValue animatableFloatValue;
        List write;
        getFontFamily getfontfamily2 = getfontfamily;
        onGetStartedClick.write((Object) getfontfamily2, "hmlLoanOffersEntity");
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getfontfamily2.MediaBrowserCompat$CustomActionResultReceiver, (Object) "PENDING_OCR_RESUBMIT") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getfontfamily2.MediaBrowserCompat$CustomActionResultReceiver, (Object) "PENDING_LEADS_RESUBMIT")) {
            if (getfontfamily2.RatingCompat == null) {
                throw new EntityMappingException("HmlLoanOffersEntityMapper: data.isRequireConsent must not be null in PENDING_OCR_RESUBMIT and PENDING_LEADS_RESUBMIT status", (Throwable) null);
            } else if (getfontfamily2.RatingCompat.booleanValue()) {
                if (getfontfamily2.MediaMetadataCompat == null) {
                    throw new EntityMappingException("HmlLoanOffersEntityMapper: data.loanOfferConsent must not be null when isRequireConsent is true", (Throwable) null);
                } else if (getfontfamily2.MediaMetadataCompat.read == null || getfontfamily2.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    throw new EntityMappingException("HmlLoanOffersEntityMapper: data.type or data.subType must not be null", (Throwable) null);
                }
            }
        }
        String str6 = getfontfamily2.read;
        String str7 = getfontfamily2.MediaBrowserCompat$CustomActionResultReceiver;
        Integer num = getfontfamily2.MediaDescriptionCompat;
        String str8 = getfontfamily2.IconCompatParcelizer;
        String str9 = getfontfamily2.write;
        String str10 = getfontfamily2.f2834x50fd9e4a;
        String str11 = getfontfamily2.MediaBrowserCompat$MediaItem;
        List<matchesName> list3 = getfontfamily2.MediaBrowserCompat$SearchResultReceiver;
        if (list3 == null || (write = HmlNTBBusinessURLInformationActivity.write(list3, new setBody$MediaBrowserCompat$CustomActionResultReceiver())) == null) {
            list = null;
        } else {
            Iterable<matchesName> iterable = write;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (matchesName MediaBrowserCompat$ItemReceiver : iterable) {
                arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            list = (List) arrayList;
        }
        AnimatableGradientColorValue animatableGradientColorValue = getfontfamily2.MediaSessionCompat$ResultReceiverWrapper;
        if (animatableGradientColorValue != null) {
            str = animatableGradientColorValue.read;
        } else {
            str = null;
        }
        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1);
        AnimatableGradientColorValue animatableGradientColorValue2 = getfontfamily2.MediaSessionCompat$ResultReceiverWrapper;
        if (animatableGradientColorValue2 == null || (animatableFloatValue = animatableGradientColorValue2.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str2 = null;
        } else {
            str2 = animatableFloatValue.MediaBrowserCompat$CustomActionResultReceiver;
        }
        AnimatableGradientColorValue animatableGradientColorValue3 = getfontfamily2.MediaSessionCompat$ResultReceiverWrapper;
        if (animatableGradientColorValue3 != null) {
            str3 = animatableGradientColorValue3.IconCompatParcelizer;
        } else {
            str3 = null;
        }
        AnimatableGradientColorValue animatableGradientColorValue4 = getfontfamily2.MediaSessionCompat$ResultReceiverWrapper;
        if (animatableGradientColorValue4 == null || (str5 = animatableGradientColorValue4.MediaBrowserCompat$ItemReceiver) == null) {
            offsetDateTime = null;
        } else {
            offsetDateTime = FragmentBuilder_BindSummaryFragment.write(str5, (OffsetDateTime) null);
        }
        ActivityTransition.Builder builder2 = new ActivityTransition.Builder(MediaBrowserCompat$ItemReceiver2, str2, str3, offsetDateTime);
        String str12 = getfontfamily2.MediaBrowserCompat$ItemReceiver;
        AnimatableTextProperties animatableTextProperties = getfontfamily2.MediaSessionCompat$QueueItem;
        if (animatableTextProperties != null) {
            str4 = str12;
            builder = builder2;
            list2 = list;
            gettime = new getTime(animatableTextProperties.write, animatableTextProperties.MediaDescriptionCompat, animatableTextProperties.MediaBrowserCompat$CustomActionResultReceiver, animatableTextProperties.read, animatableTextProperties.IconCompatParcelizer, animatableTextProperties.MediaBrowserCompat$ItemReceiver, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) animatableTextProperties.RatingCompat, (Object) DiskLruCache.VERSION_1));
        } else {
            list2 = list;
            str4 = str12;
            builder = builder2;
            gettime = null;
        }
        clear clear = getfontfamily2.MediaMetadataCompat;
        if (clear != null) {
            activityRecognitionClient = new ActivityRecognitionClient(clear.read, clear.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            activityRecognitionClient = null;
        }
        return new zziu.zza(str6, str7, num, str8, str9, str10, str11, list2, builder, str4, gettime, activityRecognitionClient, getfontfamily2.RatingCompat);
    }
}
