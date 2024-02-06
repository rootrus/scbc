package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.natural */
public final class natural extends constrainedListMultimap {
    private String read;

    /* renamed from: o.natural$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ natural read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(natural natural) {
            super(1);
            this.read = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return natural.MediaBrowserCompat$ItemReceiver(this.read, setdatacollectionenabled);
        }
    }

    /* renamed from: o.natural$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<String, Boolean> {
        public static final MediaDescriptionCompat IconCompatParcelizer = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "it");
            return Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "INFORMATION", (Object) str) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "LOAN_INFORMATION", (Object) str));
        }
    }

    /* renamed from: o.natural$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ natural IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(natural natural) {
            super(1);
            this.IconCompatParcelizer = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            String str = setdatacollectionenabled.IconCompatParcelizer;
            List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
            onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
            return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
        }
    }

    /* renamed from: o.natural$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ natural MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ParcelableVolumeInfo(natural natural) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return natural.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, setdatacollectionenabled);
        }
    }

    /* renamed from: o.natural$RatingCompat */
    public static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        public static final RatingCompat read = new RatingCompat();

        RatingCompat() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
        }
    }

    /* renamed from: o.natural$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ natural write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(natural natural) {
            super(1);
            this.write = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            String str = setdatacollectionenabled.IconCompatParcelizer;
            List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(this.write.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
            onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
            return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public natural(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    private final List<dropBreadcrumb> MediaBrowserCompat$ItemReceiver(List<? extends setDataCollectionEnabled> list, boolean z) {
        List<dropBreadcrumb> arrayList = new ArrayList<>();
        arrayList.add(read(z ? Iterables$3$MediaBrowserCompat$MediaItem.review_loan_information_header : Iterables$3$MediaBrowserCompat$MediaItem.review_card_information_header, list, "LOAN_INFORMATION", new natural$MediaSessionCompat$QueueItem(this)));
        arrayList.add(read(Iterables$3$MediaBrowserCompat$MediaItem.review_details_header, list, "DETAILS", new ParcelableVolumeInfo(this)));
        return arrayList;
    }

    private final List<dropBreadcrumb> read(List<? extends setDataCollectionEnabled> list, boolean z, int i) {
        List<dropBreadcrumb> arrayList = new ArrayList<>();
        arrayList.add(IconCompatParcelizer(z ? Iterables$3$MediaBrowserCompat$MediaItem.review_loan_information_header : Iterables$3$MediaBrowserCompat$MediaItem.review_card_information_header, list, MediaDescriptionCompat.IconCompatParcelizer, new natural$MediaSessionCompat$ResultReceiverWrapper(this)));
        arrayList.add(read(i, list, "DETAILS", new natural$MediaSessionCompat$Token(this)));
        return arrayList;
    }

    /* renamed from: o.natural$write */
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

    public final dropBreadcrumb read(int i, List<? extends setDataCollectionEnabled> list, String str, FundFactSheetActivity<? super setDataCollectionEnabled, ? extends RestrictedComponentContainer> fundFactSheetActivity) {
        return IconCompatParcelizer(i, list, new natural$MediaBrowserCompat$CustomActionResultReceiver(str), fundFactSheetActivity);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r0 = r7.IconCompatParcelizer;
        r6 = java.util.Collections.singletonList(new p040o.C3758xd990f62c(r7.MediaDescriptionCompat, p040o.ContentFrameLayout.write(r6.MediaBrowserCompat$CustomActionResultReceiver, p040o.Iterables.C35273.read.dark_gray, (android.content.res.Resources.Theme) null)));
        p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, "java.util.Collections.singletonList(element)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r0.equals("RECEIVING_ACCOUNT") != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r0.equals("REPAYMENT_ACCOUNT") != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return new p040o.RestrictedComponentContainer(r0, (java.util.List<p040o.C3758xd990f62c>) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return new p040o.RestrictedComponentContainer(r7.IconCompatParcelizer, p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(r7.MediaDescriptionCompat, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.equals("SAVINGS_ACCOUNT") != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0.equals("INTEREST_RATE") != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0.equals("ANNUAL_INTEREST_TIER") != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ p040o.RestrictedComponentContainer MediaBrowserCompat$ItemReceiver(p040o.natural r6, p040o.setDataCollectionEnabled r7) {
        /*
            java.lang.String r0 = r7.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00cd
            int r1 = r0.hashCode()
            java.lang.String r2 = "java.util.Collections.singletonList(element)"
            r3 = 0
            r4 = 0
            switch(r1) {
                case -197190111: goto L_0x00b6;
                case 66081660: goto L_0x007a;
                case 347697038: goto L_0x0071;
                case 569254464: goto L_0x004b;
                case 849599351: goto L_0x0024;
                case 1196249301: goto L_0x001b;
                case 1854639207: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x00cd
        L_0x0011:
            java.lang.String r6 = "SAVINGS_ACCOUNT"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x00cd
            goto L_0x00be
        L_0x001b:
            java.lang.String r1 = "INTEREST_RATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "ANNUAL_INTEREST_TIER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
        L_0x002c:
            java.lang.String r0 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.MediaDescriptionCompat
            android.content.res.Resources r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = p040o.Iterables.C35273.read.dark_gray
            int r6 = p040o.ContentFrameLayout.write(r6, r1, r4)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r7, r6)
            java.util.List r6 = java.util.Collections.singletonList(r1)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r2)
            o.RestrictedComponentContainer r7 = new o.RestrictedComponentContainer
            r7.<init>((java.lang.String) r0, (java.util.List<p040o.C3758xd990f62c>) r6)
            goto L_0x00d7
        L_0x004b:
            java.lang.String r1 = "MAILING_ADDRESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.MediaDescriptionCompat
            android.content.res.Resources r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = p040o.Iterables.C35273.read.dark_gray
            int r6 = p040o.ContentFrameLayout.write(r6, r1, r4)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r7, r6)
            java.util.List r6 = java.util.Collections.singletonList(r1)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r2)
            o.RestrictedComponentContainer r7 = new o.RestrictedComponentContainer
            r7.<init>((java.lang.String) r0, (java.util.List<p040o.C3758xd990f62c>) r6)
            goto L_0x00d7
        L_0x0071:
            java.lang.String r6 = "RECEIVING_ACCOUNT"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x00cd
            goto L_0x00be
        L_0x007a:
            java.lang.String r1 = "EMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            r0 = 1
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver[] r0 = new p040o.C3758xd990f62c[r0]
            java.lang.String r1 = r7.MediaDescriptionCompat
            android.content.res.Resources r2 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = p040o.Iterables.C35273.read.dark_gray
            int r2 = p040o.ContentFrameLayout.write(r2, r5, r4)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r5 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r5.<init>(r1, r2)
            r0[r3] = r5
            java.util.List r0 = p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.String r1 = r6.read
            if (r1 == 0) goto L_0x00ae
            android.content.res.Resources r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = p040o.Iterables.C35273.read.dark_gray
            int r6 = p040o.ContentFrameLayout.write(r6, r2, r4)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r1, r6)
            r0.add(r2)
        L_0x00ae:
            o.RestrictedComponentContainer r6 = new o.RestrictedComponentContainer
            java.lang.String r7 = r7.IconCompatParcelizer
            r6.<init>((java.lang.String) r7, (java.util.List<p040o.C3758xd990f62c>) r0)
            goto L_0x00d6
        L_0x00b6:
            java.lang.String r6 = "REPAYMENT_ACCOUNT"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x00cd
        L_0x00be:
            java.lang.String r6 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.MediaDescriptionCompat
            java.lang.String r7 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r7, (boolean) r3)
            o.RestrictedComponentContainer r0 = new o.RestrictedComponentContainer
            r0.<init>((java.lang.String) r6, (java.lang.String) r7)
            r7 = r0
            goto L_0x00d7
        L_0x00cd:
            o.RestrictedComponentContainer r6 = new o.RestrictedComponentContainer
            java.lang.String r0 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.MediaDescriptionCompat
            r6.<init>((java.lang.String) r0, (java.lang.String) r7)
        L_0x00d6:
            r7 = r6
        L_0x00d7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.natural.MediaBrowserCompat$ItemReceiver(o.natural, o.setDataCollectionEnabled):o.RestrictedComponentContainer");
    }

    private final dropBreadcrumb IconCompatParcelizer(int i, List<? extends setDataCollectionEnabled> list, FundFactSheetActivity<? super String, Boolean> fundFactSheetActivity, FundFactSheetActivity<? super setDataCollectionEnabled, ? extends RestrictedComponentContainer> fundFactSheetActivity2) {
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) next;
            String str = setdatacollectionenabled.read;
            onGetStartedClick.IconCompatParcelizer((Object) str, "it.section");
            if ((!fundFactSheetActivity.invoke(str).booleanValue() || setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) ? false : true) {
                arrayList.add(next);
            }
        }
        Iterable<setDataCollectionEnabled> write2 = HmlNTBBusinessURLInformationActivity.write((List) arrayList, new write());
        int i2 = 10;
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        if (write2 instanceof Collection) {
            i2 = ((Collection) write2).size();
        }
        Collection arrayList2 = new ArrayList(i2);
        for (setDataCollectionEnabled invoke : write2) {
            arrayList2.add((RestrictedComponentContainer) fundFactSheetActivity2.invoke(invoke));
        }
        return new dropBreadcrumb(string, HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList2));
    }

    public final dispatchBreadcrumbEvent MediaBrowserCompat$CustomActionResultReceiver(setUserProperty setuserproperty, boolean z, int i) {
        onGetStartedClick.write((Object) setuserproperty, "easycashSummary");
        this.read = setuserproperty.MediaBrowserCompat$ItemReceiver;
        List<dropBreadcrumb> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver((List<? extends setDataCollectionEnabled>) setuserproperty.IconCompatParcelizer, z);
        List<setDataCollectionEnabled> list = setuserproperty.read;
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new dispatchBreadcrumbEvent(MediaBrowserCompat$ItemReceiver, read(list, z, i), setuserproperty.write.read, setuserproperty.write.write);
    }
}
