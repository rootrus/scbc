package p040o;

import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import java.util.Set;
import p040o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
import p040o.HmlVerifyIdentifyActivity;
import p040o.MyECouponActivity_ViewBinding;

@HmlSetNTBPinActivity
/* renamed from: o.FragmentBuilder_BindPurchaseDepositInputFragment */
public final class FragmentBuilder_BindPurchaseDepositInputFragment {
    public closePinLocation$MediaBrowserCompat$ItemReceiver write;

    /* renamed from: o.FragmentBuilder_BindPurchaseDepositInputFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements FragmentBuilder_BindHmlDocumentUploadGuidelineFragment<Object> {
        private /* synthetic */ MailingAddressReviewOTPActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
            this.MediaBrowserCompat$ItemReceiver = mailingAddressReviewOTPActivity;
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE));
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE));
            }
        }

        public final void write(int i, String str) {
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n                        Load Interaction Context Failed.\n                        Error message: ");
                sb.append(str);
                sb.append("\n                        Type of failure: ");
                sb.append(i);
                sb.append("\n                    ");
                Throwable runtimeException = new RuntimeException(GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString()));
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) runtimeException, "exception");
                this.MediaBrowserCompat$ItemReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(runtimeException)));
            }
        }
    }

    public static final Object write(FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment, HmlNTBPromptPayNotFoundActivity<? super Boolean> hmlNTBPromptPayNotFoundActivity) {
        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2 = fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
        MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = mailingAddressReviewActivity;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(mailingAddressReviewOTPActivity);
        if (mailingAddressReviewOTPActivity.IconCompatParcelizer()) {
            FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment = iconCompatParcelizer;
            if (!fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.read.read()) {
                fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(2, "");
                fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.IconCompatParcelizer.IconCompatParcelizer(fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaBrowserCompat$CustomActionResultReceiver, 2, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
            } else {
                String str = fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaBrowserCompat$SearchResultReceiver;
                if (str == null || str.length() == 0) {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(20, "");
                    fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.IconCompatParcelizer.IconCompatParcelizer(fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaBrowserCompat$CustomActionResultReceiver, 20, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
                } else {
                    fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.write.read();
                    Set<String> write2 = AlertController$RecycleListView.write(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), FragmentBuilder_BindHmlIssuerLandingFragment.setBackgroundResource());
                    if (new int[]{write2.size()}[0] == 0) {
                        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(7, "");
                        fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.IconCompatParcelizer.IconCompatParcelizer(fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaBrowserCompat$CustomActionResultReceiver, 7, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, "Trying to load interaction's context but no interactions where detected");
                    } else if (fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaDescriptionCompat == null) {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressDetailsFragment.NO_TOUCHPOINT_CONFIGURED);
                    } else {
                        int[] iArr = {0};
                        boolean[] zArr = {false};
                        for (String next : write2) {
                            iArr[0] = iArr[0] + 1;
                            StringBuilder sb = new StringBuilder();
                            sb.append(fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaDescriptionCompat.toString());
                            sb.append(next);
                            String obj = sb.toString();
                            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.C65361 r0 = new NetworkOperationCallback<InteractionRegionResponse>(iArr, zArr, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment, next) {
                                final /* synthetic */ String IconCompatParcelizer;
                                final /* synthetic */ FragmentBuilder_BindHmlDocumentUploadGuidelineFragment MediaBrowserCompat$CustomActionResultReceiver;
                                final /* synthetic */ boolean[] MediaBrowserCompat$ItemReceiver;
                                final /* synthetic */ int[] write;

                                public final /* synthetic */ void onSuccess(
/*
Method generation error in method: o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.1.onSuccess(java.lang.Object):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.1.onSuccess(java.lang.Object):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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

                                public final void onFailure(
/*
Method generation error in method: o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.1.onFailure(com.thunderhead.connectivity.NetworkOperationError):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.1.onFailure(com.thunderhead.connectivity.NetworkOperationError):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                            };
                            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("An interaction region context request sent for interaction: ");
                            sb2.append(obj);
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                            fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment2.MediaBrowserCompat$ItemReceiver.loadInteractionContext(obj, r0);
                        }
                    }
                }
            }
        }
        Object MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
