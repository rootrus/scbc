package p040o;

import java.text.NumberFormat;
import java.util.Locale;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAsCharacter */
public final /* synthetic */ class getAsCharacter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C$Gson$Preconditions MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ComponentContainer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Boolean read;
    private final /* synthetic */ intoSet write;

    public /* synthetic */ getAsCharacter(C$Gson$Preconditions _gson_preconditions, ComponentContainer componentContainer, intoSet intoset, Boolean bool, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = _gson_preconditions;
        this.MediaBrowserCompat$ItemReceiver = componentContainer;
        this.write = intoset;
        this.read = bool;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i;
        int i2;
        ComponentContainer componentContainer = this.MediaBrowserCompat$ItemReceiver;
        intoSet intoset = this.write;
        Boolean bool = this.read;
        String str = this.IconCompatParcelizer;
        getSignatureImage getsignatureimage = (getSignatureImage) obj;
        lambda$intoSet$2 lambda_intoset_2 = new lambda$intoSet$2();
        lambda_intoset_2.write = componentContainer.IconCompatParcelizer;
        lambda_intoset_2.IconCompatParcelizer = componentContainer.write;
        lambda_intoset_2.AlertController$RecycleListView = componentContainer.MediaBrowserCompat$CustomActionResultReceiver;
        lambda_intoset_2.setHasDecor = intoset.MediaSessionCompat$QueueItem;
        lambda_intoset_2.MediaBrowserCompat$SearchResultReceiver = intoset.AlertController$RecycleListView;
        lambda_intoset_2.MediaDescriptionCompat = intoset.MediaBrowserCompat$MediaItem;
        lambda_intoset_2.PlaybackStateCompat$CustomAction = intoset.IconCompatParcelizer;
        lambda_intoset_2.Keep = intoset.PlaybackStateCompat$CustomAction;
        lambda_intoset_2.AppCompatActivity = intoset.ParcelableVolumeInfo;
        lambda_intoset_2.ParcelableVolumeInfo = intoset.MediaSessionCompat$Token;
        lambda_intoset_2.MediaSessionCompat$QueueItem = 1;
        lambda_intoset_2.MediaBrowserCompat$MediaItem = str;
        lambda_intoset_2.f2885x50fd9e4a = true;
        lambda_intoset_2.MediaSessionCompat$ResultReceiverWrapper = bool.booleanValue();
        lambda_intoset_2.setContentView = componentContainer.RatingCompat;
        lambda_intoset_2.read = componentContainer.MediaMetadataCompat;
        lambda_intoset_2.MediaBrowserCompat$ItemReceiver = componentContainer.MediaBrowserCompat$SearchResultReceiver;
        lambda_intoset_2.AppCompatDialogFragment = componentContainer.ParcelableVolumeInfo;
        if (bool.booleanValue()) {
            i = 0;
            i2 = intoset.PlaybackStateCompat$CustomAction.intValue();
        } else {
            i = intoset.IconCompatParcelizer.intValue();
            i2 = intoset.ParcelableVolumeInfo.intValue();
        }
        lambda_intoset_2.MediaMetadataCompat = NumberFormat.getInstance(Locale.getDefault()).format((long) i2);
        lambda_intoset_2.RatingCompat = NumberFormat.getInstance(Locale.getDefault()).format((long) i);
        lambda_intoset_2.PlaybackStateCompat = componentContainer.MediaSessionCompat$QueueItem;
        lambda_intoset_2.MediaBrowserCompat$CustomActionResultReceiver = componentContainer.read;
        getsignatureimage.read(lambda_intoset_2);
    }
}
