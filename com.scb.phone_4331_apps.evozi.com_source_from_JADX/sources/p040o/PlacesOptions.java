package p040o;

import java.util.Objects;

/* renamed from: o.PlacesOptions */
public final class PlacesOptions {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public String write;

    /* renamed from: o.PlacesOptions$Builder */
    public enum Builder {
        BG_ACCOUNT_SUMMARY("bg_acsummary.png"),
        BG_BANKING_SERVICE("bg_bankservices.png"),
        BG_LOGIN("bg_login.png"),
        BG_MONEY_MOVEMENT("bg_moneymovement.png"),
        BG_LANDING_BELT("bg_landing_belt.png");
        
        public String component;

        private Builder(String str) {
            this.component = str;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TileHistory{accountFrom='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", accountTo='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", referenceNo1='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", referenceNo2='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", payBy='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", ebillSource='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", depAcctIdFrom='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", serviceNumber='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", pmtAmt='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlacesOptions placesOptions = (PlacesOptions) obj;
        if (!Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, placesOptions.MediaBrowserCompat$CustomActionResultReceiver) || !Objects.equals(this.IconCompatParcelizer, placesOptions.IconCompatParcelizer) || !Objects.equals(this.MediaDescriptionCompat, placesOptions.MediaDescriptionCompat) || !Objects.equals(this.MediaMetadataCompat, placesOptions.MediaMetadataCompat) || !Objects.equals(this.MediaBrowserCompat$ItemReceiver, placesOptions.MediaBrowserCompat$ItemReceiver) || !Objects.equals(this.RatingCompat, placesOptions.RatingCompat) || !Objects.equals(this.read, placesOptions.read) || !Objects.equals(this.write, placesOptions.write) || !Objects.equals(this.MediaBrowserCompat$MediaItem, placesOptions.MediaBrowserCompat$MediaItem) || !Objects.equals(this.MediaBrowserCompat$SearchResultReceiver, placesOptions.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaBrowserCompat$ItemReceiver, this.RatingCompat, this.read, this.write, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver});
    }
}
