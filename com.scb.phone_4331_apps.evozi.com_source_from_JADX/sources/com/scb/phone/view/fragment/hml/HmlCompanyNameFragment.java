package com.scb.phone.view.fragment.hml;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.CCContentService;
import p040o.CheckEligibilityActivity;
import p040o.ExtractionParameters;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;
import p040o.FragmentBuilder_BindEasycashCommercialLoanAccountFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.firebaseCrashExists;
import p040o.getRegistrationsAddresses;
import p040o.getUserEmailAddress;
import p040o.getUserEmailAddress$MediaSessionCompat$QueueItem;
import p040o.getUserEmailAddress$MediaSessionCompat$ResultReceiverWrapper;
import p040o.listSessionPartFilesFor;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzct;

public final class HmlCompanyNameFragment extends BaseFragment implements ExtractionParameters.ExtractionType {
    public static final HmlCompanyNameFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new HmlCompanyNameFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private CCContentService MediaBrowserCompat$CustomActionResultReceiver = new CCContentService(new read(this), new write(this));
    /* access modifiers changed from: private */
    public boolean RatingCompat;
    @BindView
    public Button addButton;
    @BindView
    public ImageButton clearButton;
    @BindView
    public LinearLayout emptyContainer;
    @BindView
    public EditText mSearchEdit;
    @BindView
    public TextView notFoundInstruction;
    @HmlPinActivity
    public getUserEmailAddress<ExtractionParameters.ExtractionType> presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public DefaultButton searchButton;
    @BindView
    public TextView tvInfo;

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<firebaseCrashExists, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlCompanyNameFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(HmlCompanyNameFragment hmlCompanyNameFragment) {
            super(1);
            this.write = hmlCompanyNameFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            firebaseCrashExists firebasecrashexists = (firebaseCrashExists) obj;
            onGetStartedClick.write((Object) firebasecrashexists, "it");
            getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.write.presenter;
            if (getuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) firebasecrashexists, "itemDisplay");
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new getUserEmailAddress.RatingCompat(firebasecrashexists);
            if (getuseremailaddress.RatingCompat != null) {
                ratingCompat.IconCompatParcelizer(getuseremailaddress.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f80782131493303, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.presenter;
        if (getuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getuseremailaddress.MediaBrowserCompat$ItemReceiver(this);
        getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress2 = this.presenter;
        if (getuseremailaddress2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getUserEmailAddress$MediaSessionCompat$ResultReceiverWrapper.read;
        if (getuseremailaddress2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getuseremailaddress2.RatingCompat);
        }
        zzct.zza MediaBrowserCompat$SearchResultReceiver = getuseremailaddress2.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver();
        writeUInt64NoTag.IconCompatParcelizer getuseremailaddress_mediasessioncompat_queueitem = new getUserEmailAddress$MediaSessionCompat$QueueItem(MediaBrowserCompat$SearchResultReceiver);
        if (getuseremailaddress2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getuseremailaddress_mediasessioncompat_queueitem.IconCompatParcelizer(getuseremailaddress2.RatingCompat);
        }
        if (MediaBrowserCompat$SearchResultReceiver == zzct.zza.BUSINESS_OWNER) {
            getuseremailaddress2.read((String) null, true);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(firebaseCrashExists firebasecrashexists) {
        onGetStartedClick.write((Object) firebasecrashexists, "itemDisplay");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_COMPANY_NAME", firebasecrashexists.write);
        bundle.putString("EXTRA_COMPANY_ID", firebasecrashexists.MediaBrowserCompat$CustomActionResultReceiver);
        if (getActivity() instanceof FragmentBuilder_BindBaseGiftTransferInputFragment) {
            ((FragmentBuilder_BindBaseGiftTransferInputFragment) getActivity()).MediaBrowserCompat$ItemReceiver(bundle);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        DefaultButton defaultButton = this.searchButton;
        if (defaultButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchButton");
        }
        defaultButton.setButtonEnabled(z);
    }

    public final void write(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        if (zza == zzct.zza.BUSINESS_OWNER) {
            ParcelableVolumeInfo(getString(R.string.hml_business_company_search_activity_title));
            EditText editText = this.mSearchEdit;
            if (editText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEdit");
            }
            editText.setHint(getString(R.string.hml_business_company_search_input_hint));
            TextView textView = this.notFoundInstruction;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("notFoundInstruction");
            }
            textView.setText(getString(R.string.hml_business_company_search_no_results_text));
        } else {
            EditText editText2 = this.mSearchEdit;
            if (editText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEdit");
            }
            editText2.setHint(getString(R.string.hml_company_search_input_hint));
        }
        EditText editText3 = this.mSearchEdit;
        if (editText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEdit");
        }
        editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA), new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z_\"&*()@, .\\/\\\\-]+( [0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z_\\\"&() *@,.\\\\/\\\\\\\\-]+)*$")});
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        DefaultButton defaultButton = this.searchButton;
        if (defaultButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchButton");
        }
        defaultButton.setText(getString(R.string.hml_company_search_button));
        DefaultButton defaultButton2 = this.searchButton;
        if (defaultButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchButton");
        }
        defaultButton2.setButtonEnabled(false);
        DefaultButton defaultButton3 = this.searchButton;
        if (defaultButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchButton");
        }
        defaultButton3.setOnClickListener(new MediaMetadataCompat(this));
        EditText editText4 = this.mSearchEdit;
        if (editText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEdit");
        }
        editText4.addTextChangedListener(new FragmentBuilder_BindEasycashCommercialLoanAccountFragment(new C5981x9c5ae27e(this)));
        editText4.setOnEditorActionListener(new IconCompatParcelizer(this));
        Button button = this.addButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
        }
        button.setOnClickListener(new MediaDescriptionCompat(this));
        ImageButton imageButton = this.clearButton;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clearButton");
        }
        imageButton.setOnClickListener(new HmlCompanyNameFragment$MediaBrowserCompat$MediaItem(this));
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        RecyclerView.ParcelableVolumeInfo hmlCompanyNameFragment$MediaBrowserCompat$SearchResultReceiver = new HmlCompanyNameFragment$MediaBrowserCompat$SearchResultReceiver(this);
        if (recyclerView4.setGroupDividerEnabled == null) {
            recyclerView4.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView4.setGroupDividerEnabled.add(hmlCompanyNameFragment$MediaBrowserCompat$SearchResultReceiver);
    }

    static final class MediaMetadataCompat implements View.OnClickListener {
        private /* synthetic */ HmlCompanyNameFragment MediaBrowserCompat$CustomActionResultReceiver;

        MediaMetadataCompat(HmlCompanyNameFragment hmlCompanyNameFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlCompanyNameFragment;
        }

        public final void onClick(View view) {
            getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (getuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (getuseremailaddress.IconCompatParcelizer) {
                String str = getuseremailaddress.read;
                getuseremailaddress.MediaDescriptionCompat = str;
                if (str != null) {
                    getuseremailaddress.read(str, true);
                }
            }
        }
    }

    static final class IconCompatParcelizer implements TextView.OnEditorActionListener {
        private /* synthetic */ HmlCompanyNameFragment IconCompatParcelizer;

        IconCompatParcelizer(HmlCompanyNameFragment hmlCompanyNameFragment) {
            this.IconCompatParcelizer = hmlCompanyNameFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.IconCompatParcelizer.presenter;
            if (getuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (!getuseremailaddress.IconCompatParcelizer) {
                return true;
            }
            String str = getuseremailaddress.read;
            getuseremailaddress.MediaDescriptionCompat = str;
            if (str == null) {
                return true;
            }
            getuseremailaddress.read(str, true);
            return true;
        }
    }

    static final class MediaDescriptionCompat implements View.OnClickListener {
        private /* synthetic */ HmlCompanyNameFragment write;

        MediaDescriptionCompat(HmlCompanyNameFragment hmlCompanyNameFragment) {
            this.write = hmlCompanyNameFragment;
        }

        public final void onClick(View view) {
            getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.write.presenter;
            if (getuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer read = new getUserEmailAddress.read(getuseremailaddress);
            if (getuseremailaddress.RatingCompat != null) {
                read.IconCompatParcelizer(getuseremailaddress.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        EditText editText = this.mSearchEdit;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEdit");
        }
        editText.setText("");
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends listSessionPartFilesFor> list) {
        onGetStartedClick.write((Object) list, "items");
        TextView textView = this.tvInfo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvInfo");
        }
        textView.setVisibility(8);
        CCContentService cCContentService = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) list, "newItems");
        cCContentService.MediaBrowserCompat$ItemReceiver = list;
        cCContentService.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        String string = getString(zza == zzct.zza.BUSINESS_OWNER ? R.string.hml_business_company_search_add_dialog_title : R.string.hml_company_search_add_dialog_title);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        String string2 = getString(zza == zzct.zza.BUSINESS_OWNER ? R.string.hml_business_company_search_add_dialog_label : R.string.hml_company_search_add_dialog_label);
        if (string2 != null) {
            MediaBrowserCompat$ItemReceiver.mTextTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTextTextView.setText(string2);
        }
        EditText editText = MediaBrowserCompat$ItemReceiver.mEditTextView;
        onGetStartedClick.IconCompatParcelizer((Object) editText, "editTextView");
        editText.setHint(getString(zza == zzct.zza.BUSINESS_OWNER ? R.string.hml_business_company_search_add_dialog_hint : R.string.hml_company_search_add_dialog_hint));
        EditText editText2 = MediaBrowserCompat$ItemReceiver.mEditTextView;
        onGetStartedClick.IconCompatParcelizer((Object) editText2, "editTextView");
        editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA)});
        MediaBrowserCompat$ItemReceiver.mEditTextView.setVisibility(0);
        MediaBrowserCompat$ItemReceiver.mPositiveButton.setEnabled(true);
        MediaBrowserCompat$ItemReceiver.setCanceledOnTouchOutside(false);
        MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getString(R.string.hml_company_search_add_dialog_cancel), ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver);
        String string3 = getString(R.string.hml_company_search_add_dialog_ok);
        DialogInterface.OnClickListener ratingCompat = new RatingCompat(MediaBrowserCompat$ItemReceiver, this);
        if (string3 != null) {
            MediaBrowserCompat$ItemReceiver.mPositiveButton.setText(string3);
            MediaBrowserCompat$ItemReceiver.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(MediaBrowserCompat$ItemReceiver, ratingCompat, false));
        }
        MediaBrowserCompat$ItemReceiver.show();
    }

    static final class ParcelableVolumeInfo implements DialogInterface.OnClickListener {
        public static final ParcelableVolumeInfo MediaBrowserCompat$CustomActionResultReceiver = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static final class RatingCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ CustomInputDialog MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ HmlCompanyNameFragment read;

        RatingCompat(CustomInputDialog customInputDialog, HmlCompanyNameFragment hmlCompanyNameFragment) {
            this.MediaBrowserCompat$ItemReceiver = customInputDialog;
            this.read = hmlCompanyNameFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String valueOf = String.valueOf(this.MediaBrowserCompat$ItemReceiver.mEditTextView.getText());
            onGetStartedClick.IconCompatParcelizer((Object) valueOf, "editTextString");
            boolean z = true;
            if (valueOf.length() == 0) {
                this.MediaBrowserCompat$ItemReceiver.dismiss();
                return;
            }
            if (!Pattern.compile("^[0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z_\"'#&*()@:,.\\/\\\\-]+( [0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z_\\\"\\'#&() *@:,.\\\\/\\\\\\\\-]+)*$").matcher(String.valueOf(this.MediaBrowserCompat$ItemReceiver.mEditTextView.getText())).matches()) {
                CustomInputDialog customInputDialog = this.MediaBrowserCompat$ItemReceiver;
                String string = this.read.getString(R.string.hml_company_search_add_dialog_error);
                customInputDialog.mErrorTextView.setVisibility(0);
                customInputDialog.mErrorTextView.setText(string);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver.mErrorTextView.setVisibility(8);
            getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.read.presenter;
            if (getuseremailaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String valueOf2 = String.valueOf(this.MediaBrowserCompat$ItemReceiver.mEditTextView.getText());
            onGetStartedClick.IconCompatParcelizer((Object) valueOf2, "editTextString");
            onGetStartedClick.write((Object) valueOf2, "name");
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new getUserEmailAddress.MediaMetadataCompat(valueOf2);
            if (getuseremailaddress.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(getuseremailaddress.RatingCompat);
            }
        }
    }

    public final void write(boolean z) {
        ImageButton imageButton = this.clearButton;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clearButton");
        }
        imageButton.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer(boolean z) {
        TextView textView = this.tvInfo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvInfo");
        }
        int i = 8;
        textView.setVisibility(8);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setVisibility(z ? 8 : 0);
        LinearLayout linearLayout = this.emptyContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyContainer");
        }
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    public final void onDestroyView() {
        Unbinder unbinder = this.read;
        if (unbinder != null) {
            unbinder.read();
        }
        super.onDestroyView();
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlCompanyNameFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlCompanyNameFragment hmlCompanyNameFragment) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlCompanyNameFragment;
        }

        public final /* synthetic */ Object invoke() {
            String str;
            if (!HmlCompanyNameFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (getuseremailaddress == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                if (!getuseremailaddress.write && (str = getuseremailaddress.MediaDescriptionCompat) != null) {
                    getuseremailaddress.read(str, false);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(HmlCompanyNameFragment hmlCompanyNameFragment) {
        Dialog dialog = hmlCompanyNameFragment.write;
        return dialog != null && dialog.isShowing();
    }
}
