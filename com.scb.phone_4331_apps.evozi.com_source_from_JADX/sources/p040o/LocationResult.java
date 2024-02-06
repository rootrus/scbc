package p040o;

import java.util.List;

/* renamed from: o.LocationResult */
public final class LocationResult {
    public final List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> IconCompatParcelizer;
    public final List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> MediaBrowserCompat$ItemReceiver;
    public final List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> read;

    public LocationResult() {
        this((byte) 0);
    }

    public LocationResult(List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> list, List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> list2, List<DenominatorAmountAdapter$BubbleViewHolder_ViewBinding> list3) {
        onGetStartedClick.write((Object) list, "brokers");
        onGetStartedClick.write((Object) list2, "riskLevels");
        onGetStartedClick.write((Object) list3, "typeOfFunds");
        this.read = list;
        this.IconCompatParcelizer = list2;
        this.MediaBrowserCompat$ItemReceiver = list3;
    }

    public /* synthetic */ LocationResult(byte b) {
        this(HmlNationalIdActivity.IconCompatParcelizer, HmlNationalIdActivity.IconCompatParcelizer, HmlNationalIdActivity.IconCompatParcelizer);
    }
}
