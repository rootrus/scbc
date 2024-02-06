package p040o;

import java.util.List;

/* renamed from: o.setOnStreetViewPanoramaChangeListener */
public final class setOnStreetViewPanoramaChangeListener {
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final List<animateTo> MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final setOnStreetViewPanoramaClickListener RatingCompat;
    public final List<isPanningGesturesEnabled> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnStreetViewPanoramaChangeListener)) {
            return false;
        }
        setOnStreetViewPanoramaChangeListener setonstreetviewpanoramachangelistener = (setOnStreetViewPanoramaChangeListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setonstreetviewpanoramachangelistener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setonstreetviewpanoramachangelistener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonstreetviewpanoramachangelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonstreetviewpanoramachangelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setonstreetviewpanoramachangelistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonstreetviewpanoramachangelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setonstreetviewpanoramachangelistener.RatingCompat) && this.MediaBrowserCompat$CustomActionResultReceiver == setonstreetviewpanoramachangelistener.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<isPanningGesturesEnabled> list = this.read;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<animateTo> list2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = list2 != null ? list2.hashCode() : 0;
        setOnStreetViewPanoramaClickListener setonstreetviewpanoramaclicklistener = this.RatingCompat;
        if (setonstreetviewpanoramaclicklistener != null) {
            i = setonstreetviewpanoramaclicklistener.hashCode();
        }
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesSummary(unrealizedAmt=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", marketValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", asOfDate=");
        sb.append(this.write);
        sb.append(", accountList=");
        sb.append(this.read);
        sb.append(", pieChart=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tradeNow=");
        sb.append(this.RatingCompat);
        sb.append(", singleAppFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setOnStreetViewPanoramaChangeListener(String str, String str2, String str3, String str4, List<isPanningGesturesEnabled> list, List<animateTo> list2, setOnStreetViewPanoramaClickListener setonstreetviewpanoramaclicklistener, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.RatingCompat = setonstreetviewpanoramaclicklistener;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }
}
