package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.Iterables;
import p040o.Maps;
import p040o.zzfy;

/* renamed from: o.forArray */
public final class forArray extends Iterables.C35339 {
    public final getSession IconCompatParcelizer;
    public final Maps.FilteredEntryMap.EntrySet read;
    public final getReceiveBufferSize write;

    /* renamed from: o.forArray$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zzfy.zzc, onMessageTriggered> {
        private /* synthetic */ forArray MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ List write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(forArray forarray, List list) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = forarray;
            this.write = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            zzfy.zzc zzc = (zzfy.zzc) obj;
            onGetStartedClick.write((Object) zzc, "model");
            Maps.FilteredEntryMap.EntrySet entrySet = this.MediaBrowserCompat$ItemReceiver.read;
            List list = this.write;
            onGetStartedClick.write((Object) zzc, "model");
            onGetStartedClick.write((Object) list, "ccdList");
            String str5 = zzc.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 == null) {
                str5 = "";
            }
            if (AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str5)) {
                str = "";
            } else {
                String IconCompatParcelizer = entrySet.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(str5));
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthYear…e.parse(transactionDate))");
                str = IconCompatParcelizer;
            }
            String str6 = zzc.read;
            if (str6 == null) {
                str6 = "";
            }
            String MediaBrowserCompat$MediaItem = entrySet.MediaBrowserCompat$MediaItem(str6);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$MediaItem, "transformChannelName(model.channel.orEmpty())");
            String str7 = zzc.read;
            if (str7 == null) {
                str2 = "";
            } else {
                str2 = str7;
            }
            String str8 = zzc.IconCompatParcelizer;
            if (str8 == null) {
                str3 = "";
            } else {
                str3 = str8;
            }
            String str9 = zzc.write;
            if (str9 == null) {
                str4 = "";
            } else {
                str4 = str9;
            }
            List<String> list2 = zzc.MediaBrowserCompat$ItemReceiver;
            if (list2 == null) {
                list2 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<String> list3 = list2;
            List<String> list4 = zzc.MediaBrowserCompat$ItemReceiver;
            if (list4 == null) {
                list4 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            ArrayList arrayList = new ArrayList();
            Iterable<String> iterable = list4;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (String write2 : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(entrySet.write(write2, list))));
            }
            return new onMessageTriggered(str, MediaBrowserCompat$MediaItem, str2, str3, str4, list3, arrayList);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public forArray(getSession getsession, getReceiveBufferSize getreceivebuffersize, Maps.FilteredEntryMap.EntrySet entrySet) {
        super((byte) 0);
        onGetStartedClick.write((Object) getsession, "inquiryChannelCase");
        onGetStartedClick.write((Object) getreceivebuffersize, "changeChannelCase");
        onGetStartedClick.write((Object) entrySet, "statementChannelDisplayMapper");
        this.IconCompatParcelizer = getsession;
        this.write = getreceivebuffersize;
        this.read = entrySet;
    }

    public final List<UninterruptibleFuture> write(String str, boolean z, ArrayList<chain> arrayList) {
        onGetStartedClick.write((Object) str, "cardRefSelect");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        List list = arrayList;
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) list, "ccdList");
        ArrayList arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        for (Object next : list) {
            chain chain = (chain) next;
            boolean z2 = true;
            if (!chain.setContentHeight || !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) chain.MediaDescriptionCompat, (Object) str))) {
                z2 = false;
            }
            if (z2) {
                arrayList3.add(next);
            }
        }
        Iterable<chain> iterable = (List) arrayList3;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList4 = new ArrayList(((Collection) iterable).size());
        for (chain chain2 : iterable) {
            String str2 = chain2.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "ccd.cardRefNo");
            StringBuilder sb = new StringBuilder();
            sb.append(chain2.MediaBrowserCompat$SearchResultReceiver);
            sb.append(" ");
            sb.append(chain2.MediaSessionCompat$QueueItem);
            sb.append("xx");
            sb.append(" ");
            sb.append("xxxx");
            sb.append(" ");
            sb.append(chain2.f2806x50fd9e4a);
            sb.append("\n");
            String str3 = chain2.AppCompatViewInflater;
            if (str3 == null) {
                str3 = chain2.setItemInvoker;
            }
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            String obj = sb.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().also { b…n ?: \"\")\n    }.toString()");
            arrayList4.add(Boolean.valueOf(arrayList2.add(new UninterruptibleFuture(str2, z, obj))));
        }
        return arrayList2;
    }
}
