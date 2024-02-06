package p040o;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.trackoption.fragments.PropositionsRootListFragment;

/* renamed from: o.ExportCardStatementActivity */
public final class ExportCardStatementActivity {
    public PropositionsRootListFragment.write MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private boolean read = true;
    public AttributeData[] write;

    public ExportCardStatementActivity() {
        if (FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat() != null) {
            this.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat().getSharedPreferences("one_session_params", 0).getBoolean("tip_shown", false);
        }
    }

    public final void IconCompatParcelizer() {
        CropDocumentActivity cropDocumentActivity;
        CropDocumentActivity cropDocumentActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        if (cropDocumentActivity2 != null) {
            cropDocumentActivity2.write(false);
        }
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        AttributeData attributeData = onClickActionNext.IconCompatParcelizer.read;
        if (attributeData != null) {
            for (AttributeData id : this.write) {
                if (id.getId().equals(attributeData.getId()) && (cropDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write) != null) {
                    cropDocumentActivity.write(true);
                }
            }
        }
        if (this.read && this.write.length != 0) {
            this.read = false;
            PropositionsRootListFragment.write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            write2.IconCompatParcelizer.postDelayed(new Runnable() {
                public final void run(
/*
Method generation error in method: com.thunderhead.trackoption.fragments.PropositionsRootListFragment.write.4.run():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.thunderhead.trackoption.fragments.PropositionsRootListFragment.write.4.run():void, class status: UNLOADED
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
            }, 200);
            if (!this.MediaBrowserCompat$ItemReceiver) {
                if (FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat() != null) {
                    FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat().getSharedPreferences("one_session_params", 0).edit().putBoolean("tip_shown", true).apply();
                }
                PropositionsRootListFragment.write write3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                Toast.makeText(PropositionsRootListFragment.this.getContext(), PropositionsRootListFragment.this.getString(C6555xdccae8ee.th_dynamic_proposition_data_attributes_hint), 0).show();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CropDocumentActivity cropDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        if (cropDocumentActivity != null) {
            cropDocumentActivity.write(false);
        }
        PropositionsRootListFragment.write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        View currentFocus = PropositionsRootListFragment.this.getActivity().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) PropositionsRootListFragment.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
