package com.p032rd;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.DSYMV;
import p040o.DSYR;
import p040o.DTRMM;
import p040o.FragmentBuilder_BindOccupationInfoFragment;
import p040o.FragmentBuilder_BindOnboardingSelectAccountFragment;
import p040o.FragmentBuilder_BindOthersTabFragment;
import p040o.SGBMV;
import p040o.SSPR2;
import p040o.SSPR2$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.SSYR2;
import p040o.SSYRK;
import p040o.STBMV;
import p040o.ZGEMV;
import p040o.onActivityCreated;
import p040o.setSelected;

/* renamed from: com.rd.PageIndicatorView */
public class PageIndicatorView extends View implements ViewPager.MediaMetadataCompat, DSYR.read, ViewPager.IconCompatParcelizer, View.OnTouchListener {
    private static final Handler MediaBrowserCompat$ItemReceiver = new Handler(Looper.getMainLooper());
    private DataSetObserver IconCompatParcelizer;
    private Runnable MediaBrowserCompat$CustomActionResultReceiver = new Runnable() {
        public final void run() {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = PageIndicatorView.this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
            PageIndicatorView.write(PageIndicatorView.this);
        }
    };
    private ViewPager MediaBrowserCompat$SearchResultReceiver;
    private boolean read;
    public DSYR write;

    public PageIndicatorView(Context context) {
        super(context);
        if (getId() == -1) {
            setId(ZGEMV.MediaBrowserCompat$ItemReceiver());
        }
        IconCompatParcelizer((AttributeSet) null);
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
            MediaBrowserCompat$ItemReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
            Handler handler = MediaBrowserCompat$ItemReceiver;
            Runnable runnable = this.MediaBrowserCompat$CustomActionResultReceiver;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            handler.postDelayed(runnable, fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getId() == -1) {
            setId(ZGEMV.MediaBrowserCompat$ItemReceiver());
        }
        IconCompatParcelizer(attributeSet);
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
            MediaBrowserCompat$ItemReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
            Handler handler = MediaBrowserCompat$ItemReceiver;
            Runnable runnable = this.MediaBrowserCompat$CustomActionResultReceiver;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            handler.postDelayed(runnable, fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getId() == -1) {
            setId(ZGEMV.MediaBrowserCompat$ItemReceiver());
        }
        IconCompatParcelizer(attributeSet);
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
            MediaBrowserCompat$ItemReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
            Handler handler = MediaBrowserCompat$ItemReceiver;
            Runnable runnable = this.MediaBrowserCompat$CustomActionResultReceiver;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            handler.postDelayed(runnable, fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        ViewPager viewPager;
        View findViewById;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent != null && (parent instanceof ViewGroup) && ((ViewGroup) parent).getChildCount() > 0) {
                FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
                if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                    fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
                }
                int i = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.setBackgroundResource;
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getChildCount() <= 0 || (findViewById = viewGroup.findViewById(i)) == null || !(findViewById instanceof ViewPager)) {
                    viewPager = null;
                } else {
                    viewPager = (ViewPager) findViewById;
                }
                if (viewPager != null) {
                    setViewPager(viewPager);
                    return;
                }
                parent = parent.getParent();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        RatingCompat();
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        SSYRK ssyrk = new SSYRK(super.onSaveInstanceState());
        ssyrk.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment;
        ssyrk.write = fragmentBuilder_BindOthersTabFragment.AppCompatActivity;
        ssyrk.read = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem;
        return ssyrk;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SSYRK) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
            SSYRK ssyrk = (SSYRK) parcelable;
            fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = ssyrk.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindOthersTabFragment.AppCompatActivity = ssyrk.write;
            fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem = ssyrk.read;
            super.onRestoreInstanceState(ssyrk.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write.read.MediaBrowserCompat$ItemReceiver;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
        int i6 = fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat;
        int i7 = fragmentBuilder_BindOthersTabFragment.setContentView;
        int i8 = fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$ResultReceiverWrapper;
        int i9 = fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$QueueItem;
        int i10 = fragmentBuilder_BindOthersTabFragment.Keep;
        int i11 = fragmentBuilder_BindOthersTabFragment.f3149x50fd9e4a;
        int i12 = fragmentBuilder_BindOthersTabFragment.ParcelableVolumeInfo;
        int i13 = i6 << 1;
        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
            fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
        }
        SSYR2 ssyr2 = fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token;
        int i14 = 0;
        if (i5 != 0) {
            i3 = (i13 * i5) + ((i7 << 1) * i5) + (i8 * (i5 - 1));
            i4 = i13 + i7;
            if (ssyr2 == SSYR2.HORIZONTAL) {
                int i15 = i3;
                i3 = i4;
                i4 = i15;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (fragmentBuilder_BindOthersTabFragment.write == null) {
            fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
        }
        if (fragmentBuilder_BindOthersTabFragment.write == DTRMM.DROP) {
            if (ssyr2 == SSYR2.HORIZONTAL) {
                i3 <<= 1;
            } else {
                i4 <<= 1;
            }
        }
        SSYR2 ssyr22 = SSYR2.HORIZONTAL;
        int i16 = i4 + i9 + i11;
        int i17 = i3 + i10 + i12;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i16, size) : i16;
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i17, size2);
            } else {
                size2 = i17;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i14 = size2;
        }
        fragmentBuilder_BindOthersTabFragment.setCheckable = size;
        fragmentBuilder_BindOthersTabFragment.RatingCompat = i14;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(i14));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            o.DSYR r2 = r0.write
            o.FragmentBuilder_BindOccupationInfoFragment r2 = r2.read
            o.SSPR2 r2 = r2.IconCompatParcelizer
            o.FragmentBuilder_BindOthersTabFragment r3 = r2.read
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r5 = 0
        L_0x000f:
            if (r5 >= r3) goto L_0x034b
            o.FragmentBuilder_BindOthersTabFragment r6 = r2.read
            int r6 = p040o.FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(r6, r5)
            o.FragmentBuilder_BindOthersTabFragment r7 = r2.read
            int r7 = p040o.FragmentBuilder_BindOnboardingSelectAccountFragment.read(r7, r5)
            o.FragmentBuilder_BindOthersTabFragment r8 = r2.read
            boolean r8 = r8.MediaMetadataCompat
            o.FragmentBuilder_BindOthersTabFragment r9 = r2.read
            int r9 = r9.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r10 = r2.read
            int r10 = r10.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r11 = r2.read
            int r11 = r11.MediaBrowserCompat$MediaItem
            r12 = 1
            if (r8 != 0) goto L_0x0036
            if (r5 == r9) goto L_0x0034
            if (r5 != r11) goto L_0x0036
        L_0x0034:
            r11 = r12
            goto L_0x0037
        L_0x0036:
            r11 = 0
        L_0x0037:
            if (r8 == 0) goto L_0x003f
            if (r5 == r9) goto L_0x003d
            if (r5 != r10) goto L_0x003f
        L_0x003d:
            r8 = r12
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            r8 = r8 | r11
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r9 = r2.MediaBrowserCompat$ItemReceiver
            r9.MediaMetadataCompat = r5
            r9.write = r6
            r9.MediaBrowserCompat$CustomActionResultReceiver = r7
            o.inject_base64Decoder r6 = r2.IconCompatParcelizer
            if (r6 == 0) goto L_0x0340
            if (r8 == 0) goto L_0x0340
            o.FragmentBuilder_BindOthersTabFragment r6 = r2.read
            o.DTRMM r7 = r6.write
            if (r7 != 0) goto L_0x0059
            o.DTRMM r7 = p040o.DTRMM.NONE
            r6.write = r7
        L_0x0059:
            o.DTRMM r6 = r6.write
            int[] r7 = p040o.SSPR2.C12623.IconCompatParcelizer
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x033a;
                case 2: goto L_0x02eb;
                case 3: goto L_0x0290;
                case 4: goto L_0x027f;
                case 5: goto L_0x022d;
                case 6: goto L_0x01ab;
                case 7: goto L_0x019a;
                case 8: goto L_0x013a;
                case 9: goto L_0x00c4;
                case 10: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0345
        L_0x0068:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r6 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r7 = r2.IconCompatParcelizer
            o.STRMM r8 = r6.MediaDescriptionCompat
            if (r8 == 0) goto L_0x0345
            int r9 = r6.MediaMetadataCompat
            int r10 = r6.write
            int r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            boolean r11 = r7 instanceof p040o.DSYRK
            if (r11 == 0) goto L_0x0345
            o.DSYRK r7 = (p040o.DSYRK) r7
            o.FragmentBuilder_BindOthersTabFragment r11 = r8.MediaBrowserCompat$ItemReceiver
            int r11 = r11.PlaybackStateCompat
            float r11 = (float) r11
            o.FragmentBuilder_BindOthersTabFragment r12 = r8.MediaBrowserCompat$ItemReceiver
            int r12 = r12.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r13 = r8.MediaBrowserCompat$ItemReceiver
            int r13 = r13.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r14 = r8.MediaBrowserCompat$ItemReceiver
            int r14 = r14.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r15 = r8.MediaBrowserCompat$ItemReceiver
            int r15 = r15.MediaBrowserCompat$MediaItem
            o.FragmentBuilder_BindOthersTabFragment r4 = r8.MediaBrowserCompat$ItemReceiver
            boolean r4 = r4.MediaMetadataCompat
            if (r4 == 0) goto L_0x00a7
            if (r9 != r14) goto L_0x009f
            int r4 = r7.IconCompatParcelizer
            float r11 = (float) r4
            int r12 = r7.write
            goto L_0x00b6
        L_0x009f:
            if (r9 != r13) goto L_0x00b6
            int r4 = r7.read
            float r11 = (float) r4
            int r12 = r7.MediaBrowserCompat$ItemReceiver
            goto L_0x00b6
        L_0x00a7:
            if (r9 != r13) goto L_0x00af
            int r4 = r7.IconCompatParcelizer
            float r11 = (float) r4
            int r12 = r7.write
            goto L_0x00b6
        L_0x00af:
            if (r9 != r15) goto L_0x00b6
            int r4 = r7.read
            float r11 = (float) r4
            int r12 = r7.MediaBrowserCompat$ItemReceiver
        L_0x00b6:
            android.graphics.Paint r4 = r8.read
            r4.setColor(r12)
            float r4 = (float) r10
            float r6 = (float) r6
            android.graphics.Paint r7 = r8.read
            r1.drawCircle(r4, r6, r11, r7)
            goto L_0x0345
        L_0x00c4:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r4 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r6 = r2.IconCompatParcelizer
            o.ZGBMV r7 = r4.MediaBrowserCompat$MediaItem
            if (r7 == 0) goto L_0x0345
            int r8 = r4.MediaMetadataCompat
            int r9 = r4.write
            int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            boolean r10 = r6 instanceof p040o.DTRMV
            if (r10 == 0) goto L_0x0345
            o.DTRMV r6 = (p040o.DTRMV) r6
            o.FragmentBuilder_BindOthersTabFragment r10 = r7.MediaBrowserCompat$ItemReceiver
            int r10 = r10.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r11 = r7.MediaBrowserCompat$ItemReceiver
            int r11 = r11.AppCompatDelegateImpl$ListMenuDecorView
            o.FragmentBuilder_BindOthersTabFragment r12 = r7.MediaBrowserCompat$ItemReceiver
            int r12 = r12.PlaybackStateCompat
            o.FragmentBuilder_BindOthersTabFragment r13 = r7.MediaBrowserCompat$ItemReceiver
            int r13 = r13.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r14 = r7.MediaBrowserCompat$ItemReceiver
            int r14 = r14.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r15 = r7.MediaBrowserCompat$ItemReceiver
            int r15 = r15.MediaBrowserCompat$MediaItem
            int r0 = r6.IconCompatParcelizer
            r16 = r0
            o.FragmentBuilder_BindOthersTabFragment r0 = r7.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.MediaMetadataCompat
            if (r0 == 0) goto L_0x0104
            if (r8 != r14) goto L_0x00ff
            int r0 = r6.IconCompatParcelizer
            goto L_0x0111
        L_0x00ff:
            if (r8 != r13) goto L_0x010e
            int r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0110
        L_0x0104:
            if (r8 != r15) goto L_0x0109
            int r0 = r6.IconCompatParcelizer
            goto L_0x0111
        L_0x0109:
            if (r8 != r13) goto L_0x010e
            int r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0110
        L_0x010e:
            r0 = r16
        L_0x0110:
            r10 = r11
        L_0x0111:
            android.graphics.Paint r6 = r7.read
            r6.setColor(r10)
            o.FragmentBuilder_BindOthersTabFragment r6 = r7.MediaBrowserCompat$ItemReceiver
            o.SSYR2 r8 = r6.MediaSessionCompat$Token
            if (r8 != 0) goto L_0x0120
            o.SSYR2 r8 = p040o.SSYR2.HORIZONTAL
            r6.MediaSessionCompat$Token = r8
        L_0x0120:
            o.SSYR2 r6 = r6.MediaSessionCompat$Token
            o.SSYR2 r8 = p040o.SSYR2.HORIZONTAL
            if (r6 != r8) goto L_0x0130
            float r0 = (float) r0
            float r4 = (float) r4
            float r6 = (float) r12
            android.graphics.Paint r7 = r7.read
            r1.drawCircle(r0, r4, r6, r7)
            goto L_0x0345
        L_0x0130:
            float r4 = (float) r9
            float r0 = (float) r0
            float r6 = (float) r12
            android.graphics.Paint r7 = r7.read
            r1.drawCircle(r4, r0, r6, r7)
            goto L_0x0345
        L_0x013a:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STPSV r6 = r0.read
            if (r6 == 0) goto L_0x0345
            int r7 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r8 = r4 instanceof p040o.DTBMV
            if (r8 == 0) goto L_0x0345
            o.DTBMV r4 = (p040o.DTBMV) r4
            o.FragmentBuilder_BindOthersTabFragment r8 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r8.AppCompatDelegateImpl$ListMenuDecorView
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            int r9 = r9.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r10 = r6.MediaBrowserCompat$ItemReceiver
            int r10 = r10.PlaybackStateCompat
            float r10 = (float) r10
            android.graphics.Paint r11 = r6.read
            r11.setColor(r8)
            float r7 = (float) r7
            float r0 = (float) r0
            android.graphics.Paint r8 = r6.read
            r1.drawCircle(r7, r0, r10, r8)
            android.graphics.Paint r0 = r6.read
            r0.setColor(r9)
            o.FragmentBuilder_BindOthersTabFragment r0 = r6.MediaBrowserCompat$ItemReceiver
            o.SSYR2 r7 = r0.MediaSessionCompat$Token
            if (r7 != 0) goto L_0x0174
            o.SSYR2 r7 = p040o.SSYR2.HORIZONTAL
            r0.MediaSessionCompat$Token = r7
        L_0x0174:
            o.SSYR2 r0 = r0.MediaSessionCompat$Token
            o.SSYR2 r7 = p040o.SSYR2.HORIZONTAL
            if (r0 != r7) goto L_0x018a
            int r0 = r4.write
            float r0 = (float) r0
            int r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            float r7 = (float) r7
            int r4 = r4.IconCompatParcelizer
            float r4 = (float) r4
            android.graphics.Paint r6 = r6.read
            r1.drawCircle(r0, r7, r4, r6)
            goto L_0x0345
        L_0x018a:
            int r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            float r0 = (float) r0
            int r7 = r4.write
            float r7 = (float) r7
            int r4 = r4.IconCompatParcelizer
            float r4 = (float) r4
            android.graphics.Paint r6 = r6.read
            r1.drawCircle(r0, r7, r4, r6)
            goto L_0x0345
        L_0x019a:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.ZGEMM r6 = r0.f2775x50fd9e4a
            if (r6 == 0) goto L_0x0345
            int r7 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r6.MediaBrowserCompat$ItemReceiver(r1, r4, r7, r0)
            goto L_0x0345
        L_0x01ab:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STRMV r6 = r0.IconCompatParcelizer
            if (r6 == 0) goto L_0x0345
            int r7 = r0.MediaMetadataCompat
            int r8 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r4 instanceof p040o.DTPSV
            if (r9 == 0) goto L_0x0345
            o.DTPSV r4 = (p040o.DTPSV) r4
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            int r9 = r9.AppCompatDelegateImpl$ListMenuDecorView
            o.FragmentBuilder_BindOthersTabFragment r10 = r6.MediaBrowserCompat$ItemReceiver
            int r10 = r10.PlaybackStateCompat
            float r10 = (float) r10
            o.FragmentBuilder_BindOthersTabFragment r11 = r6.MediaBrowserCompat$ItemReceiver
            int r11 = r11.setContentView
            o.FragmentBuilder_BindOthersTabFragment r12 = r6.MediaBrowserCompat$ItemReceiver
            int r12 = r12.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r13 = r6.MediaBrowserCompat$ItemReceiver
            int r13 = r13.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r14 = r6.MediaBrowserCompat$ItemReceiver
            int r14 = r14.MediaBrowserCompat$MediaItem
            o.FragmentBuilder_BindOthersTabFragment r15 = r6.MediaBrowserCompat$ItemReceiver
            boolean r15 = r15.MediaMetadataCompat
            if (r15 == 0) goto L_0x01f2
            if (r7 != r13) goto L_0x01e8
            int r9 = r4.write
            int r7 = r4.read
            float r10 = (float) r7
            int r11 = r4.IconCompatParcelizer
            goto L_0x0205
        L_0x01e8:
            if (r7 != r12) goto L_0x0205
            int r9 = r4.MediaBrowserCompat$ItemReceiver
            int r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            float r10 = (float) r7
            int r11 = r4.MediaBrowserCompat$MediaItem
            goto L_0x0205
        L_0x01f2:
            if (r7 != r12) goto L_0x01fc
            int r9 = r4.write
            int r7 = r4.read
            float r10 = (float) r7
            int r11 = r4.IconCompatParcelizer
            goto L_0x0205
        L_0x01fc:
            if (r7 != r14) goto L_0x0205
            int r9 = r4.MediaBrowserCompat$ItemReceiver
            int r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            float r10 = (float) r7
            int r11 = r4.MediaBrowserCompat$MediaItem
        L_0x0205:
            android.graphics.Paint r4 = r6.IconCompatParcelizer
            r4.setColor(r9)
            android.graphics.Paint r4 = r6.IconCompatParcelizer
            o.FragmentBuilder_BindOthersTabFragment r7 = r6.MediaBrowserCompat$ItemReceiver
            int r7 = r7.setContentView
            float r7 = (float) r7
            r4.setStrokeWidth(r7)
            float r4 = (float) r8
            float r0 = (float) r0
            o.FragmentBuilder_BindOthersTabFragment r7 = r6.MediaBrowserCompat$ItemReceiver
            int r7 = r7.PlaybackStateCompat
            float r7 = (float) r7
            android.graphics.Paint r8 = r6.IconCompatParcelizer
            r1.drawCircle(r4, r0, r7, r8)
            android.graphics.Paint r7 = r6.IconCompatParcelizer
            float r8 = (float) r11
            r7.setStrokeWidth(r8)
            android.graphics.Paint r6 = r6.IconCompatParcelizer
            r1.drawCircle(r4, r0, r10, r6)
            goto L_0x0345
        L_0x022d:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STPMV r6 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r6 == 0) goto L_0x0345
            int r7 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r8 = r4 instanceof p040o.DTPMV
            if (r8 == 0) goto L_0x0345
            o.DTPMV r4 = (p040o.DTPMV) r4
            int r4 = r4.IconCompatParcelizer
            o.FragmentBuilder_BindOthersTabFragment r8 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r8.AppCompatDelegateImpl$ListMenuDecorView
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            int r9 = r9.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r10 = r6.MediaBrowserCompat$ItemReceiver
            int r10 = r10.PlaybackStateCompat
            android.graphics.Paint r11 = r6.read
            r11.setColor(r8)
            float r7 = (float) r7
            float r0 = (float) r0
            float r8 = (float) r10
            android.graphics.Paint r10 = r6.read
            r1.drawCircle(r7, r0, r8, r10)
            android.graphics.Paint r10 = r6.read
            r10.setColor(r9)
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            o.SSYR2 r10 = r9.MediaSessionCompat$Token
            if (r10 != 0) goto L_0x0269
            o.SSYR2 r10 = p040o.SSYR2.HORIZONTAL
            r9.MediaSessionCompat$Token = r10
        L_0x0269:
            o.SSYR2 r9 = r9.MediaSessionCompat$Token
            o.SSYR2 r10 = p040o.SSYR2.HORIZONTAL
            if (r9 != r10) goto L_0x0277
            float r4 = (float) r4
            android.graphics.Paint r6 = r6.read
            r1.drawCircle(r4, r0, r8, r6)
            goto L_0x0345
        L_0x0277:
            float r0 = (float) r4
            android.graphics.Paint r4 = r6.read
            r1.drawCircle(r7, r0, r8, r4)
            goto L_0x0345
        L_0x027f:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STRSV r6 = r0.MediaSessionCompat$Token
            if (r6 == 0) goto L_0x0345
            int r7 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r6.MediaBrowserCompat$ItemReceiver(r1, r4, r7, r0)
            goto L_0x0345
        L_0x0290:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STRSM r6 = r0.RatingCompat
            if (r6 == 0) goto L_0x0345
            int r7 = r0.MediaMetadataCompat
            int r8 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r4 instanceof p040o.DSYRK
            if (r9 == 0) goto L_0x0345
            o.DSYRK r4 = (p040o.DSYRK) r4
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            int r9 = r9.PlaybackStateCompat
            float r9 = (float) r9
            o.FragmentBuilder_BindOthersTabFragment r10 = r6.MediaBrowserCompat$ItemReceiver
            int r10 = r10.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r11 = r6.MediaBrowserCompat$ItemReceiver
            int r11 = r11.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r12 = r6.MediaBrowserCompat$ItemReceiver
            int r12 = r12.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r13 = r6.MediaBrowserCompat$ItemReceiver
            int r13 = r13.MediaBrowserCompat$MediaItem
            o.FragmentBuilder_BindOthersTabFragment r14 = r6.MediaBrowserCompat$ItemReceiver
            boolean r14 = r14.MediaMetadataCompat
            if (r14 == 0) goto L_0x02cf
            if (r7 != r12) goto L_0x02c7
            int r7 = r4.IconCompatParcelizer
            float r9 = (float) r7
            int r10 = r4.write
            goto L_0x02de
        L_0x02c7:
            if (r7 != r11) goto L_0x02de
            int r7 = r4.read
            float r9 = (float) r7
            int r10 = r4.MediaBrowserCompat$ItemReceiver
            goto L_0x02de
        L_0x02cf:
            if (r7 != r11) goto L_0x02d7
            int r7 = r4.IconCompatParcelizer
            float r9 = (float) r7
            int r10 = r4.write
            goto L_0x02de
        L_0x02d7:
            if (r7 != r13) goto L_0x02de
            int r7 = r4.read
            float r9 = (float) r7
            int r10 = r4.MediaBrowserCompat$ItemReceiver
        L_0x02de:
            android.graphics.Paint r4 = r6.read
            r4.setColor(r10)
            float r4 = (float) r8
            float r0 = (float) r0
            android.graphics.Paint r6 = r6.read
            r1.drawCircle(r4, r0, r9, r6)
            goto L_0x0345
        L_0x02eb:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            o.inject_base64Decoder r4 = r2.IconCompatParcelizer
            o.STBSV r6 = r0.MediaBrowserCompat$ItemReceiver
            if (r6 == 0) goto L_0x0345
            int r7 = r0.MediaMetadataCompat
            int r8 = r0.write
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r4 instanceof p040o.DTBSV
            if (r9 == 0) goto L_0x0345
            o.DTBSV r4 = (p040o.DTBSV) r4
            o.FragmentBuilder_BindOthersTabFragment r9 = r6.MediaBrowserCompat$ItemReceiver
            int r9 = r9.PlaybackStateCompat
            float r9 = (float) r9
            o.FragmentBuilder_BindOthersTabFragment r10 = r6.MediaBrowserCompat$ItemReceiver
            int r10 = r10.AlertController$RecycleListView
            o.FragmentBuilder_BindOthersTabFragment r11 = r6.MediaBrowserCompat$ItemReceiver
            int r11 = r11.AppCompatDialogFragment
            o.FragmentBuilder_BindOthersTabFragment r12 = r6.MediaBrowserCompat$ItemReceiver
            int r12 = r12.AppCompatActivity
            o.FragmentBuilder_BindOthersTabFragment r13 = r6.MediaBrowserCompat$ItemReceiver
            int r13 = r13.MediaBrowserCompat$MediaItem
            o.FragmentBuilder_BindOthersTabFragment r14 = r6.MediaBrowserCompat$ItemReceiver
            boolean r14 = r14.MediaMetadataCompat
            if (r14 == 0) goto L_0x0324
            if (r7 != r12) goto L_0x031f
            int r10 = r4.write
            goto L_0x032d
        L_0x031f:
            if (r7 != r11) goto L_0x032d
            int r10 = r4.MediaBrowserCompat$ItemReceiver
            goto L_0x032d
        L_0x0324:
            if (r7 != r11) goto L_0x0329
            int r10 = r4.write
            goto L_0x032d
        L_0x0329:
            if (r7 != r13) goto L_0x032d
            int r10 = r4.MediaBrowserCompat$ItemReceiver
        L_0x032d:
            android.graphics.Paint r4 = r6.read
            r4.setColor(r10)
            float r4 = (float) r8
            float r0 = (float) r0
            android.graphics.Paint r6 = r6.read
            r1.drawCircle(r4, r0, r9, r6)
            goto L_0x0345
        L_0x033a:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            r0.read(r1, r12)
            goto L_0x0345
        L_0x0340:
            o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer r0 = r2.MediaBrowserCompat$ItemReceiver
            r0.read(r1, r8)
        L_0x0345:
            int r5 = r5 + 1
            r0 = r17
            goto L_0x000f
        L_0x034b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p032rd.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment;
        SSPR2 sspr2 = this.write.read.IconCompatParcelizer;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!(sspr2.write == null || (fragmentBuilder_BindOthersTabFragment = sspr2.read) == null)) {
                if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                    fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
                }
                if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token != SSYR2.HORIZONTAL) {
                    float f = x;
                    x = y;
                    y = f;
                }
                FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindOthersTabFragment, x, y);
            }
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (!fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            MediaBrowserCompat$ItemReceiver();
        } else if (action == 1) {
            IconCompatParcelizer();
        }
        return false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = this.read;
        }
    }

    public final void read(ViewPager viewPager, onActivityCreated onactivitycreated, onActivityCreated onactivitycreated2) {
        DataSetObserver dataSetObserver;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
            if (!(onactivitycreated == null || (dataSetObserver = this.IconCompatParcelizer) == null)) {
                onactivitycreated.unregisterDataSetObserver(dataSetObserver);
                this.IconCompatParcelizer = null;
            }
            read();
        }
        MediaDescriptionCompat();
    }

    public void setCount(int i) {
        if (i >= 0) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != i) {
                FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
                if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                    fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
                }
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = i;
                MediaMetadataCompat();
                requestLayout();
            }
        }
    }

    public void setDynamicCount(boolean z) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = z;
        if (z) {
            read();
        } else {
            RatingCompat();
        }
    }

    public void setFadeOnIdle(boolean z) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = z;
        if (z) {
            IconCompatParcelizer();
        } else {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setRadius(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat = (int) f;
        invalidate();
    }

    public void setPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = (int) f;
        invalidate();
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.setHasDecor = f;
    }

    public void setStrokeWidth(float f) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        int i = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else {
            float f2 = (float) i;
            if (f > f2) {
                f = f2;
            }
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.setContentView = (int) f;
        invalidate();
    }

    public void setSelectedColor(int i) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView = i;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView = i;
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.read = z;
        MediaMetadataCompat();
    }

    public void setOrientation(SSYR2 ssyr2) {
        if (ssyr2 != null) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = ssyr2;
            requestLayout();
        }
    }

    public void setAnimationDuration(long j) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = j;
    }

    public void setIdleDuration(long j) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = j;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
            IconCompatParcelizer();
        } else {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setAnimationType(DTRMM dtrmm) {
        DSYR dsyr = this.write;
        dsyr.read.IconCompatParcelizer.IconCompatParcelizer = null;
        DSYR.read read2 = dsyr.write;
        if (read2 != null) {
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (dtrmm != null) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.write = dtrmm;
        } else {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.write = DTRMM.NONE;
        }
        invalidate();
    }

    public void setInteractiveAnimation(boolean z) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = z;
        this.read = z;
    }

    public void setRtlMode(STBMV stbmv) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        if (stbmv == null) {
            fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat$CustomAction = STBMV.Off;
        } else {
            fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat$CustomAction = stbmv;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            int i = fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment;
            if (write()) {
                i = (fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver - 1) - i;
            } else {
                ViewPager viewPager = this.MediaBrowserCompat$SearchResultReceiver;
                if (viewPager != null) {
                    i = viewPager.getCurrentItem();
                }
            }
            fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem = i;
            fragmentBuilder_BindOthersTabFragment.AppCompatActivity = i;
            fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = i;
            invalidate();
        }
    }

    public void setSelection(int i) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        int i2 = fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver - 1;
        if (i < 0) {
            i = 0;
        } else if (i > i2) {
            i = i2;
        }
        if (i != fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment && i != fragmentBuilder_BindOthersTabFragment.AppCompatActivity) {
            fragmentBuilder_BindOthersTabFragment.MediaMetadataCompat = false;
            fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem = fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment;
            fragmentBuilder_BindOthersTabFragment.AppCompatActivity = i;
            fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = i;
            this.write.IconCompatParcelizer.write();
        }
    }

    public void setSelected(int i) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindOthersTabFragment.write == null) {
            fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
        }
        DTRMM dtrmm = fragmentBuilder_BindOthersTabFragment.write;
        fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
        setSelection(i);
        fragmentBuilder_BindOthersTabFragment.write = dtrmm;
    }

    public void setProgress(int i, float f) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindOthersTabFragment.MediaMetadataCompat) {
            int i2 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 <= 0 || i < 0) {
                i = 0;
            } else {
                int i3 = i2 - 1;
                if (i > i3) {
                    i = i3;
                }
            }
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem = fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment;
                fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = i;
            }
            fragmentBuilder_BindOthersTabFragment.AppCompatActivity = i;
            DSYMV dsymv = this.write.IconCompatParcelizer.read;
            if (dsymv != null) {
                dsymv.MediaBrowserCompat$CustomActionResultReceiver = true;
                dsymv.IconCompatParcelizer = f;
                dsymv.IconCompatParcelizer();
            }
        }
    }

    public void setClickListener(SSPR2$MediaBrowserCompat$CustomActionResultReceiver sSPR2$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write.read.IconCompatParcelizer.write = sSPR2$MediaBrowserCompat$CustomActionResultReceiver;
    }

    private void IconCompatParcelizer(AttributeSet attributeSet) {
        DSYR dsyr = new DSYR(this);
        this.write = dsyr;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = dsyr.read;
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(getContext(), attributeSet);
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver;
        fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$QueueItem = getPaddingLeft();
        fragmentBuilder_BindOthersTabFragment.Keep = getPaddingTop();
        fragmentBuilder_BindOthersTabFragment.f3149x50fd9e4a = getPaddingRight();
        fragmentBuilder_BindOthersTabFragment.ParcelableVolumeInfo = getPaddingBottom();
        this.read = fragmentBuilder_BindOthersTabFragment.MediaMetadataCompat;
    }

    private void read() {
        ViewPager viewPager;
        if (this.IconCompatParcelizer == null && (viewPager = this.MediaBrowserCompat$SearchResultReceiver) != null && viewPager.getAdapter() != null) {
            this.IconCompatParcelizer = new DataSetObserver() {
                public final void onChanged() {
                    PageIndicatorView.this.MediaDescriptionCompat();
                }
            };
            try {
                this.MediaBrowserCompat$SearchResultReceiver.getAdapter().registerDataSetObserver(this.IconCompatParcelizer);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    private void RatingCompat() {
        ViewPager viewPager;
        if (this.IconCompatParcelizer != null && (viewPager = this.MediaBrowserCompat$SearchResultReceiver) != null && viewPager.getAdapter() != null) {
            try {
                this.MediaBrowserCompat$SearchResultReceiver.getAdapter().unregisterDataSetObserver(this.IconCompatParcelizer);
                this.IconCompatParcelizer = null;
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        SGBMV sgbmv;
        ViewPager viewPager = this.MediaBrowserCompat$SearchResultReceiver;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int count = this.MediaBrowserCompat$SearchResultReceiver.getAdapter().getCount();
            int currentItem = write() ? (count - 1) - this.MediaBrowserCompat$SearchResultReceiver.getCurrentItem() : this.MediaBrowserCompat$SearchResultReceiver.getCurrentItem();
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.AppCompatDialogFragment = currentItem;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.AppCompatActivity = currentItem;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment3 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment3.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment3.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment3.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = currentItem;
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment4 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment4.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment4.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment4.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = count;
            DSYMV dsymv = this.write.IconCompatParcelizer.read;
            if (!(dsymv == null || (sgbmv = dsymv.MediaBrowserCompat$ItemReceiver) == null)) {
                sgbmv.IconCompatParcelizer();
            }
            MediaMetadataCompat();
            requestLayout();
        }
    }

    private void MediaMetadataCompat() {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.read) {
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            int i = fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int visibility = getVisibility();
            if (visibility != 0 && i > 1) {
                setVisibility(0);
            } else if (visibility != 4 && i <= 1) {
                setVisibility(4);
            }
        }
    }

    /* renamed from: com.rd.PageIndicatorView$4 */
    static /* synthetic */ class C10494 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.STBMV[] r0 = p040o.STBMV.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.STBMV r1 = p040o.STBMV.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.STBMV r1 = p040o.STBMV.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.STBMV r1 = p040o.STBMV.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p032rd.PageIndicatorView.C10494.<clinit>():void");
        }
    }

    private boolean write() {
        int[] iArr = C10494.read;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat$CustomAction == null) {
            fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat$CustomAction = STBMV.Off;
        }
        int i = iArr[fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat$CustomAction.ordinal()];
        if (i == 1 || (i == 3 && setSelected.MediaBrowserCompat$ItemReceiver(getContext().getResources().getConfiguration().locale) == 1)) {
            return true;
        }
        return false;
    }

    private void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
        Handler handler = MediaBrowserCompat$ItemReceiver;
        Runnable runnable = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        handler.postDelayed(runnable, fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
    }

    private void MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$ItemReceiver.removeCallbacks(this.MediaBrowserCompat$CustomActionResultReceiver);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250);
    }

    static /* synthetic */ void write(PageIndicatorView pageIndicatorView) {
        pageIndicatorView.animate().cancel();
        pageIndicatorView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(250);
    }

    public void onPageScrolled(int i, float f, int i2) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindOthersTabFragment.write == null) {
            fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
        }
        boolean z = false;
        if ((getMeasuredHeight() != 0 || getMeasuredWidth() != 0) && fragmentBuilder_BindOthersTabFragment.MediaMetadataCompat && fragmentBuilder_BindOthersTabFragment.write != DTRMM.NONE) {
            boolean write2 = write();
            int i3 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
            int i4 = fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment;
            if (write2) {
                i = (i3 - 1) - i;
            }
            if (i < 0) {
                i = 0;
            } else {
                int i5 = i3 - 1;
                if (i > i5) {
                    i = i5;
                }
            }
            boolean z2 = i > i4;
            boolean z3 = !write2 ? i + 1 < i4 : i + -1 < i4;
            if (z2 || z3) {
                fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = i;
                i4 = i;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i4 == i && f != BitmapDescriptorFactory.HUE_RED) {
                z = true;
            }
            if (z) {
                i = write2 ? i - 1 : i + 1;
            } else {
                f = 1.0f - f;
            }
            if (f > 1.0f) {
                f2 = 1.0f;
            } else if (f >= BitmapDescriptorFactory.HUE_RED) {
                f2 = f;
            }
            Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f2));
            setProgress(((Integer) pair.first).intValue(), ((Float) pair.second).floatValue());
        }
    }

    public void onPageSelected(int i) {
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
        boolean z = (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
        int i2 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            if (write()) {
                i = (i2 - 1) - i;
            }
            setSelection(i);
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = applyDimension;
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat = applyDimension;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int applyDimension = (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        int i2 = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
        if (applyDimension < 0) {
            applyDimension = 0;
        } else if (applyDimension > i2) {
            applyDimension = i2;
        }
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
        if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.setContentView = applyDimension;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.MediaBrowserCompat$SearchResultReceiver.removeOnAdapterChangeListener(this);
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        if (viewPager != null) {
            this.MediaBrowserCompat$SearchResultReceiver = viewPager;
            viewPager.addOnPageChangeListener(this);
            this.MediaBrowserCompat$SearchResultReceiver.addOnAdapterChangeListener(this);
            this.MediaBrowserCompat$SearchResultReceiver.setOnTouchListener(this);
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver.setBackgroundResource = this.MediaBrowserCompat$SearchResultReceiver.getId();
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment2 = this.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            setDynamicCount(fragmentBuilder_BindOccupationInfoFragment2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
            MediaDescriptionCompat();
        }
    }
}
