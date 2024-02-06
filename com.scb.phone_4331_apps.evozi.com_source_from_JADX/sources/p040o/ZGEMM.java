package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: o.ZGEMM */
public final class ZGEMM extends STRSV {
    public ZGEMM(Paint paint, FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment) {
        super(paint, fragmentBuilder_BindOthersTabFragment);
    }

    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas, inject_base64Decoder inject_base64decoder, int i, int i2) {
        if (inject_base64decoder instanceof DTRSV) {
            DTRSV dtrsv = (DTRSV) inject_base64decoder;
            int i3 = dtrsv.write;
            int i4 = dtrsv.MediaBrowserCompat$CustomActionResultReceiver;
            int i5 = dtrsv.IconCompatParcelizer / 2;
            int i6 = this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
            int i7 = this.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView;
            int i8 = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.MediaBrowserCompat$ItemReceiver;
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                this.write.left = (float) i3;
                this.write.right = (float) i4;
                this.write.top = (float) (i2 - i5);
                this.write.bottom = (float) (i5 + i2);
            } else {
                this.write.left = (float) (i - i5);
                this.write.right = (float) (i5 + i);
                this.write.top = (float) i3;
                this.write.bottom = (float) i4;
            }
            this.read.setColor(i7);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) i6;
            canvas.drawCircle(f, f2, f3, this.read);
            this.read.setColor(i8);
            canvas.drawRoundRect(this.write, f3, f3, this.read);
        }
    }
}
