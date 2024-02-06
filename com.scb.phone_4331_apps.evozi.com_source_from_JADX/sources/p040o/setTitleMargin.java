package p040o;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: o.setTitleMargin */
public final class setTitleMargin {

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final Interpolator f2645x50fd9e4a = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private float AlertController$RecycleListView;
    private final Runnable AppCompatActivity = new Runnable() {
        public final void run() {
            setTitleMargin.this.write(0);
        }
    };
    private VelocityTracker AppCompatDialogFragment;
    public float[] IconCompatParcelizer;
    private boolean Keep;
    public float[] MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public float[] MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat;
    public float MediaMetadataCompat;
    private int[] MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token = -1;
    private final read ParcelableVolumeInfo;
    private int[] PlaybackStateCompat;
    private int[] PlaybackStateCompat$CustomAction;
    public float[] RatingCompat;
    public int read;
    private OverScroller setContentView;
    private final ViewGroup setHasDecor;
    public View write;

    /* renamed from: o.setTitleMargin$read */
    public static abstract class read {
        public int IconCompatParcelizer() {
            return 0;
        }

        public abstract boolean IconCompatParcelizer(View view, int i);

        public int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return 0;
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        }

        public void MediaBrowserCompat$ItemReceiver(int i) {
        }

        public void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        }

        public int read(View view, int i) {
            return 0;
        }

        public int write(View view) {
            return 0;
        }

        public void write() {
        }

        public void write(View view, float f, float f2) {
        }

        public void write(View view, int i) {
        }
    }

    public static setTitleMargin write(ViewGroup viewGroup, read read2) {
        return new setTitleMargin(viewGroup.getContext(), viewGroup, read2);
    }

    private setTitleMargin(Context context, ViewGroup viewGroup, read read2) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (read2 != null) {
            this.setHasDecor = viewGroup;
            this.ParcelableVolumeInfo = read2;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.MediaBrowserCompat$ItemReceiver = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.MediaBrowserCompat$MediaItem = viewConfiguration.getScaledTouchSlop();
            this.AlertController$RecycleListView = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.MediaMetadataCompat = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.setContentView = new OverScroller(context, f2645x50fd9e4a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void write(View view, int i) {
        if (view.getParent() == this.setHasDecor) {
            this.write = view;
            this.MediaSessionCompat$Token = i;
            this.ParcelableVolumeInfo.write(view, i);
            write(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.setHasDecor);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void write() {
        this.MediaSessionCompat$Token = -1;
        float[] fArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr != null) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.RatingCompat, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.MediaBrowserCompat$SearchResultReceiver, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.PlaybackStateCompat$CustomAction, 0);
            Arrays.fill(this.MediaSessionCompat$QueueItem, 0);
            Arrays.fill(this.PlaybackStateCompat, 0);
            this.MediaDescriptionCompat = 0;
        }
        VelocityTracker velocityTracker = this.AppCompatDialogFragment;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.AppCompatDialogFragment = null;
        }
    }

    public final boolean IconCompatParcelizer(View view, int i, int i2) {
        this.write = view;
        this.MediaSessionCompat$Token = -1;
        boolean MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(i, i2, 0, 0);
        if (!MediaBrowserCompat$CustomActionResultReceiver2 && this.read == 0 && this.write != null) {
            this.write = null;
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final boolean IconCompatParcelizer(int i, int i2) {
        if (this.Keep) {
            return MediaBrowserCompat$CustomActionResultReceiver(i, i2, (int) this.AppCompatDialogFragment.getXVelocity(this.MediaSessionCompat$Token), (int) this.AppCompatDialogFragment.getYVelocity(this.MediaSessionCompat$Token));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaBrowserCompat$CustomActionResultReceiver(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.write
            int r2 = r0.getLeft()
            android.view.View r0 = r9.write
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            r10 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            android.widget.OverScroller r11 = r9.setContentView
            r11.abortAnimation()
            r9.write((int) r10)
            return r10
        L_0x001e:
            android.view.View r11 = r9.write
            float r0 = r9.MediaMetadataCompat
            int r0 = (int) r0
            float r1 = r9.AlertController$RecycleListView
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r0) goto L_0x002e
            r12 = r10
            goto L_0x0035
        L_0x002e:
            if (r6 <= r1) goto L_0x0035
            if (r12 > 0) goto L_0x0034
            int r12 = -r1
            goto L_0x0035
        L_0x0034:
            r12 = r1
        L_0x0035:
            float r0 = r9.MediaMetadataCompat
            int r0 = (int) r0
            float r1 = r9.AlertController$RecycleListView
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r0) goto L_0x0043
        L_0x0041:
            r13 = r10
            goto L_0x004a
        L_0x0043:
            if (r6 <= r1) goto L_0x004a
            if (r13 > 0) goto L_0x0049
            int r10 = -r1
            goto L_0x0041
        L_0x0049:
            r13 = r1
        L_0x004a:
            int r10 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r1 + r6
            int r8 = r10 + r0
            if (r12 == 0) goto L_0x0063
            float r10 = (float) r1
            float r1 = (float) r7
            goto L_0x0065
        L_0x0063:
            float r10 = (float) r10
            float r1 = (float) r8
        L_0x0065:
            float r10 = r10 / r1
            if (r13 == 0) goto L_0x006b
            float r0 = (float) r6
            float r1 = (float) r7
            goto L_0x006d
        L_0x006b:
            float r0 = (float) r0
            float r1 = (float) r8
        L_0x006d:
            float r0 = r0 / r1
            o.setTitleMargin$read r1 = r9.ParcelableVolumeInfo
            int r11 = r1.write(r11)
            int r11 = r9.IconCompatParcelizer((int) r4, (int) r12, (int) r11)
            o.setTitleMargin$read r12 = r9.ParcelableVolumeInfo
            int r12 = r12.IconCompatParcelizer()
            int r12 = r9.IconCompatParcelizer((int) r5, (int) r13, (int) r12)
            float r11 = (float) r11
            float r11 = r11 * r10
            float r10 = (float) r12
            float r10 = r10 * r0
            float r11 = r11 + r10
            int r6 = (int) r11
            android.widget.OverScroller r1 = r9.setContentView
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.write((int) r10)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTitleMargin.MediaBrowserCompat$CustomActionResultReceiver(int, int, int, int):boolean");
    }

    private int IconCompatParcelizer(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.setHasDecor.getWidth();
        float f = (float) (width / 2);
        float sin = (float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f));
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs((f + (sin * f)) / ((float) abs)) * 1000.0f) << 2;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == 2) {
            boolean computeScrollOffset = this.setContentView.computeScrollOffset();
            int currX = this.setContentView.getCurrX();
            int currY = this.setContentView.getCurrY();
            int left = currX - this.write.getLeft();
            int top = currY - this.write.getTop();
            if (left != 0) {
                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(this.write, left);
            }
            if (top != 0) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver(this.write, top);
            }
            if (!(left == 0 && top == 0)) {
                this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(this.write, currX, currY);
            }
            if (computeScrollOffset && currX == this.setContentView.getFinalX() && currY == this.setContentView.getFinalY()) {
                this.setContentView.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.setHasDecor.post(this.AppCompatActivity);
            }
        }
        if (this.read == 2) {
            return true;
        }
        return false;
    }

    private void write(float f, float f2) {
        this.Keep = true;
        this.ParcelableVolumeInfo.write(this.write, f, f2);
        this.Keep = false;
        if (this.read == 1) {
            write(0);
        }
    }

    private void read(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            boolean z = true;
            int i2 = 1 << i;
            if ((this.MediaDescriptionCompat & i2) == 0) {
                z = false;
            }
            if (z) {
                this.MediaBrowserCompat$CustomActionResultReceiver[i] = 0.0f;
                this.IconCompatParcelizer[i] = 0.0f;
                this.RatingCompat[i] = 0.0f;
                this.MediaBrowserCompat$SearchResultReceiver[i] = 0.0f;
                this.PlaybackStateCompat$CustomAction[i] = 0;
                this.MediaSessionCompat$QueueItem[i] = 0;
                this.PlaybackStateCompat[i] = 0;
                this.MediaDescriptionCompat = (~i2) & this.MediaDescriptionCompat;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (MediaBrowserCompat$CustomActionResultReceiver(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.RatingCompat[pointerId] = x;
                this.MediaBrowserCompat$SearchResultReceiver[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(int i) {
        this.setHasDecor.removeCallbacks(this.AppCompatActivity);
        if (this.read != i) {
            this.read = i;
            this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(i);
            if (this.read == 0) {
                this.write = null;
            }
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        if (view == this.write && this.MediaSessionCompat$Token == i) {
            return true;
        }
        if (view == null || !this.ParcelableVolumeInfo.IconCompatParcelizer(view, i)) {
            return false;
        }
        this.MediaSessionCompat$Token = i;
        write(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r12 != r11) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.write()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.AppCompatDialogFragment
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.AppCompatDialogFragment = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.AppCompatDialogFragment
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00fb
            if (r2 == r6) goto L_0x00f6
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00f6
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x00f9
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.read(r1)
            goto L_0x00f9
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.read((float) r7, (float) r1, (int) r2)
            int r3 = r0.read
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.PlaybackStateCompat$CustomAction
            r1 = r1[r2]
            int r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00f9
            o.setTitleMargin$read r1 = r0.ParcelableVolumeInfo
            r1.write()
            goto L_0x00f9
        L_0x005f:
            if (r3 != r4) goto L_0x00f9
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.MediaBrowserCompat$ItemReceiver(r3, r1)
            android.view.View r3 = r0.write
            if (r1 != r3) goto L_0x00f9
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            goto L_0x00f9
        L_0x0070:
            float[] r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x00f9
            float[] r2 = r0.IconCompatParcelizer
            if (r2 == 0) goto L_0x00f9
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007d:
            if (r3 >= r2) goto L_0x00f2
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.MediaBrowserCompat$CustomActionResultReceiver((int) r4)
            if (r7 == 0) goto L_0x00ef
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.IconCompatParcelizer
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.MediaBrowserCompat$ItemReceiver(r7, r8)
            if (r7 == 0) goto L_0x00ad
            boolean r8 = r0.read((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00ad
            r8 = r6
            goto L_0x00ae
        L_0x00ad:
            r8 = 0
        L_0x00ae:
            if (r8 == 0) goto L_0x00e0
            int r11 = r7.getLeft()
            int r12 = (int) r9
            o.setTitleMargin$read r13 = r0.ParcelableVolumeInfo
            int r12 = r12 + r11
            int r12 = r13.MediaBrowserCompat$CustomActionResultReceiver(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            o.setTitleMargin$read r15 = r0.ParcelableVolumeInfo
            int r14 = r14 + r13
            int r14 = r15.read(r7, r14)
            o.setTitleMargin$read r15 = r0.ParcelableVolumeInfo
            int r15 = r15.write(r7)
            o.setTitleMargin$read r5 = r0.ParcelableVolumeInfo
            int r5 = r5.IconCompatParcelizer()
            if (r15 == 0) goto L_0x00da
            if (r15 <= 0) goto L_0x00e0
            if (r12 != r11) goto L_0x00e0
        L_0x00da:
            if (r5 == 0) goto L_0x00f2
            if (r5 <= 0) goto L_0x00e0
            if (r14 == r13) goto L_0x00f2
        L_0x00e0:
            r0.MediaBrowserCompat$ItemReceiver((float) r9, (float) r10, (int) r4)
            int r5 = r0.read
            if (r5 == r6) goto L_0x00f2
            if (r8 == 0) goto L_0x00ef
            boolean r4 = r0.MediaBrowserCompat$CustomActionResultReceiver(r7, r4)
            if (r4 != 0) goto L_0x00f2
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x00f2:
            r16.MediaBrowserCompat$ItemReceiver(r17)
            goto L_0x00f9
        L_0x00f6:
            r16.write()
        L_0x00f9:
            r5 = 0
            goto L_0x012a
        L_0x00fb:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.read((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.MediaBrowserCompat$ItemReceiver(r2, r3)
            android.view.View r3 = r0.write
            if (r2 != r3) goto L_0x011c
            int r3 = r0.read
            if (r3 != r4) goto L_0x011c
            r0.MediaBrowserCompat$CustomActionResultReceiver(r2, r1)
        L_0x011c:
            int[] r2 = r0.PlaybackStateCompat$CustomAction
            r1 = r2[r1]
            int r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            r1 = r1 & r2
            if (r1 == 0) goto L_0x012a
            o.setTitleMargin$read r1 = r0.ParcelableVolumeInfo
            r1.write()
        L_0x012a:
            int r1 = r0.read
            if (r1 != r6) goto L_0x012f
            r5 = r6
        L_0x012f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTitleMargin.write(android.view.MotionEvent):boolean");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            write();
        }
        if (this.AppCompatDialogFragment == null) {
            this.AppCompatDialogFragment = VelocityTracker.obtain();
        }
        this.AppCompatDialogFragment.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver((int) x, (int) y);
            read(x, y, pointerId);
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, pointerId);
            if ((this.PlaybackStateCompat$CustomAction[pointerId] & this.MediaSessionCompat$ResultReceiverWrapper) != 0) {
                this.ParcelableVolumeInfo.write();
            }
        } else if (actionMasked == 1) {
            if (this.read == 1) {
                read();
            }
            write();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.read == 1) {
                    write((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                }
                write();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                read(x2, y2, pointerId2);
                if (this.read == 0) {
                    MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver((int) x2, (int) y2), pointerId2);
                    if ((this.PlaybackStateCompat$CustomAction[pointerId2] & this.MediaSessionCompat$ResultReceiverWrapper) != 0) {
                        this.ParcelableVolumeInfo.write();
                        return;
                    }
                    return;
                }
                int i3 = (int) x2;
                int i4 = (int) y2;
                View view = this.write;
                if (view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    MediaBrowserCompat$CustomActionResultReceiver(this.write, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.read == 1 && pointerId3 == this.MediaSessionCompat$Token) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.MediaSessionCompat$Token) {
                            View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view2 = this.write;
                            if (MediaBrowserCompat$ItemReceiver3 == view2 && MediaBrowserCompat$CustomActionResultReceiver(view2, pointerId4)) {
                                i = this.MediaSessionCompat$Token;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        read();
                    }
                }
                read(pointerId3);
            }
        } else if (this.read != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (MediaBrowserCompat$CustomActionResultReceiver(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.MediaBrowserCompat$CustomActionResultReceiver[pointerId5];
                    float f2 = y3 - this.IconCompatParcelizer[pointerId5];
                    MediaBrowserCompat$ItemReceiver(f, f2, pointerId5);
                    if (this.read == 1) {
                        break;
                    }
                    View MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver((int) x3, (int) y3);
                    if (read(MediaBrowserCompat$ItemReceiver4, f, f2) && MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver4, pointerId5)) {
                        break;
                    }
                }
                i2++;
            }
            MediaBrowserCompat$ItemReceiver(motionEvent);
        } else if (MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.MediaSessionCompat$Token);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.RatingCompat;
            int i5 = this.MediaSessionCompat$Token;
            int i6 = (int) (x4 - fArr[i5]);
            int i7 = (int) (y4 - this.MediaBrowserCompat$SearchResultReceiver[i5]);
            int left = this.write.getLeft() + i6;
            int top = this.write.getTop() + i7;
            int left2 = this.write.getLeft();
            int top2 = this.write.getTop();
            if (i6 != 0) {
                left = this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(this.write, left);
                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(this.write, left - left2);
            }
            if (i7 != 0) {
                top = this.ParcelableVolumeInfo.read(this.write, top);
                SwitchCompat.MediaBrowserCompat$ItemReceiver(this.write, top - top2);
            }
            if (!(i6 == 0 && i7 == 0)) {
                this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(this.write, left, top);
            }
            MediaBrowserCompat$ItemReceiver(motionEvent);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(float f, float f2, int i) {
        boolean write2 = write(f, f2, i, 1);
        if (write(f2, f, i, 4)) {
            write2 |= true;
        }
        if (write(f, f2, i, 2)) {
            write2 |= true;
        }
        if (write(f2, f, i, 8)) {
            write2 |= true;
        }
        if (write2) {
            int[] iArr = this.MediaSessionCompat$QueueItem;
            iArr[i] = iArr[i] | write2;
            this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(write2 ? 1 : 0, i);
        }
    }

    private boolean write(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.PlaybackStateCompat$CustomAction[i] & i2) != i2 || (this.MediaSessionCompat$ResultReceiverWrapper & i2) == 0 || (this.PlaybackStateCompat[i] & i2) == i2 || (this.MediaSessionCompat$QueueItem[i] & i2) == i2) {
            return false;
        }
        float f3 = (float) this.MediaBrowserCompat$MediaItem;
        if ((abs > f3 || abs2 > f3) && (this.MediaSessionCompat$QueueItem[i] & i2) == 0 && abs > ((float) this.MediaBrowserCompat$MediaItem)) {
            return true;
        }
        return false;
    }

    private boolean read(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.ParcelableVolumeInfo.write(view) > 0;
        boolean z2 = this.ParcelableVolumeInfo.IconCompatParcelizer() > 0;
        if (z && z2) {
            int i = this.MediaBrowserCompat$MediaItem;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.MediaBrowserCompat$MediaItem)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.MediaBrowserCompat$MediaItem)) {
            return false;
        } else {
            return true;
        }
    }

    private void read() {
        this.AppCompatDialogFragment.computeCurrentVelocity(1000, this.AlertController$RecycleListView);
        float xVelocity = this.AppCompatDialogFragment.getXVelocity(this.MediaSessionCompat$Token);
        float f = this.MediaMetadataCompat;
        float f2 = this.AlertController$RecycleListView;
        float abs = Math.abs(xVelocity);
        int i = (abs > f ? 1 : (abs == f ? 0 : -1));
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (i < 0) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity <= BitmapDescriptorFactory.HUE_RED ? -f2 : f2;
        }
        float yVelocity = this.AppCompatDialogFragment.getYVelocity(this.MediaSessionCompat$Token);
        float f4 = this.MediaMetadataCompat;
        float f5 = this.AlertController$RecycleListView;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity <= BitmapDescriptorFactory.HUE_RED) {
                    yVelocity = -f5;
                } else {
                    f3 = f5;
                }
            }
            f3 = yVelocity;
        }
        write(xVelocity, f3);
    }

    public final View MediaBrowserCompat$ItemReceiver(int i, int i2) {
        for (int childCount = this.setHasDecor.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.setHasDecor.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public static setTitleMargin MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, float f, read read2) {
        setTitleMargin settitlemargin = new setTitleMargin(viewGroup.getContext(), viewGroup, read2);
        settitlemargin.MediaBrowserCompat$MediaItem = (int) ((float) settitlemargin.MediaBrowserCompat$MediaItem);
        return settitlemargin;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if ((this.MediaDescriptionCompat & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    private void read(float f, float f2, int i) {
        float[] fArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.IconCompatParcelizer;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.RatingCompat;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.MediaBrowserCompat$SearchResultReceiver;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.PlaybackStateCompat$CustomAction;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.MediaSessionCompat$QueueItem;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.PlaybackStateCompat;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = fArr2;
            this.IconCompatParcelizer = fArr3;
            this.RatingCompat = fArr4;
            this.MediaBrowserCompat$SearchResultReceiver = fArr5;
            this.PlaybackStateCompat$CustomAction = iArr;
            this.MediaSessionCompat$QueueItem = iArr2;
            this.PlaybackStateCompat = iArr3;
        }
        float[] fArr10 = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.RatingCompat[i] = f;
        fArr10[i] = f;
        float[] fArr11 = this.IconCompatParcelizer;
        this.MediaBrowserCompat$SearchResultReceiver[i] = f2;
        fArr11[i] = f2;
        int[] iArr7 = this.PlaybackStateCompat$CustomAction;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.setHasDecor.getLeft() + this.MediaBrowserCompat$ItemReceiver) {
            i2 = 1;
        }
        if (i5 < this.setHasDecor.getTop() + this.MediaBrowserCompat$ItemReceiver) {
            i2 |= 4;
        }
        if (i4 > this.setHasDecor.getRight() - this.MediaBrowserCompat$ItemReceiver) {
            i2 |= 2;
        }
        if (i5 > this.setHasDecor.getBottom() - this.MediaBrowserCompat$ItemReceiver) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.MediaDescriptionCompat |= 1 << i;
    }
}
