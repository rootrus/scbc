package p040o;

import android.view.View;
import java.util.ArrayList;

/* renamed from: o.DeejungTransferLandingActivity */
public final class DeejungTransferLandingActivity {
    public View IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    public DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver = null;
    public String MediaBrowserCompat$MediaItem;
    public write MediaBrowserCompat$SearchResultReceiver = new write();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public ECouponSuccessfulActivity f3129x50fd9e4a;
    public boolean MediaDescriptionCompat = false;
    public boolean MediaMetadataCompat = false;
    public boolean MediaSessionCompat$QueueItem = false;
    public DeejungTransferLandingActivity MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token = false;
    public String ParcelableVolumeInfo;
    public boolean RatingCompat = false;
    public ArrayList<DeejungTransferLandingActivity> read = new ArrayList<>();
    public boolean write = false;

    /* renamed from: o.DeejungTransferLandingActivity$write */
    public static class write {
        public int[] IconCompatParcelizer = new int[2];
        public int[] write = new int[2];
    }

    public DeejungTransferLandingActivity(View view, String str, String str2) {
        this.IconCompatParcelizer = view;
        this.ParcelableVolumeInfo = str;
        this.MediaBrowserCompat$MediaItem = str2;
    }

    public final void write(String str) {
        for (int i = 0; i < this.read.size(); i++) {
            if (this.read.get(i).ParcelableVolumeInfo.equals(str)) {
                this.read.remove(i);
                return;
            }
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        for (int i = 0; i < this.read.size(); i++) {
            if (this.read.get(i).ParcelableVolumeInfo != null && this.read.get(i).ParcelableVolumeInfo.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
