package p040o;

import p040o.ForwardingListenableFuture;

/* renamed from: o.SettableFuture */
public final class SettableFuture extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public static SettableFuture IconCompatParcelizer(int i, String str, boolean z) {
        return new SettableFuture(i, str, z);
    }

    private SettableFuture(int i, String str, boolean z) {
        super(i, str, false, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SettableFuture settableFuture = (SettableFuture) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? settableFuture.IconCompatParcelizer != null : !str.equals(settableFuture.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.RatingCompat;
        if (str2 == null ? settableFuture.RatingCompat != null : !str2.equals(settableFuture.RatingCompat)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null ? settableFuture.MediaBrowserCompat$MediaItem != null : !str3.equals(settableFuture.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str4 = this.MediaDescriptionCompat;
        if (str4 == null ? settableFuture.MediaDescriptionCompat != null : !str4.equals(settableFuture.MediaDescriptionCompat)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str5 == null ? settableFuture.MediaBrowserCompat$SearchResultReceiver != null : !str5.equals(settableFuture.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str6 = this.MediaSessionCompat$Token;
        if (str6 == null ? settableFuture.MediaSessionCompat$Token != null : !str6.equals(settableFuture.MediaSessionCompat$Token)) {
            return false;
        }
        String str7 = this.MediaSessionCompat$QueueItem;
        if (str7 == null ? settableFuture.MediaSessionCompat$QueueItem != null : !str7.equals(settableFuture.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str8 == null ? settableFuture.MediaSessionCompat$ResultReceiverWrapper != null : !str8.equals(settableFuture.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str9 = this.ParcelableVolumeInfo;
        if (str9 == null ? settableFuture.ParcelableVolumeInfo != null : !str9.equals(settableFuture.ParcelableVolumeInfo)) {
            return false;
        }
        String str10 = this.read;
        if (str10 == null ? settableFuture.read != null : !str10.equals(settableFuture.read)) {
            return false;
        }
        String str11 = this.MediaMetadataCompat;
        String str12 = settableFuture.MediaMetadataCompat;
        if (str11 != null) {
            return str11.equals(str12);
        }
        if (str12 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$Token;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$QueueItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.ParcelableVolumeInfo;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaMetadataCompat;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferIndividualScreenshotDisplay{dateTime='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", refId='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", fromBankLogo='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", fromName='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", fromNumber='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", toBankLogo='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", toName='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", toNumber='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", toNickname='");
        sb.append(this.ParcelableVolumeInfo);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", fee='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
