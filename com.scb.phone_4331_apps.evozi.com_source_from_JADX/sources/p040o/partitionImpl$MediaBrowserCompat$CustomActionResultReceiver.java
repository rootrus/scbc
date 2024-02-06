package p040o;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Maps;
import p040o.zzqj;
import p040o.zzrc;

/* renamed from: o.partitionImpl$MediaBrowserCompat$CustomActionResultReceiver */
final class partitionImpl$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzqj.zze, Component$$Lambda$2> {
    private /* synthetic */ partitionImpl write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    partitionImpl$MediaBrowserCompat$CustomActionResultReceiver(partitionImpl partitionimpl) {
        super(1);
        this.write = partitionimpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Collection collection;
        zzqj.zze zze;
        String str;
        double d;
        double d2;
        double d3;
        double d4;
        String str2;
        zzqj.zze zze2 = (zzqj.zze) obj;
        onGetStartedClick.write((Object) zze2, "model");
        Maps.ValueDifferenceImpl valueDifferenceImpl = this.write.MediaSessionCompat$QueueItem;
        String str3 = "transaction";
        onGetStartedClick.write((Object) zze2, str3);
        int i = zze2.IconCompatParcelizer;
        Iterable iterable = zze2.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzqj.zzc zzc = (zzqj.zzc) it.next();
            onGetStartedClick.write((Object) zzc, str3);
            String str4 = zzc.MediaBrowserCompat$ItemReceiver;
            int i2 = zzc.write;
            String str5 = zzc.read;
            String str6 = zzc.MediaBrowserCompat$CustomActionResultReceiver;
            String str7 = zzc.MediaDescriptionCompat;
            String str8 = zzc.MediaBrowserCompat$MediaItem;
            int parseInt = Integer.parseInt(zzc.MediaMetadataCompat);
            String str9 = zzc.MediaBrowserCompat$SearchResultReceiver;
            String str10 = zzc.IconCompatParcelizer;
            String str11 = str3;
            String str12 = zzc.MediaBrowserCompat$ItemReceiver;
            Iterator it2 = it;
            String str13 = str9;
            int i3 = i;
            if (str12.length() == 0) {
                zze = zze2;
                str = str10;
                collection = arrayList;
                d = 0.0d;
            } else {
                zze = zze2;
                Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str12);
                onGetStartedClick.IconCompatParcelizer((Object) parse, "getSimpleDateFormat().parse(dateExpiry)");
                long time = parse.getTime();
                Date parse2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(Maps.ValueDifferenceImpl.IconCompatParcelizer());
                onGetStartedClick.IconCompatParcelizer((Object) parse2, "getSimpleDateFormat().pa…NowFormat()\n            )");
                str = str10;
                d = ((double) (time - parse2.getTime())) / 8.64E7d;
                collection = arrayList;
            }
            String str14 = zzc.MediaBrowserCompat$ItemReceiver;
            if (str14.length() == 0) {
                double d5 = d;
                d3 = 0.0d;
                d2 = d5;
            } else {
                d2 = d;
                Date parse3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str14);
                onGetStartedClick.IconCompatParcelizer((Object) parse3, "getSimpleDateFormat().parse(dateExpiry)");
                long time2 = parse3.getTime();
                Date parse4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(Maps.ValueDifferenceImpl.IconCompatParcelizer());
                onGetStartedClick.IconCompatParcelizer((Object) parse4, "getSimpleDateFormat().pa…NowFormat()\n            )");
                long time3 = time2 - parse4.getTime();
                d3 = (((double) ((time3 / 60000) % 60)) + (((double) ((time3 / 1000) % 60)) / 60.0d)) * 60.0d * 1000.0d;
            }
            boolean z = zzc.MediaBrowserCompat$SearchResultReceiver.length() > 0;
            OffsetDateTime write2 = CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", zzc.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) write2, "DateUtilities.getOffsetD…                dateTime)");
            OffsetDateTime now = OffsetDateTime.now();
            if (now == null) {
                str2 = null;
                d4 = d3;
            } else {
                d4 = d3;
                str2 = now.format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok")));
            }
            OffsetDateTime write3 = CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", str2);
            onGetStartedClick.IconCompatParcelizer((Object) write3, "DateUtilities.getOffsetD…AT, transformNowDateTime)");
            arrayList = collection;
            arrayList.add(new isAlwaysEager(str4, i2, str5, str6, str7, str8, parseInt, str13, str, d2, d4, z, write3.isAfter(write2), valueDifferenceImpl.MediaBrowserCompat$SearchResultReceiver(zzc.MediaBrowserCompat$ItemReceiver), valueDifferenceImpl.MediaBrowserCompat$SearchResultReceiver(zzc.MediaBrowserCompat$SearchResultReceiver)));
            str3 = str11;
            it = it2;
            i = i3;
            zze2 = zze;
        }
        zzqj.zze zze3 = zze2;
        int i4 = i;
        zzrc.zzd zzd = zze2.MediaBrowserCompat$ItemReceiver;
        return new Component$$Lambda$2(i4, (List) arrayList, new setInstantiation(zzd.IconCompatParcelizer, zzd.MediaBrowserCompat$CustomActionResultReceiver, zzd.MediaBrowserCompat$ItemReceiver, zzd.write));
    }
}
