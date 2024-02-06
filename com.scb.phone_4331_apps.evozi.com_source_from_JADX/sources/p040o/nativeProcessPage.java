package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.C10827Iterators;
import p040o.access$2300;
import p040o.onNotNowClick;
import p040o.synchronizedSetMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcessPage */
public final class nativeProcessPage extends writeUInt64NoTag<newIdParameters> {
    public String IconCompatParcelizer;
    private final synchronizedSetMultimap MediaBrowserCompat$ItemReceiver;
    public final C10827Iterators.C354015 read;
    public String write;

    /* renamed from: o.nativeProcessPage$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<getDefaultLevelIndex, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ onNotNowClick.read MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ nativeProcessPage write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(nativeProcessPage nativeprocesspage, onNotNowClick.read read) {
            super(1);
            this.write = nativeprocesspage;
            this.MediaBrowserCompat$ItemReceiver = read;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final getDefaultLevelIndex getdefaultlevelindex = (getDefaultLevelIndex) obj;
            onGetStartedClick.write((Object) getdefaultlevelindex, "it");
            nativeProcessPage nativeprocesspage = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newIdParameters>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    newIdParameters newidparameters = (newIdParameters) obj;
                    nativeProcessPage.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.write);
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = nativeProcessPage.write(this.MediaBrowserCompat$ItemReceiver.write, getdefaultlevelindex).write;
                    Collection collection = (List) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    if (collection == null || collection.isEmpty()) {
                        nativeProcessPage nativeprocesspage = this.MediaBrowserCompat$ItemReceiver.write;
                        RegularImmutableBiMap read = this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver;
                        nativeprocesspage.MediaBrowserCompat$ItemReceiver(read.read((String) null, read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource), access$2300.write.JUST_DISMISS));
                        return;
                    }
                    List list = (List) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    if (list != null) {
                        newidparameters.MediaBrowserCompat$CustomActionResultReceiver(list);
                    }
                }
            };
            if (nativeprocesspage.RatingCompat != null) {
                r1.IconCompatParcelizer(nativeprocesspage.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nativeProcessPage$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ nativeProcessPage IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(nativeProcessPage nativeprocesspage) {
            super(1);
            this.IconCompatParcelizer = nativeprocesspage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nativeProcessPage$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ nativeProcessPage IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(nativeProcessPage nativeprocesspage) {
            super(1);
            this.IconCompatParcelizer = nativeprocesspage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nativeProcessPage(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C354015 r3, synchronizedSetMultimap synchronizedsetmultimap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "depositAccountController");
        onGetStartedClick.write((Object) synchronizedsetmultimap, "depositProductInfoDisplayMapper");
        this.read = r3;
        this.MediaBrowserCompat$ItemReceiver = synchronizedsetmultimap;
    }

    public static Map<String, List<access$1900>> read(List<access$1900> list) {
        onGetStartedClick.write((Object) list, "list");
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String str = ((access$1900) next).MediaBrowserCompat$CustomActionResultReceiver;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(next);
        }
        Map<String, List<access$1900>> linkedHashMap2 = new LinkedHashMap<>(HmlNdidSelectIdpActivity.read(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (List) entry.getValue());
        }
        return linkedHashMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r10 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ p040o.appendOrganizationIdToSessionFile write(p040o.nativeProcessPage r12, p040o.getDefaultLevelIndex r13) {
        /*
            o.synchronizedSetMultimap r12 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = "depositProductInfo"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.util.List<o.DividendSummaryAdapter$ChildViewHolder> r13 = r13.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r1)
            boolean r1 = r13 instanceof java.util.Collection
            if (r1 == 0) goto L_0x001e
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            goto L_0x0020
        L_0x001e:
            r1 = 10
        L_0x0020:
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r13 = r13.iterator()
        L_0x0029:
            boolean r1 = r13.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r1 = r13.next()
            o.DividendSummaryAdapter$ChildViewHolder r1 = (p040o.DividendSummaryAdapter$ChildViewHolder) r1
            int r4 = r1.MediaDescriptionCompat
            java.lang.String r5 = r1.IconCompatParcelizer
            java.lang.String r6 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = r1.IconCompatParcelizer
            java.lang.String r7 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = "2"
            boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r3, (java.lang.Object) r8)
            if (r3 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r7 = r2
        L_0x004a:
            java.lang.String r2 = r1.read
            java.lang.String r3 = r1.write
            java.lang.String r9 = r12.mo26549c_(r3)
            java.lang.String r3 = "transformAssetUrl(imageURL)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r3)
            java.lang.String r1 = r1.IconCompatParcelizer
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x00b9
            int r10 = r1.hashCode()
            r11 = 1
            switch(r10) {
                case 48: goto L_0x009c;
                case 49: goto L_0x0080;
                case 50: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x00b9
        L_0x0066:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00b9
            boolean r1 = r12.read
            if (r1 != 0) goto L_0x00b9
            r12.read = r11
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_product_list_saving_account_type_title
            android.content.res.Resources r3 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r3 = "getString(R.string.auto_…aving_account_type_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r3)
            goto L_0x00b7
        L_0x0080:
            java.lang.String r8 = "1"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00b9
            boolean r1 = r12.IconCompatParcelizer
            if (r1 != 0) goto L_0x00b9
            r12.IconCompatParcelizer = r11
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_product_list_fixed_deposit_account_type_title
            android.content.res.Resources r3 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r3 = "getString(R.string.auto_…posit_account_type_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r3)
            goto L_0x00b7
        L_0x009c:
            java.lang.String r8 = "0"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00b9
            boolean r1 = r12.MediaBrowserCompat$ItemReceiver
            if (r1 != 0) goto L_0x00b9
            r12.MediaBrowserCompat$ItemReceiver = r11
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_product_list_contractual_account_type_title
            android.content.res.Resources r3 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r3 = "getString(R.string.auto_…ctual_account_type_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r3)
        L_0x00b7:
            r10 = r1
            goto L_0x00ba
        L_0x00b9:
            r10 = r3
        L_0x00ba:
            o.access$1900 r1 = new o.access$1900
            r3 = r1
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.add(r1)
            goto L_0x0029
        L_0x00c6:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            o.synchronizedSetMultimap$read r12 = new o.synchronizedSetMultimap$read
            r12.<init>()
            java.util.Comparator r12 = (java.util.Comparator) r12
            java.util.List r12 = p040o.HmlNTBBusinessURLInformationActivity.write(r0, r12)
            o.appendOrganizationIdToSessionFile r13 = new o.appendOrganizationIdToSessionFile
            r13.<init>(r12, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nativeProcessPage.write(o.nativeProcessPage, o.getDefaultLevelIndex):o.appendOrganizationIdToSessionFile");
    }

    public static final /* synthetic */ appendOrganizationIdToSessionFile MediaBrowserCompat$ItemReceiver(nativeProcessPage nativeprocesspage, getDefaultLevelIndex getdefaultlevelindex) {
        onGetStartedClick.write((Object) getdefaultlevelindex, "depositProductInfo");
        Iterable<LtfSummaryAdapter$ParentViewHolder> iterable = getdefaultlevelindex.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (LtfSummaryAdapter$ParentViewHolder read2 : iterable) {
            arrayList.add(synchronizedSetMultimap.read(read2));
        }
        return new appendOrganizationIdToSessionFile((List<access$1900>) null, HmlNTBBusinessURLInformationActivity.write((List) arrayList, new synchronizedSetMultimap.write()));
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(nativeProcessPage nativeprocesspage) {
        if (nativeprocesspage.RatingCompat != null) {
            nativeprocesspage.RatingCompat.aj_();
        }
    }
}
