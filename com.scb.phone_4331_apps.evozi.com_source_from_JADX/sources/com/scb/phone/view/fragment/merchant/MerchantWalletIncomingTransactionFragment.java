package com.scb.phone.view.fragment.merchant;

import android.content.Context;
import android.os.Bundle;
import com.scb.phone.view.adapter.merchant.MerchantWalletIncomingTransactionAdapter;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_ContributeEasycashCommonNCBConsentActivity;
import p040o.AppStatsSqLiteDs;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C6309xc961f838;
import p040o.C6900x198d4346;
import p040o.HmlPinActivity;
import p040o.ICheckExtractorListener$MediaBrowserCompat$ItemReceiver;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.doWriteToLog;
import p040o.getCustomerContact;
import p040o.getCustomerContact$MediaBrowserCompat$ItemReceiver;
import p040o.isError;
import p040o.onGetStartedClick;
import p040o.onPlaceSelected;
import p040o.standardCount;
import p040o.validateHERK;

public class MerchantWalletIncomingTransactionFragment extends BaseMerchantWalletItemTransactionFragment implements ICheckExtractorListener$MediaBrowserCompat$ItemReceiver, C6900x198d4346 {
    private boolean MediaBrowserCompat$SearchResultReceiver;
    public MerchantWalletIncomingTransactionAdapter MediaMetadataCompat;
    @HmlPinActivity
    public AppStatsSqLiteDs.C3040a mPresenter;

    public static MerchantWalletIncomingTransactionFragment write(doWriteToLog dowritetolog, String str, String str2, boolean z) {
        MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment = new MerchantWalletIncomingTransactionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_WALLET_DETAIL", dowritetolog);
        bundle.putString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_START_DATE", str);
        bundle.putString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_END_DATE", str2);
        bundle.putBoolean("com.scb.phone.view.fragment.merchant.MerchantWalletIncomingTransactionFragment.EXTRA_IS_IMMEDIATELY_DISPLAY", z);
        merchantWalletIncomingTransactionFragment.setArguments(bundle);
        return merchantWalletIncomingTransactionFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2, String str3) {
        this.mTextMessage.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyCard.setVisibility(8);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z = false;
            if (!arguments.getBoolean("com.scb.phone.view.fragment.merchant.MerchantWalletIncomingTransactionFragment.EXTRA_IS_IMMEDIATELY_DISPLAY", false) || this.MediaBrowserCompat$SearchResultReceiver) {
                AppStatsSqLiteDs.C3040a aVar = this.mPresenter;
                if (aVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    aVar.RatingCompat.Keep();
                }
                aVar.MediaBrowserCompat$MediaItem = str;
                aVar.MediaMetadataCompat = str2;
                aVar.IconCompatParcelizer = str3;
                standardCount standardcount = new standardCount();
                onGetStartedClick.write((Object) str, "<set-?>");
                standardcount.read = str;
                standardcount.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(aVar.write);
                standardcount.IconCompatParcelizer = 20;
                standardcount.write = str2;
                standardcount.MediaBrowserCompat$ItemReceiver = str3;
                aVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(standardcount);
                aVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<onPlaceSelected>() {
                    public final /* synthetic */ void onNext(
/*
Method generation error in method: o.AppStatsSqLiteDs.a.4.onNext(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppStatsSqLiteDs.a.4.onNext(java.lang.Object):void, class status: UNLOADED
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

                    public final void onError(
/*
Method generation error in method: o.AppStatsSqLiteDs.a.4.onError(java.lang.Throwable):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppStatsSqLiteDs.a.4.onError(java.lang.Throwable):void, class status: UNLOADED
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
                return;
            }
            this.MediaBrowserCompat$SearchResultReceiver = true;
            AppStatsSqLiteDs.C3040a aVar2 = this.mPresenter;
            isError iserror = new isError(aVar2, (doWriteToLog) arguments.getParcelable("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_WALLET_DETAIL"));
            if (aVar2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iserror.IconCompatParcelizer(aVar2.RatingCompat);
            }
        }
    }

    public final getCustomerContact MediaBrowserCompat$MediaItem() {
        MerchantWalletIncomingTransactionAdapter merchantWalletIncomingTransactionAdapter = new MerchantWalletIncomingTransactionAdapter(this.IconCompatParcelizer);
        this.MediaMetadataCompat = merchantWalletIncomingTransactionAdapter;
        return merchantWalletIncomingTransactionAdapter;
    }

    public void onDestroyView() {
        this.mPresenter.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(List<AutoCrashlyticsReportEncoder> list) {
        validateHERK validateherk;
        if (list != null) {
            if (list.isEmpty()) {
                this.mTextMessage.setVisibility(0);
                this.mRecyclerView.setVisibility(8);
                return;
            }
            this.mTextMessage.setVisibility(8);
            this.mRecyclerView.setVisibility(0);
            this.MediaMetadataCompat.IconCompatParcelizer(list);
            for (int i = 0; i < list.size(); i++) {
                AutoCrashlyticsReportEncoder autoCrashlyticsReportEncoder = list.get(i);
                if (!(autoCrashlyticsReportEncoder == null || !autoCrashlyticsReportEncoder.MediaDescriptionCompat || (validateherk = this.IconCompatParcelizer.MediaDescriptionCompat) == null)) {
                    boolean read = validateherk.read(i, false, (Object) null);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        boolean z;
        validateHERK validateherk;
        AutoCrashlyticsReportEncoder write = write(i);
        if (write != null) {
            z = !DiskLruCache.VERSION_1.equalsIgnoreCase(write.MediaBrowserCompat$SearchResultReceiver);
            write.MediaDescriptionCompat = z;
        } else {
            z = false;
        }
        if (z && (validateherk = this.IconCompatParcelizer.MediaDescriptionCompat) != null) {
            boolean MediaBrowserCompat$ItemReceiver = validateherk.MediaBrowserCompat$ItemReceiver(i, false, (Object) null);
        }
    }

    public final void read(int i) {
        AutoCrashlyticsReportEncoder write = write(i);
        if (write != null) {
            write.MediaDescriptionCompat = false;
        }
    }

    private AutoCrashlyticsReportEncoder write(int i) {
        List read = this.MediaMetadataCompat.read();
        if (i < read.size()) {
            return (AutoCrashlyticsReportEncoder) read.get(i);
        }
        return null;
    }

    public final void aw_() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && this.MediaMetadataCompat != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.post(new ActivityBuilder_ContributeEasycashCommonNCBConsentActivity(this));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.RatingCompat != null) {
            this.RatingCompat.IconCompatParcelizer(this);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<AutoCrashlyticsReportEncoder> list) {
        if (!isDetached() && this.MediaBrowserCompat$CustomActionResultReceiver != null && this.MediaMetadataCompat != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.post(new C6309xc961f838(this, list));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MerchantWalletIncomingTransactionAdapter merchantWalletIncomingTransactionAdapter = this.MediaMetadataCompat;
        if (merchantWalletIncomingTransactionAdapter != null) {
            merchantWalletIncomingTransactionAdapter.MediaBrowserCompat$ItemReceiver(false, (getCustomerContact$MediaBrowserCompat$ItemReceiver) null);
        }
        if (this.RatingCompat != null) {
            this.RatingCompat.IconCompatParcelizer((C6900x198d4346) null);
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.IconCompatParcelizer((C6900x198d4346) null);
        }
    }
}
