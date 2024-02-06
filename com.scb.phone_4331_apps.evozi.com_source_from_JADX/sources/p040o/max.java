package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p040o.padWithZerosToMaxIntWidth;
import p040o.zzfo;

/* renamed from: o.max */
public final class max extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public max(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    private final access$1000 MediaBrowserCompat$CustomActionResultReceiver(List<? extends setDataCollectionEnabled> list) {
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) next;
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "COLLATERAL", (Object) setdatacollectionenabled.read) || setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterable<setDataCollectionEnabled> write2 = HmlNTBBusinessURLInformationActivity.write((List) arrayList, new max$MediaBrowserCompat$CustomActionResultReceiver());
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList2 = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
        for (setDataCollectionEnabled read2 : write2) {
            arrayList2.add(read(read2));
        }
        List MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList2);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            setDataCollectionEnabled setdatacollectionenabled2 = (setDataCollectionEnabled) next2;
            if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "LOAN_INFORMATION", (Object) setdatacollectionenabled2.read) || setdatacollectionenabled2.MediaDescriptionCompat == null || setdatacollectionenabled2.write == null) ? false : true) {
                arrayList3.add(next2);
            }
        }
        Iterable<setDataCollectionEnabled> write3 = HmlNTBBusinessURLInformationActivity.write((List) arrayList3, new write());
        onGetStartedClick.write((Object) write3, "$this$collectionSizeOrDefault");
        Collection arrayList4 = new ArrayList(write3 instanceof Collection ? ((Collection) write3).size() : 10);
        for (setDataCollectionEnabled read3 : write3) {
            arrayList4.add(read(read3));
        }
        List MediaBrowserCompat$CustomActionResultReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList4);
        Collection arrayList5 = new ArrayList();
        for (Object next3 : iterable) {
            setDataCollectionEnabled setdatacollectionenabled3 = (setDataCollectionEnabled) next3;
            if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "CAR_REGISTRATION", (Object) setdatacollectionenabled3.read) || setdatacollectionenabled3.MediaDescriptionCompat == null || setdatacollectionenabled3.write == null) ? false : true) {
                arrayList5.add(next3);
            }
        }
        Iterable<setDataCollectionEnabled> write4 = HmlNTBBusinessURLInformationActivity.write((List) arrayList5, new read());
        onGetStartedClick.write((Object) write4, "$this$collectionSizeOrDefault");
        if (write4 instanceof Collection) {
            i = ((Collection) write4).size();
        }
        Collection arrayList6 = new ArrayList(i);
        for (setDataCollectionEnabled read4 : write4) {
            arrayList6.add(read(read4));
        }
        return new access$1000(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList6));
    }

    /* renamed from: o.max$read */
    public static final class read<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((setDataCollectionEnabled) t).MediaBrowserCompat$CustomActionResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((setDataCollectionEnabled) t2).MediaBrowserCompat$CustomActionResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* renamed from: o.max$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((setDataCollectionEnabled) t).MediaBrowserCompat$CustomActionResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((setDataCollectionEnabled) t2).MediaBrowserCompat$CustomActionResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0.equals("YEAR_OF_MANUFACTURE") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0.equals("YEAR_OF_REGISTRATION") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r0.equals("CAR_SUB_MODEL") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0.equals("REMARK") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0.equals("ANNUAL_INTEREST") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r0 = r4.IconCompatParcelizer;
        r4 = java.util.Collections.singletonList(new p040o.C3758xd990f62c(r4.MediaDescriptionCompat, r3.MediaBrowserCompat$CustomActionResultReceiver.getColor(p040o.Iterables.C35273.read.dark_gray)));
        p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, "java.util.Collections.singletonList(element)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return new p040o.RestrictedComponentContainer(r0, (java.util.List<p040o.C3758xd990f62c>) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0.equals("PROVINCE_OF_REGISTRATION") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0.equals("CAR_MODEL") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.equals("CAR_BRAND") != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p040o.RestrictedComponentContainer read(p040o.setDataCollectionEnabled r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0074
            int r1 = r0.hashCode()
            switch(r1) {
                case -2045047414: goto L_0x004c;
                case -1881294976: goto L_0x0043;
                case -1833599649: goto L_0x003a;
                case -1537088993: goto L_0x0031;
                case -1177931141: goto L_0x0028;
                case -977722596: goto L_0x001f;
                case -967650626: goto L_0x0016;
                case 416036626: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0074
        L_0x000d:
            java.lang.String r1 = "PROVINCE_OF_REGISTRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x0016:
            java.lang.String r1 = "CAR_MODEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x001f:
            java.lang.String r1 = "CAR_BRAND"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x0028:
            java.lang.String r1 = "YEAR_OF_MANUFACTURE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x0031:
            java.lang.String r1 = "YEAR_OF_REGISTRATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x003a:
            java.lang.String r1 = "CAR_SUB_MODEL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x0043:
            java.lang.String r1 = "REMARK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            goto L_0x0054
        L_0x004c:
            java.lang.String r1 = "ANNUAL_INTEREST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
        L_0x0054:
            java.lang.String r0 = r4.IconCompatParcelizer
            java.lang.String r4 = r4.MediaDescriptionCompat
            android.content.res.Resources r1 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = p040o.Iterables.C35273.read.dark_gray
            int r1 = r1.getColor(r2)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r4, r1)
            java.util.List r4 = java.util.Collections.singletonList(r2)
            java.lang.String r1 = "java.util.Collections.singletonList(element)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r1)
            o.RestrictedComponentContainer r1 = new o.RestrictedComponentContainer
            r1.<init>((java.lang.String) r0, (java.util.List<p040o.C3758xd990f62c>) r4)
            goto L_0x007d
        L_0x0074:
            o.RestrictedComponentContainer r1 = new o.RestrictedComponentContainer
            java.lang.String r0 = r4.IconCompatParcelizer
            java.lang.String r4 = r4.MediaDescriptionCompat
            r1.<init>((java.lang.String) r0, (java.lang.String) r4)
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.max.read(o.setDataCollectionEnabled):o.RestrictedComponentContainer");
    }

    public final getDeviceState MediaBrowserCompat$CustomActionResultReceiver(zzfo.zze zze, List<? extends setDataCollectionEnabled> list) {
        onGetStartedClick.write((Object) zze, "data");
        onGetStartedClick.write((Object) list, ProductAction.ACTION_DETAIL);
        getSharedPrefs$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = getSharedPrefs.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = zze.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = zze.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = zze.read;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = zze.MediaDescriptionCompat;
        Iterable<String> iterable = zze.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (String parseInt : iterable) {
            arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        MediaBrowserCompat$CustomActionResultReceiver.Keep = (List) arrayList;
        padWithZerosToMaxIntWidth.write write2 = new padWithZerosToMaxIntWidth.write();
        write2.read = zze.MediaBrowserCompat$SearchResultReceiver;
        write2.MediaBrowserCompat$CustomActionResultReceiver = zze.MediaBrowserCompat$CustomActionResultReceiver;
        Iterable<String> iterable2 = zze.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        if (iterable2 instanceof Collection) {
            i = ((Collection) iterable2).size();
        }
        Collection arrayList2 = new ArrayList(i);
        for (String parseInt2 : iterable2) {
            arrayList2.add(Integer.valueOf(Integer.parseInt(parseInt2)));
        }
        write2.MediaBrowserCompat$ItemReceiver = (List) arrayList2;
        List<padWithZerosToMaxIntWidth> singletonList = Collections.singletonList(new padWithZerosToMaxIntWidth(write2, (byte) 0));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        MediaBrowserCompat$CustomActionResultReceiver.setContentView = singletonList;
        getStringsFileValue MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            List singletonList2 = Collections.singletonList((getSharedPrefs) MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) singletonList2, "java.util.Collections.singletonList(element)");
            return new getDeviceState(singletonList2, MediaBrowserCompat$CustomActionResultReceiver(list));
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.landing.EasycashMortgageLoanOfferDisplay");
    }
}
