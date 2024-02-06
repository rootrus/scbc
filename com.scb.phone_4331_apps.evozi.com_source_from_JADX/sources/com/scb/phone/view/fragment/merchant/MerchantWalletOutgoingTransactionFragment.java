package com.scb.phone.view.fragment.merchant;

import android.content.Context;
import android.os.Bundle;
import com.scb.phone.view.adapter.merchant.MerchantWalletOutgoingTransactionAdapter;
import java.util.List;
import p040o.ActivityBuilder_ContributeEasycashCollateralInformationActivity;
import p040o.AppStatsSqLiteDs;
import p040o.C6900x198d4346;
import p040o.HmlPinActivity;
import p040o.ICheckExtractorListener;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.QueueFileLogStore;
import p040o.doWriteToLog;
import p040o.getCustomerContact;
import p040o.getCustomerContact$MediaBrowserCompat$ItemReceiver;
import p040o.getLogBytes;
import p040o.onGetStartedClick;
import p040o.standardCount;
import p040o.validateHERK;
import p040o.zzm;

public class MerchantWalletOutgoingTransactionFragment extends BaseMerchantWalletItemTransactionFragment implements ICheckExtractorListener.IconCompatParcelizer, C6900x198d4346 {
    private MerchantWalletOutgoingTransactionAdapter MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public AppStatsSqLiteDs mPresenter;

    public static MerchantWalletOutgoingTransactionFragment IconCompatParcelizer(doWriteToLog dowritetolog, String str, String str2) {
        MerchantWalletOutgoingTransactionFragment merchantWalletOutgoingTransactionFragment = new MerchantWalletOutgoingTransactionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_WALLET_DETAIL", dowritetolog);
        bundle.putString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_START_DATE", str);
        bundle.putString("com.scb.phone.view.fragment.merchant.BaseMerchantWalletItemTransactionFragment.EXTRA_END_DATE", str2);
        merchantWalletOutgoingTransactionFragment.setArguments(bundle);
        return merchantWalletOutgoingTransactionFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2, String str3) {
        this.mTextMessage.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyCard.setVisibility(8);
        AppStatsSqLiteDs appStatsSqLiteDs = this.mPresenter;
        if (appStatsSqLiteDs.RatingCompat != null) {
            appStatsSqLiteDs.RatingCompat.Keep();
        }
        appStatsSqLiteDs.MediaDescriptionCompat = str;
        appStatsSqLiteDs.MediaMetadataCompat = str2;
        appStatsSqLiteDs.read = str3;
        standardCount standardcount = new standardCount();
        onGetStartedClick.write((Object) str, "<set-?>");
        standardcount.read = str;
        standardcount.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(appStatsSqLiteDs.MediaBrowserCompat$ItemReceiver);
        standardcount.IconCompatParcelizer = 20;
        standardcount.write = str2;
        standardcount.MediaBrowserCompat$ItemReceiver = str3;
        appStatsSqLiteDs.write.read(standardcount);
        appStatsSqLiteDs.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzm.zzg>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.AppStatsSqLiteDs.1.onNext(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppStatsSqLiteDs.1.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.AppStatsSqLiteDs.1.onError(java.lang.Throwable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AppStatsSqLiteDs.1.onError(java.lang.Throwable):void, class status: UNLOADED
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

    public final getCustomerContact MediaBrowserCompat$MediaItem() {
        MerchantWalletOutgoingTransactionAdapter merchantWalletOutgoingTransactionAdapter = new MerchantWalletOutgoingTransactionAdapter(this.IconCompatParcelizer);
        this.MediaBrowserCompat$SearchResultReceiver = merchantWalletOutgoingTransactionAdapter;
        return merchantWalletOutgoingTransactionAdapter;
    }

    public void onDestroyView() {
        this.mPresenter.onDestroy();
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLogBytes getlogbytes, List<QueueFileLogStore.LogBytes> list) {
        validateHERK validateherk;
        if (list != null) {
            if (list.isEmpty()) {
                this.mTextMessage.setVisibility(0);
                this.mRecyclerView.setVisibility(8);
                return;
            }
            this.mTextMessage.setVisibility(8);
            this.mRecyclerView.setVisibility(0);
            this.mRecyclerView.setFocusable(false);
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(getlogbytes, list);
            for (int i = 0; i < list.size(); i++) {
                QueueFileLogStore.LogBytes logBytes = list.get(i);
                if (!(logBytes == null || !logBytes.IconCompatParcelizer || (validateherk = this.IconCompatParcelizer.MediaDescriptionCompat) == null)) {
                    boolean read = validateherk.read(i, false, (Object) null);
                }
            }
            this.mRecyclerView.setFocusable(true);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        QueueFileLogStore.LogBytes write = write(i);
        if (write != null) {
            write.IconCompatParcelizer = true;
        }
    }

    public final void read(int i) {
        QueueFileLogStore.LogBytes write = write(i);
        if (write != null) {
            write.IconCompatParcelizer = false;
        }
    }

    private QueueFileLogStore.LogBytes write(int i) {
        List read = this.MediaBrowserCompat$SearchResultReceiver.read();
        if (i < read.size()) {
            return (QueueFileLogStore.LogBytes) read.get(i);
        }
        return null;
    }

    public final void aw_() {
        MerchantWalletOutgoingTransactionAdapter merchantWalletOutgoingTransactionAdapter;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && (merchantWalletOutgoingTransactionAdapter = this.MediaBrowserCompat$SearchResultReceiver) != null) {
            merchantWalletOutgoingTransactionAdapter.MediaBrowserCompat$ItemReceiver(true, new ActivityBuilder_ContributeEasycashCollateralInformationActivity(this));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.RatingCompat != null) {
            this.RatingCompat.write(this);
        }
    }

    public final void read(List<QueueFileLogStore.LogBytes> list) {
        MerchantWalletOutgoingTransactionAdapter merchantWalletOutgoingTransactionAdapter;
        if (!isDetached() && this.MediaBrowserCompat$CustomActionResultReceiver != null && (merchantWalletOutgoingTransactionAdapter = this.MediaBrowserCompat$SearchResultReceiver) != null) {
            merchantWalletOutgoingTransactionAdapter.MediaBrowserCompat$ItemReceiver(false, (getCustomerContact$MediaBrowserCompat$ItemReceiver) null);
            this.MediaBrowserCompat$SearchResultReceiver.write(list);
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.write((C6900x198d4346) null);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.write((C6900x198d4346) null);
        }
        MerchantWalletOutgoingTransactionAdapter merchantWalletOutgoingTransactionAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (merchantWalletOutgoingTransactionAdapter != null) {
            merchantWalletOutgoingTransactionAdapter.MediaBrowserCompat$ItemReceiver(false, (getCustomerContact$MediaBrowserCompat$ItemReceiver) null);
        }
    }
}
