package com.scb.phone.view.fragment.etb;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.etb.ETBSetDetailNoteActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.HashSet;
import java.util.List;
import p040o.C3934V;
import p040o.C4054b;
import p040o.C9697x61e75783;
import p040o.C9839a;
import p040o.ColorPassThroughShader;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.DeepLinkModule_ContributeJustForYouEntryPointDeepLinkActivity;
import p040o.DeepLinkModule_ContributeMoreOptionsPromptPayDeepLinkActivity;
import p040o.DeepLinkModule_ContributeMutualFundsDeepLinkActivity;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.ImageProcessor;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.access$1900;
import p040o.defaultReportUploader;
import p040o.deleteSessionPartFilesFor;
import p040o.getICheckDeserializerRtti;
import p040o.getMaxTextureSize;
import p040o.getMinimumFaceSize;
import p040o.loadShader;
import p040o.onSurfaceCreated;
import p040o.processByteData;
import p040o.processTexture;
import p040o.runCleanup;
import p040o.setBaselineAligned;
import p040o.setCvv;
import p040o.setFaceAngleTolerance;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMode;
import p040o.setTapText;

public class EtbSetDetailFragment extends BaseEtbFragment implements setCvv.write, AccountSourceSelectFragment.write {
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private List<String> MediaBrowserCompat$MediaItem;
    private Double MediaBrowserCompat$SearchResultReceiver = Double.valueOf(-1.0d);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private ScriptIntrinsicBlend f3082x50fd9e4a = new ScriptIntrinsicBlend();
    private List<String> MediaDescriptionCompat;
    private CustomSpinnerWithTitle.IconCompatParcelizer MediaSessionCompat$QueueItem = new CustomSpinnerWithTitle.IconCompatParcelizer() {
        public final void write() {
        }

        public final void IconCompatParcelizer() {
            EtbSetDetailFragment etbSetDetailFragment = EtbSetDetailFragment.this;
            int unused = etbSetDetailFragment.RatingCompat = etbSetDetailFragment.customSpinnerDateOfDeduction.spinner.getSelectedItemPosition();
            ColorPassThroughShader colorPassThroughShader = EtbSetDetailFragment.this.etbSetDetailPresenter;
            String MediaBrowserCompat$ItemReceiver = EtbSetDetailFragment.this.customSpinnerDateOfDeduction.MediaBrowserCompat$ItemReceiver();
            HashSet hashSet = new HashSet();
            hashSet.add("29");
            hashSet.add("30");
            hashSet.add("31");
            boolean z = true;
            if (hashSet.contains(MediaBrowserCompat$ItemReceiver)) {
                C3934V v = C3934V.MediaBrowserCompat$CustomActionResultReceiver;
                if (colorPassThroughShader.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    v.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                    return;
                }
                return;
            }
            getMaxTextureSize getmaxtexturesize = new getMaxTextureSize(MediaBrowserCompat$ItemReceiver);
            if (colorPassThroughShader.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getmaxtexturesize.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
        }
    };
    private String MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public int MediaSessionCompat$Token;
    private CustomSpinnerWithTitle.IconCompatParcelizer ParcelableVolumeInfo = new CustomSpinnerWithTitle.IconCompatParcelizer() {
        public final void write() {
        }

        public final void IconCompatParcelizer() {
            if (EtbSetDetailFragment.this.customSpinnerMainAccount.spinner.getSelectedItemPosition() > 0) {
                EtbSetDetailFragment etbSetDetailFragment = EtbSetDetailFragment.this;
                int unused = etbSetDetailFragment.MediaSessionCompat$Token = etbSetDetailFragment.customSpinnerMainAccount.spinner.getSelectedItemPosition();
                ColorPassThroughShader colorPassThroughShader = EtbSetDetailFragment.this.etbSetDetailPresenter;
                colorPassThroughShader.MediaSessionCompat$ResultReceiverWrapper = EtbSetDetailFragment.this.customSpinnerMainAccount.spinner.getSelectedItemPosition();
                colorPassThroughShader.write();
            }
        }
    };
    /* access modifiers changed from: private */
    public int RatingCompat;
    @BindView
    protected Button buttonNext;
    @BindView
    CheckBox checkBoxConsent;
    @BindView
    protected CustomSpinnerWithTitle customSpinnerDateOfDeduction;
    @BindView
    protected CustomSpinnerWithTitle customSpinnerMainAccount;
    @HmlPinActivity
    public ColorPassThroughShader etbSetDetailPresenter;
    @BindView
    protected TextView limitIncremental;
    @BindView
    protected TextInputLayout mAmountInputLayout;
    @BindView
    protected AmountEditText mAmountValue;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected TextView textRemainingLimit;
    @BindView
    TextView tvSelectAccountLabel;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public final int ParcelableVolumeInfo() {
        return 3;
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EtbSetDetailFragment MediaBrowserCompat$ItemReceiver(access$1900 access_1900, deleteSessionPartFilesFor deletesessionpartfilesfor) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", access_1900);
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT", deletesessionpartfilesfor);
        EtbSetDetailFragment etbSetDetailFragment = new EtbSetDetailFragment();
        etbSetDetailFragment.setArguments(bundle);
        return etbSetDetailFragment;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.f93082131558413, menu);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_help).getIcon().mutate());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(getContext(), R.color.f65582131099711));
        menu.findItem(R.id.menu_action_help).setIcon(MediaBrowserCompat$MediaItem2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(getContext(), ETBSetDetailNoteActivity.class);
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
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87352131493962, viewGroup, false);
        setHasOptionsMenu(true);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.etbSetDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = ((access$1900) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT")).MediaBrowserCompat$CustomActionResultReceiver;
        if (this.etbSetDetailPresenter != null) {
            deleteSessionPartFilesFor deletesessionpartfilesfor = null;
            if (getArguments() != null) {
                deletesessionpartfilesfor = (deleteSessionPartFilesFor) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT");
            }
            ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            colorPassThroughShader.IconCompatParcelizer = str;
            ImageProcessor.Method method = ImageProcessor.Method.MediaBrowserCompat$CustomActionResultReceiver;
            if (colorPassThroughShader.RatingCompat != null) {
                method.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
            if (deletesessionpartfilesfor != null) {
                colorPassThroughShader.MediaSessionCompat$Token = deletesessionpartfilesfor.write;
                colorPassThroughShader.ParcelableVolumeInfo = deletesessionpartfilesfor.read;
                i = deletesessionpartfilesfor.MediaBrowserCompat$ItemReceiver;
            } else {
                colorPassThroughShader.MediaSessionCompat$Token = 0;
                colorPassThroughShader.ParcelableVolumeInfo = 0;
                i = 1;
            }
            processByteData processbytedata = new processByteData(colorPassThroughShader, i);
            if (colorPassThroughShader.RatingCompat != null) {
                processbytedata.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
            colorPassThroughShader.write("0".equals(colorPassThroughShader.IconCompatParcelizer), new loadShader(colorPassThroughShader, i));
            onSurfaceCreated onsurfacecreated = onSurfaceCreated.read;
            if (colorPassThroughShader.RatingCompat != null) {
                onsurfacecreated.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
            if (colorPassThroughShader.write == null) {
                if (colorPassThroughShader.RatingCompat != null) {
                    colorPassThroughShader.RatingCompat.AlertController$RecycleListView();
                }
                setMode setmode = colorPassThroughShader.MediaSessionCompat$QueueItem;
                setmode.write(setmode.MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReportJsonTransform$$Lambda$4.ETB_SET_ACCOUNT_DETAIL_MAIN_FUNCTION.toString()), new ColorPassThroughShader.IconCompatParcelizer(colorPassThroughShader, (byte) 0));
            }
            if (colorPassThroughShader.write == null) {
                if (colorPassThroughShader.RatingCompat != null) {
                    colorPassThroughShader.RatingCompat.Keep();
                }
                setMode setmode2 = colorPassThroughShader.MediaSessionCompat$QueueItem;
                setmode2.write(setmode2.MediaBrowserCompat$CustomActionResultReceiver("TRANSFER", "OWN"), new ColorPassThroughShader.write(colorPassThroughShader, (byte) 0));
            }
            if ("0".equalsIgnoreCase(str)) {
                setFaceAngleTolerance setfaceangletolerance = setFaceAngleTolerance.MediaBrowserCompat$ItemReceiver;
                if (colorPassThroughShader.RatingCompat != null) {
                    setfaceangletolerance.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                }
            } else {
                C9839a.C39651 r0 = C9839a.C39651.MediaBrowserCompat$ItemReceiver;
                if (colorPassThroughShader.RatingCompat != null) {
                    r0.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                }
            }
            if ("0".equalsIgnoreCase(str)) {
                getMinimumFaceSize getminimumfacesize = getMinimumFaceSize.IconCompatParcelizer;
                if (colorPassThroughShader.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getminimumfacesize.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                }
            } else {
                C4054b.C40551 r02 = C4054b.C40551.write;
                if (colorPassThroughShader.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r02.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                }
            }
        }
        ScriptIntrinsicBlend scriptIntrinsicBlend = this.f3082x50fd9e4a;
        if (getActivity() != null) {
            scriptIntrinsicBlend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_set_detail");
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List<String> list = this.MediaDescriptionCompat;
        if (list != null) {
            MediaBrowserCompat$ItemReceiver(list);
            this.customSpinnerDateOfDeduction.setSelectionIndex(this.RatingCompat);
        }
        List<String> list2 = this.MediaBrowserCompat$MediaItem;
        if (list2 != null) {
            IconCompatParcelizer(list2);
            this.customSpinnerMainAccount.setSelectionIndex(this.MediaSessionCompat$Token);
        }
        if (this.MediaSessionCompat$ResultReceiverWrapper != null) {
            IconCompatParcelizer(true);
            this.remainingLimit.setText(this.MediaSessionCompat$ResultReceiverWrapper);
        }
    }

    public final void read() {
        this.checkBoxConsent.setText(R.string.etb_set_detail_concent_fixed_acknowledge);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.checkBoxConsent.setText(R.string.etb_set_detail_concent_contactual_acknowledge);
    }

    public final void write() {
        this.tvSelectAccountLabel.setText(R.string.etb_set_detail_main_fixed_account);
    }

    public final void IconCompatParcelizer() {
        this.tvSelectAccountLabel.setText(R.string.etb_set_detail_main_contractual_account);
    }

    public final void MediaDescriptionCompat() {
        IconCompatParcelizer(false);
    }

    public final void write(String str) {
        IconCompatParcelizer(true);
        this.MediaSessionCompat$ResultReceiverWrapper = str;
        this.remainingLimit.setText(str);
    }

    public final void read(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void write(int i, int i2, String str, int i3) {
        String str2;
        String str3 = str;
        this.mAmountValue.setCustomHint(str3, this.mAmountInputLayout);
        this.mAmountValue.setOnFocusChangeListener(new DeepLinkModule_ContributeMutualFundsDeepLinkActivity(this, str3));
        if ("0".equals(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            str2 = getResources().getString(R.string.etb_set_detail_amount_divide_error, new Object[]{String.valueOf(i3)});
        } else {
            str2 = null;
        }
        String str4 = str2;
        AmountEditText amountEditText = this.mAmountValue;
        String string = getResources().getString(R.string.etb_set_detail_amount_min_max_error);
        String string2 = getResources().getString(R.string.not_enough_funds_on_selected_account);
        AmountEditText amountEditText2 = amountEditText;
        String str5 = string2;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText2, this.mAmountInputLayout, (double) i2, this.MediaBrowserCompat$SearchResultReceiver.doubleValue(), (double) i, string, str5, String.format(getResources().getString(R.string.etb_set_detail_amount_min_max_error), new Object[]{Integer.toString(i), Integer.toString(i2)}), (double) i3, str4));
        this.mAmountValue.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                ColorPassThroughShader colorPassThroughShader = EtbSetDetailFragment.this.etbSetDetailPresenter;
                colorPassThroughShader.MediaBrowserCompat$ItemReceiver = d;
                colorPassThroughShader.write();
                if (d > 0.0d) {
                    EtbSetDetailFragment.this.mAmountInputLayout.setHintEnabled(false);
                    EtbSetDetailFragment.this.mAmountValue.setHint("");
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                EtbSetDetailFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        if (z) {
            this.mAmountInputLayout.setHintEnabled(false);
            this.mAmountValue.setHint("");
            if (getActivity() != null && isAdded()) {
                ((BaseActivity) getActivity()).ActionBarContainer();
            }
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.mAmountValue.getText().toString())) {
            this.mAmountInputLayout.setHintEnabled(true);
            this.mAmountValue.setText("");
            this.mAmountValue.setHint(str);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        this.MediaDescriptionCompat = list;
        this.customSpinnerDateOfDeduction.setItems(list, true, false);
        this.customSpinnerDateOfDeduction.setOnCustomSpinnerWithTitleCompletion(this.MediaSessionCompat$QueueItem);
        this.customSpinnerDateOfDeduction.setMandatory(true);
    }

    public final void IconCompatParcelizer(List<String> list) {
        this.MediaBrowserCompat$MediaItem = list;
        this.customSpinnerMainAccount.setItems(list, true, false);
        this.customSpinnerMainAccount.setOnCustomSpinnerWithTitleCompletion(this.ParcelableVolumeInfo);
        this.customSpinnerMainAccount.setMandatory(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.ETB_SET_ACCOUNT_DETAIL_SOURCE_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.RatingCompat = true;
        write.IconCompatParcelizer = false;
        write.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.etb_set_detail_source_of_open_account);
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
    }

    public final void read(defaultReportUploader defaultreportuploader) {
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(EtbReviewInformationFragment.write((access$1900) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT"), defaultreportuploader));
    }

    private void IconCompatParcelizer(boolean z) {
        int i = 8;
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        this.remainingLimit.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.remainingLimitLinearLayout;
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    public void onDestroy() {
        super.onDestroy();
        this.etbSetDetailPresenter.onDestroy();
    }

    @OnClick
    public void onNextButtonClick() {
        String str;
        access$1900 access_1900 = (access$1900) getArguments().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT");
        ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
        Double MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.mAmountValue.getText().toString());
        if (colorPassThroughShader.MediaBrowserCompat$MediaItem) {
            boolean z = false;
            colorPassThroughShader.MediaBrowserCompat$MediaItem = false;
            if (colorPassThroughShader.RatingCompat != null) {
                z = true;
            }
            if (z) {
                colorPassThroughShader.RatingCompat.AlertController$RecycleListView();
            }
            if (colorPassThroughShader.write.get(colorPassThroughShader.MediaSessionCompat$ResultReceiverWrapper - 1) != null) {
                str = colorPassThroughShader.write.get(colorPassThroughShader.MediaSessionCompat$ResultReceiverWrapper - 1).write;
            } else {
                str = "";
            }
            runCleanup read = runCleanup.read();
            read.MediaBrowserCompat$CustomActionResultReceiver = colorPassThroughShader.MediaDescriptionCompat;
            read.write = MediaBrowserCompat$ItemReceiver.doubleValue();
            read.MediaBrowserCompat$ItemReceiver = colorPassThroughShader.read;
            read.read = str;
            setMode setmode = colorPassThroughShader.MediaSessionCompat$QueueItem;
            setmode.write(setmode.MediaBrowserCompat$ItemReceiver(read), new C9697x61e75783(colorPassThroughShader, access_1900));
        }
    }

    @OnCheckedChanged
    public void onCheckedConsent(CompoundButton compoundButton, boolean z) {
        ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
        colorPassThroughShader.MediaMetadataCompat = z;
        colorPassThroughShader.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
            colorPassThroughShader.read = builder.MediaSessionCompat$Token;
            colorPassThroughShader.write();
            this.MediaBrowserCompat$SearchResultReceiver = builder.MediaBrowserCompat$CustomActionResultReceiver;
            ColorPassThroughShader colorPassThroughShader2 = this.etbSetDetailPresenter;
            processTexture processtexture = new processTexture(colorPassThroughShader2, this.MediaBrowserCompat$CustomActionResultReceiver);
            if (colorPassThroughShader2.RatingCompat != null) {
                processtexture.IconCompatParcelizer(colorPassThroughShader2.RatingCompat);
            }
            ColorPassThroughShader colorPassThroughShader3 = this.etbSetDetailPresenter;
            colorPassThroughShader3.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$SearchResultReceiver;
            colorPassThroughShader3.write();
            this.mAmountValue.setAvailableBalanceCurrencyFormattingTextWatcher(this.MediaBrowserCompat$SearchResultReceiver.doubleValue());
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.customSpinnerDateOfDeduction.setVisibility(z ? 8 : 0);
    }

    public final void MediaMetadataCompat() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.etb_set_detail_deduction_disclaimer_title).IconCompatParcelizer((int) R.string.etb_set_detail_deduction_disclaimer_description);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), new DeepLinkModule_ContributeMoreOptionsPromptPayDeepLinkActivity(this));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new DeepLinkModule_ContributeJustForYouEntryPointDeepLinkActivity(this)).show();
    }

    public final /* synthetic */ void read(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        CustomSpinnerWithTitle customSpinnerWithTitle = this.customSpinnerDateOfDeduction;
        customSpinnerWithTitle.IconCompatParcelizer = false;
        if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            customSpinnerWithTitle.spinner.setSelection(0);
        }
        ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
        colorPassThroughShader.MediaDescriptionCompat = 0;
        colorPassThroughShader.write();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        String MediaBrowserCompat$ItemReceiver = this.customSpinnerDateOfDeduction.MediaBrowserCompat$ItemReceiver();
        if (this.customSpinnerDateOfDeduction.spinner.getSelectedItemPosition() > 0) {
            ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
            colorPassThroughShader.MediaDescriptionCompat = Integer.parseInt(MediaBrowserCompat$ItemReceiver);
            colorPassThroughShader.write();
        }
    }

    public final void read(String str) {
        if (this.customSpinnerDateOfDeduction.spinner.getSelectedItemPosition() > 0) {
            ColorPassThroughShader colorPassThroughShader = this.etbSetDetailPresenter;
            colorPassThroughShader.MediaDescriptionCompat = Integer.parseInt(str);
            colorPassThroughShader.write();
        }
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_set_detail_page);
    }

    public final void IconCompatParcelizer(String str) {
        this.limitIncremental.setVisibility(0);
        this.limitIncremental.setText(str);
    }
}
