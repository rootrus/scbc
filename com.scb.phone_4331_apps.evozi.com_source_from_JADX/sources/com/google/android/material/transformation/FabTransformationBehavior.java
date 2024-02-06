package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment;
import p040o.FragmentBuilder_BindInvestmentFundDetailFragment;
import p040o.SwitchCompat;
import p040o.nClosureSetGlobal;
import p040o.nContextSendMessage;
import p040o.nDeviceSetConfig;
import p040o.zzlz;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();
    private final RectF MediaBrowserCompat$MediaItem = new RectF();
    private final RectF read = new RectF();
    private final int[] write = new int[2];

    /* access modifiers changed from: protected */
    public abstract read MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean read(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int i = ((FloatingActionButton) view2).write.IconCompatParcelizer;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final void IconCompatParcelizer(CoordinatorLayout.read read2) {
        if (read2.read == 0) {
            read2.read = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026c A[LOOP:0: B:80:0x026a->B:81:0x026c, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet IconCompatParcelizer(android.view.View r21, android.view.View r22, boolean r23, boolean r24) {
        /*
            r20 = this;
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            android.content.Context r0 = r22.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$read r14 = r10.MediaBrowserCompat$CustomActionResultReceiver((android.content.Context) r0, (boolean) r13)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 0
            r7 = 1
            r6 = 0
            r1 = 21
            if (r0 < r1) goto L_0x0058
            float r0 = p040o.SwitchCompat.MediaBrowserCompat$SearchResultReceiver(r22)
            float r1 = p040o.SwitchCompat.MediaBrowserCompat$SearchResultReceiver(r21)
            float r0 = r0 - r1
            if (r13 == 0) goto L_0x003f
            if (r24 != 0) goto L_0x0034
            float r0 = -r0
            r12.setTranslationZ(r0)
        L_0x0034:
            android.util.Property r0 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r7]
            r1[r6] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r12, r0, r1)
            goto L_0x004a
        L_0x003f:
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r7]
            float r0 = -r0
            r2[r6] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r12, r1, r2)
        L_0x004a:
            o.nClosureSetGlobal r1 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "elevation"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r1 = r1.write(r2)
            r1.write(r0)
            r15.add(r0)
        L_0x0058:
            android.graphics.RectF r0 = r10.read
            o.FragmentBuilder_BindInvestmentFundDetailFragment r1 = r14.read
            float r1 = r10.MediaBrowserCompat$ItemReceiver(r11, r12, r1)
            o.FragmentBuilder_BindInvestmentFundDetailFragment r2 = r14.read
            float r2 = r10.IconCompatParcelizer(r11, r12, r2)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x009a
            int r3 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x009a
            if (r13 == 0) goto L_0x0074
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0078
        L_0x0074:
            if (r13 != 0) goto L_0x0089
            if (r3 <= 0) goto L_0x0089
        L_0x0078:
            o.nClosureSetGlobal r3 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "translationXCurveUpwards"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r3 = r3.write(r4)
            o.nClosureSetGlobal r4 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = "translationYCurveUpwards"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r4 = r4.write(r5)
            goto L_0x00aa
        L_0x0089:
            o.nClosureSetGlobal r3 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "translationXCurveDownwards"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r3 = r3.write(r4)
            o.nClosureSetGlobal r4 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = "translationYCurveDownwards"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r4 = r4.write(r5)
            goto L_0x00aa
        L_0x009a:
            o.nClosureSetGlobal r3 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "translationXLinear"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r3 = r3.write(r4)
            o.nClosureSetGlobal r4 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = "translationYLinear"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r4 = r4.write(r5)
        L_0x00aa:
            if (r13 == 0) goto L_0x00f4
            if (r24 != 0) goto L_0x00b6
            float r5 = -r1
            r12.setTranslationX(r5)
            float r5 = -r2
            r12.setTranslationY(r5)
        L_0x00b6:
            android.util.Property r5 = android.view.View.TRANSLATION_X
            r16 = r9
            float[] r9 = new float[r7]
            r9[r6] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r9)
            android.util.Property r9 = android.view.View.TRANSLATION_Y
            r17 = r5
            float[] r5 = new float[r7]
            r5[r6] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r9, r5)
            float r1 = -r1
            float r2 = -r2
            float r1 = MediaBrowserCompat$ItemReceiver(r14, r3, r1, r8)
            float r2 = MediaBrowserCompat$ItemReceiver(r14, r4, r2, r8)
            android.graphics.Rect r9 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r12.getWindowVisibleDisplayFrame(r9)
            android.graphics.RectF r8 = r10.read
            r8.set(r9)
            android.graphics.RectF r9 = r10.MediaBrowserCompat$MediaItem
            r10.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r12, (android.graphics.RectF) r9)
            r9.offset(r1, r2)
            r9.intersect(r8)
            r0.set(r9)
            r1 = r5
            r5 = r17
            goto L_0x010c
        L_0x00f4:
            r16 = r9
            android.util.Property r5 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r7]
            float r1 = -r1
            r8[r6] = r1
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r8)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r8 = new float[r7]
            float r2 = -r2
            r8[r6] = r2
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r12, r1, r8)
        L_0x010c:
            r3.write(r5)
            r4.write(r1)
            r15.add(r5)
            r15.add(r1)
            float r8 = r0.width()
            float r9 = r0.height()
            boolean r5 = r12 instanceof p040o.nDeviceSetConfig
            if (r5 == 0) goto L_0x0176
            boolean r0 = r11 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0176
            r0 = r12
            o.nDeviceSetConfig r0 = (p040o.nDeviceSetConfig) r0
            r1 = r11
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L_0x0176
            r1.mutate()
            r2 = 255(0xff, float:3.57E-43)
            if (r13 == 0) goto L_0x014b
            if (r24 != 0) goto L_0x0140
            r1.setAlpha(r2)
        L_0x0140:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r2 = p040o.nContextDump.MediaBrowserCompat$ItemReceiver
            int[] r3 = new int[r7]
            r3[r6] = r6
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(r1, r2, r3)
            goto L_0x0155
        L_0x014b:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r3 = p040o.nContextDump.MediaBrowserCompat$ItemReceiver
            int[] r4 = new int[r7]
            r4[r6] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(r1, r3, r4)
        L_0x0155:
            com.google.android.material.transformation.FabTransformationBehavior$5 r3 = new com.google.android.material.transformation.FabTransformationBehavior$5
            r3.<init>(r12)
            r2.addUpdateListener(r3)
            o.nClosureSetGlobal r3 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "iconFade"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r3 = r3.write(r4)
            r3.write(r2)
            r15.add(r2)
            com.google.android.material.transformation.FabTransformationBehavior$4 r2 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r2.<init>(r1)
            r4 = r16
            r4.add(r2)
            goto L_0x0178
        L_0x0176:
            r4 = r16
        L_0x0178:
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r16 = r4
            r4 = r24
            r17 = r5
            r5 = r14
            r10 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r8
            r18 = 0
            r8 = r15
            r10 = r9
            r19 = r16
            r9 = r19
            r0.IconCompatParcelizer(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r17 == 0) goto L_0x01e5
            r0 = r12
            o.nDeviceSetConfig r0 = (p040o.nDeviceSetConfig) r0
            android.content.res.ColorStateList r1 = p040o.SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(r21)
            if (r1 == 0) goto L_0x01af
            int[] r2 = r21.getDrawableState()
            int r3 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r2, r3)
            goto L_0x01b0
        L_0x01af:
            r6 = 0
        L_0x01b0:
            if (r13 == 0) goto L_0x01c7
            if (r24 != 0) goto L_0x01b7
            r0.setCircularRevealScrimColor(r6)
        L_0x01b7:
            android.util.Property<o.nDeviceSetConfig, java.lang.Integer> r1 = p040o.nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            int[] r2 = new int[r10]
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r6
            r4 = 0
            r2[r4] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r2)
            goto L_0x01d2
        L_0x01c7:
            r4 = 0
            android.util.Property<o.nDeviceSetConfig, java.lang.Integer> r1 = p040o.nDeviceSetConfig$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            int[] r2 = new int[r10]
            r2[r4] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r2)
        L_0x01d2:
            o.nClosureSetArg r1 = p040o.nClosureSetArg.MediaBrowserCompat$ItemReceiver
            r0.setEvaluator(r1)
            o.nClosureSetGlobal r1 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "color"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r1 = r1.write(r2)
            r1.write(r0)
            r15.add(r0)
        L_0x01e5:
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0254
            if (r17 == 0) goto L_0x01ef
            int r1 = p040o.nDeviceCreate.read
            if (r1 == 0) goto L_0x0254
        L_0x01ef:
            int r1 = p040o.nAllocationSetSurface.MediaDescriptionCompat.mtrl_child_content_container
            android.view.View r1 = r12.findViewById(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0200
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x021d
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x021d
        L_0x0200:
            boolean r1 = r12 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r1 != 0) goto L_0x020e
            boolean r1 = r12 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r1 != 0) goto L_0x020e
            if (r0 == 0) goto L_0x021d
            r2 = r12
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x021d
        L_0x020e:
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x021d
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x021d:
            if (r2 == 0) goto L_0x0254
            if (r13 == 0) goto L_0x023a
            if (r24 != 0) goto L_0x022c
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p040o.nContextDestroy.MediaBrowserCompat$ItemReceiver
            java.lang.Float r1 = java.lang.Float.valueOf(r18)
            r0.set(r2, r1)
        L_0x022c:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p040o.nContextDestroy.MediaBrowserCompat$ItemReceiver
            float[] r1 = new float[r10]
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r1[r4] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
            goto L_0x0245
        L_0x023a:
            r4 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p040o.nContextDestroy.MediaBrowserCompat$ItemReceiver
            float[] r1 = new float[r10]
            r1[r4] = r18
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
        L_0x0245:
            o.nClosureSetGlobal r1 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "contentFade"
            o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment$read r1 = r1.write(r2)
            r1.write(r0)
            r15.add(r0)
            goto L_0x0255
        L_0x0254:
            r4 = 0
        L_0x0255:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p040o.Iterables.C35273.read(r0, r15)
            com.google.android.material.transformation.FabTransformationBehavior$1 r1 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r1.<init>(r13, r12, r11)
            r0.addListener(r1)
            int r1 = r19.size()
            r6 = r4
        L_0x026a:
            if (r6 >= r1) goto L_0x027a
            r2 = r19
            java.lang.Object r3 = r2.get(r6)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r6 = r6 + 1
            goto L_0x026a
        L_0x027a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.IconCompatParcelizer(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    private void IconCompatParcelizer(View view, View view2, boolean z, boolean z2, read read2, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read3;
        List<Animator> list3;
        Animator animator;
        float f3;
        float f4;
        View view3 = view;
        View view4 = view2;
        read read4 = read2;
        List<Animator> list4 = list;
        if (view4 instanceof nDeviceSetConfig) {
            final nDeviceSetConfig ndevicesetconfig = (nDeviceSetConfig) view4;
            FragmentBuilder_BindInvestmentFundDetailFragment fragmentBuilder_BindInvestmentFundDetailFragment = read4.read;
            RectF rectF = this.read;
            RectF rectF2 = this.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$CustomActionResultReceiver(view3, rectF);
            MediaBrowserCompat$CustomActionResultReceiver(view4, rectF2);
            rectF2.offset(-MediaBrowserCompat$ItemReceiver(view3, view4, fragmentBuilder_BindInvestmentFundDetailFragment), BitmapDescriptorFactory.HUE_RED);
            float centerX = rectF.centerX() - rectF2.left;
            FragmentBuilder_BindInvestmentFundDetailFragment fragmentBuilder_BindInvestmentFundDetailFragment2 = read4.read;
            RectF rectF3 = this.read;
            RectF rectF4 = this.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$CustomActionResultReceiver(view3, rectF3);
            MediaBrowserCompat$CustomActionResultReceiver(view4, rectF4);
            rectF4.offset(BitmapDescriptorFactory.HUE_RED, -IconCompatParcelizer(view3, view4, fragmentBuilder_BindInvestmentFundDetailFragment2));
            float centerY = rectF3.centerY() - rectF4.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view3;
            Rect rect = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (SwitchCompat.setCheckable(floatingActionButton)) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.write(rect);
            }
            float width = ((float) this.MediaBrowserCompat$CustomActionResultReceiver.width()) / 2.0f;
            FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read write2 = read4.MediaBrowserCompat$CustomActionResultReceiver.write("expansion");
            if (z) {
                if (!z2) {
                    ndevicesetconfig.setRevealInfo(new nDeviceSetConfig.read(centerX, centerY, width));
                }
                if (z2) {
                    f3 = f2;
                    width = ndevicesetconfig.read().read;
                    f4 = f;
                } else {
                    f4 = f;
                    f3 = f2;
                }
                Animator write3 = nContextSendMessage.write(ndevicesetconfig, centerX, centerY, AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(centerX, centerY, f4, f3));
                write3.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        nDeviceSetConfig.read read = nDeviceSetConfig.this.read();
                        read.read = Float.MAX_VALUE;
                        nDeviceSetConfig.this.setRevealInfo(read);
                    }
                });
                write(view2, write2.read, (int) centerX, (int) centerY, width, list);
                animator = write3;
                list3 = list4;
                read3 = write2;
            } else {
                float f5 = ndevicesetconfig.read().read;
                Animator write4 = nContextSendMessage.write(ndevicesetconfig, centerX, centerY, width);
                int i = (int) centerX;
                int i2 = (int) centerY;
                int i3 = i;
                write(view2, write2.read, i, i2, f5, list);
                long j = write2.read;
                long j2 = write2.MediaBrowserCompat$CustomActionResultReceiver;
                nClosureSetGlobal nclosuresetglobal = read4.MediaBrowserCompat$CustomActionResultReceiver;
                int size = nclosuresetglobal.write.size();
                FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read5 = write2;
                Animator animator2 = write4;
                long j3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read6 = (FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read) nclosuresetglobal.write.read[(i4 << 1) + 1];
                    j3 = Math.max(j3, read6.read + read6.MediaBrowserCompat$CustomActionResultReceiver);
                    i4++;
                    size = size;
                    read5 = read5;
                    List<Animator> list5 = list;
                    nclosuresetglobal = nclosuresetglobal;
                }
                FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read7 = read5;
                if (Build.VERSION.SDK_INT >= 21) {
                    long j4 = j + j2;
                    if (j4 < j3) {
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view4, i3, i2, width, width);
                        createCircularReveal.setStartDelay(j4);
                        createCircularReveal.setDuration(j3 - j4);
                        list3 = list;
                        list3.add(createCircularReveal);
                        animator = animator2;
                        read3 = read7;
                    }
                }
                list3 = list;
                animator = animator2;
                read3 = read7;
            }
            read3.write(animator);
            list3.add(animator);
            list2.add(new AnimatorListenerAdapter(ndevicesetconfig) {
                private /* synthetic */ nDeviceSetConfig MediaBrowserCompat$ItemReceiver;

                public final void onAnimationStart(
/*
Method generation error in method: o.nContextSendMessage.3.onAnimationStart(android.animation.Animator):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.nContextSendMessage.3.onAnimationStart(android.animation.Animator):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onAnimationEnd(
/*
Method generation error in method: o.nContextSendMessage.3.onAnimationEnd(android.animation.Animator):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.nContextSendMessage.3.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    private float MediaBrowserCompat$ItemReceiver(View view, View view2, FragmentBuilder_BindInvestmentFundDetailFragment fragmentBuilder_BindInvestmentFundDetailFragment) {
        RectF rectF = this.read;
        RectF rectF2 = this.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver(view, rectF);
        MediaBrowserCompat$CustomActionResultReceiver(view2, rectF2);
        return (rectF2.centerX() - rectF.centerX()) + BitmapDescriptorFactory.HUE_RED;
    }

    private float IconCompatParcelizer(View view, View view2, FragmentBuilder_BindInvestmentFundDetailFragment fragmentBuilder_BindInvestmentFundDetailFragment) {
        RectF rectF = this.read;
        RectF rectF2 = this.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver(view, rectF);
        MediaBrowserCompat$CustomActionResultReceiver(view2, rectF2);
        return (rectF2.centerY() - rectF.centerY()) + BitmapDescriptorFactory.HUE_RED;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.write;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private static void write(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    public static class read {
        public nClosureSetGlobal MediaBrowserCompat$CustomActionResultReceiver;
        public FragmentBuilder_BindInvestmentFundDetailFragment read;

        protected read() {
        }
    }

    private static float MediaBrowserCompat$ItemReceiver(read read2, FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read3, float f, float f2) {
        long j = read3.read;
        long j2 = read3.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read write2 = read2.MediaBrowserCompat$CustomActionResultReceiver.write("expansion");
        float f3 = ((float) (((write2.read + write2.MediaBrowserCompat$CustomActionResultReceiver) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = read3.write;
        if (timeInterpolator == null) {
            timeInterpolator = zzlz.read;
        }
        return f + (timeInterpolator.getInterpolation(f3) * (BitmapDescriptorFactory.HUE_RED - f));
    }
}
