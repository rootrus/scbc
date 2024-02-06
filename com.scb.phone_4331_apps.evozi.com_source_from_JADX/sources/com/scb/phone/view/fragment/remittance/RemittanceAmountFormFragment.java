package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.TintNoteEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import kotlin.TypeCastException;
import p040o.ActivityBuilder_ContributePartnerLoginActivity;
import p040o.ActivityBuilder_ContributePinChangeSuccessActivity;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C4997nB;
import p040o.FragmentBuilder_BindCloseAccountSelectionTabFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.getICheckDeserializerRtti;
import p040o.nB$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nB$MediaBrowserCompat$ItemReceiver;
import p040o.nB$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;
import p040o.setAddress;
import p040o.setFaceLeftPadding;
import p040o.writeUInt64NoTag;

public final class RemittanceAmountFormFragment extends BaseFragment implements setFaceLeftPadding, ActivityBuilder_ContributePartnerLoginActivity {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    private final write IconCompatParcelizer = new write(this);
    private final RemittanceAmountFormFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new RemittanceAmountFormFragment$MediaBrowserCompat$ItemReceiver(this);
    private FragmentBuilder_BindCloseAccountSelectionTabFragment MediaDescriptionCompat;
    private final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer(this);
    private final C6148x732e717 RatingCompat = new C6148x732e717(this);
    @BindView
    public Button btAction;
    @BindView
    public ConstraintLayout clAmountFromContainer;
    @BindView
    public ConstraintLayout clAmountToContainer;
    @BindView
    public ConstraintLayout csMobileSectionLayout;
    @BindView
    public AmountEditText etFromAmountValue;
    @BindView
    public CustomEditText etMobileInputField;
    @BindView
    public TintNoteEditText etNote;
    @BindView
    public AmountEditText etToAmountValue;
    @BindView
    public ImageView ivCountryFlag;
    @BindView
    public ImageView ivEdit;
    @HmlPinActivity
    public C4997nB presenter;
    @BindView
    public CustomSpinnerWithTitle swtPurpose;
    @BindView
    public TextView tvCountryName;
    @BindView
    public TextView tvErrorAmountTo;
    @BindView
    public TextView tvExchangeRate;
    @BindView
    public TextView tvMaxLimitTransaction;
    @BindView
    public TextView tvMobileDesc;
    @BindView
    public TextView tvMoreTitle;
    @BindView
    public TextView tvPayNowRemainingDailyLimit;
    @BindView
    public TextView tvRateDescription;
    @BindView
    public TextView tvRemainingDailyLimit;
    @BindView
    public TextView tvRemainingMonthlyLimit;
    @BindView
    public TextView tvRemainingTimesMonthly;
    @BindView
    public TextView tvRemark;
    @BindView
    public TextView tvTitleFromAmount;
    @BindView
    public TextView tvTitleToAmount;
    @BindView
    public View vSpace;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static RemittanceAmountFormFragment IconCompatParcelizer(C3092xce3d994b.Builder builder, C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, boolean z, AutoValue_CrashlyticsReport_Session_Application.C30641 r7) {
            onGetStartedClick.write((Object) builder, "state");
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
            RemittanceAmountFormFragment remittanceAmountFormFragment = new RemittanceAmountFormFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("STATE", builder.ordinal());
            bundle.putParcelable("display", autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread);
            bundle.putBoolean("preFilled", z);
            bundle.putParcelable("cache", r7);
            remittanceAmountFormFragment.setArguments(bundle);
            return remittanceAmountFormFragment;
        }
    }

    public static final class write implements AmountEditText.read {
        private /* synthetic */ RemittanceAmountFormFragment MediaBrowserCompat$ItemReceiver;

        write(RemittanceAmountFormFragment remittanceAmountFormFragment) {
            this.MediaBrowserCompat$ItemReceiver = remittanceAmountFormFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            AmountEditText amountEditText = this.MediaBrowserCompat$ItemReceiver.etFromAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
            }
            if (amountEditText.hasFocus()) {
                C4997nB nBVar = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (nBVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                writeUInt64NoTag.IconCompatParcelizer write = new C4997nB.write(nBVar, d / nBVar.IconCompatParcelizer);
                boolean z = true;
                if (nBVar.RatingCompat != null) {
                    write.IconCompatParcelizer(nBVar.RatingCompat);
                }
                C4997nB nBVar2 = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (nBVar2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                AmountEditText amountEditText2 = this.MediaBrowserCompat$ItemReceiver.etFromAmountValue;
                if (amountEditText2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
                }
                double d2 = amountEditText2.write;
                AmountEditText amountEditText3 = this.MediaBrowserCompat$ItemReceiver.etToAmountValue;
                if (amountEditText3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
                }
                writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4997nB.MediaMetadataCompat(nBVar2, d2, amountEditText3.write);
                if (nBVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mediaMetadataCompat.IconCompatParcelizer(nBVar2.RatingCompat);
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction();
        }
    }

    public static final class IconCompatParcelizer implements AmountEditText.read {
        private /* synthetic */ RemittanceAmountFormFragment MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(RemittanceAmountFormFragment remittanceAmountFormFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = remittanceAmountFormFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            AmountEditText amountEditText = this.MediaBrowserCompat$CustomActionResultReceiver.etToAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
            }
            if (amountEditText.hasFocus()) {
                C4997nB nBVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (nBVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                writeUInt64NoTag.IconCompatParcelizer nb_mediabrowsercompat_itemreceiver = new nB$MediaBrowserCompat$ItemReceiver(nBVar, d * nBVar.IconCompatParcelizer, d);
                boolean z = true;
                if (nBVar.RatingCompat != null) {
                    nb_mediabrowsercompat_itemreceiver.IconCompatParcelizer(nBVar.RatingCompat);
                }
                C4997nB nBVar2 = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (nBVar2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                AmountEditText amountEditText2 = this.MediaBrowserCompat$CustomActionResultReceiver.etFromAmountValue;
                if (amountEditText2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
                }
                double d2 = amountEditText2.write;
                AmountEditText amountEditText3 = this.MediaBrowserCompat$CustomActionResultReceiver.etToAmountValue;
                if (amountEditText3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
                }
                writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4997nB.MediaMetadataCompat(nBVar2, d2, amountEditText3.write);
                if (nBVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mediaMetadataCompat.IconCompatParcelizer(nBVar2.RatingCompat);
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
        }
    }

    private final C3092xce3d994b.Builder MediaBrowserCompat$SearchResultReceiver() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C3092xce3d994b.Builder builder = null;
            int i = arguments.getInt("STATE", -1);
            if (i >= 0) {
                builder = C3092xce3d994b.Builder.values()[i];
            }
            C3092xce3d994b.Builder builder2 = builder;
            if (builder2 != null) {
                return builder2;
            }
        }
        return C3092xce3d994b.Builder.NORMAL;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof FragmentBuilder_BindCloseAccountSelectionTabFragment) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                this.MediaDescriptionCompat = (FragmentBuilder_BindCloseAccountSelectionTabFragment) parentFragment;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.listener.RemittanceAmountFormListener");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89382131494165, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        C4997nB nBVar = this.presenter;
        if (nBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nBVar.MediaBrowserCompat$ItemReceiver(this);
        int i = 8;
        int i2 = MediaBrowserCompat$SearchResultReceiver() == C3092xce3d994b.Builder.ADD_FAVOURITE ? 8 : 0;
        int i3 = MediaBrowserCompat$SearchResultReceiver() == C3092xce3d994b.Builder.ADD_FAVOURITE ? 0 : 8;
        if (MediaBrowserCompat$SearchResultReceiver() == C3092xce3d994b.Builder.ADD_FAVOURITE) {
            str = getString(R.string.remittance_input_add_recipient_button_message);
        } else {
            str = getString(R.string.remittance_input_proceed_button_message);
        }
        onGetStartedClick.IconCompatParcelizer((Object) str, "if (state == RemittanceS…button_message)\n        }");
        TextView textView = this.tvRateDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRateDescription");
        }
        textView.setVisibility(i2);
        TextView textView2 = this.tvExchangeRate;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExchangeRate");
        }
        textView2.setVisibility(i2);
        TextView textView3 = this.tvMaxLimitTransaction;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMaxLimitTransaction");
        }
        textView3.setVisibility(i2);
        TextView textView4 = this.tvPayNowRemainingDailyLimit;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayNowRemainingDailyLimit");
        }
        textView4.setVisibility(i2);
        TextView textView5 = this.tvRemainingDailyLimit;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingDailyLimit");
        }
        textView5.setVisibility(i2);
        TextView textView6 = this.tvRemainingMonthlyLimit;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingMonthlyLimit");
        }
        textView6.setVisibility(i2);
        TextView textView7 = this.tvRemainingTimesMonthly;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingTimesMonthly");
        }
        textView7.setVisibility(i2);
        TextView textView8 = this.tvRemark;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView8.setVisibility(i2);
        ConstraintLayout constraintLayout = this.clAmountFromContainer;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clAmountFromContainer");
        }
        constraintLayout.setVisibility(i2);
        ConstraintLayout constraintLayout2 = this.clAmountToContainer;
        if (constraintLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clAmountToContainer");
        }
        constraintLayout2.setVisibility(i2);
        View view2 = this.vSpace;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vSpace");
        }
        view2.setVisibility(i3);
        if (this.btAction != null) {
            Button button = this.btAction;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAction");
            }
            button.setText(str);
        }
        Bundle arguments = getArguments();
        if (!(arguments == null || (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread = (C3088x7e3e3ebd) arguments.getParcelable("display")) == null)) {
            C4997nB nBVar2 = this.presenter;
            if (nBVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
            Bundle arguments2 = getArguments();
            boolean z = arguments2 != null ? arguments2.getBoolean("preFilled") : false;
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
            nBVar2.MediaDescriptionCompat = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
            nBVar2.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaMetadataCompat;
            writeUInt64NoTag.IconCompatParcelizer nb_mediabrowsercompat_mediaitem = new nB$MediaBrowserCompat$MediaItem(nBVar2, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, z);
            if (nBVar2.RatingCompat != null) {
                nb_mediabrowsercompat_mediaitem.IconCompatParcelizer(nBVar2.RatingCompat);
            }
            TextView textView9 = this.tvCountryName;
            if (textView9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCountryName");
            }
            textView9.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.IconCompatParcelizer);
            if (getContext() == null) {
                getActivity();
            }
            ImageView imageView = this.ivCountryFlag;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivCountryFlag");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(imageView, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.read);
            TextView textView10 = this.tvExchangeRate;
            if (textView10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExchangeRate");
            }
            textView10.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$MediaItem);
            TextView textView11 = this.tvRateDescription;
            if (textView11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRateDescription");
            }
            textView11.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$SearchResultReceiver);
            TextView textView12 = this.tvTitleFromAmount;
            if (textView12 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitleFromAmount");
            }
            textView12.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$ItemReceiver);
            TextView textView13 = this.tvTitleToAmount;
            if (textView13 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitleToAmount");
            }
            textView13.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$CustomActionResultReceiver);
            ImageView imageView2 = this.ivEdit;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivEdit");
            }
            if (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.write) {
                i = 0;
            }
            imageView2.setVisibility(i);
        }
        AmountEditText amountEditText = this.etFromAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
        }
        amountEditText.setOnAmountChangeListener(this.IconCompatParcelizer);
        AmountEditText amountEditText2 = this.etToAmountValue;
        if (amountEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
        }
        amountEditText2.setOnAmountChangeListener(this.MediaMetadataCompat);
        CustomEditText customEditText = this.etMobileInputField;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etMobileInputField");
        }
        customEditText.addTextChangedListener(this.MediaBrowserCompat$MediaItem);
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.IconCompatParcelizer();
        }
        TintNoteEditText tintNoteEditText = this.etNote;
        if (tintNoteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
        }
        tintNoteEditText.mNoteEditText.addTextChangedListener(this.RatingCompat);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "amountTo");
        AmountEditText amountEditText = this.etToAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
        }
        amountEditText.setText(str);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "amountFrom");
        AmountEditText amountEditText = this.etFromAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
        }
        amountEditText.setText(str);
    }

    @OnClick
    public final void onActionButtonClicked() {
        boolean z = true;
        if (ActivityBuilder_ContributePinChangeSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$SearchResultReceiver().ordinal()] != 1) {
            C4997nB nBVar = this.presenter;
            if (nBVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AmountEditText amountEditText = this.etFromAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
            }
            double d = amountEditText.write;
            AmountEditText amountEditText2 = this.etToAmountValue;
            if (amountEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
            }
            writeUInt64NoTag.IconCompatParcelizer nb_mediabrowsercompat_customactionresultreceiver = new nB$MediaBrowserCompat$CustomActionResultReceiver(nBVar, d, amountEditText2.write);
            if (nBVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nb_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nBVar.RatingCompat);
            }
        } else {
            FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
            if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
                fragmentBuilder_BindCloseAccountSelectionTabFragment.write();
            }
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("outward_remittance_input");
        }
    }

    @OnClick
    public final void onEditClicked() {
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.RatingCompat();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.btAction != null) {
            Button button = this.btAction;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAction");
            }
            button.setEnabled(z);
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.MediaDescriptionCompat = null;
    }

    public final void IconCompatParcelizer(C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
        TextView textView = this.tvMaxLimitTransaction;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMaxLimitTransaction");
        }
        textView.setVisibility(8);
        TextView textView2 = this.tvPayNowRemainingDailyLimit;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayNowRemainingDailyLimit");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.tvRemainingDailyLimit;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingDailyLimit");
        }
        textView3.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.f2677x50fd9e4a);
        TextView textView4 = this.tvRemainingMonthlyLimit;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingMonthlyLimit");
        }
        textView4.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaSessionCompat$QueueItem);
        TextView textView5 = this.tvRemainingTimesMonthly;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingTimesMonthly");
        }
        textView5.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.ParcelableVolumeInfo);
    }

    public final void MediaBrowserCompat$ItemReceiver(setAddress setaddress, C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread) {
        onGetStartedClick.write((Object) setaddress, "purposeList");
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
        Button button = this.btAction;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAction");
        }
        button.setText(getString(R.string.paynow_input_review_button_message));
        ConstraintLayout constraintLayout = this.csMobileSectionLayout;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csMobileSectionLayout");
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.tvRemainingDailyLimit;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingDailyLimit");
        }
        textView.setVisibility(8);
        TextView textView2 = this.tvRemainingMonthlyLimit;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingMonthlyLimit");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.tvRemainingTimesMonthly;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingTimesMonthly");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.tvMobileDesc;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMobileDesc");
        }
        textView4.setVisibility(0);
        TextView textView5 = this.tvMoreTitle;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMoreTitle");
        }
        textView5.setVisibility(0);
        TintNoteEditText tintNoteEditText = this.etNote;
        if (tintNoteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
        }
        tintNoteEditText.setVisibility(0);
        TextView textView6 = this.tvMaxLimitTransaction;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMaxLimitTransaction");
        }
        textView6.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaDescriptionCompat);
        TextView textView7 = this.tvPayNowRemainingDailyLimit;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayNowRemainingDailyLimit");
        }
        textView7.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.f2677x50fd9e4a);
        if (setaddress.MediaBrowserCompat$ItemReceiver != null) {
            CustomSpinnerWithTitle customSpinnerWithTitle = this.swtPurpose;
            if (customSpinnerWithTitle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            customSpinnerWithTitle.IconCompatParcelizer = false;
            if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                customSpinnerWithTitle.spinner.setSelection(0);
            }
            CustomSpinnerWithTitle customSpinnerWithTitle2 = this.swtPurpose;
            if (customSpinnerWithTitle2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            customSpinnerWithTitle2.setItems(setaddress.MediaBrowserCompat$ItemReceiver, false, true);
            CustomSpinnerWithTitle customSpinnerWithTitle3 = this.swtPurpose;
            if (customSpinnerWithTitle3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            customSpinnerWithTitle3.setSelectionIndex(0);
            C4997nB nBVar = this.presenter;
            if (nBVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CustomSpinnerWithTitle customSpinnerWithTitle4 = this.swtPurpose;
            if (customSpinnerWithTitle4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            nBVar.MediaBrowserCompat$CustomActionResultReceiver(customSpinnerWithTitle4.spinner.getSelectedItemPosition());
            CustomSpinnerWithTitle customSpinnerWithTitle5 = this.swtPurpose;
            if (customSpinnerWithTitle5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            customSpinnerWithTitle5.setOnCustomSpinnerWithTitleCompletion(new RemittanceAmountFormFragment$MediaBrowserCompat$MediaItem(this));
        }
    }

    public final void write() {
        AmountEditText amountEditText = this.etToAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
        }
        amountEditText.setInvalidAmount(false);
        TextView textView = this.tvErrorAmountTo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorAmountTo");
        }
        textView.setVisibility(8);
    }

    public final void read() {
        AmountEditText amountEditText = this.etToAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
        }
        amountEditText.setInvalidAmount(true);
        TextView textView = this.tvErrorAmountTo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorAmountTo");
        }
        textView.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity, String str, String str2) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        onGetStartedClick.write((Object) str, "mobile");
        onGetStartedClick.write((Object) str2, "purpose");
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.read(hmlVerifyEmailSuccessfulActivity, str, str2);
        }
    }

    public final void write(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.IconCompatParcelizer(hmlVerifyEmailSuccessfulActivity);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.MediaBrowserCompat$ItemReceiver(hmlVerifyEmailSuccessfulActivity);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity, String str, String str2, String str3) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        onGetStartedClick.write((Object) str, "mobile");
        onGetStartedClick.write((Object) str2, "purpose");
        onGetStartedClick.write((Object) str3, "note");
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.MediaBrowserCompat$ItemReceiver(hmlVerifyEmailSuccessfulActivity, str, str2, str3);
        }
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindCloseAccountSelectionTabFragment fragmentBuilder_BindCloseAccountSelectionTabFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCloseAccountSelectionTabFragment != null) {
            fragmentBuilder_BindCloseAccountSelectionTabFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void read(int i) {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.swtPurpose;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
        }
        customSpinnerWithTitle.setSelectionIndex(i);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("outward_remittance_pp_input");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle arguments = getArguments();
        AutoValue_CrashlyticsReport_Session_Application.C30641 r0 = arguments != null ? (AutoValue_CrashlyticsReport_Session_Application.C30641) arguments.getParcelable("cache") : null;
        if (r0 != null) {
            double d = (double) r0.MediaBrowserCompat$ItemReceiver;
            String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            CustomEditText customEditText = this.etMobileInputField;
            if (customEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etMobileInputField");
            }
            customEditText.setText(r0.MediaDescriptionCompat);
            C4997nB nBVar = this.presenter;
            if (nBVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nBVar.read(r0.MediaDescriptionCompat);
            TintNoteEditText tintNoteEditText = this.etNote;
            if (tintNoteEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
            }
            tintNoteEditText.setText(r0.RatingCompat);
            AmountEditText amountEditText = this.etFromAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
            }
            amountEditText.setText(MediaBrowserCompat$ItemReceiver);
            C4997nB nBVar2 = this.presenter;
            if (nBVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer write2 = new C4997nB.write(nBVar2, d / nBVar2.IconCompatParcelizer);
            boolean z = true;
            if (nBVar2.RatingCompat != null) {
                write2.IconCompatParcelizer(nBVar2.RatingCompat);
            }
            C4997nB nBVar3 = this.presenter;
            if (nBVar3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = r0.RatingCompat;
            if (str == null) {
                str = "";
            }
            onGetStartedClick.write((Object) str, "note");
            nBVar3.MediaBrowserCompat$ItemReceiver = str;
            C4997nB nBVar4 = this.presenter;
            if (nBVar4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str2 = r0.MediaMetadataCompat;
            onGetStartedClick.write((Object) str2, "purpose");
            setAddress setaddress = nBVar4.write;
            if (setaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("purposeList");
            }
            List<String> list = setaddress.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                int indexOf = list.indexOf(str2);
                nBVar4.read = list.get(indexOf);
                writeUInt64NoTag.IconCompatParcelizer ratingCompat = new C4997nB.RatingCompat(indexOf);
                if (nBVar4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ratingCompat.IconCompatParcelizer(nBVar4.RatingCompat);
                }
            }
        }
    }
}
