package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlHomeAddressActivity;
import com.scb.phone.view.activity.hml.HmlNTBMonthlyIncomeAboutActivity;
import com.scb.phone.view.activity.hml.HmlNTBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.custom.common.DateInputWithoutError;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Arrays;
import java.util.List;
import org.jmrtd.cbeff.ISO781611;
import p040o.ActivityBuilder_BindCardPaySelectedActivity;
import p040o.ActivityBuilder_BindCardlessATMActivity;
import p040o.ActivityBuilder_BindCardlessATMReviewActivity;
import p040o.ActivityBuilder_BindCardlessATMTutorialActivity;
import p040o.ActivityBuilder_BindCardlessAtmCoachMarkActivity;
import p040o.ActivityBuilder_BindCardlessAtmInfoActivity;
import p040o.ActivityBuilder_BindChequeReviewActivity;
import p040o.ActivityBuilder_BindChequeStatusActivity;
import p040o.ActivityBuilder_BindContactUsActivity;
import p040o.ActivityBuilder_BindCreateRecipientGroupActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkModule_HmlLatestPersonalInformationDeepLinkActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule;
import p040o.RotateType;
import p040o.UTCStringFromDate;
import p040o.ZSYR2K;
import p040o.didCrashOnPreviousExecution;
import p040o.getFatalSessionFilesDir;
import p040o.getPageID$MediaBrowserCompat$ItemReceiver;
import p040o.getRegionType;
import p040o.onGetStartedClick;
import p040o.readBitmapFromFileUsingIp;
import p040o.rotateImage;
import p040o.saveIpBitmap;
import p040o.saveIpJPG;
import p040o.saveToGallery;
import p040o.setContentDescription;
import p040o.setResultCode;
import p040o.setTapText;
import p040o.setTypeName;
import p040o.zzcz;

public class HmlNTBPersonalInfoFragment extends HmlBasePersonalInfoFragment implements PassportCaptureModule.RttiExceptionResponseDeserializer {
    @BindView
    CheckBox addressCheckbox;
    @BindView
    RelativeLayout addressCheckboxView;
    @BindView
    DateInputText birthDateInput;
    @BindView
    ProgressStateBar breadcrumbsNtb;
    @BindView
    View dateOfBirthArea;
    @BindView
    DateInputWithoutError expiryDate;
    @BindView
    CommonInputViewGroup firstNameEnglish;
    @BindView
    LinearLayout homeAddressArea;
    @BindView
    TextView homeAddressError;
    @BindView
    View homeAddressLayout;
    @BindView
    TextView homeAddressTitle;
    @BindView
    TextView homeView;
    @BindView
    DateInputWithoutError issueDate;
    @BindView
    TextView issueExpiryDateError;
    @BindView
    CommonInputViewGroup lastNameEnglish;
    @BindView
    LinearLayout llNTBDatesSection;
    @BindView
    RelativeLayout mailingAddressLayout;
    @BindView
    ImageView nationalIdCard;
    @BindView
    CommonInputViewGroup nationalIdInput;
    @HmlPinActivity
    public setResultCode presenter;
    @BindView
    TextView titleError;
    @BindView
    CustomSpinnerWithTitle titleSpinner;

    public static HmlNTBPersonalInfoFragment MediaSessionCompat$ResultReceiverWrapper() {
        return new HmlNTBPersonalInfoFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setResultCode setresultcode = this.presenter;
        if (setresultcode.RatingCompat != null) {
            setresultcode.RatingCompat.AlertController$RecycleListView();
        }
        setresultcode.MediaDescriptionCompat.write(DebitCardResetOtpActivity.zip(setresultcode.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(), setresultcode.MediaBrowserCompat$MediaItem.read(), setresultcode.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(), setresultcode.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer("loanOrigination"), setresultcode.setHasDecor.read().doOnNext(new readBitmapFromFileUsingIp(setresultcode)), new saveIpBitmap(setresultcode)), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<didCrashOnPreviousExecution>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.setResultCode.4.onNext(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setResultCode.4.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.setResultCode.4.onError(java.lang.Throwable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setResultCode.4.onError(java.lang.Throwable):void, class status: UNLOADED
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
        this.IconCompatParcelizer = this.presenter;
        this.nationalIdCard.setImageResource(R.drawable.national_id_ntb_personal_info);
        this.titleSpinner.setVisibility(0);
        this.firstNameEnglish.setVisibility(0);
        this.lastNameEnglish.setVisibility(0);
        this.birthDateInput.setVisibility(0);
        this.nationalIdInput.setVisibility(0);
        this.llNTBDatesSection.setVisibility(0);
        this.issueDate.setVisibility(0);
        this.expiryDate.setVisibility(0);
        this.homeAddressTitle.setVisibility(0);
        this.homeAddressLayout.setVisibility(0);
        this.addressCheckboxView.setVisibility(0);
        this.mobileNumberOtpMsg.setVisibility(0);
        this.breadcrumbsNtb.setStates(Arrays.asList(getResources().getStringArray(R.array.f64702130903049)));
        this.breadcrumbsNtb.setVisibility(0);
        this.breadcrumbsNtb.setCurrentState(0);
        AppCompatViewInflater();
        setExpandedFormat();
        this.firstNameEnglish.clearFocus();
        this.firstNameEnglish.mEditText.setInputType(524432);
        this.firstNameEnglish.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ISO781611.BIOMETRIC_SUBTYPE_TAG)});
        write(this.firstNameEnglish, getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH);
        this.lastNameEnglish.clearFocus();
        this.lastNameEnglish.mEditText.setInputType(524432);
        this.lastNameEnglish.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        write(this.lastNameEnglish, getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH);
        this.homeAddressArea.setVisibility(0);
        this.homeView.addTextChangedListener(new HmlNTBPersonalInfoFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        this.homeView.clearFocus();
        this.dateOfBirthArea.setVisibility(0);
        this.birthDateInput.setDateUpdatedListener(new ActivityBuilder_BindCardlessATMReviewActivity(this));
        this.birthDateInput.setValidateInputListener(new ActivityBuilder_BindCreateRecipientGroupActivity(this));
        this.issueDate.setDateUpdatedListener(new ActivityBuilder_BindCardlessATMActivity(this));
        this.issueDate.setValidateInputListener(new ActivityBuilder_BindCardPaySelectedActivity(this));
        this.expiryDate.setDateUpdatedListener(new ActivityBuilder_BindCardlessATMTutorialActivity(this));
        this.expiryDate.setValidateInputListener(new ActivityBuilder_BindChequeReviewActivity(this));
        CommonInputViewGroup commonInputViewGroup = this.nationalIdInput;
        commonInputViewGroup.write = false;
        commonInputViewGroup.mEditClearImageButton.setVisibility(8);
        this.nationalIdInput.mEditText.setInputType(2);
        this.nationalIdInput.mEditText.setKeyListener(DigitsKeyListener.getInstance("1234567890-"));
        this.nationalIdInput.setOnPasteListener(new ActivityBuilder_BindChequeStatusActivity(this));
        CommonInputViewGroup commonInputViewGroup2 = this.nationalIdInput;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup2.mEditText, "X-XXXX-XXXXX-XX-X", new ActivityBuilder_BindCardlessAtmInfoActivity(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                HmlNTBPersonalInfoFragment.this.presenter.read(str);
            }

            public final void write(String str) {
                HmlNTBPersonalInfoFragment.this.presenter.read(str);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write = true;
        commonInputViewGroup2.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        this.mailingView.setHint(R.string.hml_personal_info_mailing_address_hint);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final void AppCompatActivity() {
        this.expiryDate.setDateUpdatedListener(new ActivityBuilder_BindCardlessATMTutorialActivity(this));
        this.expiryDate.setValidateInputListener(new ActivityBuilder_BindChequeReviewActivity(this));
    }

    /* access modifiers changed from: protected */
    public final void write(CommonInputViewGroup commonInputViewGroup, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        commonInputViewGroup.setOnBackListener(new DeepLinkModule_HmlLatestPersonalInformationDeepLinkActivity(this));
        commonInputViewGroup.setOnEditorActionListener(new ActivityBuilder_BindCardlessAtmCoachMarkActivity(this));
        commonInputViewGroup.setFocusListener(new ActivityBuilder_BindContactUsActivity(this, getpageid_mediabrowsercompat_itemreceiver, commonInputViewGroup));
    }

    @OnCheckedChanged
    public void addressCheckboxCheckedChange() {
        this.presenter.MediaBrowserCompat$ItemReceiver(this.addressCheckbox.isChecked());
    }

    public final void RatingCompat() {
        this.mailingArrow.setEnabled(true);
        this.mailingView.setEnabled(true);
        this.mailingView.setText(getString(R.string.hml_personal_info_mailing_address_hint));
        TextView textView = this.mailingView;
        getResources();
        textView.setTextColor(-6975079);
    }

    public final void read() {
        setResultCode setresultcode = this.presenter;
        String obj = this.firstNameView.mEditText.getText().toString();
        String obj2 = this.lastNameView.mEditText.getText().toString();
        String obj3 = this.firstNameEnglish.mEditText.getText().toString();
        String obj4 = this.lastNameEnglish.mEditText.getText().toString();
        String obj5 = this.nationalIdInput.mEditText.getText().toString();
        String write = this.laserIdInput.write();
        String obj6 = this.mobileNumberView.mEditText.getText().toString();
        String obj7 = this.emailView.mEditText.getText().toString();
        boolean isChecked = this.addressCheckbox.isChecked();
        String obj8 = this.income.getText().toString();
        int selectedItemPosition = this.titleSpinner.spinner.getSelectedItemPosition();
        String charSequence = this.titleSpinner.textViewDescription.getText().toString();
        String obj9 = this.birthDateInput.inputEditText.getText().toString();
        String obj10 = this.issueDate.inputEditText.getText().toString();
        String obj11 = this.expiryDate.inputEditText.getText().toString();
        String MediaBrowserCompat$ItemReceiver = this.maritalStatusSpinner.MediaBrowserCompat$ItemReceiver();
        String MediaBrowserCompat$ItemReceiver2 = this.residentialStatusSpinner.MediaBrowserCompat$ItemReceiver();
        String MediaBrowserCompat$ItemReceiver3 = this.educationLevelSpinner.MediaBrowserCompat$ItemReceiver();
        setStackedBackground();
        if (setresultcode.RatingCompat != null) {
            setresultcode.RatingCompat.AlertController$RecycleListView();
        }
        setContentDescription.write write2 = setContentDescription.write.MAILING;
        DebitCardResetOtpActivity<R> flatMap = setresultcode.IconCompatParcelizer.IconCompatParcelizer(write2).flatMap(new UTCStringFromDate(write2));
        setContentDescription.write write3 = setContentDescription.write.HOME;
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity = flatMap;
        saveIpJPG saveipjpg = r1;
        DebitCardResetOtpActivity<R> flatMap2 = setresultcode.IconCompatParcelizer.IconCompatParcelizer(write3).flatMap(new UTCStringFromDate(write3));
        DebitCardResetOtpActivity<zzcz.zzg> MediaBrowserCompat$CustomActionResultReceiver = setresultcode.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver();
        saveIpJPG saveipjpg2 = new saveIpJPG(setresultcode, isChecked, selectedItemPosition, charSequence, obj, obj2, obj3, obj4, obj9, obj6, obj7, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3, obj8, obj5, write, obj10, obj11);
        setResultCode setresultcode2 = setresultcode;
        setresultcode2.AlertController$RecycleListView.write(DebitCardResetOtpActivity.zip(debitCardResetOtpActivity, flatMap2, MediaBrowserCompat$CustomActionResultReceiver, saveipjpg).flatMap(new saveToGallery(setresultcode2)), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void>() {
            public final void onComplete(
/*
Method generation error in method: o.setResultCode.3.onComplete():void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setResultCode.3.onComplete():void, class status: UNLOADED
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
Method generation error in method: o.setResultCode.3.onError(java.lang.Throwable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setResultCode.3.onError(java.lang.Throwable):void, class status: UNLOADED
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
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("monthly_income", this.income.getText().toString())};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_ntb_verification_personal_info", zsyr2kArr);
        }
    }

    @OnClick
    public void onHomeClick() {
        setResultCode setresultcode = this.presenter;
        getRegionType getregiontype = getRegionType.MediaBrowserCompat$ItemReceiver;
        if (setresultcode.RatingCompat != null) {
            getregiontype.IconCompatParcelizer(setresultcode.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.nationalIdInput.setText(str);
    }

    public final void read(boolean z) {
        if (z) {
            CommonInputViewGroup commonInputViewGroup = this.nationalIdInput;
            commonInputViewGroup.write = true;
            commonInputViewGroup.mEditClearImageButton.setVisibility(0);
            return;
        }
        CommonInputViewGroup commonInputViewGroup2 = this.nationalIdInput;
        commonInputViewGroup2.write = false;
        commonInputViewGroup2.mEditClearImageButton.setVisibility(8);
    }

    @OnClick
    public void onAboutClicked(View view) {
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBMonthlyIncomeAboutActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(final String str, List<String> list, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        if (getpageid_mediabrowsercompat_itemreceiver == getPageID$MediaBrowserCompat$ItemReceiver.TITLE) {
            IconCompatParcelizer(this.titleSpinner, str, list, R.string.hml_personal_info_select);
            this.titleSpinner.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
                public final void write() {
                }

                public final void IconCompatParcelizer() {
                    HmlNTBPersonalInfoFragment.this.write(getPageID$MediaBrowserCompat$ItemReceiver.TITLE);
                    HmlNTBPersonalInfoFragment.this.presenter.MediaBrowserCompat$ItemReceiver(HmlNTBPersonalInfoFragment.this.titleSpinner.spinner.getSelectedItemPosition(), str, getPageID$MediaBrowserCompat$ItemReceiver.TITLE);
                }
            });
            return;
        }
        super.write(str, list, getpageid_mediabrowsercompat_itemreceiver);
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.separator.setVisibility(0);
        this.firstNameEnglish.setVisibility(0);
        this.lastNameEnglish.setVisibility(0);
        CommonInputViewGroup commonInputViewGroup = this.firstNameEnglish;
        if (str != null && !str.isEmpty()) {
            commonInputViewGroup.setText(str);
        }
        CommonInputViewGroup commonInputViewGroup2 = this.lastNameEnglish;
        if (str2 != null && !str2.isEmpty()) {
            commonInputViewGroup2.setText(str2);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo37808x50fd9e4a() {
        TextView textView = this.mailingView;
        getResources();
        textView.setTextColor(-6975079);
        this.mailingView.setText(this.homeView.getText());
    }

    public final void MediaDescriptionCompat(String str) {
        this.titleSpinner.setDisabledText(str);
    }

    /* renamed from: com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment$2 */
    static /* synthetic */ class C60022 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getPageID$MediaBrowserCompat$ItemReceiver[] r0 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.TITLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.HOME_ADDRESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.EMAIL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.NATIONAL_ID     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x006c }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.BIRTH_DATE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.ISSUE_DATE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x009c }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MOBILE_NUMBER     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment.C60022.<clinit>():void");
        }
    }

    public final void IconCompatParcelizer(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        switch (C60022.read[getpageid_mediabrowsercompat_itemreceiver.ordinal()]) {
            case 1:
                this.titleSpinner.setEnabled(false);
                return;
            case 2:
                this.firstNameView.setEnabled(false);
                return;
            case 3:
                this.lastNameView.setEnabled(false);
                return;
            case 5:
                this.mailingView.setEnabled(false);
                TextView textView = this.mailingView;
                getResources();
                textView.setTextColor(-6975079);
                this.mailingArrow.setEnabled(false);
                return;
            case 6:
                this.emailView.setEnabled(false);
                return;
            case 7:
                this.nationalIdInput.setEnabled(false);
                return;
            case 8:
                this.laserIdInput.setEnabled(false);
                return;
            case 9:
                this.expiryDate.setEnabled(false);
                return;
            case 10:
                this.birthDateInput.setEnabled(false);
                return;
            case 11:
                this.issueDate.setEnabled(false);
                return;
            case 12:
                this.firstNameEnglish.setEnabled(false);
                return;
            case 13:
                this.lastNameEnglish.setEnabled(false);
                return;
            default:
                return;
        }
    }

    public final void MediaDescriptionCompat() {
        if (getContext() != null) {
            HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver hmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver = HmlNTBeKYCLandingActivity.MediaDescriptionCompat;
            Context context = getContext();
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlNTBeKYCLandingActivity.class);
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
    }

    public final void MediaBrowserCompat$ItemReceiver(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C60022.read[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i == 4) {
            this.homeAddressError.setVisibility(0);
        } else if (i != 7) {
            switch (i) {
                case 9:
                    this.expiryDate.setHighlight(true);
                    this.issueExpiryDateError.setVisibility(0);
                    return;
                case 10:
                    this.birthDateInput.setErrorText(getString(R.string.hml_personal_info_date_birth_error));
                    this.birthDateInput.setErrorVisible(true);
                    return;
                case 11:
                    this.issueDate.setHighlight(true);
                    this.issueExpiryDateError.setVisibility(0);
                    return;
                case 12:
                    this.firstNameEnglish.setErrorText(getString(R.string.hml_personal_info_first_name_eng_only));
                    this.firstNameEnglish.MediaBrowserCompat$ItemReceiver();
                    return;
                case 13:
                    this.lastNameEnglish.setErrorText(getString(R.string.hml_personal_info_last_name_eng_only));
                    this.lastNameEnglish.MediaBrowserCompat$ItemReceiver();
                    return;
                case 14:
                    return;
                case 15:
                    this.mobileNumberOtpMsg.setVisibility(8);
                    this.mobileNumberView.setErrorText(getString(R.string.hml_personal_info_invalid_format));
                    this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
                    return;
                default:
                    super.MediaBrowserCompat$ItemReceiver(getpageid_mediabrowsercompat_itemreceiver);
                    return;
            }
        } else {
            this.nationalIdInput.setErrorText(getString(R.string.auto_personal_id_card_info_error_invalid));
            this.nationalIdInput.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C60022.read[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        boolean z = true;
        if (i == 1) {
            this.titleError.setVisibility(8);
            this.titleSpinner.setSpinnerBackground(Boolean.FALSE);
        } else if (i == 4) {
            this.homeAddressError.setVisibility(8);
        } else if (i == 7) {
            this.nationalIdInput.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (i != 15) {
            switch (i) {
                case 9:
                    this.issueDate.setErrorVisible(false);
                    this.expiryDate.setErrorVisible(false);
                    this.expiryDate.setHighlight(false);
                    setResultCode setresultcode = this.presenter;
                    String obj = this.issueDate.inputEditText.getText().toString();
                    String obj2 = this.expiryDate.inputEditText.getText().toString();
                    if (setresultcode.MediaBrowserCompat$ItemReceiver(obj) && setresultcode.MediaBrowserCompat$ItemReceiver(obj2)) {
                        setTypeName settypename = setTypeName.MediaBrowserCompat$CustomActionResultReceiver;
                        if (setresultcode.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            settypename.IconCompatParcelizer(setresultcode.RatingCompat);
                            return;
                        }
                        return;
                    }
                    return;
                case 10:
                    this.birthDateInput.setErrorVisible(false);
                    return;
                case 11:
                    this.issueDate.setErrorVisible(false);
                    this.expiryDate.setErrorVisible(false);
                    this.issueDate.setHighlight(false);
                    setResultCode setresultcode2 = this.presenter;
                    String obj3 = this.issueDate.inputEditText.getText().toString();
                    String obj4 = this.expiryDate.inputEditText.getText().toString();
                    if (setresultcode2.MediaBrowserCompat$ItemReceiver(obj3) && setresultcode2.MediaBrowserCompat$ItemReceiver(obj4)) {
                        setTypeName settypename2 = setTypeName.MediaBrowserCompat$CustomActionResultReceiver;
                        if (setresultcode2.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            settypename2.IconCompatParcelizer(setresultcode2.RatingCompat);
                            return;
                        }
                        return;
                    }
                    return;
                case 12:
                    this.firstNameEnglish.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                case 13:
                    this.lastNameEnglish.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                default:
                    super.write(getpageid_mediabrowsercompat_itemreceiver);
                    return;
            }
        } else {
            this.mobileNumberView.MediaBrowserCompat$CustomActionResultReceiver();
            this.mobileNumberOtpMsg.setVisibility(0);
        }
    }

    public final void MediaSessionCompat$Token() {
        this.issueExpiryDateError.setVisibility(8);
    }

    public final void write(String str) {
        this.homeView.setText(str);
    }

    public final void MediaSessionCompat$QueueItem() {
        Intent IconCompatParcelizer = HmlHomeAddressActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer, 1003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C60022.read[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i == 1) {
            this.titleError.setText(getString(R.string.hml_personal_info_title_empty));
            this.titleError.setVisibility(0);
            this.titleSpinner.setSpinnerBackground(Boolean.TRUE);
        } else if (i == 7) {
            this.nationalIdInput.setErrorText(getString(R.string.hml_personal_info_empty_field));
            this.nationalIdInput.MediaBrowserCompat$ItemReceiver();
        } else if (i != 15) {
            switch (i) {
                case 9:
                case 11:
                    this.issueExpiryDateError.setVisibility(0);
                    return;
                case 10:
                    this.birthDateInput.setErrorText(getString(R.string.hml_personal_info_empty_field));
                    this.birthDateInput.setErrorVisible(true);
                    return;
                case 12:
                    this.firstNameEnglish.setErrorText(getString(R.string.hml_personal_info_empty_field));
                    this.firstNameEnglish.MediaBrowserCompat$ItemReceiver();
                    return;
                case 13:
                    this.lastNameEnglish.setErrorText(getString(R.string.hml_personal_info_empty_field));
                    this.lastNameEnglish.MediaBrowserCompat$ItemReceiver();
                    return;
                default:
                    super.read(getpageid_mediabrowsercompat_itemreceiver);
                    return;
            }
        } else {
            this.mobileNumberView.setErrorText(getString(R.string.hml_personal_info_empty_field));
            this.mobileNumberOtpMsg.setVisibility(8);
            this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getContext() != null) {
            Intent IconCompatParcelizer = HmlNTBPersonalInfoActivity.IconCompatParcelizer(getContext());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i == 1002 && i2 == -1 && intent != null) {
            setResultCode setresultcode = this.presenter;
            String stringExtra = intent.getStringExtra("com.scb.phone.EXTRA_RESULT_ADDRESS");
            RotateType rotateType = new RotateType(stringExtra);
            if (setresultcode.RatingCompat != null) {
                rotateType.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.write(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, !stringExtra.isEmpty(), TextUtils.isEmpty(stringExtra));
        }
        if (i == 1003 && i2 == -1 && intent != null) {
            setResultCode setresultcode2 = this.presenter;
            boolean isChecked = this.sameAddressCheckBox.isChecked();
            rotateImage rotateimage = new rotateImage(intent.getStringExtra("com.scb.phone.EXTRA_RESULT_ADDRESS"));
            if (setresultcode2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                rotateimage.IconCompatParcelizer(setresultcode2.RatingCompat);
            }
            setresultcode2.MediaBrowserCompat$ItemReceiver(isChecked);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void read(getFatalSessionFilesDir getfatalsessionfilesdir) {
        String str = getfatalsessionfilesdir.f2833x50fd9e4a;
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        if (str != null && !str.isEmpty()) {
            customPhoneNumberInput.setText(str);
        }
        String str2 = getfatalsessionfilesdir.MediaBrowserCompat$CustomActionResultReceiver;
        CommonInputViewGroup commonInputViewGroup = this.emailView;
        if (str2 != null && !str2.isEmpty()) {
            commonInputViewGroup.setText(str2);
        }
        String str3 = getfatalsessionfilesdir.MediaBrowserCompat$SearchResultReceiver;
        if (!TextUtils.isEmpty(str3)) {
            this.income.setText(str3);
        }
        if (!TextUtils.isEmpty(getfatalsessionfilesdir.read)) {
            this.expiryDate.setText(getfatalsessionfilesdir.read);
        }
        if (!TextUtils.isEmpty(getfatalsessionfilesdir.MediaBrowserCompat$MediaItem)) {
            this.issueDate.setText(getfatalsessionfilesdir.MediaBrowserCompat$MediaItem);
        }
        if (!TextUtils.isEmpty(getfatalsessionfilesdir.write)) {
            this.birthDateInput.setText(getfatalsessionfilesdir.write);
        }
        this.mailingView.setText(getfatalsessionfilesdir.RatingCompat);
        TextView textView = this.mailingView;
        getResources();
        textView.setTextColor(-13290951);
        this.homeView.setText(getfatalsessionfilesdir.MediaMetadataCompat);
        if (!TextUtils.isEmpty(getfatalsessionfilesdir.MediaDescriptionCompat)) {
            this.laserIdInput.setLaserId(getfatalsessionfilesdir.MediaDescriptionCompat);
        }
        if (!TextUtils.isEmpty(getfatalsessionfilesdir.MediaSessionCompat$QueueItem)) {
            String str4 = getfatalsessionfilesdir.MediaSessionCompat$QueueItem;
            CommonInputViewGroup commonInputViewGroup2 = this.nationalIdInput;
            if (str4 != null && !str4.isEmpty()) {
                commonInputViewGroup2.setText(str4);
            }
        }
        this.addressCheckbox.setChecked(getfatalsessionfilesdir.MediaSessionCompat$ResultReceiverWrapper.booleanValue());
    }
}
