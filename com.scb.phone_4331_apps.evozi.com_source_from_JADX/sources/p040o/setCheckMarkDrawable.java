package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: o.setCheckMarkDrawable */
public final class setCheckMarkDrawable {
    static int MediaBrowserCompat$CustomActionResultReceiver = 1;
    public float IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver = -1;
    public int MediaBrowserCompat$MediaItem = 0;
    private setTextSize[] MediaBrowserCompat$SearchResultReceiver = new setTextSize[8];
    float[] MediaDescriptionCompat = new float[7];
    public int MediaMetadataCompat = 0;
    private int RatingCompat = 0;
    public int read = -1;
    public setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver write;

    public setCheckMarkDrawable(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver setcheckmarkdrawable_mediabrowsercompat_itemreceiver) {
        this.write = setcheckmarkdrawable_mediabrowsercompat_itemreceiver;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setTextSize settextsize) {
        int i = 0;
        while (true) {
            int i2 = this.RatingCompat;
            if (i >= i2) {
                setTextSize[] settextsizeArr = this.MediaBrowserCompat$SearchResultReceiver;
                if (i2 >= settextsizeArr.length) {
                    this.MediaBrowserCompat$SearchResultReceiver = (setTextSize[]) Arrays.copyOf(settextsizeArr, settextsizeArr.length << 1);
                }
                setTextSize[] settextsizeArr2 = this.MediaBrowserCompat$SearchResultReceiver;
                int i3 = this.RatingCompat;
                settextsizeArr2[i3] = settextsize;
                this.RatingCompat = i3 + 1;
                return;
            } else if (this.MediaBrowserCompat$SearchResultReceiver[i] != settextsize) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void IconCompatParcelizer(setTextSize settextsize) {
        int i = this.RatingCompat;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.MediaBrowserCompat$SearchResultReceiver[i2] == settextsize) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    setTextSize[] settextsizeArr = this.MediaBrowserCompat$SearchResultReceiver;
                    int i4 = i2 + i3;
                    settextsizeArr[i4] = settextsizeArr[i4 + 1];
                }
                this.RatingCompat--;
                return;
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setTextSize settextsize) {
        int i = this.RatingCompat;
        for (int i2 = 0; i2 < i; i2++) {
            this.MediaBrowserCompat$SearchResultReceiver[i2].MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$SearchResultReceiver[i2], settextsize);
        }
        this.RatingCompat = 0;
    }

    public final void write() {
        this.write = setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNKNOWN;
        this.MediaBrowserCompat$MediaItem = 0;
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.read = -1;
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RatingCompat = 0;
        this.MediaMetadataCompat = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) null);
        return sb.toString();
    }
}
