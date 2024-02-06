package p040o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import p040o.nAllocationSetSurface;

/* renamed from: o.nInvokeClosureCreate */
public final class nInvokeClosureCreate {
    public boolean IconCompatParcelizer;
    private int Keep;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public Animator MediaBrowserCompat$ItemReceiver;
    public CharSequence MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private FrameLayout f2611x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public TextView MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem;
    public final TextInputLayout MediaSessionCompat$ResultReceiverWrapper;
    public Typeface MediaSessionCompat$Token;
    public TextView ParcelableVolumeInfo;
    private final float PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    public CharSequence RatingCompat;
    public int read;
    private LinearLayout setHasDecor;
    public final Context write;

    public nInvokeClosureCreate(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.write = context;
        this.MediaSessionCompat$ResultReceiverWrapper = textInputLayout;
        this.PlaybackStateCompat = (float) context.getResources().getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.design_textinput_caption_translate_y);
    }

    public final void IconCompatParcelizer() {
        this.RatingCompat = null;
        Animator animator = this.MediaBrowserCompat$ItemReceiver;
        if (animator != null) {
            animator.cancel();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 1) {
            if (!this.MediaDescriptionCompat || TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem)) {
                this.read = 0;
            } else {
                this.read = 2;
            }
        }
        write(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, (CharSequence) null));
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(TextView textView, CharSequence charSequence) {
        return SwitchCompat.setCheckable(this.MediaSessionCompat$ResultReceiverWrapper) && this.MediaSessionCompat$ResultReceiverWrapper.isEnabled() && (this.read != this.MediaBrowserCompat$CustomActionResultReceiver || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r18, int r19, boolean r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = 0
            r12 = 2
            r13 = 0
            r14 = 1
            if (r10 == 0) goto L_0x0065
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            r7.MediaBrowserCompat$ItemReceiver = r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r2 = r7.MediaDescriptionCompat
            android.widget.TextView r3 = r7.ParcelableVolumeInfo
            r4 = 2
            r0 = r17
            r1 = r6
            r5 = r18
            r16 = r6
            r6 = r19
            r0.read(r1, r2, r3, r4, r5, r6)
            boolean r2 = r7.IconCompatParcelizer
            android.widget.TextView r3 = r7.MediaMetadataCompat
            r4 = 1
            r1 = r16
            r0.read(r1, r2, r3, r4, r5, r6)
            r0 = r16
            p040o.Iterables.C35273.read(r15, r0)
            if (r8 == r14) goto L_0x0043
            if (r8 == r12) goto L_0x0040
            r3 = r13
            goto L_0x0046
        L_0x0040:
            android.widget.TextView r0 = r7.ParcelableVolumeInfo
            goto L_0x0045
        L_0x0043:
            android.widget.TextView r0 = r7.MediaMetadataCompat
        L_0x0045:
            r3 = r0
        L_0x0046:
            if (r9 == r14) goto L_0x004f
            if (r9 == r12) goto L_0x004c
            r5 = r13
            goto L_0x0052
        L_0x004c:
            android.widget.TextView r0 = r7.ParcelableVolumeInfo
            goto L_0x0051
        L_0x004f:
            android.widget.TextView r0 = r7.MediaMetadataCompat
        L_0x0051:
            r5 = r0
        L_0x0052:
            o.nInvokeClosureCreate$1 r6 = new o.nInvokeClosureCreate$1
            r0 = r6
            r1 = r17
            r2 = r19
            r4 = r18
            r0.<init>(r2, r3, r4, r5)
            r15.addListener(r6)
            r15.start()
            goto L_0x0098
        L_0x0065:
            if (r8 == r9) goto L_0x0098
            if (r9 == 0) goto L_0x007e
            if (r9 == r14) goto L_0x0072
            if (r9 == r12) goto L_0x006f
            r0 = r13
            goto L_0x0074
        L_0x006f:
            android.widget.TextView r0 = r7.ParcelableVolumeInfo
            goto L_0x0074
        L_0x0072:
            android.widget.TextView r0 = r7.MediaMetadataCompat
        L_0x0074:
            if (r0 == 0) goto L_0x007e
            r0.setVisibility(r11)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L_0x007e:
            if (r8 == 0) goto L_0x0096
            if (r8 == r14) goto L_0x0089
            if (r8 == r12) goto L_0x0086
            r0 = r13
            goto L_0x008b
        L_0x0086:
            android.widget.TextView r0 = r7.ParcelableVolumeInfo
            goto L_0x008b
        L_0x0089:
            android.widget.TextView r0 = r7.MediaMetadataCompat
        L_0x008b:
            if (r0 == 0) goto L_0x0096
            r1 = 4
            r0.setVisibility(r1)
            if (r8 != r14) goto L_0x0096
            r0.setText(r13)
        L_0x0096:
            r7.MediaBrowserCompat$CustomActionResultReceiver = r9
        L_0x0098:
            com.google.android.material.textfield.TextInputLayout r0 = r7.MediaSessionCompat$ResultReceiverWrapper
            r0.MediaBrowserCompat$CustomActionResultReceiver()
            com.google.android.material.textfield.TextInputLayout r0 = r7.MediaSessionCompat$ResultReceiverWrapper
            r0.MediaBrowserCompat$ItemReceiver(r10, r11)
            com.google.android.material.textfield.TextInputLayout r0 = r7.MediaSessionCompat$ResultReceiverWrapper
            r0.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nInvokeClosureCreate.write(int, int, boolean):void");
    }

    public final void MediaBrowserCompat$ItemReceiver(TextView textView, int i) {
        if (this.setHasDecor == null && this.f2611x50fd9e4a == null) {
            LinearLayout linearLayout = new LinearLayout(this.write);
            this.setHasDecor = linearLayout;
            linearLayout.setOrientation(0);
            this.MediaSessionCompat$ResultReceiverWrapper.addView(this.setHasDecor, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.write);
            this.f2611x50fd9e4a = frameLayout;
            this.setHasDecor.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.setHasDecor.addView(new Space(this.write), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaBrowserCompat$ItemReceiver();
            }
        }
        if (i == 0 || i == 1) {
            this.f2611x50fd9e4a.setVisibility(0);
            this.f2611x50fd9e4a.addView(textView);
            this.PlaybackStateCompat$CustomAction++;
        } else {
            this.setHasDecor.addView(textView, i);
        }
        this.setHasDecor.setVisibility(0);
        this.Keep++;
    }

    public final void read(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.setHasDecor != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.f2611x50fd9e4a) == null) {
                this.setHasDecor.removeView(textView);
            } else {
                int i2 = this.PlaybackStateCompat$CustomAction - 1;
                this.PlaybackStateCompat$CustomAction = i2;
                if (i2 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.f2611x50fd9e4a.removeView(textView);
            }
            int i3 = this.Keep - 1;
            this.Keep = i3;
            LinearLayout linearLayout = this.setHasDecor;
            if (i3 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final boolean read() {
        if (this.read != 1 || this.MediaMetadataCompat == null || TextUtils.isEmpty(this.RatingCompat)) {
            return false;
        }
        return true;
    }

    private void read(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(zzlz.IconCompatParcelizer);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.PlaybackStateCompat, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(zzlz.MediaBrowserCompat$CustomActionResultReceiver);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if ((this.setHasDecor == null || this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver == null) ? false : true) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver(this.setHasDecor, SwitchCompat.MediaSessionCompat$QueueItem(this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver), 0, SwitchCompat.ParcelableVolumeInfo(this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver), 0);
        }
    }
}
