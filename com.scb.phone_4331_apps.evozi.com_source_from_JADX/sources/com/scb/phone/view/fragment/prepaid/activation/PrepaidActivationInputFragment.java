package com.scb.phone.view.fragment.prepaid.activation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import p040o.C4773hl;
import p040o.C6941xae337a3a;
import p040o.FragmentBuilder_BindChangeChannelStatementApplyAllFragment;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ImmutableCollection;
import p040o.Objects$1$MediaBrowserCompat$ItemReceiver;
import p040o.ZHER2K;
import p040o.ZTBSV;
import p040o.charactersOf;
import p040o.getCasaDetails;
import p040o.getKernelIDDstAtop;
import p040o.hl$MediaBrowserCompat$ItemReceiver;
import p040o.hl$MediaBrowserCompat$SearchResultReceiver;
import p040o.isSimulator;
import p040o.onGetStartedClick;
import p040o.removeAllReports;
import p040o.setLastBaselineToBottomHeight;
import p040o.setModel;
import p040o.setModelClass;
import p040o.writeUInt64NoTag;
import p059me.relex.circleindicator.CircleIndicator;

public final class PrepaidActivationInputFragment extends BaseFragment implements C6941xae337a3a {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindChangeChannelStatementApplyAllFragment MediaBrowserCompat$MediaItem;
    private getCasaDetails MediaBrowserCompat$SearchResultReceiver = new getCasaDetails(HmlNationalIdActivity.IconCompatParcelizer);
    private FragmentBuilder_BindCreditLimitDisplayFragment MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public C4773hl presenter;

    private View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PrepaidActivationInputFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C6121x9d34bdc2.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            this.MediaBrowserCompat$MediaItem = (FragmentBuilder_BindChangeChannelStatementApplyAllFragment) context;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.listener.OnPrepaidActivationClickListener");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88922131494119, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        C4773hl hlVar = this.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        setModelClass setmodelclass = arguments != null ? (setModelClass) arguments.getParcelable("ARGS_PREPAID_DISPLAY") : null;
        if (setmodelclass != null) {
            C4773hl hlVar2 = this.presenter;
            if (hlVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setmodelclass, "prepaidDisplay");
            Iterable<isSimulator> iterable = setmodelclass.IconCompatParcelizer;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (isSimulator issimulator : iterable) {
                arrayList.add(hlVar2.read.MediaBrowserCompat$ItemReceiver(issimulator.read, issimulator.IconCompatParcelizer));
            }
            hlVar2.IconCompatParcelizer = setmodelclass.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer hl_mediabrowsercompat_searchresultreceiver = new hl$MediaBrowserCompat$SearchResultReceiver((List) arrayList);
            if (hlVar2.RatingCompat != null) {
                hl_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(hlVar2.RatingCompat);
            }
        }
        ViewPager viewPager = (ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager);
        onGetStartedClick.IconCompatParcelizer((Object) viewPager, "cardViewPager");
        viewPager.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        ((ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager)).addOnPageChangeListener(new PrepaidActivationInputFragment$MediaBrowserCompat$ItemReceiver(this));
        C4773hl hlVar3 = this.presenter;
        if (hlVar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar3.MediaBrowserCompat$ItemReceiver = hlVar3.IconCompatParcelizer.get(0);
        ((CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator)).setViewPager((ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager));
        getCasaDetails getcasadetails = this.MediaBrowserCompat$SearchResultReceiver;
        CircleIndicator circleIndicator = (CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator);
        onGetStartedClick.IconCompatParcelizer((Object) circleIndicator, "indicator");
        getcasadetails.registerDataSetObserver(circleIndicator.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaDescriptionCompat = new IconCompatParcelizer(this);
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).clearFocus();
        CustomEditText customEditText = (CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText);
        FragmentBuilder_BindCreditLimitDisplayFragment fragmentBuilder_BindCreditLimitDisplayFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCreditLimitDisplayFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardInputTextWatcher");
        }
        customEditText.addTextChangedListener(fragmentBuilder_BindCreditLimitDisplayFragment);
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).setOnBackListener(new write(this));
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).setOnEditorActionListener(new MediaDescriptionCompat(this));
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).setOnFocusChangeListener(new C6122x9a5447e3(this));
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_cardactivate_input_screen");
        }
    }

    public static final class IconCompatParcelizer extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private /* synthetic */ PrepaidActivationInputFragment IconCompatParcelizer;

        IconCompatParcelizer(PrepaidActivationInputFragment prepaidActivationInputFragment) {
            this.IconCompatParcelizer = prepaidActivationInputFragment;
        }

        public final void afterTextChanged(Editable editable) {
            onGetStartedClick.write((Object) editable, "editable");
            C4773hl hlVar = this.IconCompatParcelizer.presenter;
            if (hlVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String obj = editable.toString();
            onGetStartedClick.write((Object) obj, "cardNumberInput");
            hlVar.write = obj;
            writeUInt64NoTag.IconCompatParcelizer write = new C4773hl.write(hlVar, obj);
            if (hlVar.RatingCompat != null) {
                write.IconCompatParcelizer(hlVar.RatingCompat);
            }
        }
    }

    static final class write implements CustomEditText.write {
        private /* synthetic */ PrepaidActivationInputFragment IconCompatParcelizer;

        write(PrepaidActivationInputFragment prepaidActivationInputFragment) {
            this.IconCompatParcelizer = prepaidActivationInputFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            ((CustomEditText) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).clearFocus();
        }
    }

    static final class MediaDescriptionCompat implements TextView.OnEditorActionListener {
        private /* synthetic */ PrepaidActivationInputFragment IconCompatParcelizer;

        MediaDescriptionCompat(PrepaidActivationInputFragment prepaidActivationInputFragment) {
            this.IconCompatParcelizer = prepaidActivationInputFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            ((CustomEditText) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).clearFocus();
            this.IconCompatParcelizer.PlaybackStateCompat$CustomAction();
            return true;
        }
    }

    public final void write(List<? extends removeAllReports> list) {
        onGetStartedClick.write((Object) list, "cardCustomDisplayList");
        getCasaDetails getcasadetails = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) list, "displays");
        getcasadetails.MediaBrowserCompat$ItemReceiver = list;
        getcasadetails.notifyDataSetChanged();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        int i;
        CircleIndicator circleIndicator = (CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator);
        onGetStartedClick.IconCompatParcelizer((Object) circleIndicator, "indicator");
        if (z) {
            i = 0;
        } else if (!z) {
            i = 8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        circleIndicator.setVisibility(i);
    }

    @OnClick
    public final void onActivateButtonClick() {
        C4773hl hlVar = this.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar.write = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(hlVar.write, " ", "", false);
        if (hlVar.RatingCompat != null) {
            hlVar.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableCollection immutableCollection = new ImmutableCollection((byte) 0);
        String str = hlVar.write;
        onGetStartedClick.write((Object) str, "<set-?>");
        immutableCollection.MediaBrowserCompat$CustomActionResultReceiver = str;
        isSimulator issimulator = hlVar.MediaBrowserCompat$ItemReceiver;
        if (issimulator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardSelected");
        }
        String str2 = issimulator.RatingCompat;
        onGetStartedClick.write((Object) str2, "<set-?>");
        immutableCollection.write = str2;
        charactersOf charactersof = hlVar.MediaMetadataCompat;
        FundFactSheetActivity iconCompatParcelizer = new C4773hl.IconCompatParcelizer(hlVar);
        FundFactSheetActivity hl_mediabrowsercompat_itemreceiver = new hl$MediaBrowserCompat$ItemReceiver(hlVar);
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
        onGetStartedClick.write((Object) hl_mediabrowsercompat_itemreceiver, "onError");
        onGetStartedClick.write((Object) immutableCollection, "request");
        charactersof.IconCompatParcelizer(charactersof.write, iconCompatParcelizer, hl_mediabrowsercompat_itemreceiver, new Objects$1$MediaBrowserCompat$ItemReceiver(immutableCollection));
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "cardNumber");
        CustomEditText customEditText = (CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText);
        FragmentBuilder_BindCreditLimitDisplayFragment fragmentBuilder_BindCreditLimitDisplayFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCreditLimitDisplayFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardInputTextWatcher");
        }
        customEditText.removeTextChangedListener(fragmentBuilder_BindCreditLimitDisplayFragment);
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).setText(str);
        ((CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText)).setSelection(str.length());
        CustomEditText customEditText2 = (CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText);
        FragmentBuilder_BindCreditLimitDisplayFragment fragmentBuilder_BindCreditLimitDisplayFragment2 = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCreditLimitDisplayFragment2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardInputTextWatcher");
        }
        customEditText2.addTextChangedListener(fragmentBuilder_BindCreditLimitDisplayFragment2);
    }

    public final void write(boolean z) {
        Button button = (Button) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.activateButton);
        onGetStartedClick.IconCompatParcelizer((Object) button, "activateButton");
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Drawable drawable = null;
        if (z) {
            CustomEditText customEditText = (CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText);
            onGetStartedClick.IconCompatParcelizer((Object) customEditText, "prepaidCardEditText");
            Context context = getContext();
            if (context != null) {
                onGetStartedClick.write((Object) context, "$this$drawable");
                drawable = setLastBaselineToBottomHeight.write(context, R.drawable.shape_gray_rounded_rectangle);
            }
            customEditText.setBackground(drawable);
            TextView textView = (TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.tvPrepaidCardError);
            onGetStartedClick.IconCompatParcelizer((Object) textView, "tvPrepaidCardError");
            textView.setVisibility(8);
            return;
        }
        CustomEditText customEditText2 = (CustomEditText) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaidCardEditText);
        onGetStartedClick.IconCompatParcelizer((Object) customEditText2, "prepaidCardEditText");
        Context context2 = getContext();
        if (context2 != null) {
            onGetStartedClick.write((Object) context2, "$this$drawable");
            drawable = setLastBaselineToBottomHeight.write(context2, R.drawable.shape_red_reounded_reactangle_border);
        }
        customEditText2.setBackground(drawable);
        TextView textView2 = (TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.tvPrepaidCardError);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvPrepaidCardError");
        textView2.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(setModel setmodel) {
        onGetStartedClick.write((Object) setmodel, "prepaidVerificaitonDisplay");
        FragmentBuilder_BindChangeChannelStatementApplyAllFragment fragmentBuilder_BindChangeChannelStatementApplyAllFragment = this.MediaBrowserCompat$MediaItem;
        if (fragmentBuilder_BindChangeChannelStatementApplyAllFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("onPrepaidActivationClickListener");
        }
        C4773hl hlVar = this.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isSimulator issimulator = hlVar.MediaBrowserCompat$ItemReceiver;
        if (issimulator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardSelected");
        }
        fragmentBuilder_BindChangeChannelStatementApplyAllFragment.write(setmodel, issimulator);
    }

    public final void onDestroyView() {
        C4773hl hlVar = this.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar.onDestroy();
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
