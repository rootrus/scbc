package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.getSessionIdFromSessionFile;
import p040o.zzjx;

/* renamed from: o.ReverseNaturalOrdering */
public final class ReverseNaturalOrdering {
    @HmlPinActivity
    public ReverseNaturalOrdering(synchronizedMultimap synchronizedmultimap, makeComplementByHand makecomplementbyhand) {
        onGetStartedClick.write((Object) synchronizedmultimap, "accountNumberDisplayMapper");
        onGetStartedClick.write((Object) makecomplementbyhand, "repaymentDateDisplayMapper");
    }

    public static List<getSessionIdFromSessionFile.read> MediaBrowserCompat$CustomActionResultReceiver(List<? extends zzvo> list, String str, boolean z) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((zzvo) next).MediaDescriptionCompat.contains(str)) {
                arrayList.add(next);
            }
        }
        Iterable<zzvo> iterable = (List) arrayList;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable).size());
        for (zzvo zzvo : iterable) {
            String str2 = zzvo.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "it.accountName");
            String str3 = zzvo.write;
            onGetStartedClick.IconCompatParcelizer((Object) str3, "it.accountNumber");
            String str4 = zzvo.write;
            onGetStartedClick.IconCompatParcelizer((Object) str4, "it.accountNumber");
            arrayList2.add(new getSessionIdFromSessionFile.read(str2, str3, synchronizedMultimap.write(str4, z)));
        }
        return (List) arrayList2;
    }

    public static List<getSessionIdFromSessionFile.read> read(List<zzjx.zze.zzc> list, String str, boolean z) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((zzjx.zze.zzc) next).MediaBrowserCompat$ItemReceiver.contains(str)) {
                arrayList.add(next);
            }
        }
        Iterable<zzjx.zze.zzc> iterable = (List) arrayList;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable).size());
        for (zzjx.zze.zzc zzc : iterable) {
            arrayList2.add(new getSessionIdFromSessionFile.read(zzc.IconCompatParcelizer, zzc.read, synchronizedMultimap.write(zzc.read, z)));
        }
        return (List) arrayList2;
    }
}
