package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.MergePathsContent;
import p040o.toContent;
import p040o.zzca;

/* renamed from: o.getRequestedScopes */
public final class getRequestedScopes extends FragmentBuilder_BindSummaryFragment {
    public final SignInCredential IconCompatParcelizer;

    @HmlPinActivity
    public getRequestedScopes(SignInCredential signInCredential) {
        onGetStartedClick.write((Object) signInCredential, "mapper");
        this.IconCompatParcelizer = signInCredential;
    }

    public static getTransitionEvents IconCompatParcelizer(toContent.IconCompatParcelizer iconCompatParcelizer) {
        String str;
        getElapsedRealTimeNanos getelapsedrealtimenanos;
        toContent.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        String str2 = "entity";
        onGetStartedClick.write((Object) iconCompatParcelizer2, str2);
        String str3 = iconCompatParcelizer2.ParcelableVolumeInfo;
        String str4 = iconCompatParcelizer2.IconCompatParcelizer;
        List<String> list = iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
        String str5 = iconCompatParcelizer2.MediaMetadataCompat;
        MergePathsContent.C36531.write write = iconCompatParcelizer2.write;
        onGetStartedClick.write((Object) write, str2);
        zzca.zze.zza.write write2 = new zzca.zze.zza.write(write.IconCompatParcelizer, write.MediaBrowserCompat$CustomActionResultReceiver);
        String str6 = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
        String str7 = iconCompatParcelizer2.RatingCompat;
        String str8 = iconCompatParcelizer2.MediaBrowserCompat$MediaItem;
        List<String> list2 = iconCompatParcelizer2.PlaybackStateCompat;
        String str9 = iconCompatParcelizer2.read;
        List<String> list3 = iconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver;
        String str10 = iconCompatParcelizer2.MediaSessionCompat$QueueItem;
        Iterable iterable = iconCompatParcelizer2.MediaSessionCompat$ResultReceiverWrapper;
        String str11 = str10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            toContent.IconCompatParcelizer.read read = (toContent.IconCompatParcelizer.read) it.next();
            onGetStartedClick.write((Object) read, str2);
            arrayList.add(new ActivityTransition(read.MediaBrowserCompat$ItemReceiver, read.read));
            str2 = str2;
        }
        List list4 = (List) arrayList;
        String str12 = iconCompatParcelizer2.MediaDescriptionCompat;
        toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver = iconCompatParcelizer2.f2971x50fd9e4a;
        if (tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver != null) {
            str = str12;
            getelapsedrealtimenanos = new getElapsedRealTimeNanos(tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
        } else {
            str = str12;
            getelapsedrealtimenanos = null;
        }
        setMapStyle setmapstyle = r14;
        setMapStyle setmapstyle2 = new setMapStyle(iconCompatParcelizer2.MediaSessionCompat$Token.write, iconCompatParcelizer2.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver);
        return new getTransitionEvents(str3, str4, list, str5, write2, str6, str7, str8, list2, str9, list3, str11, list4, str, getelapsedrealtimenanos, setmapstyle);
    }
}
