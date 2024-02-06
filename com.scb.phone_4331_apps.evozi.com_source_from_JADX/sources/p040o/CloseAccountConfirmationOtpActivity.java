package p040o;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: o.CloseAccountConfirmationOtpActivity */
public class CloseAccountConfirmationOtpActivity {
    private static CloseAccountConfirmationOtpActivity Keep;
    public Context IconCompatParcelizer;
    public byte[] MediaBrowserCompat$CustomActionResultReceiver;
    public Double MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public ArrayList<byte[]> f5485x50fd9e4a;
    public IconCompatParcelizer MediaDescriptionCompat;
    public int MediaMetadataCompat = 5;
    public ArrayList<read> MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public ArrayList<onEmailUsClick$MediaBrowserCompat$MediaItem> ParcelableVolumeInfo = new ArrayList<>();
    public Double PlaybackStateCompat;
    public boolean RatingCompat = false;
    public boolean read = false;
    public boolean write = false;

    /* renamed from: o.CloseAccountConfirmationOtpActivity$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        challenge_first,
        face_first
    }

    /* renamed from: o.CloseAccountConfirmationOtpActivity$read */
    public enum read {
        smile,
        close_left_eye,
        close_right_eye,
        blink,
        turn_head_right,
        turn_head_left,
        tilt_head_left,
        tilt_head_right,
        turn_face_left,
        turn_face_right,
        straight
    }

    public CloseAccountConfirmationOtpActivity() {
        Double valueOf = Double.valueOf(0.0d);
        this.PlaybackStateCompat = valueOf;
        this.MediaBrowserCompat$ItemReceiver = valueOf;
        this.MediaDescriptionCompat = IconCompatParcelizer.challenge_first;
        this.MediaSessionCompat$QueueItem = new ArrayList<>();
        this.f5485x50fd9e4a = new ArrayList<>();
        new ArrayList();
        this.MediaSessionCompat$Token = false;
        this.MediaSessionCompat$ResultReceiverWrapper = 1;
    }

    public static CloseAccountConfirmationOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
        CloseAccountConfirmationOtpActivity closeAccountConfirmationOtpActivity;
        synchronized (CloseAccountConfirmationOtpActivity.class) {
            if (Keep == null) {
                Keep = new CloseAccountConfirmationOtpActivity();
            }
            closeAccountConfirmationOtpActivity = Keep;
        }
        return closeAccountConfirmationOtpActivity;
    }
}
