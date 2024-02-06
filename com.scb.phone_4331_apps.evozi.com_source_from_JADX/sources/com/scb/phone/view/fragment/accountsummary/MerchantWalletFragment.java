package com.scb.phone.view.fragment.accountsummary;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.accountsummary.MerchantWalletViewPagerAdapter;
import java.util.Collections;
import java.util.List;
import p040o.CheckCaptureModule;
import p040o.CompositeCreateReportSpiCall;
import p040o.CreateReportSpiCall;
import p040o.HmlPinActivity;
import p040o.NTBPinLoginService;
import p040o.SettingsCacheBehavior;
import p040o.TransformedImmutableList;
import p040o.TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver;
import p040o.confirmRpRegistration;
import p040o.doWriteToLog;
import p040o.getIdps;
import p040o.onGetStartedClick;
import p040o.onPlaceSelected;
import p040o.setChildDrawingOrderCallback;
import p040o.writeUInt64NoTag;

public class MerchantWalletFragment extends BaseCardFragment implements CheckCaptureModule.C6375a.MediaMetadataCompat {
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$SearchResultReceiver;
    private MerchantWalletViewPagerAdapter RatingCompat;
    @BindView
    TextView mTotalAmount;
    @HmlPinActivity
    public SettingsCacheBehavior merchantWalletPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85552131493782, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new confirmRpRegistration(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new confirmRpRegistration(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new confirmRpRegistration(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.merchantWalletPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onResume() {
        MerchantWalletViewPagerAdapter merchantWalletViewPagerAdapter;
        super.onResume();
        boolean z = false;
        if (this.merchantWalletPresenter.write() && (merchantWalletViewPagerAdapter = this.RatingCompat) != null) {
            SettingsCacheBehavior settingsCacheBehavior = this.merchantWalletPresenter;
            List<doWriteToLog> list = merchantWalletViewPagerAdapter.IconCompatParcelizer;
            List<onPlaceSelected> MediaBrowserCompat$ItemReceiver = settingsCacheBehavior.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver == null) {
                if (settingsCacheBehavior.write()) {
                    settingsCacheBehavior.IconCompatParcelizer();
                    return;
                }
                CompositeCreateReportSpiCall compositeCreateReportSpiCall = CompositeCreateReportSpiCall.MediaBrowserCompat$ItemReceiver;
                if (settingsCacheBehavior.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    compositeCreateReportSpiCall.IconCompatParcelizer(settingsCacheBehavior.RatingCompat);
                }
            } else if (list != null) {
                TransformedImmutableList.C38711 r5 = settingsCacheBehavior.write;
                boolean itemInvoker = settingsCacheBehavior.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
                onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "list");
                List<Out> MediaBrowserCompat$ItemReceiver2 = TransformedImmutableList.C38711.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, new TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver(r5, itemInvoker, true));
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "transformList(list) { tr…t, isMasked, isSummary) }");
                if (!list.equals(MediaBrowserCompat$ItemReceiver2)) {
                    CompositeCreateReportSpiCall.C31921 r0 = new writeUInt64NoTag.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2) {
                        private final /* synthetic */ List IconCompatParcelizer;

                        public final void IconCompatParcelizer(
/*
Method generation error in method: o.CompositeCreateReportSpiCall.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CompositeCreateReportSpiCall.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                    if (settingsCacheBehavior.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        r0.IconCompatParcelizer(settingsCacheBehavior.RatingCompat);
                    }
                }
            }
        } else if (this.merchantWalletPresenter.write()) {
            this.merchantWalletPresenter.IconCompatParcelizer();
        } else {
            if (this.mViewPager.getAdapter() == this.MediaBrowserCompat$CustomActionResultReceiver) {
                SettingsCacheBehavior settingsCacheBehavior2 = this.merchantWalletPresenter;
                List<onPlaceSelected> MediaBrowserCompat$ItemReceiver3 = settingsCacheBehavior2.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    CreateReportSpiCall createReportSpiCall = new CreateReportSpiCall(settingsCacheBehavior2, MediaBrowserCompat$ItemReceiver3);
                    if (settingsCacheBehavior2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        createReportSpiCall.IconCompatParcelizer(settingsCacheBehavior2.RatingCompat);
                    }
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.merchantWalletPresenter.IconCompatParcelizer();
    }

    public void onDestroy() {
        SettingsCacheBehavior settingsCacheBehavior = this.merchantWalletPresenter;
        if (settingsCacheBehavior != null) {
            settingsCacheBehavior.onDestroy();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteToLog> list) {
        if (list.isEmpty()) {
            RelativeLayout relativeLayout = this.mParentLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.mTotalAmount.setVisibility(8);
        MerchantWalletViewPagerAdapter merchantWalletViewPagerAdapter = new MerchantWalletViewPagerAdapter(getActivity(), list);
        this.RatingCompat = merchantWalletViewPagerAdapter;
        merchantWalletViewPagerAdapter.read = new NTBPinLoginService(this);
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        if (i > 0 && i < this.RatingCompat.getCount()) {
            this.mViewPager.setCurrentItem(this.MediaBrowserCompat$SearchResultReceiver);
        }
        this.mViewPager.setAdapter(this.RatingCompat);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                int unused = MerchantWalletFragment.this.MediaBrowserCompat$SearchResultReceiver = i;
            }
        });
        read(list);
        RelativeLayout relativeLayout2 = this.mParentLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    public final void Keep() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            MerchantWalletViewPagerAdapter merchantWalletViewPagerAdapter = new MerchantWalletViewPagerAdapter(activity, Collections.emptyList());
            MediaBrowserCompat$CustomActionResultReceiver(merchantWalletViewPagerAdapter);
            merchantWalletViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = true;
            merchantWalletViewPagerAdapter.notifyDataSetChanged();
        }
    }

    public final void ax_() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            MediaBrowserCompat$CustomActionResultReceiver(new MerchantWalletViewPagerAdapter(activity, Collections.singletonList(new doWriteToLog())));
        }
        this.RatingCompat = null;
    }
}
