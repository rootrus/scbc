package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.C5573x211f1f83;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponRedemptionDetailActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.custom.ccrredemption.ecoupon.CustomECouponFooterButtonViewComponent;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C3352x19672e6f;
import p040o.FieldNamingPolicy;
import p040o.FieldNamingPolicy$2$MediaBrowserCompat$ItemReceiver;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getFirstName$MediaBrowserCompat$SearchResultReceiver;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class ECouponSaveSlipFragment extends PurchaseSuccessFragment implements getFirstName$MediaBrowserCompat$SearchResultReceiver {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String RatingCompat;
    @BindView
    public LinearLayout deepLinkButtonsContainer;
    @HmlPinActivity
    public FieldNamingPolicy.C33452 saveSlipPresenter;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.RatingCompat = AlertController$RecycleListView.write(arguments, "EXTRA_CARD_REF_NO_KEY");
            this.MediaDescriptionCompat = AlertController$RecycleListView.write(arguments, "EXTRA_REF_ID_KEY");
            this.MediaBrowserCompat$MediaItem = AlertController$RecycleListView.write(arguments, "EXTRA_ITEM_CODE_KEY");
            this.MediaSessionCompat$QueueItem = AlertController$RecycleListView.write(arguments, "EXTRA_SLIP_REF_ID_KEY");
            this.MediaBrowserCompat$SearchResultReceiver = arguments.getBoolean("EXTRA_IS_COUPON_SENSITIVE_TIME_KEY");
            this.MediaMetadataCompat = arguments.getInt("EXTRA_RELATION_ID_KEY");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        FieldNamingPolicy.C33452 r0 = this.saveSlipPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
        }
        r0.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$ResultReceiverWrapper();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String string = getString(R.string.empty);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.empty)");
        MediaBrowserCompat$MediaItem(string);
        FieldNamingPolicy.C33452 r5 = this.saveSlipPresenter;
        if (r5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
        }
        boolean z = this.MediaBrowserCompat$SearchResultReceiver;
        String str = this.MediaSessionCompat$QueueItem;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("slipRefId");
        }
        onGetStartedClick.write((Object) str, "slipRefId");
        r5.IconCompatParcelizer = z;
        writeUInt64NoTag.IconCompatParcelizer fieldNamingPolicy$2$MediaBrowserCompat$CustomActionResultReceiver = new C3352x19672e6f(r5, str);
        boolean z2 = true;
        if (r5.RatingCompat != null) {
            fieldNamingPolicy$2$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(r5.RatingCompat);
        }
        FieldNamingPolicy.C33452 r52 = this.saveSlipPresenter;
        if (r52 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FieldNamingPolicy$2$MediaBrowserCompat$ItemReceiver.write;
        if (r52.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            iconCompatParcelizer.IconCompatParcelizer(r52.RatingCompat);
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
    }

    @OnClick
    public final void onClickReturnButton() {
        FieldNamingPolicy.C33452 r0 = this.saveSlipPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FieldNamingPolicy.C33452.write.read;
        if (r0.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, "label");
        TextView textView = this.buttonReturn;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "it");
        textView.setText(str);
        textView.setGravity(17);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<getUserId> list) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            LinearLayout linearLayout = this.deepLinkButtonsContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("deepLinkButtonsContainer");
            }
            linearLayout.removeAllViews();
            Context context = linearLayout.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context, "it.context");
            CustomECouponFooterButtonViewComponent customECouponFooterButtonViewComponent = new CustomECouponFooterButtonViewComponent(context, (AttributeSet) null, 0);
            customECouponFooterButtonViewComponent.setName(((getUserId) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list)).IconCompatParcelizer);
            customECouponFooterButtonViewComponent.setButtonClickListener(new write(this));
            linearLayout.addView(customECouponFooterButtonViewComponent);
            linearLayout.setVisibility(0);
        }
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ ECouponSaveSlipFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(ECouponSaveSlipFragment eCouponSaveSlipFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = eCouponSaveSlipFragment;
        }

        public final void onClick(View view) {
            FieldNamingPolicy.C33452 r3 = this.MediaBrowserCompat$CustomActionResultReceiver.saveSlipPresenter;
            if (r3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
            }
            writeUInt64NoTag.IconCompatParcelizer read = new FieldNamingPolicy.C33452.read(r3);
            if (r3.RatingCompat != null) {
                read.IconCompatParcelizer(r3.RatingCompat);
            }
        }
    }

    public final void onDestroyView() {
        FieldNamingPolicy.C33452 r0 = this.saveSlipPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlipPresenter");
        }
        r0.onDestroy();
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$MediaItem() {
        Context context = getContext();
        if (context != null) {
            MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver myECouponActivity$MediaBrowserCompat$CustomActionResultReceiver = MyECouponActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str = this.RatingCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
            }
            Intent IconCompatParcelizer2 = MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(context, str, false);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, IconCompatParcelizer2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Context context = getContext();
        if (context != null) {
            C5573x211f1f83 eCouponRedemptionDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = ECouponRedemptionDetailActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str = this.RatingCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRefNo");
            }
            String str2 = this.MediaDescriptionCompat;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("refId");
            }
            String str3 = this.MediaBrowserCompat$MediaItem;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemCode");
            }
            Intent MediaBrowserCompat$ItemReceiver = C5573x211f1f83.MediaBrowserCompat$ItemReceiver(context, str, str2, str3, this.MediaMetadataCompat, false);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaDescriptionCompat() {
        Intent intent = new Intent(getActivity(), CreditCardDetailActivity.class);
        intent.setFlags(603979776);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                intent = setTapText.write(activity2, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void RatingCompat() {
        String string = getString(R.string.return_to_credit_card);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.return_to_credit_card)");
        MediaBrowserCompat$MediaItem(string);
        String string2 = getString(R.string.e_coupon_view_my_e_coupon);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.e_coupon_view_my_e_coupon)");
        List singletonList = Collections.singletonList(new getUserId(string2, ""));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        MediaBrowserCompat$ItemReceiver((List<getUserId>) singletonList);
    }

    public final void MediaMetadataCompat() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ecoupon_successful");
        }
    }
}
