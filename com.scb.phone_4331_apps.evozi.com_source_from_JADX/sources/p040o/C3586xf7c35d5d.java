package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LinkedListMultimap;

/* renamed from: o.LinkedListMultimap$AsMapEntries$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3586xf7c35d5d extends CheckEligibilityActivity implements FundFactSheetActivity<setIvAvatar, populateFramesList> {
    private /* synthetic */ LinkedListMultimap.AsMapEntries write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3586xf7c35d5d(LinkedListMultimap.AsMapEntries asMapEntries) {
        super(1);
        this.write = asMapEntries;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setIvAvatar setivavatar = (setIvAvatar) obj;
        onGetStartedClick.write((Object) setivavatar, "it");
        SortedMapDifference sortedMapDifference = this.write.read;
        onGetStartedClick.write((Object) setivavatar, "config");
        Iterable<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> iterable = setivavatar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (DenominatorAmountAdapter$BubbleViewHolder_ViewBinding denominatorAmountAdapter$BubbleViewHolder_ViewBinding : iterable) {
            arrayList.add(new captureReportData(denominatorAmountAdapter$BubbleViewHolder_ViewBinding.IconCompatParcelizer, denominatorAmountAdapter$BubbleViewHolder_ViewBinding.read));
        }
        String string = sortedMapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_types_of_fund);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…t_discover_types_of_fund)");
        String string2 = sortedMapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_types_of_fund_hint);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…cover_types_of_fund_hint)");
        populateSignalData populatesignaldata = new populateSignalData(string, string2, (List) arrayList);
        Iterable<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> iterable2 = setivavatar.MediaBrowserCompat$CustomActionResultReceiver.read;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
        for (DenominatorAmountAdapter$BubbleViewHolder_ViewBinding denominatorAmountAdapter$BubbleViewHolder_ViewBinding2 : iterable2) {
            arrayList2.add(new captureReportData(denominatorAmountAdapter$BubbleViewHolder_ViewBinding2.IconCompatParcelizer, denominatorAmountAdapter$BubbleViewHolder_ViewBinding2.read));
        }
        String string3 = sortedMapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_asset_management_company);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.st…asset_management_company)");
        String string4 = sortedMapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_broker_hint);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.st…ent_discover_broker_hint)");
        populateSignalData populatesignaldata2 = new populateSignalData(string3, string4, (List) arrayList2);
        Iterable<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> iterable3 = setivavatar.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
        Collection arrayList3 = new ArrayList(iterable3 instanceof Collection ? ((Collection) iterable3).size() : 10);
        for (DenominatorAmountAdapter$BubbleViewHolder_ViewBinding denominatorAmountAdapter$BubbleViewHolder_ViewBinding3 : iterable3) {
            arrayList3.add(new captureReportData(denominatorAmountAdapter$BubbleViewHolder_ViewBinding3.IconCompatParcelizer, denominatorAmountAdapter$BubbleViewHolder_ViewBinding3.read));
        }
        String string5 = sortedMapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.investment_discover_risk_level_filter);
        onGetStartedClick.IconCompatParcelizer((Object) string5, "resources.getString(R.st…scover_risk_level_filter)");
        populateSessionApplicationData populatesessionapplicationdata = new populateSessionApplicationData(string5, (List) arrayList3);
        Iterable<setDrawable> iterable4 = setivavatar.write.read;
        onGetStartedClick.write((Object) iterable4, "$this$collectionSizeOrDefault");
        Collection arrayList4 = new ArrayList(iterable4 instanceof Collection ? ((Collection) iterable4).size() : 10);
        for (setDrawable setdrawable : iterable4) {
            arrayList4.add(new captureReportData(setdrawable.write, setdrawable.IconCompatParcelizer, setdrawable.MediaBrowserCompat$ItemReceiver, setdrawable.MediaBrowserCompat$CustomActionResultReceiver));
        }
        populateSignalData populatesignaldata3 = new populateSignalData("", "", (List) arrayList4);
        Iterable<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> iterable5 = setivavatar.write.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable5, "$this$collectionSizeOrDefault");
        if (iterable5 instanceof Collection) {
            i = ((Collection) iterable5).size();
        }
        Collection arrayList5 = new ArrayList(i);
        for (DenominatorAmountAdapter$BubbleViewHolder_ViewBinding denominatorAmountAdapter$BubbleViewHolder_ViewBinding4 : iterable5) {
            arrayList5.add(new captureReportData(denominatorAmountAdapter$BubbleViewHolder_ViewBinding4.IconCompatParcelizer, denominatorAmountAdapter$BubbleViewHolder_ViewBinding4.read));
        }
        return new populateFramesList(populatesignaldata, populatesignaldata2, populatesessionapplicationdata, populatesignaldata3, new populateSignalData("", "", (List) arrayList5));
    }
}
