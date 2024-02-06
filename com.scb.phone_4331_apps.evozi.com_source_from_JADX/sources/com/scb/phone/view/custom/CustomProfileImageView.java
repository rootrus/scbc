package com.scb.phone.view.custom;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomDoubleCircleBorderView;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class CustomProfileImageView extends FrameLayout implements CustomDoubleCircleBorderView.IconCompatParcelizer {
    private int[] IconCompatParcelizer;
    private float MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int[] MediaBrowserCompat$MediaItem;
    private int[] MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public ImageView ivAvatar;
    public int read;
    @BindView
    public CustomDoubleCircleBorderView vBorder;
    private read write;

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomProfileImageView(Context context) {
        this(context, (AttributeSet) null);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomProfileImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0184, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        write();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018d, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0190, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0186 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CustomProfileImageView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
            r10.<init>(r11, r12, r13)
            r13 = 0
            int[] r1 = new int[r13]
            r10.MediaBrowserCompat$SearchResultReceiver = r1
            int[] r1 = new int[r13]
            r10.MediaBrowserCompat$MediaItem = r1
            int[] r1 = new int[r13]
            r10.IconCompatParcelizer = r1
            android.content.Context r1 = r10.getContext()
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r0)
            int r0 = p040o.AlertController$RecycleListView.read((android.content.Context) r1)
            r10.MediaBrowserCompat$ItemReceiver = r0
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r11.getSystemService(r0)
            if (r0 == 0) goto L_0x01c9
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131493667(0x7f0c0323, float:1.861082E38)
            r2 = r10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 1
            r0.inflate(r1, r2, r3)
            r0 = r10
            android.view.View r0 = (android.view.View) r0
            butterknife.ButterKnife.IconCompatParcelizer(r0)
            if (r12 == 0) goto L_0x0191
            int[] r0 = p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomProfileImageView
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r0, r13, r13)
            int r11 = p040o.AlertController$RecycleListView.read((android.content.Context) r11)     // Catch:{ Exception -> 0x0186 }
            r0 = 7
            int r11 = r12.getResourceId(r0, r11)     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$ItemReceiver = r11     // Catch:{ Exception -> 0x0186 }
            r11 = 5
            int r0 = r12.getResourceId(r11, r13)     // Catch:{ Exception -> 0x0186 }
            r1 = 2131100257(0x7f060261, float:1.781289E38)
            java.lang.String r2 = "color"
            r4 = 94842723(0x5a72f63, float:1.5722012E-35)
            java.lang.String r5 = "array"
            r6 = 93090393(0x58c7259, float:1.3207541E-35)
            if (r0 <= 0) goto L_0x00a3
            android.content.res.Resources r7 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r7 = r7.getResourceTypeName(r0)     // Catch:{ Exception -> 0x0186 }
            if (r7 == 0) goto L_0x00a3
            int r8 = r7.hashCode()     // Catch:{ Exception -> 0x0186 }
            if (r8 == r6) goto L_0x008e
            if (r8 != r4) goto L_0x00a3
            boolean r0 = r7.equals(r2)     // Catch:{ Exception -> 0x0186 }
            if (r0 == 0) goto L_0x00a3
            int[] r0 = new int[r3]     // Catch:{ Exception -> 0x0186 }
            android.content.Context r7 = r10.getContext()     // Catch:{ Exception -> 0x0186 }
            int r7 = p040o.setLastBaselineToBottomHeight.read(r7, r1)     // Catch:{ Exception -> 0x0186 }
            int r11 = r12.getColor(r11, r7)     // Catch:{ Exception -> 0x0186 }
            r0[r13] = r11     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$SearchResultReceiver = r0     // Catch:{ Exception -> 0x0186 }
            goto L_0x00a3
        L_0x008e:
            boolean r11 = r7.equals(r5)     // Catch:{ Exception -> 0x0186 }
            if (r11 == 0) goto L_0x00a3
            android.content.res.Resources r11 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            int[] r11 = r11.getIntArray(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "resources.getIntArray(activeColorsResId)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$SearchResultReceiver = r11     // Catch:{ Exception -> 0x0186 }
        L_0x00a3:
            r11 = 6
            int r0 = r12.getResourceId(r11, r13)     // Catch:{ Exception -> 0x0186 }
            if (r0 <= 0) goto L_0x00ea
            android.content.res.Resources r7 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r7 = r7.getResourceTypeName(r0)     // Catch:{ Exception -> 0x0186 }
            if (r7 == 0) goto L_0x00ea
            int r8 = r7.hashCode()     // Catch:{ Exception -> 0x0186 }
            if (r8 == r6) goto L_0x00d5
            if (r8 != r4) goto L_0x00ea
            boolean r0 = r7.equals(r2)     // Catch:{ Exception -> 0x0186 }
            if (r0 == 0) goto L_0x00ea
            int[] r0 = new int[r3]     // Catch:{ Exception -> 0x0186 }
            android.content.Context r7 = r10.getContext()     // Catch:{ Exception -> 0x0186 }
            int r7 = p040o.setLastBaselineToBottomHeight.read(r7, r1)     // Catch:{ Exception -> 0x0186 }
            int r11 = r12.getColor(r11, r7)     // Catch:{ Exception -> 0x0186 }
            r0[r13] = r11     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$MediaItem = r0     // Catch:{ Exception -> 0x0186 }
            goto L_0x00ea
        L_0x00d5:
            boolean r11 = r7.equals(r5)     // Catch:{ Exception -> 0x0186 }
            if (r11 == 0) goto L_0x00ea
            android.content.res.Resources r11 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            int[] r11 = r11.getIntArray(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "resources.getIntArray(inactiveColorResId)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$MediaItem = r11     // Catch:{ Exception -> 0x0186 }
        L_0x00ea:
            r11 = 4
            int r0 = r12.getResourceId(r11, r13)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r7 = "vBorder"
            if (r0 <= 0) goto L_0x014b
            android.content.res.Resources r8 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            java.lang.String r8 = r8.getResourceTypeName(r0)     // Catch:{ Exception -> 0x0186 }
            if (r8 == 0) goto L_0x014b
            int r9 = r8.hashCode()     // Catch:{ Exception -> 0x0186 }
            if (r9 == r6) goto L_0x012a
            if (r9 != r4) goto L_0x014b
            boolean r0 = r8.equals(r2)     // Catch:{ Exception -> 0x0186 }
            if (r0 == 0) goto L_0x014b
            int[] r0 = new int[r3]     // Catch:{ Exception -> 0x0186 }
            android.content.Context r2 = r10.getContext()     // Catch:{ Exception -> 0x0186 }
            int r1 = p040o.setLastBaselineToBottomHeight.read(r2, r1)     // Catch:{ Exception -> 0x0186 }
            int r11 = r12.getColor(r11, r1)     // Catch:{ Exception -> 0x0186 }
            r0[r13] = r11     // Catch:{ Exception -> 0x0186 }
            r10.IconCompatParcelizer = r0     // Catch:{ Exception -> 0x0186 }
            com.scb.phone.view.custom.CustomDoubleCircleBorderView r11 = r10.vBorder     // Catch:{ Exception -> 0x0186 }
            if (r11 != 0) goto L_0x0124
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x0186 }
        L_0x0124:
            int[] r0 = r10.IconCompatParcelizer     // Catch:{ Exception -> 0x0186 }
            r11.setInnerColors(r0)     // Catch:{ Exception -> 0x0186 }
            goto L_0x014b
        L_0x012a:
            boolean r11 = r8.equals(r5)     // Catch:{ Exception -> 0x0186 }
            if (r11 == 0) goto L_0x014b
            android.content.res.Resources r11 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            int[] r11 = r11.getIntArray(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "resources.getIntArray(innerColorsResId)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x0186 }
            r10.IconCompatParcelizer = r11     // Catch:{ Exception -> 0x0186 }
            com.scb.phone.view.custom.CustomDoubleCircleBorderView r11 = r10.vBorder     // Catch:{ Exception -> 0x0186 }
            if (r11 != 0) goto L_0x0146
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x0186 }
        L_0x0146:
            int[] r0 = r10.IconCompatParcelizer     // Catch:{ Exception -> 0x0186 }
            r11.setInnerColors(r0)     // Catch:{ Exception -> 0x0186 }
        L_0x014b:
            r11 = 3
            int r11 = r12.getDimensionPixelSize(r11, r13)     // Catch:{ Exception -> 0x0186 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0186 }
            r10.MediaBrowserCompat$CustomActionResultReceiver = r11     // Catch:{ Exception -> 0x0186 }
            com.scb.phone.view.custom.CustomDoubleCircleBorderView r0 = r10.vBorder     // Catch:{ Exception -> 0x0186 }
            if (r0 != 0) goto L_0x015a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x0186 }
        L_0x015a:
            r0.setImageWidth(r11)     // Catch:{ Exception -> 0x0186 }
            r11 = 2
            int r11 = r12.getDimensionPixelSize(r11, r13)     // Catch:{ Exception -> 0x0186 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0186 }
            com.scb.phone.view.custom.CustomDoubleCircleBorderView r0 = r10.vBorder     // Catch:{ Exception -> 0x0186 }
            if (r0 != 0) goto L_0x016a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x0186 }
        L_0x016a:
            r0.setBorderWidth(r11)     // Catch:{ Exception -> 0x0186 }
            int r11 = r12.getInt(r13, r13)     // Catch:{ Exception -> 0x0186 }
            long r0 = (long) r11     // Catch:{ Exception -> 0x0186 }
            com.scb.phone.view.custom.CustomDoubleCircleBorderView r11 = r10.vBorder     // Catch:{ Exception -> 0x0186 }
            if (r11 != 0) goto L_0x0179
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x0186 }
        L_0x0179:
            r11.setDuration(r0)     // Catch:{ Exception -> 0x0186 }
            int r11 = r12.getInt(r3, r13)     // Catch:{ Exception -> 0x0186 }
            r10.setBorderState(r11)     // Catch:{ Exception -> 0x0186 }
            goto L_0x0189
        L_0x0184:
            r11 = move-exception
            goto L_0x018d
        L_0x0186:
            r10.write()     // Catch:{ all -> 0x0184 }
        L_0x0189:
            r12.recycle()
            goto L_0x0194
        L_0x018d:
            r12.recycle()
            throw r11
        L_0x0191:
            r10.write()
        L_0x0194:
            float r11 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            java.lang.String r12 = "ivAvatar"
            if (r11 <= 0) goto L_0x01bc
            android.widget.ImageView r11 = r10.ivAvatar
            if (r11 != 0) goto L_0x01a4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x01a4:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            float r13 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = (int) r13
            r11.width = r13
            float r13 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = (int) r13
            r11.height = r13
            android.widget.ImageView r13 = r10.ivAvatar
            if (r13 != 0) goto L_0x01b9
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x01b9:
            r13.setLayoutParams(r11)
        L_0x01bc:
            android.widget.ImageView r11 = r10.ivAvatar
            if (r11 != 0) goto L_0x01c3
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x01c3:
            int r12 = r10.MediaBrowserCompat$ItemReceiver
            r11.setImageResource(r12)
            return
        L_0x01c9:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type android.view.LayoutInflater"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.CustomProfileImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setBorderState(int i) {
        this.read = i;
        if (i == 0) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView = this.vBorder;
            if (customDoubleCircleBorderView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView.setVisibility(4);
        } else if (i == 1) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView2 = this.vBorder;
            if (customDoubleCircleBorderView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView2.setVisibility(0);
            CustomDoubleCircleBorderView customDoubleCircleBorderView3 = this.vBorder;
            if (customDoubleCircleBorderView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView3.setOuterColors(this.MediaBrowserCompat$MediaItem);
            CustomDoubleCircleBorderView customDoubleCircleBorderView4 = this.vBorder;
            if (customDoubleCircleBorderView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView4.setInsightIconDrawableResId(R.drawable.ic_insight_inactive);
            CustomDoubleCircleBorderView customDoubleCircleBorderView5 = this.vBorder;
            if (customDoubleCircleBorderView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView5.setRotation(90.0f);
            CustomDoubleCircleBorderView customDoubleCircleBorderView6 = this.vBorder;
            if (customDoubleCircleBorderView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView6.setDefaultBorder(false);
        } else if (i == 2) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView7 = this.vBorder;
            if (customDoubleCircleBorderView7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView7.setVisibility(0);
            CustomDoubleCircleBorderView customDoubleCircleBorderView8 = this.vBorder;
            if (customDoubleCircleBorderView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView8.setOuterColors(this.MediaBrowserCompat$SearchResultReceiver);
            CustomDoubleCircleBorderView customDoubleCircleBorderView9 = this.vBorder;
            if (customDoubleCircleBorderView9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView9.setInsightIconDrawableResId(R.drawable.ic_insight_active);
            CustomDoubleCircleBorderView customDoubleCircleBorderView10 = this.vBorder;
            if (customDoubleCircleBorderView10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView10.setRotation(BitmapDescriptorFactory.HUE_RED);
            CustomDoubleCircleBorderView customDoubleCircleBorderView11 = this.vBorder;
            if (customDoubleCircleBorderView11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView11.setDefaultBorder(false);
        } else if (i == 3) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView12 = this.vBorder;
            if (customDoubleCircleBorderView12 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView12.setVisibility(0);
            CustomDoubleCircleBorderView customDoubleCircleBorderView13 = this.vBorder;
            if (customDoubleCircleBorderView13 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView13.setOuterColors(this.MediaBrowserCompat$SearchResultReceiver);
            CustomDoubleCircleBorderView customDoubleCircleBorderView14 = this.vBorder;
            if (customDoubleCircleBorderView14 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView14.setInsightIconDrawableResId(R.drawable.ic_insight_active);
            CustomDoubleCircleBorderView customDoubleCircleBorderView15 = this.vBorder;
            if (customDoubleCircleBorderView15 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView15.setRotation(BitmapDescriptorFactory.HUE_RED);
            CustomDoubleCircleBorderView customDoubleCircleBorderView16 = this.vBorder;
            if (customDoubleCircleBorderView16 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView16.setDefaultBorder(false);
            CustomDoubleCircleBorderView customDoubleCircleBorderView17 = this.vBorder;
            if (customDoubleCircleBorderView17 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView17.write();
        } else if (i == 4) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView18 = this.vBorder;
            if (customDoubleCircleBorderView18 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView18.setVisibility(0);
            CustomDoubleCircleBorderView customDoubleCircleBorderView19 = this.vBorder;
            if (customDoubleCircleBorderView19 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView19.setOuterColors(this.MediaBrowserCompat$MediaItem);
            CustomDoubleCircleBorderView customDoubleCircleBorderView20 = this.vBorder;
            if (customDoubleCircleBorderView20 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView20.setInsightIconDrawableResId(R.drawable.ic_insight_inactive);
            CustomDoubleCircleBorderView customDoubleCircleBorderView21 = this.vBorder;
            if (customDoubleCircleBorderView21 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView21.setRotation(90.0f);
            CustomDoubleCircleBorderView customDoubleCircleBorderView22 = this.vBorder;
            if (customDoubleCircleBorderView22 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView22.setDefaultBorder(false);
            CustomDoubleCircleBorderView customDoubleCircleBorderView23 = this.vBorder;
            if (customDoubleCircleBorderView23 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView23.write();
        } else if (i == 5) {
            CustomDoubleCircleBorderView customDoubleCircleBorderView24 = this.vBorder;
            if (customDoubleCircleBorderView24 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView24.setVisibility(0);
            CustomDoubleCircleBorderView customDoubleCircleBorderView25 = this.vBorder;
            if (customDoubleCircleBorderView25 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView25.setOuterColors(new int[]{setLastBaselineToBottomHeight.read(getContext(), R.color.f71012131100257)});
            CustomDoubleCircleBorderView customDoubleCircleBorderView26 = this.vBorder;
            if (customDoubleCircleBorderView26 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
            }
            customDoubleCircleBorderView26.setDefaultBorder(true);
        }
    }

    public final void setIvAvatar(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.ivAvatar = imageView;
    }

    public final void setVBorder(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        onGetStartedClick.write((Object) customDoubleCircleBorderView, "<set-?>");
        this.vBorder = customDoubleCircleBorderView;
    }

    private final void write() {
        this.MediaBrowserCompat$ItemReceiver = 0;
        int[] iArr = {setLastBaselineToBottomHeight.read(getContext(), R.color.f71012131100257)};
        CustomDoubleCircleBorderView customDoubleCircleBorderView = this.vBorder;
        if (customDoubleCircleBorderView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView.setOuterColors(iArr);
        this.IconCompatParcelizer = new int[]{setLastBaselineToBottomHeight.read(getContext(), R.color.f71012131100257)};
        CustomDoubleCircleBorderView customDoubleCircleBorderView2 = this.vBorder;
        if (customDoubleCircleBorderView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView2.setInnerColors(this.IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        CustomDoubleCircleBorderView customDoubleCircleBorderView3 = this.vBorder;
        if (customDoubleCircleBorderView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView3.setImageWidth(BitmapDescriptorFactory.HUE_RED);
        CustomDoubleCircleBorderView customDoubleCircleBorderView4 = this.vBorder;
        if (customDoubleCircleBorderView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView4.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
        CustomDoubleCircleBorderView customDoubleCircleBorderView5 = this.vBorder;
        if (customDoubleCircleBorderView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView5.setDuration(0);
        setBorderState(0);
    }

    public final void setImageUrl(String str) {
        getContext();
        Context context = getContext();
        onGetStartedClick.IconCompatParcelizer((Object) context, "context");
        int read2 = AlertController$RecycleListView.read(context);
        ImageView imageView = this.ivAvatar;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivAvatar");
        }
        FragmentBuilder_BindDepositSelectorFragment.read(read2, imageView, str);
    }

    public final void setImageResource(Integer num) {
        if (num != null) {
            ImageView imageView = this.ivAvatar;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivAvatar");
            }
            imageView.setImageResource(num.intValue());
        }
    }

    public final void IconCompatParcelizer() {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.f64512130837507);
        CustomDoubleCircleBorderView customDoubleCircleBorderView = this.vBorder;
        if (customDoubleCircleBorderView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        loadAnimator.setTarget(customDoubleCircleBorderView);
        loadAnimator.start();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        read read2 = this.write;
        if (read2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("borderAnimationListener");
        }
        read2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void setBorderAnimationListener(read read2, boolean z) {
        onGetStartedClick.write((Object) read2, "borderAnimationListener");
        this.write = read2;
        CustomDoubleCircleBorderView customDoubleCircleBorderView = this.vBorder;
        if (customDoubleCircleBorderView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vBorder");
        }
        customDoubleCircleBorderView.setBorderAnimationListener(this, z);
    }
}
