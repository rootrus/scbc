package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.upperCaseFirstLetter */
public final class upperCaseFirstLetter extends writeUInt64NoTag<getFirstName.read> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public Component$$Lambda$3 MediaMetadataCompat;
    public intoSet read;
    public String write;

    /* renamed from: o.upperCaseFirstLetter$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.read> {
        private /* synthetic */ upperCaseFirstLetter MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(upperCaseFirstLetter uppercasefirstletter) {
            this.MediaBrowserCompat$ItemReceiver = uppercasefirstletter;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName.read read = (getFirstName.read) obj;
            if (upperCaseFirstLetter.write(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver != null) {
                read.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    /* renamed from: o.upperCaseFirstLetter$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.read> {
        private /* synthetic */ upperCaseFirstLetter IconCompatParcelizer;

        public read(upperCaseFirstLetter uppercasefirstletter) {
            this.IconCompatParcelizer = uppercasefirstletter;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.read) obj).IconCompatParcelizer(upperCaseFirstLetter.IconCompatParcelizer(this.IconCompatParcelizer));
        }
    }

    /* renamed from: o.upperCaseFirstLetter$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.read> {
        private /* synthetic */ boolean write;

        public write(boolean z) {
            this.write = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.read) obj).MediaBrowserCompat$ItemReceiver(this.write);
        }
    }

    public static final /* synthetic */ intoSet write(upperCaseFirstLetter uppercasefirstletter) {
        intoSet intoset = uppercasefirstletter.read;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        return intoset;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public upperCaseFirstLetter(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    public static final /* synthetic */ lambda$intoSet$2 IconCompatParcelizer(upperCaseFirstLetter uppercasefirstletter) {
        lambda$intoSet$2 lambda_intoset_2 = new lambda$intoSet$2();
        String str = uppercasefirstletter.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardNo");
        }
        lambda_intoset_2.IconCompatParcelizer = str;
        String str2 = uppercasefirstletter.MediaBrowserCompat$ItemReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productTypeDescription");
        }
        lambda_intoset_2.setContentView = str2;
        String str3 = uppercasefirstletter.write;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("maskedCardNo");
        }
        lambda_intoset_2.AlertController$RecycleListView = str3;
        lambda_intoset_2.MediaSessionCompat$ResultReceiverWrapper = true;
        intoSet intoset = uppercasefirstletter.read;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        lambda_intoset_2.Keep = intoset.PlaybackStateCompat$CustomAction;
        intoSet intoset2 = uppercasefirstletter.read;
        if (intoset2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        lambda_intoset_2.setHasDecor = intoset2.MediaSessionCompat$QueueItem;
        intoSet intoset3 = uppercasefirstletter.read;
        if (intoset3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        lambda_intoset_2.ParcelableVolumeInfo = intoset3.MediaSessionCompat$Token;
        Component$$Lambda$3 component$$Lambda$3 = uppercasefirstletter.MediaMetadataCompat;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        lambda_intoset_2.MediaSessionCompat$QueueItem = (int) component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver;
        return lambda_intoset_2;
    }

    public static final /* synthetic */ void read(upperCaseFirstLetter uppercasefirstletter) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(uppercasefirstletter);
        if (uppercasefirstletter.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(uppercasefirstletter.RatingCompat);
        }
    }
}
