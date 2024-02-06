package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: o.STRSV */
public class STRSV extends addOnSuccessListener$MediaBrowserCompat$ItemReceiver {
    public RectF write = new RectF();

    public STRSV(Paint paint, FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment) {
        super(paint, fragmentBuilder_BindOthersTabFragment);
    }

    public void MediaBrowserCompat$ItemReceiver(Canvas canvas, inject_base64Decoder inject_base64decoder, int i, int i2) {
        if (inject_base64decoder instanceof DTRSM) {
            DTRSM dtrsm = (DTRSM) inject_base64decoder;
            int i3 = dtrsm.write;
            int i4 = dtrsm.MediaBrowserCompat$CustomActionResultReceiver;
            int i5 = this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
            int i6 = this.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView;
            int i7 = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.MediaBrowserCompat$ItemReceiver;
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                this.write.left = (float) i3;
                this.write.right = (float) i4;
                this.write.top = (float) (i2 - i5);
                this.write.bottom = (float) (i2 + i5);
            } else {
                this.write.left = (float) (i - i5);
                this.write.right = (float) (i + i5);
                this.write.top = (float) i3;
                this.write.bottom = (float) i4;
            }
            this.read.setColor(i6);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) i5;
            canvas.drawCircle(f, f2, f3, this.read);
            this.read.setColor(i7);
            canvas.drawRoundRect(this.write, f3, f3, this.read);
        }
    }
}
