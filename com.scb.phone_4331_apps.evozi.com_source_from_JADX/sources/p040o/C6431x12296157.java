package p040o;

/* renamed from: o.DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding */
public final class C6431x12296157 {
    public final String AlertController$RecycleListView;
    public final String IconCompatParcelizer;
    public final String Keep;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f3131x50fd9e4a;
    public final DepositTransactionAdapter$GroupItemViewHolder_ViewBinding MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final int MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final int PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final String read;
    public final String setHasDecor;
    public final String[] write;

    public C6431x12296157() {
    }

    public static <T> T write(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be null");
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T extends CharSequence> T IconCompatParcelizer(T t, String str) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" may not be null");
            throw new IllegalArgumentException(sb.toString());
        } else if (!DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(t)) {
            return t;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" may not be blank");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" may not be negative");
        throw new IllegalArgumentException(sb.toString());
    }

    public C6431x12296157(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DepositTransactionAdapter$GroupItemViewHolder_ViewBinding depositTransactionAdapter$GroupItemViewHolder_ViewBinding, String[] strArr, int i2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        onGetStartedClick.write((Object) str2, "cardMask");
        onGetStartedClick.write((Object) strArr, "allowTag");
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.RatingCompat = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.Keep = str7;
        this.AlertController$RecycleListView = str8;
        this.MediaDescriptionCompat = depositTransactionAdapter$GroupItemViewHolder_ViewBinding;
        this.write = strArr;
        this.PlaybackStateCompat$CustomAction = i2;
        this.read = str9;
        this.PlaybackStateCompat = str10;
        this.MediaSessionCompat$QueueItem = str11;
        this.IconCompatParcelizer = str12;
        this.setHasDecor = str13;
        this.ParcelableVolumeInfo = str14;
        this.MediaSessionCompat$Token = str15;
        this.f3131x50fd9e4a = str16;
    }
}
