package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.DocumentData;
import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.getAccountForScopes */
public final class getAccountForScopes extends getSignInClient {
    public final zzjx.zze.zza write(DocumentData.Justification justification, zzct.zza zza) {
        String str;
        DocumentData.Justification justification2 = justification;
        onGetStartedClick.write((Object) justification2, "entity");
        onGetStartedClick.write((Object) zza, "customerType");
        String str2 = justification2.RatingCompat;
        int parseInt = Integer.parseInt(justification2.write);
        String str3 = justification2.IconCompatParcelizer;
        zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver = new zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver(justification2.MediaBrowserCompat$MediaItem.read, justification2.MediaBrowserCompat$MediaItem.write, justification2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver, justification2.MediaBrowserCompat$MediaItem.IconCompatParcelizer, justification2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
        DocumentData.Justification.IconCompatParcelizer iconCompatParcelizer = justification2.MediaMetadataCompat;
        onGetStartedClick.write((Object) iconCompatParcelizer, "entity");
        zzjx.zze.zza.write write = new zzjx.zze.zza.write(Integer.parseInt(iconCompatParcelizer.IconCompatParcelizer), iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        zzjx.zze.zza.IconCompatParcelizer iconCompatParcelizer2 = new zzjx.zze.zza.IconCompatParcelizer(Double.parseDouble(justification2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver), justification2.MediaBrowserCompat$ItemReceiver.read);
        getOffset getoffset = justification2.MediaBrowserCompat$CustomActionResultReceiver;
        zzjx.zze.zza.IconCompatParcelizer iconCompatParcelizer3 = getoffset != null ? new zzjx.zze.zza.IconCompatParcelizer(Double.parseDouble(getoffset.MediaBrowserCompat$ItemReceiver), getoffset.read) : null;
        String str4 = justification2.ParcelableVolumeInfo;
        String str5 = justification2.MediaBrowserCompat$SearchResultReceiver;
        OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(justification2.MediaSessionCompat$QueueItem, (OffsetDateTime) null);
        if (write2 == null) {
            write2 = OffsetDateTime.now();
            onGetStartedClick.IconCompatParcelizer((Object) write2, "OffsetDateTime.now()");
        }
        OffsetDateTime offsetDateTime = write2;
        String str6 = justification2.MediaDescriptionCompat;
        if (str6 == null || str6 == null) {
            str6 = zzjx.zza.zzb.GENERAL.name();
        }
        String str7 = str6;
        createStarPath createstarpath = justification2.read;
        if (createstarpath != null) {
            str = createstarpath.read;
        } else {
            str = null;
        }
        Iterable iterable = justification2.MediaSessionCompat$ResultReceiverWrapper;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            getGradientColor getgradientcolor = (getGradientColor) it.next();
            onGetStartedClick.write((Object) getgradientcolor, "entity");
            arrayList.add(new ActivityTransitionRequest(getgradientcolor.read, getgradientcolor.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return new zzjx.zze.zza(str2, parseInt, str3, zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver, write, iconCompatParcelizer2, iconCompatParcelizer3, str4, str5, offsetDateTime, str7, str, (List) arrayList, zza);
    }
}
