package com.scb.phone.view.fragment.closeaccount;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.adapter.closeaccount.AmountDetailsSuccessAdapter;
import com.scb.phone.view.custom.closeaccount.AccountAmountCustomComponent;
import com.scb.phone.view.custom.common.MultilineDataComponent;
import com.scb.phone.view.custom.investment.CustomSuccessInformation;
import com.scb.phone.view.fragment.ScreenShotFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.jmrtd.lds.ImageInfo;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CollectionTypeAdapterFactory;
import p040o.DateTypeAdapter;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PreJava9DateFormatProvider;
import p040o.expect;
import p040o.getAllTilesV3;
import p040o.getComponent;
import p040o.getOversizeImage;
import p040o.getStaticTilesV9;
import p040o.newFactory;
import p040o.nullValue;
import p040o.onStart;
import p040o.setExitButtonEnabled;
import p040o.setTapText;
import p040o.verifyRedeem;

public class CloseAccountSuccessFragment extends ScreenShotFragment<getComponent> implements IdCaptureModule.C6905a {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    @BindView
    AccountAmountCustomComponent accountAmountComponent;
    @HmlPinActivity
    public Iterables.C351911.C35201 itemFactory;
    @BindView
    LinearLayout layoutDepositDetails;
    @HmlPinActivity
    public newFactory presenter;
    @BindView
    MultilineDataComponent receivingAccountData;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Button saveSlip;
    @BindView
    CustomSuccessInformation successInformation;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;
    @BindView
    TextView tvReferenceId;
    @BindView
    TextView tvSuccessDescription;
    @BindView
    TextView tvSuccessTitle;
    @BindView
    TextView tvTransactionDate;

    public class CloseAccountSuccessfulDisplay_ViewBinding implements Unbinder {
        private CloseAccountSuccessfulDisplay IconCompatParcelizer;

        public CloseAccountSuccessfulDisplay_ViewBinding(CloseAccountSuccessfulDisplay closeAccountSuccessfulDisplay, View view) {
            this.IconCompatParcelizer = closeAccountSuccessfulDisplay;
            closeAccountSuccessfulDisplay.tvSuccessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvSuccessTitle'", TextView.class);
            closeAccountSuccessfulDisplay.tvSuccessDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_desc, "field 'tvSuccessDescription'", TextView.class);
            closeAccountSuccessfulDisplay.tvTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'tvTransactionDate'", TextView.class);
            closeAccountSuccessfulDisplay.tvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'tvReferenceId'", TextView.class);
            closeAccountSuccessfulDisplay.successInformation = (CustomSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_information, "field 'successInformation'", CustomSuccessInformation.class);
            closeAccountSuccessfulDisplay.accountAmountComponent = (AccountAmountCustomComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.closing_account_amount_data, "field 'accountAmountComponent'", AccountAmountCustomComponent.class);
            closeAccountSuccessfulDisplay.receivingAccountData = (MultilineDataComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.receiving_account_data, "field 'receivingAccountData'", MultilineDataComponent.class);
            closeAccountSuccessfulDisplay.layoutDepositDetails = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_deposit_details, "field 'layoutDepositDetails'", LinearLayout.class);
            closeAccountSuccessfulDisplay.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        }

        public final void read() {
            CloseAccountSuccessfulDisplay closeAccountSuccessfulDisplay = this.IconCompatParcelizer;
            if (closeAccountSuccessfulDisplay != null) {
                this.IconCompatParcelizer = null;
                closeAccountSuccessfulDisplay.tvSuccessTitle = null;
                closeAccountSuccessfulDisplay.tvSuccessDescription = null;
                closeAccountSuccessfulDisplay.tvTransactionDate = null;
                closeAccountSuccessfulDisplay.tvReferenceId = null;
                closeAccountSuccessfulDisplay.successInformation = null;
                closeAccountSuccessfulDisplay.accountAmountComponent = null;
                closeAccountSuccessfulDisplay.receivingAccountData = null;
                closeAccountSuccessfulDisplay.layoutDepositDetails = null;
                closeAccountSuccessfulDisplay.recyclerView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @OnClick
    public void onReturnButton() {
        newFactory newfactory = this.presenter;
        nullValue nullvalue = nullValue.IconCompatParcelizer;
        if (newfactory.RatingCompat != null) {
            nullvalue.IconCompatParcelizer(newfactory.RatingCompat);
        }
    }

    @OnClick
    @Optional
    public void onShareSlipButtonClick() {
        newFactory newfactory = this.presenter;
        CollectionTypeAdapterFactory.Adapter adapter = new CollectionTypeAdapterFactory.Adapter(newfactory);
        if (newfactory.RatingCompat != null) {
            adapter.IconCompatParcelizer(newfactory.RatingCompat);
        }
    }

    @OnClick
    @Optional
    public void onSaveSlipButtonClick() {
        newFactory newfactory = this.presenter;
        expect expect = new expect(newfactory);
        if (newfactory.RatingCompat != null) {
            expect.IconCompatParcelizer(newfactory.RatingCompat);
        }
    }

    public static CloseAccountSuccessFragment MediaBrowserCompat$ItemReceiver() {
        return new CloseAccountSuccessFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86262131493853, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        newFactory newfactory = this.presenter;
        DebitCardResetOtpActivity<R> zip = DebitCardResetOtpActivity.zip(newfactory.write.MediaBrowserCompat$CustomActionResultReceiver(), newfactory.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(), newfactory.IconCompatParcelizer.IconCompatParcelizer(), new DateTypeAdapter(newfactory));
        PreJava9DateFormatProvider preJava9DateFormatProvider = PreJava9DateFormatProvider.MediaBrowserCompat$CustomActionResultReceiver;
        if (newfactory.RatingCompat != null) {
            preJava9DateFormatProvider.IconCompatParcelizer(newfactory.RatingCompat);
        }
        newfactory.MediaBrowserCompat$ItemReceiver.write(zip, new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getComponent>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.newFactory.4.onNext(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.newFactory.4.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.newFactory.4.onError(java.lang.Throwable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.newFactory.4.onError(java.lang.Throwable):void, class status: UNLOADED
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(getComponent getcomponent) {
        this.tvSuccessTitle.setText(getString(R.string.close_account_successfuly_closeaccount));
        this.tvTransactionDate.setText(getcomponent.RatingCompat);
        this.tvReferenceId.setText(getString(R.string.reference_id, getcomponent.MediaBrowserCompat$MediaItem));
        this.tvReferenceId.setVisibility(0);
        this.tvSuccessDescription.setVisibility(8);
        this.successInformation.setData(getcomponent.IconCompatParcelizer);
        this.accountAmountComponent.setDisplayData(getcomponent.MediaBrowserCompat$CustomActionResultReceiver);
        this.accountAmountComponent.netAmountButton.setVisibility(8);
        this.receivingAccountData.setDisplay(getcomponent.MediaBrowserCompat$ItemReceiver);
        if (getcomponent.write == null || getcomponent.write.isEmpty()) {
            this.layoutDepositDetails.setVisibility(8);
            return;
        }
        this.layoutDepositDetails.setVisibility(0);
        getContext();
        this.recyclerView.setAdapter(new AmountDetailsSuccessAdapter(getcomponent.write));
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        String string = getString(R.string.saved_slip);
        getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
        }
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        String string = getString(R.string.saved_slip_error);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.root_view, string, getoversizeimage);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent putExtra = new Intent(getActivity(), HomeActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        FragmentActivity activity = getActivity();
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write(boolean z) {
        this.saveSlip.setVisibility(z ? 0 : 8);
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final void IconCompatParcelizer(getComponent getcomponent, boolean z, boolean z2) {
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new C5894xe515ad8b(this.themesSlipPresenter), new CloseAccountSuccessfulDisplay(getcomponent, z, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new getAllTilesV3(this, z), new getStaticTilesV9(this));
    }

    public class CloseAccountSuccessfulDisplay extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        final getComponent IconCompatParcelizer;
        @BindView
        AccountAmountCustomComponent accountAmountComponent;
        @BindView
        LinearLayout layoutDepositDetails;
        @BindView
        MultilineDataComponent receivingAccountData;
        @BindView
        RecyclerView recyclerView;
        @BindView
        CustomSuccessInformation successInformation;
        @BindView
        TextView tvReferenceId;
        @BindView
        TextView tvSuccessDescription;
        @BindView
        TextView tvSuccessTitle;
        @BindView
        TextView tvTransactionDate;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CloseAccountSuccessfulDisplay(p040o.getComponent r4, boolean r5, boolean r6) {
            /*
                r2 = this;
                com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment.this = r3
                java.util.Calendar r3 = java.util.Calendar.getInstance()
                long r0 = r3.getTimeInMillis()
                java.lang.String r3 = java.lang.String.valueOf(r0)
                java.lang.String r0 = "id"
                p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.read
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 2131494350(0x7f0c05ce, float:1.8612206E38)
                r2.<init>(r0, r3, r5, r6)
                r2.IconCompatParcelizer = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment.CloseAccountSuccessfulDisplay.<init>(com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment, o.getComponent, boolean, boolean):void");
        }
    }

    public final /* bridge */ /* synthetic */ void read(getComponent getcomponent, boolean z) {
        verifyRedeem.read(this, getcomponent, false, z);
    }
}
