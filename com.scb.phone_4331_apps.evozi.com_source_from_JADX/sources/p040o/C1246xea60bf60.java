package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$MediaBrowserCompat$ItemReceiver;
import p040o.PlaybackStateCompat;

/* renamed from: o.PlaybackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver */
public class C1246xea60bf60 {
    private final int MediaBrowserCompat$ItemReceiver;
    public final AlertController.read read;

    public C1246xea60bf60(Context context) {
        this(context, PlaybackStateCompat.CustomAction.read(context, 0));
    }

    public C1246xea60bf60(Context context, int i) {
        this.read = new AlertController.read(new ContextThemeWrapper(context, PlaybackStateCompat.CustomAction.read(context, i)));
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final PlaybackStateCompat.CustomAction write() {
        PlaybackStateCompat.CustomAction customAction = new PlaybackStateCompat.CustomAction(this.read.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
        AlertController.read read2 = this.read;
        AlertController alertController = customAction.MediaBrowserCompat$CustomActionResultReceiver;
        View view = read2.read;
        if (view != null) {
            alertController.MediaSessionCompat$QueueItem = view;
        } else {
            CharSequence charSequence = read2.RatingCompat;
            if (charSequence != null) {
                alertController.setBackgroundResource = charSequence;
                TextView textView = alertController.AppCompatActivity;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = read2.MediaBrowserCompat$SearchResultReceiver;
            if (drawable != null) {
                alertController.ParcelableVolumeInfo = drawable;
                alertController.MediaSessionCompat$Token = 0;
                ImageView imageView = alertController.MediaSessionCompat$ResultReceiverWrapper;
                if (imageView != null) {
                    if (drawable != null) {
                        imageView.setVisibility(0);
                        alertController.MediaSessionCompat$ResultReceiverWrapper.setImageDrawable(drawable);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
        }
        if (read2.MediaBrowserCompat$CustomActionResultReceiver != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) read2.MediaBrowserCompat$MediaItem.inflate(alertController.Keep, (ViewGroup) null);
            int i = alertController.PlaybackStateCompat$CustomAction;
            ListAdapter listAdapter = read2.MediaBrowserCompat$CustomActionResultReceiver;
            if (listAdapter == null) {
                listAdapter = new AlertController$MediaBrowserCompat$ItemReceiver(read2.IconCompatParcelizer, i, (CharSequence[]) null);
            }
            alertController.MediaBrowserCompat$ItemReceiver = listAdapter;
            alertController.MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$ItemReceiver;
            if (read2.MediaMetadataCompat != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener(alertController) {
                    final /* synthetic */ AlertController MediaBrowserCompat$CustomActionResultReceiver;

                    public final void onItemClick(
/*
Method generation error in method: androidx.appcompat.app.AlertController.read.1.onItemClick(android.widget.AdapterView, android.view.View, int, long):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.read.1.onItemClick(android.widget.AdapterView, android.view.View, int, long):void, class status: UNLOADED
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
            alertController.setHasDecor = recycleListView;
        }
        View view2 = read2.MediaSessionCompat$QueueItem;
        if (view2 != null) {
            alertController.AppCompatDialogFragment = view2;
            alertController.AppCompatDelegateImpl$ListMenuDecorView = 0;
            alertController.setChecked = false;
        }
        customAction.setCancelable(this.read.write);
        if (this.read.write) {
            customAction.setCanceledOnTouchOutside(true);
        }
        customAction.setOnCancelListener((DialogInterface.OnCancelListener) null);
        customAction.setOnDismissListener((DialogInterface.OnDismissListener) null);
        if (this.read.MediaDescriptionCompat != null) {
            customAction.setOnKeyListener(this.read.MediaDescriptionCompat);
        }
        return customAction;
    }
}
