package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.addI32;
import p040o.addToPack;
import p040o.addToPack$MediaBrowserCompat$ItemReceiver;
import p040o.skip;
import p040o.subFloat3;
import p040o.subInt3;
import p040o.subMatrix3f;
import p040o.subMatrix4f;
import p040o.subShort3;

public class RadarChart extends PieRadarChartBase<addI32> {
    public float AlertController$RecycleListView = 1.5f;
    public float AppCompatActivity = 2.5f;
    public addToPack AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment = true;
    private subMatrix3f AppCompatViewInflater;
    public int PlaybackStateCompat$CustomAction = 0;
    public int setBackgroundResource = Color.rgb(122, 122, 122);
    private subMatrix4f setChecked;
    public int setContentView = Color.rgb(122, 122, 122);
    public int setHasDecor = CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA;

    public RadarChart(Context context) {
        super(context);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void ParcelableVolumeInfo() {
        super.ParcelableVolumeInfo();
        this.AppCompatDelegateImpl$ListMenuDecorView = new addToPack(addToPack$MediaBrowserCompat$ItemReceiver.LEFT);
        this.AppCompatActivity = subShort3.read(1.5f);
        this.AlertController$RecycleListView = subShort3.read(0.75f);
        this.MediaSessionCompat$Token = new subInt3(this, this.IconCompatParcelizer, this.Keep);
        this.AppCompatViewInflater = new subMatrix3f(this.Keep, this.AppCompatDelegateImpl$ListMenuDecorView, this);
        this.setChecked = new subMatrix4f(this.Keep, this.PlaybackStateCompat, this);
        this.MediaBrowserCompat$SearchResultReceiver = new skip(this);
    }

    /* access modifiers changed from: protected */
    public final void read() {
        float f;
        float f2;
        super.read();
        addToPack addtopack = this.AppCompatDelegateImpl$ListMenuDecorView;
        addI32 addi32 = (addI32) this.read;
        if (addToPack$MediaBrowserCompat$ItemReceiver.LEFT == addToPack$MediaBrowserCompat$ItemReceiver.LEFT) {
            f = addi32.write;
            if (f == Float.MAX_VALUE) {
                f = addi32.MediaBrowserCompat$CustomActionResultReceiver;
            }
        } else {
            f = addi32.MediaBrowserCompat$CustomActionResultReceiver;
            if (f == Float.MAX_VALUE) {
                f = addi32.write;
            }
        }
        addI32 addi322 = (addI32) this.read;
        if (addToPack$MediaBrowserCompat$ItemReceiver.LEFT == addToPack$MediaBrowserCompat$ItemReceiver.LEFT) {
            f2 = addi322.read;
            if (f2 == -3.4028235E38f) {
                f2 = addi322.MediaBrowserCompat$ItemReceiver;
            }
        } else {
            f2 = addi322.MediaBrowserCompat$ItemReceiver;
            if (f2 == -3.4028235E38f) {
                f2 = addi322.read;
            }
        }
        addtopack.MediaBrowserCompat$ItemReceiver(f, f2);
        this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver(BitmapDescriptorFactory.HUE_RED, (float) ((subFloat3) ((addI32) this.read).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction());
    }

    public final void AlertController$RecycleListView() {
        if (this.read != null) {
            read();
            this.AppCompatViewInflater.write(this.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer, this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver, false);
            this.setChecked.write(this.PlaybackStateCompat.IconCompatParcelizer, this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver, false);
            if (this.ParcelableVolumeInfo != null) {
                this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.read);
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.read != null) {
            if (this.PlaybackStateCompat.MediaSessionCompat$ResultReceiverWrapper) {
                this.setChecked.write(this.PlaybackStateCompat.IconCompatParcelizer, this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver, false);
            }
            this.setChecked.MediaBrowserCompat$CustomActionResultReceiver(canvas);
            if (this.AppCompatDialogFragment) {
                this.MediaSessionCompat$Token.read(canvas);
            }
            boolean z = this.AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaSessionCompat$Token.IconCompatParcelizer(canvas);
            if (PlaybackStateCompat$CustomAction()) {
                this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(canvas, this.RatingCompat);
            }
            if (this.AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper) {
                this.AppCompatViewInflater.write(canvas);
            }
            this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver(canvas);
            this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(canvas);
            this.MediaSessionCompat$ResultReceiverWrapper.read(canvas);
            MediaBrowserCompat$ItemReceiver(canvas);
            write();
        }
    }

    public final float setBackgroundResource() {
        RectF rectF = this.Keep.MediaBrowserCompat$ItemReceiver;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) / this.AppCompatDelegateImpl$ListMenuDecorView.write;
    }

    public final float AppCompatDelegateImpl$ListMenuDecorView() {
        return 360.0f / ((float) ((subFloat3) ((addI32) this.read).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction());
    }

    public void setWebLineWidth(float f) {
        this.AppCompatActivity = subShort3.read(f);
    }

    public void setWebLineWidthInner(float f) {
        this.AlertController$RecycleListView = subShort3.read(f);
    }

    public void setWebAlpha(int i) {
        this.setHasDecor = i;
    }

    public void setWebColor(int i) {
        this.setContentView = i;
    }

    public void setWebColorInner(int i) {
        this.setBackgroundResource = i;
    }

    public void setDrawWeb(boolean z) {
        this.AppCompatDialogFragment = z;
    }

    public void setSkipWebLineCount(int i) {
        this.PlaybackStateCompat$CustomAction = Math.max(0, i);
    }

    /* access modifiers changed from: protected */
    public final float setHasDecor() {
        return this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.getTextSize() * 4.0f;
    }

    /* access modifiers changed from: protected */
    public final float PlaybackStateCompat() {
        if (!this.PlaybackStateCompat.MediaSessionCompat$ResultReceiverWrapper || !this.PlaybackStateCompat.MediaBrowserCompat$SearchResultReceiver) {
            return subShort3.read(10.0f);
        }
        return (float) this.PlaybackStateCompat.PlaybackStateCompat$CustomAction;
    }

    public final float Keep() {
        RectF rectF = this.Keep.MediaBrowserCompat$ItemReceiver;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public final int IconCompatParcelizer(float f) {
        float IconCompatParcelizer = subShort3.IconCompatParcelizer(f - this.setPopupCallback);
        float PlaybackStateCompat$CustomAction2 = 360.0f / ((float) ((subFloat3) ((addI32) this.read).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction());
        int PlaybackStateCompat$CustomAction3 = ((subFloat3) ((addI32) this.read).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction();
        int i = 0;
        while (i < PlaybackStateCompat$CustomAction3) {
            int i2 = i + 1;
            if ((((float) i2) * PlaybackStateCompat$CustomAction2) - (PlaybackStateCompat$CustomAction2 / 2.0f) > IconCompatParcelizer) {
                return i;
            }
            i = i2;
        }
        return 0;
    }
}
