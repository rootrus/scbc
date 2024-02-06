package p040o;

import java.util.List;

/* renamed from: o.zzvo */
public final class zzvo extends zzuk {
    public List<zzvp> AlertController$RecycleListView;
    public int Keep;
    public setDimensions MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public Double MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public getShortName f3002x50fd9e4a;
    public List<String> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public List<zzsh> ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public List<zzvx> PlaybackStateCompat$CustomAction;
    public Double RatingCompat;
    public zzsg read;
    public List<zzvq> setHasDecor;
    public String write;

    public static zzvo MediaBrowserCompat$CustomActionResultReceiver() {
        return new zzvo();
    }

    public final zzvo IconCompatParcelizer(zzvj zzvj) {
        this.IconCompatParcelizer = zzvj;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzvo zzvo = (zzvo) obj;
        if (this.Keep != zzvo.Keep) {
            return false;
        }
        String str = this.write;
        if (str == null ? zzvo.write != null : !str.equals(zzvo.write)) {
            return false;
        }
        if (this.f3002x50fd9e4a != zzvo.f3002x50fd9e4a) {
            return false;
        }
        String str2 = this.PlaybackStateCompat;
        if (str2 == null ? zzvo.PlaybackStateCompat != null : !str2.equals(zzvo.PlaybackStateCompat)) {
            return false;
        }
        String str3 = this.MediaSessionCompat$Token;
        if (str3 == null ? zzvo.MediaSessionCompat$Token != null : !str3.equals(zzvo.MediaSessionCompat$Token)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$QueueItem;
        if (str4 == null ? zzvo.MediaSessionCompat$QueueItem != null : !str4.equals(zzvo.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str5 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str5 == null ? zzvo.MediaSessionCompat$ResultReceiverWrapper != null : !str5.equals(zzvo.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 == null ? zzvo.MediaBrowserCompat$MediaItem != null : !str6.equals(zzvo.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 == null ? zzvo.MediaMetadataCompat != null : !str7.equals(zzvo.MediaMetadataCompat)) {
            return false;
        }
        Double d = this.RatingCompat;
        if (d == null ? zzvo.RatingCompat != null : !d.equals(zzvo.RatingCompat)) {
            return false;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != zzvo.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        List<zzvx> list = this.PlaybackStateCompat$CustomAction;
        if (list == null ? zzvo.PlaybackStateCompat$CustomAction != null : !list.equals(zzvo.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        List<zzsh> list2 = this.ParcelableVolumeInfo;
        if (list2 == null ? zzvo.ParcelableVolumeInfo != null : !list2.equals(zzvo.ParcelableVolumeInfo)) {
            return false;
        }
        List<zzvp> list3 = this.AlertController$RecycleListView;
        if (list3 == null ? zzvo.AlertController$RecycleListView != null : !list3.equals(zzvo.AlertController$RecycleListView)) {
            return false;
        }
        List<zzvq> list4 = this.setHasDecor;
        if (list4 == null ? zzvo.setHasDecor != null : !list4.equals(zzvo.setHasDecor)) {
            return false;
        }
        zzsg zzsg = this.read;
        if (zzsg == null ? zzvo.read != null : !zzsg.equals(zzvo.read)) {
            return false;
        }
        Double d2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (d2 == null ? zzvo.MediaBrowserCompat$SearchResultReceiver != null : !d2.equals(zzvo.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        List<String> list5 = this.MediaDescriptionCompat;
        List<String> list6 = zzvo.MediaDescriptionCompat;
        if (list5 != null) {
            return list5.equals(list6);
        }
        if (list6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int hashCode = str != null ? str.hashCode() : 0;
        getShortName getshortname = this.f3002x50fd9e4a;
        int hashCode2 = getshortname != null ? getshortname.hashCode() : 0;
        String str2 = this.PlaybackStateCompat;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$Token;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        Double d = this.RatingCompat;
        int hashCode9 = d != null ? d.hashCode() : 0;
        setDimensions setdimensions = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = setdimensions != null ? setdimensions.hashCode() : 0;
        List<zzvx> list = this.PlaybackStateCompat$CustomAction;
        int hashCode11 = list != null ? list.hashCode() : 0;
        List<zzsh> list2 = this.ParcelableVolumeInfo;
        int hashCode12 = list2 != null ? list2.hashCode() : 0;
        List<zzvp> list3 = this.AlertController$RecycleListView;
        int hashCode13 = list3 != null ? list3.hashCode() : 0;
        List<zzvq> list4 = this.setHasDecor;
        int hashCode14 = list4 != null ? list4.hashCode() : 0;
        zzsg zzsg = this.read;
        int hashCode15 = zzsg != null ? zzsg.hashCode() : 0;
        List<String> list5 = this.MediaDescriptionCompat;
        int hashCode16 = list5 != null ? list5.hashCode() : 0;
        Double d2 = this.MediaBrowserCompat$SearchResultReceiver;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (d2 != null ? d2.hashCode() : 0)) * 31) + this.Keep;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositSummary{accountNumber='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", productType=");
        sb.append(this.f3002x50fd9e4a);
        sb.append(", productTypeDescription='");
        sb.append(this.PlaybackStateCompat);
        sb.append('\'');
        sb.append(", productSubTypeCode='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", productSubTypeDescription='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", productCodeDescription='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", currency='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", disclaimer='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", availableBalance=");
        sb.append(this.RatingCompat);
        sb.append(", accountStatus=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", recentTransactionList=");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append(", labelList=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", remarkList=");
        sb.append(this.AlertController$RecycleListView);
        sb.append(", subProductList=");
        sb.append(this.setHasDecor);
        sb.append(", additionalLimit=");
        sb.append(this.read);
        sb.append(", allow=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sortSequence=");
        sb.append(this.Keep);
        sb.append(", availableBalanceWithAdditionalLimit=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('}');
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ zzuk read(zzvj zzvj) {
        this.IconCompatParcelizer = zzvj;
        return this;
    }
}
