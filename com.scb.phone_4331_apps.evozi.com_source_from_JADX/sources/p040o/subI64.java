package p040o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.isComplex;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subI64 */
public abstract class subI64 extends MyQRCoachMarkActivity {
    protected Paint IconCompatParcelizer;
    protected rsnAllocationRead1D.write MediaBrowserCompat$CustomActionResultReceiver;
    protected Paint MediaBrowserCompat$ItemReceiver;
    protected Paint write;

    public abstract void IconCompatParcelizer(Canvas canvas);

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas, isComplex.C13709[] r2);

    public abstract void MediaBrowserCompat$ItemReceiver(Canvas canvas);

    public abstract void read(Canvas canvas);

    public subI64(rsnAllocationRead1D.write write2, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(iconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        Paint paint = new Paint(1);
        this.write = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.IconCompatParcelizer = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.IconCompatParcelizer.setTextAlign(Paint.Align.CENTER);
        this.IconCompatParcelizer.setTextSize(subShort3.read(9.0f));
        Paint paint3 = new Paint(1);
        this.MediaBrowserCompat$ItemReceiver = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.MediaBrowserCompat$ItemReceiver.setStrokeWidth(2.0f);
        this.MediaBrowserCompat$ItemReceiver.setColor(Color.rgb(255, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 115));
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(subByte2 subbyte2) {
        this.IconCompatParcelizer.setTypeface(subbyte2.MediaBrowserCompat$SearchResultReceiver());
        this.IconCompatParcelizer.setTextSize(subbyte2.MediaMetadataCompat());
    }
}
