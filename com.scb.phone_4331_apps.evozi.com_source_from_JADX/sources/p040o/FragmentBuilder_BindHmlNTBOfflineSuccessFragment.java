package p040o;

/* renamed from: o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment */
public final class FragmentBuilder_BindHmlNTBOfflineSuccessFragment {
    private boolean AlertController$RecycleListView;
    public boolean IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f3146x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public write MediaSessionCompat$Token;
    public FragmentBuilder_BindHmlNTBOfflineSuccessFragment ParcelableVolumeInfo;
    private String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String setHasDecor;
    public String write;

    /* renamed from: o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment$write */
    public interface write {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindHmlNTBOfflineSuccessFragment)) {
            return false;
        }
        FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = (FragmentBuilder_BindHmlNTBOfflineSuccessFragment) obj;
        if (this.MediaBrowserCompat$SearchResultReceiver != fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$SearchResultReceiver || this.IconCompatParcelizer != fragmentBuilder_BindHmlNTBOfflineSuccessFragment.IconCompatParcelizer) {
            return false;
        }
        String str = this.PlaybackStateCompat;
        if (str == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.PlaybackStateCompat != null : !str.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.PlaybackStateCompat)) {
            return false;
        }
        String str2 = this.Keep;
        if (str2 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.Keep != null : !str2.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.Keep)) {
            return false;
        }
        String str3 = this.f3146x50fd9e4a;
        if (str3 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a != null : !str3.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$QueueItem;
        if (str4 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaSessionCompat$QueueItem != null : !str4.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str5 = this.MediaMetadataCompat;
        if (str5 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaMetadataCompat != null : !str5.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaMetadataCompat)) {
            return false;
        }
        String str6 = this.setHasDecor;
        if (str6 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.setHasDecor != null : !str6.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.setHasDecor)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        if (str7 == null ? fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver != null : !str7.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str8 = this.read;
        String str9 = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.read;
        if (str8 != null) {
            if (str8.equals(str9)) {
                return true;
            }
        } else if (str9 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3146x50fd9e4a;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.setHasDecor;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$SearchResultReceiver;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.PlaybackStateCompat;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + hashCode7) * 31) + i) * 31) + (this.IconCompatParcelizer ? 1 : 0);
    }

    public FragmentBuilder_BindHmlNTBOfflineSuccessFragment(String str, String str2) {
        this.MediaBrowserCompat$MediaItem = false;
        this.f3146x50fd9e4a = "";
        this.setHasDecor = "";
        this.PlaybackStateCompat$CustomAction = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.read = "";
        this.write = "";
        this.IconCompatParcelizer = true;
        this.MediaDescriptionCompat = true;
        this.MediaMetadataCompat = str;
        this.Keep = str2;
    }

    public FragmentBuilder_BindHmlNTBOfflineSuccessFragment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, boolean z2) {
        this.MediaBrowserCompat$MediaItem = false;
        this.f3146x50fd9e4a = "";
        this.setHasDecor = "";
        this.PlaybackStateCompat$CustomAction = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.read = "";
        this.write = "";
        this.IconCompatParcelizer = true;
        this.f3146x50fd9e4a = str;
        this.RatingCompat = str2;
        this.MediaSessionCompat$QueueItem = str3;
        this.MediaMetadataCompat = str4;
        this.setHasDecor = str5;
        this.PlaybackStateCompat$CustomAction = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.MediaBrowserCompat$CustomActionResultReceiver = str8;
        this.read = str9;
        this.write = str10;
        this.Keep = str11;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.PlaybackStateCompat = str12;
        this.IconCompatParcelizer = z2;
    }

    private FragmentBuilder_BindHmlNTBOfflineSuccessFragment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, boolean z2, byte b) {
        this.MediaBrowserCompat$MediaItem = false;
        this.f3146x50fd9e4a = "";
        this.setHasDecor = "";
        this.PlaybackStateCompat$CustomAction = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.read = "";
        this.write = "";
        this.IconCompatParcelizer = true;
        this.ParcelableVolumeInfo = null;
        this.AlertController$RecycleListView = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.MediaDescriptionCompat = false;
        this.f3146x50fd9e4a = str;
        this.RatingCompat = str2;
        this.MediaSessionCompat$QueueItem = str3;
        this.MediaMetadataCompat = str4;
        this.setHasDecor = str5;
        this.PlaybackStateCompat$CustomAction = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.MediaBrowserCompat$CustomActionResultReceiver = str8;
        this.read = str9;
        this.write = str10;
        this.Keep = str11;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.PlaybackStateCompat = str12;
        this.IconCompatParcelizer = z2;
    }

    public final FragmentBuilder_BindHmlNTBOfflineSuccessFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new FragmentBuilder_BindHmlNTBOfflineSuccessFragment(this.f3146x50fd9e4a, this.RatingCompat, this.MediaSessionCompat$QueueItem, this.MediaMetadataCompat, this.setHasDecor, this.PlaybackStateCompat$CustomAction, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.write, this.Keep, this.MediaBrowserCompat$SearchResultReceiver, this.PlaybackStateCompat, this.IconCompatParcelizer, (byte) 0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z = true;
        boolean z2 = !write();
        FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = this.ParcelableVolumeInfo;
        boolean z3 = false;
        if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment != null && z2 && !equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment)) {
            z3 = true;
        }
        if (this.ParcelableVolumeInfo != null || !z2) {
            z = z3;
        }
        if (this.MediaSessionCompat$ResultReceiverWrapper != z) {
            this.MediaSessionCompat$ResultReceiverWrapper = z;
            write write2 = this.MediaSessionCompat$Token;
            if (write2 == null) {
                return;
            }
            if (z) {
                write2.IconCompatParcelizer();
            } else {
                write2.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    private boolean write() {
        String str = this.f3146x50fd9e4a;
        if (!(str == null || str.trim().isEmpty()) && IconCompatParcelizer()) {
            String str2 = this.read;
            if (!(str2 == null || str2.trim().isEmpty())) {
                return false;
            }
        }
        return true;
    }

    private boolean IconCompatParcelizer() {
        if (this.MediaDescriptionCompat) {
            String str = this.setHasDecor;
            if (str == null || str.trim().isEmpty()) {
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                if (str2 == null || str2.trim().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackingPointModel{origin=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", mutated=");
        sb.append(false);
        sb.append(", isValid=");
        sb.append(false);
        sb.append(", isReady=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", isNew=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isDelete=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", name='");
        sb.append(this.f3146x50fd9e4a);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", interactionId='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", propositionId='");
        sb.append(this.setHasDecor);
        sb.append('\'');
        sb.append(", propositionName='");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append('\'');
        sb.append(", attributeId='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", attributeName='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", eventTypeId='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", eventTypeName='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", trackingPointType='");
        sb.append(this.Keep);
        sb.append('\'');
        sb.append(", isCompletionActivity=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", id='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", createdDate='");
        sb.append(this.PlaybackStateCompat);
        sb.append('\'');
        sb.append(", enabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", onModelStateChangedListener=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('}');
        return sb.toString();
    }
}
