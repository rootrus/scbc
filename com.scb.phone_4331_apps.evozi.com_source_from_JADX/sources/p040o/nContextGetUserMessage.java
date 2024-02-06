package p040o;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$MediaBrowserCompat$ItemReceiver;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.nAllocationSetSurface;

/* renamed from: o.nContextGetUserMessage */
public final class nContextGetUserMessage extends setBackgroundResource {
    private BottomSheetBehavior<FrameLayout> IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    private BottomSheetBehavior$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    boolean read;
    boolean write;

    public final void setContentView(int i) {
        super.setContentView(write(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(PKIFailureInfo.systemUnavail);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setContentView(View view) {
        super.setContentView(write(0, view, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(write(0, view, layoutParams));
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.IconCompatParcelizer;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.MediaBrowserCompat$MediaItem = z;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.IconCompatParcelizer;
        if (bottomSheetBehavior != null && bottomSheetBehavior.MediaDescriptionCompat == 5) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.IconCompatParcelizer;
            if (4 != bottomSheetBehavior2.MediaDescriptionCompat) {
                WeakReference<V> weakReference = bottomSheetBehavior2.MediaSessionCompat$ResultReceiverWrapper;
                if (weakReference == null) {
                    bottomSheetBehavior2.MediaDescriptionCompat = 4;
                    return;
                }
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !SwitchCompat.setExpandedFormat(view)) {
                        bottomSheetBehavior2.IconCompatParcelizer(view, 4);
                    } else {
                        view.post(new Runnable(view, 4) {
                            private /* synthetic */ View MediaBrowserCompat$ItemReceiver;
                            private /* synthetic */ int write;

                            public final void run(
/*
Method generation error in method: com.google.android.material.bottomsheet.BottomSheetBehavior.1.run():void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.google.android.material.bottomsheet.BottomSheetBehavior.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        this.read = z;
        this.write = true;
    }

    private View write(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_bottom_sheet_dialog, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(nAllocationSetSurface.MediaDescriptionCompat.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(nAllocationSetSurface.MediaDescriptionCompat.design_bottom_sheet);
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (layoutParams2 instanceof CoordinatorLayout.read) {
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((CoordinatorLayout.read) layoutParams2).MediaDescriptionCompat;
            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver instanceof BottomSheetBehavior) {
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = (BottomSheetBehavior) coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
                this.IconCompatParcelizer = bottomSheetBehavior;
                bottomSheetBehavior.read = this.MediaBrowserCompat$ItemReceiver;
                this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (layoutParams == null) {
                    frameLayout2.addView(view);
                } else {
                    frameLayout2.addView(view, layoutParams);
                }
                coordinatorLayout.findViewById(nAllocationSetSurface.MediaDescriptionCompat.touch_outside).setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (nContextGetUserMessage.this.MediaBrowserCompat$CustomActionResultReceiver && nContextGetUserMessage.this.isShowing()) {
                            nContextGetUserMessage ncontextgetusermessage = nContextGetUserMessage.this;
                            if (!ncontextgetusermessage.write) {
                                TypedArray obtainStyledAttributes = ncontextgetusermessage.getContext().obtainStyledAttributes(new int[]{16843611});
                                ncontextgetusermessage.read = obtainStyledAttributes.getBoolean(0, true);
                                obtainStyledAttributes.recycle();
                                ncontextgetusermessage.write = true;
                            }
                            if (ncontextgetusermessage.read) {
                                nContextGetUserMessage.this.cancel();
                            }
                        }
                    }
                });
                SwitchCompat.read((View) frameLayout2, (setIconifiedByDefault) new setIconifiedByDefault() {
                    public final void IconCompatParcelizer(View view, setTextOn settexton) {
                        super.IconCompatParcelizer(view, settexton);
                        if (nContextGetUserMessage.this.MediaBrowserCompat$CustomActionResultReceiver) {
                            settexton.read((int) PKIFailureInfo.badCertTemplate);
                            settexton.MediaBrowserCompat$MediaItem(true);
                            return;
                        }
                        settexton.MediaBrowserCompat$MediaItem(false);
                    }

                    public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
                        if (i != 1048576 || !nContextGetUserMessage.this.MediaBrowserCompat$CustomActionResultReceiver) {
                            return super.MediaBrowserCompat$ItemReceiver(view, i, bundle);
                        }
                        nContextGetUserMessage.this.cancel();
                        return true;
                    }
                });
                frameLayout2.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
                return frameLayout;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nContextGetUserMessage(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = p040o.nAllocationSetSurface.read.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.MediaBrowserCompat$CustomActionResultReceiver = r0
            r3.read = r0
            o.nContextGetUserMessage$3 r4 = new o.nContextGetUserMessage$3
            r4.<init>()
            r3.MediaBrowserCompat$ItemReceiver = r4
            r3.write((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nContextGetUserMessage.<init>(android.content.Context, int):void");
    }
}
