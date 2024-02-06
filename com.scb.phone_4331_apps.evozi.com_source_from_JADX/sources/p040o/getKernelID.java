package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.ScriptGroup;
import p040o.zzgk;

/* renamed from: o.getKernelID */
final class getKernelID extends ScriptGroup.Future {
    private int ActionMenuItemView;
    int AlertController$RecycleListView;
    private float AppCompatActivity;
    private float AppCompatDelegateImpl$ListMenuDecorView;
    private Bitmap AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private int ExpandedMenuView;
    int Keep;
    Interpolator MediaBrowserCompat$MediaItem = null;
    Interpolator MediaBrowserCompat$SearchResultReceiver = null;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    long f2589x50fd9e4a = 0;
    boolean MediaDescriptionCompat;
    NinePatchDrawable MediaMetadataCompat;
    float MediaSessionCompat$QueueItem = 1.0f;
    final Rect MediaSessionCompat$ResultReceiverWrapper = new Rect();
    float MediaSessionCompat$Token = BitmapDescriptorFactory.HUE_RED;
    float ParcelableVolumeInfo = 1.0f;
    int PlaybackStateCompat;
    int PlaybackStateCompat$CustomAction;
    zzgk.IconCompatParcelizer RatingCompat;
    Interpolator read = null;
    int setBackgroundResource;
    private float setCheckable;
    private float setChecked;
    private float setContentView;
    private float setExpandedFormat;
    int setHasDecor;
    private long setIcon;
    private ScriptIntrinsic setItemInvoker;
    private boolean setPadding;
    private Paint setPopupCallback;
    private int setShortcut;

    public getKernelID(RecyclerView recyclerView, RecyclerView.setContentView setcontentview, ScriptIntrinsic scriptIntrinsic) {
        super(recyclerView, setcontentview);
        this.setItemInvoker = scriptIntrinsic;
        this.setPopupCallback = new Paint();
    }

    public final void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        if (this.AppCompatDialogFragment != null) {
            int min = (int) Math.min(System.currentTimeMillis() - this.setIcon, this.f2589x50fd9e4a);
            long j = this.f2589x50fd9e4a;
            float f = j > 0 ? ((float) min) / ((float) j) : 1.0f;
            float f2 = this.ParcelableVolumeInfo;
            float f3 = this.setContentView;
            float f4 = ((f2 - f3) * f) + f3;
            float f5 = this.AppCompatActivity;
            float f6 = ((f2 - f5) * f) + f5;
            float f7 = ((this.MediaSessionCompat$QueueItem - 1.0f) * f) + 1.0f;
            float f8 = this.MediaSessionCompat$Token * f;
            if (f4 > BitmapDescriptorFactory.HUE_RED && f6 > BitmapDescriptorFactory.HUE_RED && f7 > BitmapDescriptorFactory.HUE_RED) {
                this.setPopupCallback.setAlpha((int) (255.0f * f7));
                int save = canvas.save();
                canvas.translate((float) (this.Keep + this.RatingCompat.write), (float) (this.setBackgroundResource + this.RatingCompat.IconCompatParcelizer));
                canvas.scale(f4, f6);
                canvas.rotate(f8);
                canvas.translate((float) (-(this.MediaSessionCompat$ResultReceiverWrapper.left + this.RatingCompat.write)), (float) (-(this.MediaSessionCompat$ResultReceiverWrapper.top + this.RatingCompat.IconCompatParcelizer)));
                canvas.drawBitmap(this.AppCompatDialogFragment, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.setPopupCallback);
                canvas.restoreToCount(save);
            }
            if (f < 1.0f) {
                SwitchCompat.setItemInvoker(this.MediaBrowserCompat$ItemReceiver);
            }
            this.setChecked = f4;
            this.setExpandedFormat = f6;
            this.setCheckable = f8;
            this.AppCompatDelegateImpl$ListMenuDecorView = f7;
        }
    }

    public final void read(zzgk.IconCompatParcelizer iconCompatParcelizer, int i, int i2) {
        if (!this.setPadding) {
            View view = this.write.write;
            this.RatingCompat = iconCompatParcelizer;
            this.AppCompatDialogFragment = read(view, (NinePatchDrawable) null);
            this.AlertController$RecycleListView = this.MediaBrowserCompat$ItemReceiver.getPaddingLeft();
            this.setHasDecor = this.MediaBrowserCompat$ItemReceiver.getPaddingTop();
            this.ActionMenuItemView = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(this.MediaBrowserCompat$ItemReceiver.AppCompatActivity);
            this.AppCompatViewInflater = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.AppCompatActivity);
            this.setContentView = view.getScaleX();
            this.AppCompatActivity = view.getScaleY();
            this.setChecked = 1.0f;
            this.setExpandedFormat = 1.0f;
            this.setCheckable = BitmapDescriptorFactory.HUE_RED;
            this.AppCompatDelegateImpl$ListMenuDecorView = 1.0f;
            view.setVisibility(4);
            this.setShortcut = i;
            this.ExpandedMenuView = i2;
            write(true);
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((RecyclerView.RatingCompat) this, -1);
            this.setIcon = System.currentTimeMillis();
            this.setPadding = true;
        }
    }

    public final void write(zzgk.IconCompatParcelizer iconCompatParcelizer, RecyclerView.setContentView setcontentview) {
        if (this.setPadding) {
            if (this.write != setcontentview) {
                read();
                this.write = setcontentview;
            }
            this.AppCompatDialogFragment = read(setcontentview.write, (NinePatchDrawable) null);
            this.RatingCompat = iconCompatParcelizer;
            write(true);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.setPadding) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((RecyclerView.RatingCompat) this);
        }
        RecyclerView.MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.write();
        }
        RecyclerView recyclerView = this.MediaBrowserCompat$ItemReceiver;
        if (recyclerView.ListMenuItemView != 0) {
            recyclerView.ListMenuItemView = 0;
            recyclerView.IconCompatParcelizer();
            recyclerView.MediaBrowserCompat$ItemReceiver(0);
        }
        recyclerView.IconCompatParcelizer();
        IconCompatParcelizer((float) this.Keep, this.setBackgroundResource);
        if (this.write != null) {
            read(this.write.write, this.setChecked, this.setExpandedFormat, this.setCheckable, this.AppCompatDelegateImpl$ListMenuDecorView, true);
        }
        if (this.write != null) {
            this.write.write.setVisibility(0);
        }
        this.write = null;
        Bitmap bitmap = this.AppCompatDialogFragment;
        if (bitmap != null) {
            bitmap.recycle();
            this.AppCompatDialogFragment = null;
        }
        this.setItemInvoker = null;
        this.Keep = 0;
        this.setBackgroundResource = 0;
        this.AlertController$RecycleListView = 0;
        this.PlaybackStateCompat = 0;
        this.setHasDecor = 0;
        this.PlaybackStateCompat$CustomAction = 0;
        this.setShortcut = 0;
        this.ExpandedMenuView = 0;
        this.setPadding = false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i, int i2, boolean z) {
        this.setShortcut = i;
        this.ExpandedMenuView = i2;
        return write(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d8 A[EDGE_INSN: B:85:0x00d8->B:35:0x00d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010e A[EDGE_INSN: B:91:0x010e->B:57:0x010e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write(boolean r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.Keep
            int r2 = r0.setBackgroundResource
            androidx.recyclerview.widget.RecyclerView r3 = r0.MediaBrowserCompat$ItemReceiver
            int r4 = r3.getChildCount()
            r5 = 0
            r6 = 1
            if (r4 <= 0) goto L_0x0160
            r0.AlertController$RecycleListView = r5
            int r4 = r3.getWidth()
            o.zzgk$IconCompatParcelizer r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$MediaItem
            int r4 = r4 - r7
            r0.PlaybackStateCompat = r4
            r0.setHasDecor = r5
            int r4 = r3.getHeight()
            o.zzgk$IconCompatParcelizer r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver
            int r4 = r4 - r7
            r0.PlaybackStateCompat$CustomAction = r4
            int r4 = r0.ActionMenuItemView
            if (r4 == 0) goto L_0x0050
            if (r4 != r6) goto L_0x006f
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.MediaBrowserCompat$ItemReceiver
            int r4 = -r4
            r0.setHasDecor = r4
            int r4 = r3.getHeight()
            r0.PlaybackStateCompat$CustomAction = r4
            int r4 = r0.AlertController$RecycleListView
            int r7 = r3.getPaddingLeft()
            int r4 = r4 + r7
            r0.AlertController$RecycleListView = r4
            int r4 = r0.PlaybackStateCompat
            int r7 = r3.getPaddingRight()
            int r4 = r4 - r7
            r0.PlaybackStateCompat = r4
            goto L_0x006f
        L_0x0050:
            int r4 = r0.setHasDecor
            int r7 = r3.getPaddingTop()
            int r4 = r4 + r7
            r0.setHasDecor = r4
            int r4 = r0.PlaybackStateCompat$CustomAction
            int r7 = r3.getPaddingBottom()
            int r4 = r4 - r7
            r0.PlaybackStateCompat$CustomAction = r4
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.MediaBrowserCompat$MediaItem
            int r4 = -r4
            r0.AlertController$RecycleListView = r4
            int r4 = r3.getWidth()
            r0.PlaybackStateCompat = r4
        L_0x006f:
            int r4 = r0.AlertController$RecycleListView
            int r7 = r0.PlaybackStateCompat
            int r4 = java.lang.Math.max(r4, r7)
            r0.PlaybackStateCompat = r4
            int r4 = r0.setHasDecor
            int r7 = r0.PlaybackStateCompat$CustomAction
            int r4 = java.lang.Math.max(r4, r7)
            r0.PlaybackStateCompat$CustomAction = r4
            boolean r4 = r0.MediaDescriptionCompat
            if (r4 != 0) goto L_0x0170
            int r4 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.read(r3, r6)
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r7 = r3.AppCompatActivity
            boolean r8 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r9 = -1
            if (r8 == 0) goto L_0x00a4
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            int r8 = r7.MediaSessionCompat$ResultReceiverWrapper()
            int r8 = r8 - r6
            android.view.View r7 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((androidx.recyclerview.widget.LinearLayoutManager) r7, (int) r8, (int) r9)
            if (r7 == 0) goto L_0x00a4
            int r7 = androidx.recyclerview.widget.LinearLayoutManager.MediaMetadataCompat((android.view.View) r7)
            goto L_0x00a5
        L_0x00a4:
            r7 = r9
        L_0x00a5:
            o.ScriptIntrinsic r8 = r0.setItemInvoker
            r10 = 0
            if (r4 == r9) goto L_0x00d8
            if (r7 != r9) goto L_0x00ad
            goto L_0x00d8
        L_0x00ad:
            int r11 = r3.getChildCount()
            r12 = r5
        L_0x00b2:
            if (r12 >= r11) goto L_0x00d8
            android.view.View r13 = r3.getChildAt(r12)
            androidx.recyclerview.widget.RecyclerView$setContentView r14 = r3.MediaBrowserCompat$MediaItem((android.view.View) r13)
            if (r14 == 0) goto L_0x00d5
            int r15 = r14.ParcelableVolumeInfo
            if (r15 != r9) goto L_0x00c4
            int r15 = r14.MediaSessionCompat$QueueItem
        L_0x00c4:
            if (r15 < r4) goto L_0x00d5
            if (r15 > r7) goto L_0x00d5
            int r14 = r8.MediaBrowserCompat$ItemReceiver
            if (r15 < r14) goto L_0x00d2
            int r14 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r15 > r14) goto L_0x00d2
            r14 = r6
            goto L_0x00d3
        L_0x00d2:
            r14 = r5
        L_0x00d3:
            if (r14 != 0) goto L_0x00d9
        L_0x00d5:
            int r12 = r12 + 1
            goto L_0x00b2
        L_0x00d8:
            r13 = r10
        L_0x00d9:
            o.ScriptIntrinsic r8 = r0.setItemInvoker
            if (r4 == r9) goto L_0x010e
            if (r7 != r9) goto L_0x00e0
            goto L_0x010e
        L_0x00e0:
            int r11 = r3.getChildCount()
            int r11 = r11 - r6
        L_0x00e5:
            if (r11 < 0) goto L_0x010e
            android.view.View r12 = r3.getChildAt(r11)
            androidx.recyclerview.widget.RecyclerView$setContentView r14 = r3.MediaBrowserCompat$MediaItem((android.view.View) r12)
            if (r14 == 0) goto L_0x010b
            int r15 = r14.ParcelableVolumeInfo
            if (r15 != r9) goto L_0x00f7
            int r15 = r14.MediaSessionCompat$QueueItem
        L_0x00f7:
            if (r15 < r4) goto L_0x010b
            if (r15 > r7) goto L_0x010b
            int r14 = r8.MediaBrowserCompat$ItemReceiver
            if (r15 < r14) goto L_0x0105
            int r14 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r15 > r14) goto L_0x0105
            r14 = r6
            goto L_0x0106
        L_0x0105:
            r14 = r5
        L_0x0106:
            if (r14 != 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r10 = r12
            goto L_0x010e
        L_0x010b:
            int r11 = r11 + -1
            goto L_0x00e5
        L_0x010e:
            int r3 = r0.ActionMenuItemView
            if (r3 == 0) goto L_0x013a
            if (r3 != r6) goto L_0x0170
            if (r13 == 0) goto L_0x0122
            int r3 = r0.PlaybackStateCompat$CustomAction
            int r4 = r13.getTop()
            int r3 = java.lang.Math.min(r3, r4)
            r0.setHasDecor = r3
        L_0x0122:
            if (r10 == 0) goto L_0x0170
            int r3 = r10.getBottom()
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.MediaBrowserCompat$ItemReceiver
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r5, r3)
            int r4 = r0.PlaybackStateCompat$CustomAction
            int r3 = java.lang.Math.min(r4, r3)
            r0.PlaybackStateCompat$CustomAction = r3
            goto L_0x0170
        L_0x013a:
            if (r13 == 0) goto L_0x0148
            int r3 = r0.AlertController$RecycleListView
            int r4 = r13.getLeft()
            int r3 = java.lang.Math.min(r3, r4)
            r0.AlertController$RecycleListView = r3
        L_0x0148:
            if (r10 == 0) goto L_0x0170
            int r3 = r10.getRight()
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.MediaBrowserCompat$MediaItem
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r5, r3)
            int r4 = r0.PlaybackStateCompat
            int r3 = java.lang.Math.min(r4, r3)
            r0.PlaybackStateCompat = r3
            goto L_0x0170
        L_0x0160:
            int r4 = r3.getPaddingLeft()
            r0.AlertController$RecycleListView = r4
            r0.PlaybackStateCompat = r4
            int r3 = r3.getPaddingTop()
            r0.setHasDecor = r3
            r0.PlaybackStateCompat$CustomAction = r3
        L_0x0170:
            int r3 = r0.setShortcut
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.write
            int r3 = r3 - r4
            r0.Keep = r3
            int r3 = r0.ExpandedMenuView
            o.zzgk$IconCompatParcelizer r4 = r0.RatingCompat
            int r4 = r4.IconCompatParcelizer
            int r3 = r3 - r4
            r0.setBackgroundResource = r3
            int r3 = r0.AppCompatViewInflater
            if (r3 == r6) goto L_0x018b
            if (r3 != 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r3 = r5
            goto L_0x018c
        L_0x018b:
            r3 = r6
        L_0x018c:
            if (r3 == 0) goto L_0x01ae
            int r3 = r0.Keep
            int r4 = r0.AlertController$RecycleListView
            int r7 = r0.PlaybackStateCompat
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = java.lang.Math.min(r3, r7)
            r0.Keep = r3
            int r3 = r0.setBackgroundResource
            int r4 = r0.setHasDecor
            int r7 = r0.PlaybackStateCompat$CustomAction
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = java.lang.Math.min(r3, r7)
            r0.setBackgroundResource = r3
        L_0x01ae:
            int r3 = r0.Keep
            if (r1 != r3) goto L_0x01b7
            int r1 = r0.setBackgroundResource
            if (r2 != r1) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r5 = r6
        L_0x01b8:
            if (r5 != 0) goto L_0x01bc
            if (r17 == 0) goto L_0x01c9
        L_0x01bc:
            int r1 = r0.Keep
            float r1 = (float) r1
            int r2 = r0.setBackgroundResource
            r0.IconCompatParcelizer((float) r1, (int) r2)
            androidx.recyclerview.widget.RecyclerView r1 = r0.MediaBrowserCompat$ItemReceiver
            p040o.SwitchCompat.setItemInvoker(r1)
        L_0x01c9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getKernelID.write(boolean):boolean");
    }

    private Bitmap read(View view, NinePatchDrawable ninePatchDrawable) {
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth();
        int height = view.getHeight();
        int i = this.MediaSessionCompat$ResultReceiverWrapper.left + width + this.MediaSessionCompat$ResultReceiverWrapper.right;
        int i2 = this.MediaSessionCompat$ResultReceiverWrapper.top + height + this.MediaSessionCompat$ResultReceiverWrapper.bottom;
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        view.layout(left, top, width + left, height + top);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds(0, 0, i, i2);
            ninePatchDrawable.draw(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(this.MediaSessionCompat$ResultReceiverWrapper.left, this.MediaSessionCompat$ResultReceiverWrapper.top, i - this.MediaSessionCompat$ResultReceiverWrapper.right, i2 - this.MediaSessionCompat$ResultReceiverWrapper.bottom);
        canvas.translate((float) this.MediaSessionCompat$ResultReceiverWrapper.left, (float) this.MediaSessionCompat$ResultReceiverWrapper.top);
        view.draw(canvas);
        canvas.restoreToCount(save);
        return createBitmap;
    }

    private void IconCompatParcelizer(float f, int i) {
        if (this.write != null) {
            RecyclerView recyclerView = this.MediaBrowserCompat$ItemReceiver;
            RecyclerView.setContentView setcontentview = this.write;
            float top = (float) (i - this.write.write.getTop());
            float left = f - ((float) this.write.write.getLeft());
            RecyclerView.MediaMetadataCompat mediaMetadataCompat = recyclerView.AlertController$RecycleListView;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat.read(setcontentview);
            }
            setcontentview.write.setTranslationX(left);
            setcontentview.write.setTranslationY(top);
        }
    }

    public final void read() {
        if (this.write != null) {
            this.write.write.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.write.write.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.write.write.setVisibility(0);
        }
        this.write = null;
    }

    public final void write(RecyclerView.setContentView setcontentview) {
        if (this.write == null) {
            this.write = setcontentview;
            setcontentview.write.setVisibility(4);
            return;
        }
        throw new IllegalStateException("A new view holder is attempt to be assigned before invalidating the older one");
    }
}
