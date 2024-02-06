package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getSavedDefaultGoogleSignInOptions */
public final class getSavedDefaultGoogleSignInOptions extends FragmentBuilder_BindSummaryFragment {
    public final createServiceInterface IconCompatParcelizer;
    public final createFailedResult write;

    @HmlPinActivity
    public getSavedDefaultGoogleSignInOptions(createServiceInterface createserviceinterface, createFailedResult createfailedresult) {
        onGetStartedClick.write((Object) createserviceinterface, "fundDividendEntityMapper");
        onGetStartedClick.write((Object) createfailedresult, "fundLtfEntityMapper");
        this.IconCompatParcelizer = createserviceinterface;
        this.write = createfailedresult;
    }

    public static List<getNumUpdates> write(List<getTransform> list) {
        if (list == null) {
            return null;
        }
        Iterable<getTransform> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (getTransform gettransform : iterable) {
            onGetStartedClick.write((Object) gettransform, "list");
            arrayList.add(new getNumUpdates(gettransform.write, gettransform.MediaBrowserCompat$SearchResultReceiver, gettransform.read, gettransform.IconCompatParcelizer, gettransform.MediaBrowserCompat$CustomActionResultReceiver, gettransform.MediaBrowserCompat$ItemReceiver, gettransform.MediaBrowserCompat$MediaItem, AlertController$RecycleListView.write(gettransform.MediaDescriptionCompat, (OffsetDateTime) null), gettransform.MediaMetadataCompat, AlertController$RecycleListView.write(gettransform.MediaSessionCompat$Token, (OffsetDateTime) null), AlertController$RecycleListView.write(gettransform.RatingCompat, (OffsetDateTime) null)));
        }
        return (List) arrayList;
    }

    public final List<setNumUpdates> MediaBrowserCompat$CustomActionResultReceiver(List<getInitialPoint> list) {
        if (list == null) {
            return null;
        }
        Iterable<getInitialPoint> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (getInitialPoint getinitialpoint : iterable) {
            arrayList.add(new setNumUpdates(getinitialpoint.MediaBrowserCompat$CustomActionResultReceiver, getinitialpoint.read, read(getinitialpoint.MediaBrowserCompat$ItemReceiver)));
        }
        return (List) arrayList;
    }

    private List<setFastestInterval> read(List<interpolateBetween> list) {
        if (list == null) {
            return null;
        }
        Iterable<interpolateBetween> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (interpolateBetween write2 : iterable) {
            arrayList.add(write(write2));
        }
        return (List) arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.setFastestInterval write(p040o.interpolateBetween r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0007
            java.lang.String r1 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r3 = r1
            goto L_0x0008
        L_0x0007:
            r3 = r0
        L_0x0008:
            if (r11 == 0) goto L_0x000e
            java.lang.String r1 = r11.MediaBrowserCompat$ItemReceiver
            r4 = r1
            goto L_0x000f
        L_0x000e:
            r4 = r0
        L_0x000f:
            if (r11 == 0) goto L_0x0015
            java.lang.String r1 = r11.MediaBrowserCompat$SearchResultReceiver
            r5 = r1
            goto L_0x0016
        L_0x0015:
            r5 = r0
        L_0x0016:
            if (r11 == 0) goto L_0x001b
            java.lang.String r1 = r11.MediaBrowserCompat$MediaItem
            goto L_0x001c
        L_0x001b:
            r1 = r0
        L_0x001c:
            org.threeten.bp.OffsetDateTime r6 = p040o.AlertController$RecycleListView.write((java.lang.String) r1, (org.threeten.p041bp.OffsetDateTime) r0)
            if (r11 == 0) goto L_0x002b
            java.lang.Boolean r1 = r11.IconCompatParcelizer
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.booleanValue()
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            r7 = r1
            if (r11 == 0) goto L_0x0033
            java.lang.String r1 = r11.write
            r8 = r1
            goto L_0x0034
        L_0x0033:
            r8 = r0
        L_0x0034:
            if (r11 == 0) goto L_0x0039
            java.util.List<o.ShapeFill> r11 = r11.read
            goto L_0x003a
        L_0x0039:
            r11 = r0
        L_0x003a:
            if (r11 == 0) goto L_0x0079
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            java.lang.String r9 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r9)
            boolean r9 = r11 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0052
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L_0x0052:
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r11 = r11.iterator()
        L_0x005b:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r11.next()
            o.ShapeFill r2 = (p040o.ShapeFill) r2
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x006d
        L_0x006c:
            r2 = r0
        L_0x006d:
            o.setSmallestDisplacement r9 = new o.setSmallestDisplacement
            r9.<init>(r2)
            r1.add(r9)
            goto L_0x005b
        L_0x0076:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
        L_0x0079:
            r9 = r0
            o.setFastestInterval r11 = new o.setFastestInterval
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getSavedDefaultGoogleSignInOptions.write(o.interpolateBetween):o.setFastestInterval");
    }
}
