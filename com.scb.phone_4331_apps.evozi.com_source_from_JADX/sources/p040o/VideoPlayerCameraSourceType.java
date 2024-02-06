package p040o;

import com.scb.phone.presentation.mapper.setting.ProfileSettingDisplayMapper;
import com.scb.phone.view.fragment.hml.HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver;
import dagger.Lazy;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.access$2300;

/* renamed from: o.VideoPlayerCameraSourceType */
public class VideoPlayerCameraSourceType extends writeUInt64NoTag<getBlackStreakMaxHeight> {
    public final ProfileSettingDisplayMapper IconCompatParcelizer;
    public HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public final insert MediaBrowserCompat$MediaItem;
    public final access$210 MediaDescriptionCompat;
    private final including MediaMetadataCompat;
    public AutoValue_CrashlyticsReport_Session_Event_Log.Builder read;
    public Lazy<RttiJsonCheck_MembersInjector> write;

    @HmlPinActivity
    public VideoPlayerCameraSourceType(RegularImmutableBiMap regularImmutableBiMap, access$210 access_210, insert insert, including including, ProfileSettingDisplayMapper profileSettingDisplayMapper, Lazy<RttiJsonCheck_MembersInjector> lazy) {
        super(regularImmutableBiMap);
        this.MediaDescriptionCompat = access_210;
        this.MediaMetadataCompat = including;
        this.MediaBrowserCompat$MediaItem = insert;
        this.IconCompatParcelizer = profileSettingDisplayMapper;
        this.write = lazy;
    }

    /* renamed from: o.VideoPlayerCameraSourceType$IconCompatParcelizer */
    final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(VideoPlayerCameraSourceType videoPlayerCameraSourceType, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            VideoPlayerCameraSourceType.this.MediaBrowserCompat$ItemReceiver(VideoPlayerCameraSourceType.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onComplete() {
            VideoPlayerCameraSourceType.IconCompatParcelizer(VideoPlayerCameraSourceType.this);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, getBlackStreakMaxHeight getblackstreakmaxheight) {
        if (z) {
            getblackstreakmaxheight.setPadding();
        } else {
            getblackstreakmaxheight.setIcon();
        }
    }

    static /* synthetic */ void read(boolean z, getBlackStreakMaxHeight getblackstreakmaxheight) {
        if (z) {
            getblackstreakmaxheight.MediaBrowserCompat$ItemReceiver();
        } else {
            getblackstreakmaxheight.IconCompatParcelizer();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(boolean z, getBlackStreakMaxHeight getblackstreakmaxheight) {
        if (z) {
            getblackstreakmaxheight.read();
        } else {
            getblackstreakmaxheight.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(boolean z) {
        if (this.write.get().read()) {
            this.MediaDescriptionCompat.read.write(z);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(VideoPlayerCameraSourceType videoPlayerCameraSourceType) {
        if (videoPlayerCameraSourceType.RatingCompat != null) {
            videoPlayerCameraSourceType.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(new copyOfInternal(z ? 1 : 0));
        this.MediaMetadataCompat.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
    }
}
