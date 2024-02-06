package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import java.util.Iterator;
import java.util.List;
import p040o.PassportWorkflowActivity;
import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.setMessageIcons */
public class setMessageIcons extends writeUInt64NoTag<PassportWorkflowActivity.C69841> {
    public String IconCompatParcelizer;
    public TransformationChildCard MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2949x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    /* access modifiers changed from: private */
    public List<String> MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper = true;
    public String MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public List<String> ParcelableVolumeInfo;
    private C3990aa PlaybackStateCompat$CustomAction;
    public String read;
    /* access modifiers changed from: private */
    public StandardTable.ColumnMap.ColumnMapEntrySet setHasDecor;
    public setHelperTextTextAppearance write;

    @HmlPinActivity
    public setMessageIcons(RegularImmutableBiMap regularImmutableBiMap, StandardTable.ColumnMap.ColumnMapEntrySet columnMapEntrySet, TransformationChildCard transformationChildCard, C3990aa aaVar, setHelperTextTextAppearance sethelpertexttextappearance) {
        super(regularImmutableBiMap);
        this.setHasDecor = columnMapEntrySet;
        this.MediaBrowserCompat$ItemReceiver = transformationChildCard;
        this.PlaybackStateCompat$CustomAction = aaVar;
        this.write = sethelpertexttextappearance;
    }

    public void onDestroy() {
        super.onDestroy();
        TransformationChildCard transformationChildCard = this.MediaBrowserCompat$ItemReceiver;
        if (!transformationChildCard.MediaBrowserCompat$MediaItem.isDisposed()) {
            transformationChildCard.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void read() {
        String str;
        boolean z = true;
        if (!(this.MediaMetadataCompat == null || this.MediaBrowserCompat$SearchResultReceiver == null || (((this.IconCompatParcelizer == null || this.read == null) && this.MediaSessionCompat$ResultReceiverWrapper) || this.MediaDescriptionCompat == null || this.MediaBrowserCompat$MediaItem == null || (str = this.MediaSessionCompat$Token) == null || this.f2949x50fd9e4a == null))) {
            if (str.trim().length() >= 2) {
                if (this.f2949x50fd9e4a.trim().length() >= 2) {
                    setRefocusEnabled setrefocusenabled = setRefocusEnabled.IconCompatParcelizer;
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setrefocusenabled.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                }
            }
        }
        setOrientationEnabled setorientationenabled = setOrientationEnabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setorientationenabled.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static boolean write(String str) {
        return str.trim().length() >= 2;
    }

    /* renamed from: o.setMessageIcons$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
        public write() {
        }

        public final void onError(Throwable th) {
            setMessageIcons.this.MediaBrowserCompat$ItemReceiver(setMessageIcons.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onComplete() {
            super.onComplete();
            setMessageIcons.MediaBrowserCompat$ItemReceiver(setMessageIcons.this);
            setMessageIcons setmessageicons = setMessageIcons.this;
            captureCriteriaMet capturecriteriamet = captureCriteriaMet.write;
            if (setmessageicons.RatingCompat != null) {
                capturecriteriamet.IconCompatParcelizer(setmessageicons.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            setMessageIcons.MediaBrowserCompat$MediaItem(setMessageIcons.this);
            setMessageIcons setmessageicons = setMessageIcons.this;
            captureCriteriaMet capturecriteriamet = captureCriteriaMet.write;
            if (setmessageicons.RatingCompat != null) {
                capturecriteriamet.IconCompatParcelizer(setmessageicons.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(setMessageIcons setmessageicons) {
        if (setmessageicons.RatingCompat != null) {
            setmessageicons.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setMessageIcons setmessageicons, List list) {
        boolean z;
        boolean z2;
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            PrepaidResetOtpActivity.write write2 = (PrepaidResetOtpActivity.write) it.next();
            if (write2.MediaBrowserCompat$ItemReceiver != null && !write2.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                z2 = true;
                break;
            }
        }
        setmessageicons.MediaSessionCompat$ResultReceiverWrapper = z2;
        setmessageicons.IconCompatParcelizer = null;
        setmessageicons.read();
        isStabilityThresholdEnabled isstabilitythresholdenabled = new isStabilityThresholdEnabled(z2);
        if (setmessageicons.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isstabilitythresholdenabled.IconCompatParcelizer(setmessageicons.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setMessageIcons setmessageicons) {
        if (setmessageicons.RatingCompat != null) {
            setmessageicons.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setMessageIcons setmessageicons) {
        if (setmessageicons.RatingCompat != null) {
            setmessageicons.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(setMessageIcons setmessageicons) {
        if (setmessageicons.RatingCompat != null) {
            setmessageicons.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.PlaybackStateCompat$CustomAction.read();
        this.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver(this));
    }
}
