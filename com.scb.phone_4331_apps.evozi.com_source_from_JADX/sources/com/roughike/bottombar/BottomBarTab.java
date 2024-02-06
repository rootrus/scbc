package com.roughike.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.FragmentBuilder_BindPdfViewerFragment;
import p040o.FragmentBuilder_BindPersonalLimitFragment;
import p040o.SwitchCompat;
import p040o.ZHEMM$MediaBrowserCompat$ItemReceiver;
import p040o.ZHEMM$MediaBrowserCompat$SearchResultReceiver;
import p040o.setSwitchPadding;

public class BottomBarTab extends LinearLayout {
    private boolean AlertController$RecycleListView;
    BottomBarBadge IconCompatParcelizer;
    private int Keep;
    int MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: package-private */
    public AppCompatImageView MediaBrowserCompat$ItemReceiver;
    String MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    TextView f2525x50fd9e4a;
    boolean MediaDescriptionCompat;
    int MediaMetadataCompat;
    private float MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    IconCompatParcelizer MediaSessionCompat$Token = IconCompatParcelizer.FIXED;
    private int ParcelableVolumeInfo;
    private final int PlaybackStateCompat;
    private float PlaybackStateCompat$CustomAction;
    Typeface RatingCompat;
    public int read;
    private final int setBackgroundResource;
    private final int setHasDecor;
    int write;

    enum IconCompatParcelizer {
        FIXED,
        SHIFTING,
        TABLET
    }

    BottomBarTab(Context context) {
        super(context);
        this.PlaybackStateCompat = FragmentBuilder_BindPdfViewerFragment.write(context, 6.0f);
        this.setHasDecor = FragmentBuilder_BindPdfViewerFragment.write(context, 8.0f);
        this.setBackgroundResource = FragmentBuilder_BindPdfViewerFragment.write(context, 16.0f);
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$1 */
    static /* synthetic */ class C10661 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.roughike.bottombar.BottomBarTab$IconCompatParcelizer[] r0 = com.roughike.bottombar.BottomBarTab.IconCompatParcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                com.roughike.bottombar.BottomBarTab$IconCompatParcelizer r1 = com.roughike.bottombar.BottomBarTab.IconCompatParcelizer.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                com.roughike.bottombar.BottomBarTab$IconCompatParcelizer r1 = com.roughike.bottombar.BottomBarTab.IconCompatParcelizer.SHIFTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.roughike.bottombar.BottomBarTab$IconCompatParcelizer r1 = com.roughike.bottombar.BottomBarTab.IconCompatParcelizer.TABLET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roughike.bottombar.BottomBarTab.C10661.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.f2525x50fd9e4a != null && this.MediaMetadataCompat != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f2525x50fd9e4a.setTextAppearance(this.MediaMetadataCompat);
            } else {
                this.f2525x50fd9e4a.setTextAppearance(getContext(), this.MediaMetadataCompat);
            }
            this.f2525x50fd9e4a.setTag(ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_appearance_id, Integer.valueOf(this.MediaMetadataCompat));
        }
    }

    public void setTitle(String str) {
        this.MediaBrowserCompat$MediaItem = str;
        TextView textView = this.f2525x50fd9e4a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setInActiveAlpha(float f) {
        this.PlaybackStateCompat$CustomAction = f;
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
            if (appCompatImageView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) appCompatImageView, f);
            }
            TextView textView = this.f2525x50fd9e4a;
            if (textView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) textView, f);
            }
        }
    }

    public void setActiveAlpha(float f) {
        this.MediaSessionCompat$QueueItem = f;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
            if (appCompatImageView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) appCompatImageView, f);
            }
            TextView textView = this.f2525x50fd9e4a;
            if (textView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) textView, f);
            }
        }
    }

    public void setInActiveColor(int i) {
        this.Keep = i;
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    public void setActiveColor(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    public void setBarColorWhenSelected(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public void setBadgeBackgroundColor(int i) {
        this.ParcelableVolumeInfo = i;
        BottomBarBadge bottomBarBadge = this.IconCompatParcelizer;
        if (bottomBarBadge != null) {
            int write2 = FragmentBuilder_BindPdfViewerFragment.write(bottomBarBadge.getContext(), 1.0f);
            ShapeDrawable MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindPersonalLimitFragment.MediaBrowserCompat$ItemReceiver(write2 * 3, i);
            bottomBarBadge.setPadding(write2, write2, write2, write2);
            if (Build.VERSION.SDK_INT >= 16) {
                bottomBarBadge.setBackground(MediaBrowserCompat$ItemReceiver2);
            } else {
                bottomBarBadge.setBackgroundDrawable(MediaBrowserCompat$ItemReceiver2);
            }
        }
    }

    public void setBadgeHidesWhenActive(boolean z) {
        this.AlertController$RecycleListView = z;
    }

    public void setBadgeCount(int i) {
        if (i <= 0) {
            BottomBarBadge bottomBarBadge = this.IconCompatParcelizer;
            if (bottomBarBadge != null) {
                BadgeContainer badgeContainer = (BadgeContainer) bottomBarBadge.getParent();
                ViewGroup viewGroup = (ViewGroup) badgeContainer.getParent();
                badgeContainer.removeView(this);
                viewGroup.removeView(badgeContainer);
                viewGroup.addView(this, this.read);
                this.IconCompatParcelizer = null;
                return;
            }
            return;
        }
        if (this.IconCompatParcelizer == null) {
            BottomBarBadge bottomBarBadge2 = new BottomBarBadge(getContext());
            this.IconCompatParcelizer = bottomBarBadge2;
            int i2 = this.ParcelableVolumeInfo;
            bottomBarBadge2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            bottomBarBadge2.setGravity(17);
            int i3 = ZHEMM$MediaBrowserCompat$SearchResultReceiver.BB_BottomBarBadge_Text;
            if (Build.VERSION.SDK_INT >= 23) {
                bottomBarBadge2.setTextAppearance(i3);
            } else {
                bottomBarBadge2.setTextAppearance(bottomBarBadge2.getContext(), i3);
            }
            int write2 = FragmentBuilder_BindPdfViewerFragment.write(bottomBarBadge2.getContext(), 1.0f);
            ShapeDrawable MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindPersonalLimitFragment.MediaBrowserCompat$ItemReceiver(write2 * 3, i2);
            bottomBarBadge2.setPadding(write2, write2, write2, write2);
            if (Build.VERSION.SDK_INT >= 16) {
                bottomBarBadge2.setBackground(MediaBrowserCompat$ItemReceiver2);
            } else {
                bottomBarBadge2.setBackgroundDrawable(MediaBrowserCompat$ItemReceiver2);
            }
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            viewGroup2.removeView(this);
            BadgeContainer badgeContainer2 = new BadgeContainer(bottomBarBadge2.getContext());
            badgeContainer2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            badgeContainer2.addView(this);
            badgeContainer2.addView(bottomBarBadge2);
            viewGroup2.addView(badgeContainer2, this.read);
            badgeContainer2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(badgeContainer2, this) {
                private /* synthetic */ BadgeContainer MediaBrowserCompat$CustomActionResultReceiver;
                private /* synthetic */ BottomBarTab MediaBrowserCompat$ItemReceiver;

                public final void onGlobalLayout(
/*
Method generation error in method: com.roughike.bottombar.BottomBarBadge.4.onGlobalLayout():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.roughike.bottombar.BottomBarBadge.4.onGlobalLayout():void, class status: UNLOADED
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
        BottomBarBadge bottomBarBadge3 = this.IconCompatParcelizer;
        bottomBarBadge3.read = i;
        bottomBarBadge3.setText(String.valueOf(i));
        if (this.MediaBrowserCompat$SearchResultReceiver && this.AlertController$RecycleListView) {
            BottomBarBadge bottomBarBadge4 = this.IconCompatParcelizer;
            bottomBarBadge4.write = false;
            SwitchCompat.write(bottomBarBadge4).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$ItemReceiver((float) BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$CustomActionResultReceiver((float) BitmapDescriptorFactory.HUE_RED).write();
        }
    }

    public void setTitleTypeface(Typeface typeface) {
        TextView textView;
        this.RatingCompat = typeface;
        if (typeface != null && (textView = this.f2525x50fd9e4a) != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        if (z) {
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem, 1.24f);
            write(this.PlaybackStateCompat, 1.0f, this.MediaSessionCompat$QueueItem);
            IconCompatParcelizer(this.Keep, this.MediaSessionCompat$ResultReceiverWrapper);
        } else {
            MediaBrowserCompat$ItemReceiver(1.0f);
            write(this.PlaybackStateCompat);
            read(1.24f);
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
            float f = this.MediaSessionCompat$QueueItem;
            AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
            if (appCompatImageView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) appCompatImageView, f);
            }
            TextView textView = this.f2525x50fd9e4a;
            if (textView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) textView, f);
            }
        }
        setSelected(true);
        BottomBarBadge bottomBarBadge = this.IconCompatParcelizer;
        if (bottomBarBadge != null && this.AlertController$RecycleListView) {
            bottomBarBadge.write = false;
            SwitchCompat.write(bottomBarBadge).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$ItemReceiver((float) BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$CustomActionResultReceiver((float) BitmapDescriptorFactory.HUE_RED).write();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        BottomBarBadge bottomBarBadge;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        boolean z2 = this.MediaSessionCompat$Token == IconCompatParcelizer.SHIFTING;
        float f = z2 ? BitmapDescriptorFactory.HUE_RED : 0.86f;
        int i = z2 ? this.setBackgroundResource : this.setHasDecor;
        if (z) {
            write(i, f, this.PlaybackStateCompat$CustomAction);
            MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat$CustomAction, 1.0f);
            IconCompatParcelizer(this.MediaSessionCompat$ResultReceiverWrapper, this.Keep);
        } else {
            MediaBrowserCompat$ItemReceiver(f);
            write(i);
            read(1.0f);
            MediaBrowserCompat$CustomActionResultReceiver(this.Keep);
            float f2 = this.PlaybackStateCompat$CustomAction;
            AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
            if (appCompatImageView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) appCompatImageView, f2);
            }
            TextView textView = this.f2525x50fd9e4a;
            if (textView != null) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) textView, f2);
            }
        }
        setSelected(false);
        if (!z2 && (bottomBarBadge = this.IconCompatParcelizer) != null && !bottomBarBadge.write) {
            BottomBarBadge bottomBarBadge2 = this.IconCompatParcelizer;
            bottomBarBadge2.write = true;
            SwitchCompat.write(bottomBarBadge2).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(1.0f).MediaBrowserCompat$ItemReceiver(1.0f).MediaBrowserCompat$CustomActionResultReceiver(1.0f).write();
        }
    }

    private void IconCompatParcelizer(int i, int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{i, i2});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomBarTab.this.MediaBrowserCompat$CustomActionResultReceiver(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.setDuration(150);
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(i);
            this.MediaBrowserCompat$ItemReceiver.setTag(ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_color_id, Integer.valueOf(i));
        }
        TextView textView = this.f2525x50fd9e4a;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, boolean z) {
        BottomBarBadge bottomBarBadge;
        if (!z) {
            getLayoutParams().width = (int) f;
            if (!this.MediaBrowserCompat$SearchResultReceiver && (bottomBarBadge = this.IconCompatParcelizer) != null) {
                bottomBarBadge.MediaBrowserCompat$ItemReceiver(this);
                BottomBarBadge bottomBarBadge2 = this.IconCompatParcelizer;
                bottomBarBadge2.write = true;
                SwitchCompat.write(bottomBarBadge2).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(1.0f).MediaBrowserCompat$ItemReceiver(1.0f).MediaBrowserCompat$CustomActionResultReceiver(1.0f).write();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) getWidth(), f});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = BottomBarTab.this.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    BottomBarTab.this.setLayoutParams(layoutParams);
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (!BottomBarTab.this.MediaBrowserCompat$SearchResultReceiver && BottomBarTab.this.IconCompatParcelizer != null) {
                    BottomBarTab.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(BottomBarTab.this);
                    BottomBarBadge bottomBarBadge = BottomBarTab.this.IconCompatParcelizer;
                    bottomBarBadge.write = true;
                    SwitchCompat.write(bottomBarBadge).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(1.0f).MediaBrowserCompat$ItemReceiver(1.0f).MediaBrowserCompat$CustomActionResultReceiver(1.0f).write();
                }
            }
        });
        ofFloat.start();
    }

    private void write(int i, float f, float f2) {
        if (this.MediaSessionCompat$Token != IconCompatParcelizer.TABLET || !this.MediaDescriptionCompat) {
            int paddingTop = this.MediaBrowserCompat$ItemReceiver.getPaddingTop();
            if (this.MediaSessionCompat$Token != IconCompatParcelizer.TABLET && !this.MediaDescriptionCompat) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{paddingTop, i});
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BottomBarTab.this.MediaBrowserCompat$ItemReceiver.setPadding(BottomBarTab.this.MediaBrowserCompat$ItemReceiver.getPaddingLeft(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), BottomBarTab.this.MediaBrowserCompat$ItemReceiver.getPaddingRight(), BottomBarTab.this.MediaBrowserCompat$ItemReceiver.getPaddingBottom());
                    }
                });
                ofInt.setDuration(150);
                ofInt.start();
            }
            setSwitchPadding MediaBrowserCompat$CustomActionResultReceiver2 = SwitchCompat.write(this.f2525x50fd9e4a).MediaBrowserCompat$ItemReceiver(150).MediaBrowserCompat$ItemReceiver(f).MediaBrowserCompat$CustomActionResultReceiver(f);
            MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(f2);
            MediaBrowserCompat$CustomActionResultReceiver2.write();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        SwitchCompat.write(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(150).IconCompatParcelizer(f).write();
        if (this.MediaDescriptionCompat && this.MediaSessionCompat$Token == IconCompatParcelizer.SHIFTING) {
            SwitchCompat.write(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(150).MediaBrowserCompat$ItemReceiver(f2).MediaBrowserCompat$CustomActionResultReceiver(f2).write();
        }
    }

    private void write(int i) {
        if (this.MediaSessionCompat$Token != IconCompatParcelizer.TABLET && !this.MediaDescriptionCompat) {
            AppCompatImageView appCompatImageView = this.MediaBrowserCompat$ItemReceiver;
            appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), i, this.MediaBrowserCompat$ItemReceiver.getPaddingRight(), this.MediaBrowserCompat$ItemReceiver.getPaddingBottom());
        }
    }

    private void MediaBrowserCompat$ItemReceiver(float f) {
        if (this.MediaSessionCompat$Token != IconCompatParcelizer.TABLET && !this.MediaDescriptionCompat) {
            SwitchCompat.write((View) this.f2525x50fd9e4a, f);
            SwitchCompat.read((View) this.f2525x50fd9e4a, f);
        }
    }

    private void read(float f) {
        if (this.MediaDescriptionCompat && this.MediaSessionCompat$Token == IconCompatParcelizer.SHIFTING) {
            SwitchCompat.write((View) this.MediaBrowserCompat$ItemReceiver, f);
            SwitchCompat.read((View) this.MediaBrowserCompat$ItemReceiver, f);
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.IconCompatParcelizer == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_BADGE_COUNT_FOR_TAB_");
        sb.append(this.read);
        bundle.putInt(sb.toString(), this.IconCompatParcelizer.read);
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_BADGE_COUNT_FOR_TAB_");
            sb.append(this.read);
            setBadgeCount(bundle.getInt(sb.toString()));
            parcelable = bundle.getParcelable("superstate");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public static class write {
        /* access modifiers changed from: private */
        public final float IconCompatParcelizer;
        /* access modifiers changed from: private */
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        /* access modifiers changed from: private */
        public final int MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public final int MediaBrowserCompat$SearchResultReceiver;
        /* access modifiers changed from: private */
        public final float MediaDescriptionCompat;
        /* access modifiers changed from: private */
        public final Typeface MediaMetadataCompat;
        /* access modifiers changed from: private */
        public final int RatingCompat;
        /* access modifiers changed from: private */
        public final int read;
        /* access modifiers changed from: private */
        public final int write;

        public static class IconCompatParcelizer {
            int IconCompatParcelizer;
            boolean MediaBrowserCompat$CustomActionResultReceiver = true;
            int MediaBrowserCompat$ItemReceiver;
            int MediaBrowserCompat$SearchResultReceiver;
            float MediaDescriptionCompat;
            Typeface MediaMetadataCompat;
            int RatingCompat;
            float read;
            int write;
        }

        /* synthetic */ write(IconCompatParcelizer iconCompatParcelizer, byte b) {
            this(iconCompatParcelizer);
        }

        private write(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.MediaDescriptionCompat = iconCompatParcelizer.MediaDescriptionCompat;
            this.IconCompatParcelizer = iconCompatParcelizer.read;
            this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            this.write = iconCompatParcelizer.IconCompatParcelizer;
            this.read = iconCompatParcelizer.write;
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.RatingCompat;
            this.MediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat;
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(boolean z) {
        if (!z || this.write != 0) {
            this.MediaDescriptionCompat = z;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This tab is supposed to be icon only, yet it has no icon specified. Index in container: ");
        sb.append(this.read);
        throw new IllegalStateException(sb.toString());
    }
}
