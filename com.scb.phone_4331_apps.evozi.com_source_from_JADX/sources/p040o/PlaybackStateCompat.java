package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.ActionMenuItemView;
import p040o.AlertController$RecycleListView;

/* renamed from: o.PlaybackStateCompat */
public interface PlaybackStateCompat {
    void IconCompatParcelizer(ActionMenuItemView actionMenuItemView);

    ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView.read read);

    void write(ActionMenuItemView actionMenuItemView);

    /* renamed from: o.PlaybackStateCompat$CustomAction */
    public final class CustomAction extends setBackgroundResource implements DialogInterface {
        final AlertController MediaBrowserCompat$CustomActionResultReceiver = new AlertController(getContext(), this, getWindow());

        protected CustomAction(Context context, int i) {
            super(context, read(context, i));
        }

        static int read(Context context, int i) {
            if ((i >>> 24) > 0) {
                return i;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AlertController$RecycleListView.read.alertDialogTheme, typedValue, true);
            return typedValue.resourceId;
        }

        public final void setTitle(CharSequence charSequence) {
            super.setTitle(charSequence);
            AlertController alertController = this.MediaBrowserCompat$CustomActionResultReceiver;
            alertController.setBackgroundResource = charSequence;
            TextView textView = alertController.AppCompatActivity;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            boolean z;
            ListAdapter listAdapter;
            View findViewById;
            View findViewById2;
            super.onCreate(bundle);
            AlertController alertController = this.MediaBrowserCompat$CustomActionResultReceiver;
            alertController.f0x50fd9e4a.setContentView(alertController.MediaBrowserCompat$CustomActionResultReceiver);
            View findViewById3 = alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.parentPanel);
            View findViewById4 = findViewById3.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.topPanel);
            View findViewById5 = findViewById3.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.contentPanel);
            View findViewById6 = findViewById3.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.buttonPanel);
            ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.customPanel);
            View view = alertController.AppCompatDialogFragment;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            boolean z2 = false;
            boolean z3 = view != null;
            if (!z3 || !AlertController.MediaBrowserCompat$CustomActionResultReceiver(view)) {
                alertController.ActionMenuItemView.setFlags(131072, 131072);
            }
            if (z3) {
                ((FrameLayout) alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.custom)).addView(view, new ViewGroup.LayoutParams(-1, -1));
                if (alertController.setHasDecor != null) {
                    ((LinearLayoutCompat.write) viewGroup.getLayoutParams()).MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                viewGroup.setVisibility(8);
            }
            View findViewById7 = viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.topPanel);
            View findViewById8 = viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.contentPanel);
            View findViewById9 = viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.buttonPanel);
            ViewGroup IconCompatParcelizer = AlertController.IconCompatParcelizer(findViewById7, findViewById4);
            ViewGroup IconCompatParcelizer2 = AlertController.IconCompatParcelizer(findViewById8, findViewById5);
            ViewGroup IconCompatParcelizer3 = AlertController.IconCompatParcelizer(findViewById9, findViewById6);
            NestedScrollView nestedScrollView = (NestedScrollView) alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.scrollView);
            alertController.PlaybackStateCompat = nestedScrollView;
            nestedScrollView.setFocusable(false);
            alertController.PlaybackStateCompat.setNestedScrollingEnabled(false);
            TextView textView = (TextView) IconCompatParcelizer2.findViewById(16908299);
            alertController.AlertController$RecycleListView = textView;
            if (textView != null) {
                textView.setVisibility(8);
                alertController.PlaybackStateCompat.removeView(alertController.AlertController$RecycleListView);
                if (alertController.setHasDecor != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.PlaybackStateCompat.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.PlaybackStateCompat);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.setHasDecor, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    IconCompatParcelizer2.setVisibility(8);
                }
            }
            Button button = (Button) IconCompatParcelizer3.findViewById(16908313);
            alertController.MediaMetadataCompat = button;
            button.setOnClickListener(alertController.IconCompatParcelizer);
            if (TextUtils.isEmpty((CharSequence) null)) {
                alertController.MediaMetadataCompat.setVisibility(8);
                z = false;
            } else {
                alertController.MediaMetadataCompat.setText((CharSequence) null);
                alertController.MediaMetadataCompat.setVisibility(0);
                z = true;
            }
            Button button2 = (Button) IconCompatParcelizer3.findViewById(16908314);
            alertController.read = button2;
            button2.setOnClickListener(alertController.IconCompatParcelizer);
            if (TextUtils.isEmpty((CharSequence) null)) {
                alertController.read.setVisibility(8);
            } else {
                alertController.read.setText((CharSequence) null);
                alertController.read.setVisibility(0);
                z |= true;
            }
            Button button3 = (Button) IconCompatParcelizer3.findViewById(16908315);
            alertController.MediaBrowserCompat$MediaItem = button3;
            button3.setOnClickListener(alertController.IconCompatParcelizer);
            if (TextUtils.isEmpty((CharSequence) null)) {
                alertController.MediaBrowserCompat$MediaItem.setVisibility(8);
            } else {
                alertController.MediaBrowserCompat$MediaItem.setText((CharSequence) null);
                alertController.MediaBrowserCompat$MediaItem.setVisibility(0);
                z |= true;
            }
            Context context = alertController.RatingCompat;
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AlertController$RecycleListView.read.alertDialogCenterButtons, typedValue, true);
            if (typedValue.data != 0) {
                if (z) {
                    Button button4 = alertController.MediaMetadataCompat;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                    layoutParams.gravity = 1;
                    layoutParams.weight = 0.5f;
                    button4.setLayoutParams(layoutParams);
                } else if (z) {
                    Button button5 = alertController.read;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                    layoutParams2.gravity = 1;
                    layoutParams2.weight = 0.5f;
                    button5.setLayoutParams(layoutParams2);
                } else if (z) {
                    Button button6 = alertController.MediaBrowserCompat$MediaItem;
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                    layoutParams3.gravity = 1;
                    layoutParams3.weight = 0.5f;
                    button6.setLayoutParams(layoutParams3);
                }
            }
            if (!(z)) {
                IconCompatParcelizer3.setVisibility(8);
            }
            if (alertController.MediaSessionCompat$QueueItem != null) {
                IconCompatParcelizer.addView(alertController.MediaSessionCompat$QueueItem, 0, new ViewGroup.LayoutParams(-1, -2));
                alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title_template).setVisibility(8);
            } else {
                alertController.MediaSessionCompat$ResultReceiverWrapper = (ImageView) alertController.ActionMenuItemView.findViewById(16908294);
                if (!(!TextUtils.isEmpty(alertController.setBackgroundResource)) || !alertController.setContentView) {
                    alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title_template).setVisibility(8);
                    alertController.MediaSessionCompat$ResultReceiverWrapper.setVisibility(8);
                    IconCompatParcelizer.setVisibility(8);
                } else {
                    TextView textView2 = (TextView) alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.alertTitle);
                    alertController.AppCompatActivity = textView2;
                    textView2.setText(alertController.setBackgroundResource);
                    Drawable drawable = alertController.ParcelableVolumeInfo;
                    if (drawable != null) {
                        alertController.MediaSessionCompat$ResultReceiverWrapper.setImageDrawable(drawable);
                    } else {
                        alertController.AppCompatActivity.setPadding(alertController.MediaSessionCompat$ResultReceiverWrapper.getPaddingLeft(), alertController.MediaSessionCompat$ResultReceiverWrapper.getPaddingTop(), alertController.MediaSessionCompat$ResultReceiverWrapper.getPaddingRight(), alertController.MediaSessionCompat$ResultReceiverWrapper.getPaddingBottom());
                        alertController.MediaSessionCompat$ResultReceiverWrapper.setVisibility(8);
                    }
                }
            }
            boolean z4 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
            boolean z5 = (IconCompatParcelizer == null || IconCompatParcelizer.getVisibility() == 8) ? false : true;
            boolean z6 = (IconCompatParcelizer3 == null || IconCompatParcelizer3.getVisibility() == 8) ? false : true;
            if (!(z6 || IconCompatParcelizer2 == null || (findViewById2 = IconCompatParcelizer2.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.textSpacerNoButtons)) == null)) {
                findViewById2.setVisibility(0);
            }
            if (z5) {
                NestedScrollView nestedScrollView2 = alertController.PlaybackStateCompat;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.setClipToPadding(true);
                }
                View findViewById10 = alertController.setHasDecor != null ? IconCompatParcelizer.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.titleDividerNoCustom) : null;
                if (findViewById10 != null) {
                    findViewById10.setVisibility(0);
                }
            } else if (!(IconCompatParcelizer2 == null || (findViewById = IconCompatParcelizer2.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.textSpacerNoTitle)) == null)) {
                findViewById.setVisibility(0);
            }
            ListView listView = alertController.setHasDecor;
            if (listView instanceof AlertController.RecycleListView) {
                ((AlertController.RecycleListView) listView).setHasDecor(z5, z6);
            }
            if (!z4) {
                View view3 = alertController.setHasDecor;
                if (view3 == null) {
                    view3 = alertController.PlaybackStateCompat;
                }
                if (view3 != null) {
                    if (z6) {
                        z2 = true;
                    }
                    boolean z7 = z5 | z2;
                    View findViewById11 = alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.scrollIndicatorUp);
                    View findViewById12 = alertController.ActionMenuItemView.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.scrollIndicatorDown);
                    if (Build.VERSION.SDK_INT >= 23) {
                        SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view3, z7 ? 1 : 0, 3);
                        if (findViewById11 != null) {
                            IconCompatParcelizer2.removeView(findViewById11);
                        }
                        if (findViewById12 != null) {
                            IconCompatParcelizer2.removeView(findViewById12);
                        }
                    } else {
                        if (findViewById11 != null && (!z7 || !true)) {
                            IconCompatParcelizer2.removeView(findViewById11);
                            findViewById11 = null;
                        }
                        if (findViewById12 == null || (z7 && true)) {
                            view2 = findViewById12;
                        } else {
                            IconCompatParcelizer2.removeView(findViewById12);
                        }
                        if (!(findViewById11 == null && view2 == null)) {
                            ListView listView2 = alertController.setHasDecor;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new AbsListView.OnScrollListener(findViewById11, view2) {
                                    final /* synthetic */ View IconCompatParcelizer;
                                    final /* synthetic */ View read;

                                    public final void onScrollStateChanged(
/*
Method generation error in method: androidx.appcompat.app.AlertController.5.onScrollStateChanged(android.widget.AbsListView, int):void, dex: classes.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.5.onScrollStateChanged(android.widget.AbsListView, int):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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

                                    public final void onScroll(
/*
Method generation error in method: androidx.appcompat.app.AlertController.5.onScroll(android.widget.AbsListView, int, int, int):void, dex: classes.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.5.onScroll(android.widget.AbsListView, int, int, int):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                                alertController.setHasDecor.post(new Runnable(findViewById11, view2) {
                                    final /* synthetic */ View IconCompatParcelizer;
                                    final /* synthetic */ View MediaBrowserCompat$CustomActionResultReceiver;

                                    public final void run(
/*
Method generation error in method: androidx.appcompat.app.AlertController.4.run():void, dex: classes.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.4.run():void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                            } else {
                                if (findViewById11 != null) {
                                    IconCompatParcelizer2.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    IconCompatParcelizer2.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
            ListView listView3 = alertController.setHasDecor;
            if (listView3 != null && (listAdapter = alertController.MediaBrowserCompat$ItemReceiver) != null) {
                listView3.setAdapter(listAdapter);
                int i = alertController.MediaBrowserCompat$SearchResultReceiver;
                if (i >= 0) {
                    listView3.setItemChecked(i, true);
                    listView3.setSelection(i);
                }
            }
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            NestedScrollView nestedScrollView = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat;
            if (nestedScrollView != null && nestedScrollView.write(keyEvent)) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            NestedScrollView nestedScrollView = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat;
            if (nestedScrollView != null && nestedScrollView.write(keyEvent)) {
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        }
    }
}
