package com.scb.phone.view.fragment.accountsummary;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CheckCaptureModule$a$MediaBrowserCompat$MediaItem;
import p040o.DebitCardRequestInputActivity;
import p040o.FragmentBuilder_BindBaseEBillSubscriptionReviewFragment;
import p040o.HmlPinActivity;
import p040o.MapConstraints;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ReportUploader;
import p040o.areReportsAvailable;
import p040o.count;
import p040o.getExpiresAtFrom;
import p040o.getIdps;
import p040o.getKernelIDSrcAtop;
import p040o.getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver;
import p040o.getPredictiveTiles;
import p040o.immediateCheckedFuture;
import p040o.immediateFuture;
import p040o.makeUninterruptible;
import p040o.matchesAnyOf;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.uploadReport;
import p040o.uploadReportsAsync;
import p040o.writeSessionEventAppCustomAttributes;
import p040o.zzmd;
import p040o.zzsj;
import p040o.zzvf;

public class DepositFragment extends BaseCardFragment implements CheckCaptureModule$a$MediaBrowserCompat$MediaItem {
    private DepositViewPagerAdapter MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getExpiresAtFrom depositPresenter;
    @BindView
    protected View layoutEmptyAccount;
    @BindView
    protected TextView mTotalAmount;
    @BindView
    protected TextView titleAccounts;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85512131493778, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new getPredictiveTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new getPredictiveTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new getPredictiveTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.depositPresenter.MediaBrowserCompat$ItemReceiver(this);
        getExpiresAtFrom getexpiresatfrom = this.depositPresenter;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        if (zzmd.zzm.zzb.zza.JURISTIC == zza) {
            writeSessionEventAppCustomAttributes writesessioneventappcustomattributes = writeSessionEventAppCustomAttributes.IconCompatParcelizer;
            if (getexpiresatfrom.RatingCompat != null) {
                z = true;
            }
            if (z) {
                writesessioneventappcustomattributes.IconCompatParcelizer(getexpiresatfrom.RatingCompat);
            }
        }
        return inflate;
    }

    public void onResume() {
        List list;
        super.onResume();
        onActivityCreated adapter = this.mViewPager.getAdapter();
        DepositViewPagerAdapter depositViewPagerAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z = true;
        if (adapter == depositViewPagerAdapter && depositViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver != null) {
            getExpiresAtFrom getexpiresatfrom = this.depositPresenter;
            List<immediateCheckedFuture> list2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            zzsj MediaBrowserCompat$ItemReceiver = getexpiresatfrom.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver == null) {
                ReportUploader reportUploader = ReportUploader.read;
                if (getexpiresatfrom.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    reportUploader.IconCompatParcelizer(getexpiresatfrom.RatingCompat);
                }
            } else if (list2 != null) {
                MapConstraints.ConstrainedMultimap.C36372 r5 = getexpiresatfrom.read;
                zzvf RatingCompat = getexpiresatfrom.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.RatingCompat();
                if (RatingCompat != null) {
                    list = RatingCompat.MediaBrowserCompat$ItemReceiver;
                } else {
                    list = new ArrayList();
                }
                makeUninterruptible IconCompatParcelizer = r5.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, list, getexpiresatfrom.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setItemInvoker());
                if (!list2.equals(IconCompatParcelizer.MediaBrowserCompat$ItemReceiver())) {
                    getexpiresatfrom.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer;
                    uploadReportsAsync uploadreportsasync = new uploadReportsAsync(IconCompatParcelizer);
                    if (getexpiresatfrom.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        uploadreportsasync.IconCompatParcelizer(getexpiresatfrom.RatingCompat);
                    }
                }
            }
        } else {
            if (this.mViewPager.getAdapter() == this.MediaBrowserCompat$CustomActionResultReceiver) {
                getExpiresAtFrom getexpiresatfrom2 = this.depositPresenter;
                zzsj MediaBrowserCompat$ItemReceiver2 = getexpiresatfrom2.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    areReportsAvailable arereportsavailable = new areReportsAvailable(getexpiresatfrom2, MediaBrowserCompat$ItemReceiver2);
                    if (getexpiresatfrom2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        arereportsavailable.IconCompatParcelizer(getexpiresatfrom2.RatingCompat);
                    }
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getExpiresAtFrom getexpiresatfrom = this.depositPresenter;
        String stackedBackground = setStackedBackground();
        if (!getexpiresatfrom.MediaDescriptionCompat) {
            boolean z = true;
            getexpiresatfrom.MediaDescriptionCompat = true;
            if (getexpiresatfrom.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getexpiresatfrom.RatingCompat.Keep();
            }
            getexpiresatfrom.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            getexpiresatfrom.IconCompatParcelizer.IconCompatParcelizer(new getExpiresAtFrom.read(stackedBackground.equalsIgnoreCase("en")));
        }
    }

    public void onDestroy() {
        getExpiresAtFrom getexpiresatfrom = this.depositPresenter;
        if (getexpiresatfrom != null) {
            getexpiresatfrom.onDestroy();
        }
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r0.MediaBrowserCompat$ItemReceiver == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.makeUninterruptible r7) {
        /*
            r6 = this;
            o.getExpiresAtFrom r0 = r6.depositPresenter
            o.transparency r1 = r0.IconCompatParcelizer
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.MediaBrowserCompat$ItemReceiver
            o.zzvf r1 = r1.RatingCompat()
            java.util.List<o.zzup> r2 = r1.MediaBrowserCompat$ItemReceiver
            boolean r2 = r2.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0046
            java.util.List<o.onIndoorLevelActivated> r2 = r1.read
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            java.util.List<o.zzrt> r2 = r1.MediaBrowserCompat$MediaItem
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            java.util.List<o.zzrt> r2 = r1.MediaBrowserCompat$SearchResultReceiver
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            java.util.List<o.zzur> r2 = r1.MediaDescriptionCompat
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            java.util.List<o.zzun> r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0046
            java.util.List<o.zzry> r1 = r1.RatingCompat
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0046
            r1 = r3
            goto L_0x0047
        L_0x0046:
            r1 = r4
        L_0x0047:
            if (r1 == 0) goto L_0x0060
            o.transparency r0 = r0.IconCompatParcelizer
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r0 = r0.MediaBrowserCompat$ItemReceiver
            o.zzvf r0 = r0.RatingCompat()
            if (r0 == 0) goto L_0x0056
            o.GoogleMap$OnMapClickListener r0 = r0.MediaMetadataCompat
            goto L_0x005b
        L_0x0056:
            o.GoogleMap$OnMapClickListener r0 = new o.GoogleMap$OnMapClickListener
            r0.<init>(r4, r4)
        L_0x005b:
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            java.lang.String r0 = ""
            r1 = 0
            if (r3 == 0) goto L_0x0093
            com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter r7 = new com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            java.util.List r3 = java.util.Collections.emptyList()
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            boolean r5 = r5 instanceof com.scb.phone.view.activity.PreLoadCheckActivity
            if (r5 == 0) goto L_0x0082
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            com.scb.phone.view.activity.PreLoadCheckActivity r1 = (com.scb.phone.view.activity.PreLoadCheckActivity) r1
            o.zzmd$zzm$zzb$zza r1 = r1.setTitleOptional()
        L_0x0082:
            r7.<init>(r2, r3, r1)
            r6.MediaBrowserCompat$CustomActionResultReceiver(r7)
            android.widget.TextView r7 = r6.mTotalAmount
            r7.setText(r0)
            android.view.View r7 = r6.layoutEmptyAccount
            r7.setVisibility(r4)
            return
        L_0x0093:
            androidx.viewpager.widget.ViewPager r2 = r6.mViewPager
            r2.setVisibility(r4)
            android.view.View r2 = r6.layoutEmptyAccount
            r3 = 8
            r2.setVisibility(r3)
            java.util.List r2 = r7.MediaBrowserCompat$ItemReceiver()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b1
            android.widget.RelativeLayout r7 = r6.mParentLayout
            if (r7 == 0) goto L_0x00b0
            r7.setVisibility(r3)
        L_0x00b0:
            return
        L_0x00b1:
            android.widget.TextView r2 = r6.mTotalAmount
            java.lang.String r3 = r7.IconCompatParcelizer()
            if (r3 == 0) goto L_0x00bd
            java.lang.String r0 = r7.IconCompatParcelizer()
        L_0x00bd:
            r2.setText(r0)
            com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter r0 = new com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            java.util.List r3 = r7.MediaBrowserCompat$ItemReceiver()
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            boolean r5 = r5 instanceof com.scb.phone.view.activity.PreLoadCheckActivity
            if (r5 == 0) goto L_0x00dc
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            com.scb.phone.view.activity.PreLoadCheckActivity r1 = (com.scb.phone.view.activity.PreLoadCheckActivity) r1
            o.zzmd$zzm$zzb$zza r1 = r1.setTitleOptional()
        L_0x00dc:
            r0.<init>(r2, r3, r1)
            r6.MediaBrowserCompat$SearchResultReceiver = r0
            o.getExpiresAtFrom r1 = r6.depositPresenter
            r0.IconCompatParcelizer = r1
            androidx.viewpager.widget.ViewPager r0 = r6.mViewPager
            com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter r1 = r6.MediaBrowserCompat$SearchResultReceiver
            r0.setAdapter(r1)
            androidx.viewpager.widget.ViewPager r0 = r6.mViewPager
            r0.setClipToPadding(r4)
            androidx.viewpager.widget.ViewPager r0 = r6.mViewPager
            android.content.res.Resources r1 = r6.getResources()
            r2 = 2131166023(0x7f070347, float:1.794628E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            android.content.res.Resources r3 = r6.getResources()
            int r2 = r3.getDimensionPixelOffset(r2)
            r0.setPadding(r1, r4, r2, r4)
            java.util.List r7 = r7.MediaBrowserCompat$ItemReceiver()
            r6.read(r7)
            android.widget.RelativeLayout r7 = r6.mParentLayout
            if (r7 == 0) goto L_0x0117
            r7.setVisibility(r4)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.accountsummary.DepositFragment.read(o.makeUninterruptible):void");
    }

    public final void Keep() {
        zzmd.zzm.zzb.zza zza;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.mViewPager.setVisibility(0);
            this.layoutEmptyAccount.setVisibility(8);
            List emptyList = Collections.emptyList();
            if (getActivity() instanceof PreLoadCheckActivity) {
                zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
            } else {
                zza = null;
            }
            DepositViewPagerAdapter depositViewPagerAdapter = new DepositViewPagerAdapter(activity, emptyList, zza);
            MediaBrowserCompat$CustomActionResultReceiver(depositViewPagerAdapter);
            depositViewPagerAdapter.write = true;
            depositViewPagerAdapter.notifyDataSetChanged();
        }
    }

    public final void ax_() {
        zzmd.zzm.zzb.zza zza;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            List singletonList = Collections.singletonList(immediateCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver());
            if (getActivity() instanceof PreLoadCheckActivity) {
                zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
            } else {
                zza = null;
            }
            MediaBrowserCompat$CustomActionResultReceiver(new DepositViewPagerAdapter(activity, singletonList, zza));
        }
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    public final void write(int i, List<immediateCheckedFuture> list) {
        Intent intent = new Intent(getContext(), DepositDetailActivity.class);
        intent.putParcelableArrayListExtra("com.scb.phone.EXTRA_DEPOSIT_LIST", new ArrayList(list));
        intent.putExtra("com.scb.phone.EXTRA_SELECTED_DEPOSIT", i);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(final immediateFuture immediatefuture) {
        MediaBrowserCompat$CustomActionResultReceiver(immediatefuture, new FragmentBuilder_BindBaseEBillSubscriptionReviewFragment() {
            public final void MediaBrowserCompat$ItemReceiver() {
                getExpiresAtFrom getexpiresatfrom = DepositFragment.this.depositPresenter;
                String str = immediatefuture.IconCompatParcelizer;
                getexpiresatfrom.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(new DebitCardRequestInputActivity(str, immediatefuture.MediaBrowserCompat$ItemReceiver) {
                    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
                    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

                    public final void onSubscribe(
/*
Method generation error in method: o.getExpiresAtFrom.2.onSubscribe(o.BulkTransferDeepLinkActivity):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getExpiresAtFrom.2.onSubscribe(o.BulkTransferDeepLinkActivity):void, class status: UNLOADED
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

                    public final void onComplete(
/*
Method generation error in method: o.getExpiresAtFrom.2.onComplete():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getExpiresAtFrom.2.onComplete():void, class status: UNLOADED
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
Method generation error in method: o.getExpiresAtFrom.2.onError(java.lang.Throwable):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getExpiresAtFrom.2.onError(java.lang.Throwable):void, class status: UNLOADED
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
                }, new matchesAnyOf.write(str), getexpiresatfrom.write);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                getExpiresAtFrom getexpiresatfrom = DepositFragment.this.depositPresenter;
                String str = immediatefuture.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = immediatefuture.IconCompatParcelizer;
                String str3 = immediatefuture.MediaBrowserCompat$ItemReceiver;
                if (str != null) {
                    uploadReport uploadreport = new uploadReport(str, str2, str3);
                    if (getexpiresatfrom.RatingCompat != null) {
                        uploadreport.IconCompatParcelizer(getexpiresatfrom.RatingCompat);
                    }
                }
            }
        });
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        read(str, str2);
    }

    public final void read(String str, String str2, String str3) {
        count count = this.depositPresenter.MediaBrowserCompat$ItemReceiver;
        OffsetDateTime now = OffsetDateTime.now();
        onGetStartedClick.IconCompatParcelizer((Object) now, "now");
        count.write(new TopUpTargetTabFragment.read(str3, "contextual_banner", str2, now));
        getKernelIDSrcAtop.read read = getKernelIDSrcAtop.CREATOR;
        onGetStartedClick.write((Object) str2, "adId");
        onGetStartedClick.write((Object) str3, "adName");
        read(getKernelIDSrcAtop.read.read(str2, str3, getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver.CLICK));
        IconCompatParcelizer(str);
    }

    public final void IconCompatParcelizer() {
        this.titleAccounts.setText(getString(R.string.account_summary_my_business));
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DepositFragment depositFragment) {
        getExpiresAtFrom getexpiresatfrom = depositFragment.depositPresenter;
        String stackedBackground = depositFragment.setStackedBackground();
        if (!getexpiresatfrom.MediaDescriptionCompat) {
            boolean z = true;
            getexpiresatfrom.MediaDescriptionCompat = true;
            if (getexpiresatfrom.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getexpiresatfrom.RatingCompat.Keep();
            }
            getexpiresatfrom.IconCompatParcelizer.read();
            getexpiresatfrom.IconCompatParcelizer.IconCompatParcelizer(new getExpiresAtFrom.read(stackedBackground.equalsIgnoreCase("en")));
        }
    }
}
