package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCountryShortFieldName$MediaBrowserCompat$CustomActionResultReceiver */
final class C4535xecfda9d6 extends CheckEligibilityActivity implements FundFactSheetActivity<minZoomPreference, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getCountryShortFieldName IconCompatParcelizer;
    private /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ List read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4535xecfda9d6(getCountryShortFieldName getcountryshortfieldname, List list, List list2) {
        super(1);
        this.IconCompatParcelizer = getcountryshortfieldname;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.read = list2;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        Object obj2;
        Object obj3;
        String str2;
        minZoomPreference minzoompreference = (minZoomPreference) obj;
        onGetStartedClick.write((Object) minzoompreference, "it");
        getCountryShortFieldName.IconCompatParcelizer(this.IconCompatParcelizer);
        getCountryShortFieldName getcountryshortfieldname = this.IconCompatParcelizer;
        MultiReader unused = getcountryshortfieldname.MediaMetadataCompat;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<getMinZoomPreference> list2 = minzoompreference.MediaBrowserCompat$ItemReceiver;
        List list3 = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) list3, "cachedRegisteredAccounts");
        onGetStartedClick.write((Object) list, "depositSummaryList");
        onGetStartedClick.write((Object) list2, "accountList");
        onGetStartedClick.write((Object) list3, "cachedRegisteredAccounts");
        Iterable<zzvo> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (zzvo zzvo : iterable) {
            Iterator it = list2.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((getMinZoomPreference) obj2).MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvo.write)) {
                    break;
                }
            }
            getMinZoomPreference getminzoompreference = (getMinZoomPreference) obj2;
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((zzup) obj3).MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvo.write)) {
                    break;
                }
            }
            zzup zzup = (zzup) obj3;
            if (zzup != null) {
                str2 = zzup.MediaBrowserCompat$ItemReceiver;
            } else {
                str2 = null;
            }
            onGetStartedClick.write((Object) zzvo, "depositSummary");
            String str3 = zzvo.write;
            onGetStartedClick.IconCompatParcelizer((Object) str3, "depositSummary.accountNumber");
            getShortName getshortname = zzvo.f3002x50fd9e4a;
            onGetStartedClick.IconCompatParcelizer((Object) getshortname, "depositSummary.productType");
            String str4 = getshortname.value;
            onGetStartedClick.IconCompatParcelizer((Object) str4, "depositSummary.productType.value");
            String str5 = zzvo.PlaybackStateCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str5, "depositSummary.productTypeDescription");
            int i = zzvo.Keep;
            if (getminzoompreference != null) {
                str = getminzoompreference.MediaBrowserCompat$ItemReceiver;
            }
            arrayList.add(new getUiOrientation(str3, str4, str5, i, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "Y"), str2));
        }
        Collection collection = (List) arrayList;
        onGetStartedClick.write((Object) collection, "$this$toMutableList");
        List<getUiOrientation> arrayList2 = new ArrayList<>(collection);
        onGetStartedClick.write((Object) arrayList2, "<set-?>");
        getcountryshortfieldname.IconCompatParcelizer = arrayList2;
        getCountryShortFieldName getcountryshortfieldname2 = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<C1248xd65c1f32>(this) {
            private /* synthetic */ C4535xecfda9d6 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C1248xd65c1f32 projectProviderException$MediaBrowserCompat$CustomActionResultReceiver = (C1248xd65c1f32) obj;
                List<getUiOrientation> list = this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer;
                if (list == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountInboundDisplayList");
                }
                projectProviderException$MediaBrowserCompat$CustomActionResultReceiver.write(list);
            }
        };
        if (getcountryshortfieldname2.RatingCompat != null) {
            r2.IconCompatParcelizer(getcountryshortfieldname2.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
