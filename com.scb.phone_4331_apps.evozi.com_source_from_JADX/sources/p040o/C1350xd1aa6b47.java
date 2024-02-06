package p040o;

import com.drew.imaging.png.PngProcessingException;
import java.io.IOException;

/* renamed from: o.getViewLifecycleOwnerLiveData$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1350xd1aa6b47 {
    public static final int action_container = 2131296313;
    public static final int action_divider = 2131296315;
    public static final int action_image = 2131296316;
    public static final int action_text = 2131296326;
    public static final int actions = 2131296327;
    public static final int async = 2131296431;
    public static final int blocking = 2131296572;
    public static final int bottom = 2131296590;
    public static final int chronometer = 2131297036;
    public static final int end = 2131297635;
    public static final int forever = 2131297802;
    public static final int glide_custom_view_target_tag = 2131298034;
    public static final int icon = 2131298138;
    public static final int icon_group = 2131298145;
    public static final int info = 2131298278;
    public static final int italic = 2131298360;
    public static final int left = 2131298906;
    public static final int line1 = 2131298936;
    public static final int line3 = 2131298937;
    public static final int none = 2131299386;
    public static final int normal = 2131299387;
    public static final int notification_background = 2131299393;
    public static final int notification_main_column = 2131299394;
    public static final int notification_main_column_container = 2131299395;
    public static final int right = 2131299897;
    public static final int right_icon = 2131299901;
    public static final int right_side = 2131299902;
    public static final int start = 2131300277;
    public static final int tag_transition_group = 2131300355;
    public static final int tag_unhandled_key_event_manager = 2131300356;
    public static final int tag_unhandled_key_listeners = 2131300357;
    public static final int text = 2131300379;
    public static final int text2 = 2131300381;
    public static final int time = 2131300688;
    public static final int title = 2131300689;
    public static final int top = 2131300717;
    public setRecycledViewPool IconCompatParcelizer;
    public byte MediaBrowserCompat$CustomActionResultReceiver;
    public byte MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public byte MediaDescriptionCompat;
    public byte read;
    public int write;

    public C1350xd1aa6b47(byte[] bArr) throws PngProcessingException {
        if (bArr.length == 13) {
            copyTo copyto = new copyTo(bArr);
            try {
                this.MediaBrowserCompat$MediaItem = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.write = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$ItemReceiver = copyto.MediaBrowserCompat$ItemReceiver();
                byte MediaBrowserCompat$ItemReceiver2 = copyto.MediaBrowserCompat$ItemReceiver();
                setRecycledViewPool MediaBrowserCompat$ItemReceiver3 = setRecycledViewPool.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver3;
                    this.read = copyto.MediaBrowserCompat$ItemReceiver();
                    this.MediaBrowserCompat$CustomActionResultReceiver = copyto.MediaBrowserCompat$ItemReceiver();
                    this.MediaDescriptionCompat = copyto.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected PNG color type: ");
                sb.append(MediaBrowserCompat$ItemReceiver2);
                throw new PngProcessingException(sb.toString());
            } catch (IOException e) {
                throw new PngProcessingException((Throwable) e);
            }
        } else {
            throw new PngProcessingException("PNG header chunk must have 13 data bytes");
        }
    }

    public C1350xd1aa6b47() {
    }
}
