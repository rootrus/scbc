package com.scb.phone.view.fragment.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.OffshoreCurrencyActivity;
import com.scb.phone.view.activity.investment.scbs.SCBSProductDetailActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsInputActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.adapter.investment.accountdetail.ScbsProductAdapter;
import com.scb.phone.view.fragment.BaseHeaderAndFooterFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_BindRewardsHomeActivity;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TabParser$TabParserException;
import p040o.ZSYR2K;
import p040o.forEachDst;
import p040o.getImageType;
import p040o.getMarkerFile;
import p040o.getMicrAmount;
import p040o.getWscClientType;
import p040o.include;
import p040o.isAborted;
import p040o.jsonToUserData;
import p040o.onCreateDialog;
import p040o.onStart;
import p040o.populateBinaryImageData;
import p040o.setAborted;
import p040o.setDone;
import p040o.setTapText;
import p040o.toSoapObjectForWscRequest;
import p040o.valueOrNull;

public class ScbsAccountDetailFragment extends BaseHeaderAndFooterFragment<getMarkerFile> implements getMicrAmount.read {
    private HeaderBinding IconCompatParcelizer;
    private FooterBinding MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public ScbsAccountDetailPresenter scbsAccountDetailPresenter;

    public final int write() {
        return 2;
    }

    public class HeaderBinding_ViewBinding implements Unbinder {
        private View IconCompatParcelizer;
        private HeaderBinding MediaBrowserCompat$ItemReceiver;

        public HeaderBinding_ViewBinding(final HeaderBinding headerBinding, View view) {
            this.MediaBrowserCompat$ItemReceiver = headerBinding;
            headerBinding.accountNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_number, "field 'accountNumberTextView'", TextView.class);
            headerBinding.accountCashBalanceLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_account_cash_balance, "field 'accountCashBalanceLayout'", LinearLayout.class);
            headerBinding.cashBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cash_balance, "field 'cashBalanceTextView'", TextView.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_arrow_cash_offshore, "field 'arrowCashOffshoreImageView' and method 'arrowCashOffshoreClick'");
            headerBinding.arrowCashOffshoreImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_arrow_cash_offshore, "field 'arrowCashOffshoreImageView'", ImageView.class);
            this.IconCompatParcelizer = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    HeaderBinding.this.arrowCashOffshoreClick();
                }
            });
            headerBinding.cashBalanceNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cash_balance_number, "field 'cashBalanceNumberTextView'", TextView.class);
            headerBinding.disclaimerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer, "field 'disclaimerTextView'", TextView.class);
            headerBinding.symbolListTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_symbol_list, "field 'symbolListTextView'", TextView.class);
        }

        public final void read() {
            HeaderBinding headerBinding = this.MediaBrowserCompat$ItemReceiver;
            if (headerBinding != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                headerBinding.accountNumberTextView = null;
                headerBinding.accountCashBalanceLayout = null;
                headerBinding.cashBalanceTextView = null;
                headerBinding.arrowCashOffshoreImageView = null;
                headerBinding.cashBalanceNumberTextView = null;
                headerBinding.disclaimerTextView = null;
                headerBinding.symbolListTextView = null;
                this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class FooterBinding_ViewBinding implements Unbinder {
        private FooterBinding IconCompatParcelizer;
        private View MediaBrowserCompat$CustomActionResultReceiver;
        private View MediaBrowserCompat$ItemReceiver;

        public FooterBinding_ViewBinding(final FooterBinding footerBinding, View view) {
            this.IconCompatParcelizer = footerBinding;
            footerBinding.disclaimerDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer_date, "field 'disclaimerDateTextView'", TextView.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_cash_deposit, "field 'caseDepositButton' and method 'cashDepositClick'");
            footerBinding.caseDepositButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_cash_deposit, "field 'caseDepositButton'", Button.class);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    FooterBinding.this.cashDepositClick();
                }
            });
            View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_trade_now, "field 'tradeNowButton' and method 'tradeNowClick'");
            footerBinding.tradeNowButton = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_trade_now, "field 'tradeNowButton'", Button.class);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
            IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    FooterBinding.this.tradeNowClick();
                }
            });
        }

        public final void read() {
            FooterBinding footerBinding = this.IconCompatParcelizer;
            if (footerBinding != null) {
                this.IconCompatParcelizer = null;
                footerBinding.disclaimerDateTextView = null;
                footerBinding.caseDepositButton = null;
                footerBinding.tradeNowButton = null;
                this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$ItemReceiver = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static ScbsAccountDetailFragment read(populateBinaryImageData populatebinaryimagedata) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SCBS_ACCOUNT_DETAIL", populatebinaryimagedata);
        ScbsAccountDetailFragment scbsAccountDetailFragment = new ScbsAccountDetailFragment();
        scbsAccountDetailFragment.setArguments(bundle);
        return scbsAccountDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("scbs_account_detail");
        }
        this.scbsAccountDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("SCBS_ACCOUNT_DETAIL")) {
            ScbsAccountDetailPresenter scbsAccountDetailPresenter2 = this.scbsAccountDetailPresenter;
            populateBinaryImageData populatebinaryimagedata = (populateBinaryImageData) arguments.getParcelable("SCBS_ACCOUNT_DETAIL");
            scbsAccountDetailPresenter2.read = populatebinaryimagedata;
            setAborted setaborted = new setAborted(scbsAccountDetailPresenter2, populatebinaryimagedata);
            if (scbsAccountDetailPresenter2.RatingCompat != null) {
                setaborted.IconCompatParcelizer(scbsAccountDetailPresenter2.RatingCompat);
            }
        }
        return onCreateView;
    }

    public final TabParser$TabParserException<getMarkerFile> IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.IconCompatParcelizer = new HeaderBinding();
        this.MediaBrowserCompat$CustomActionResultReceiver = new FooterBinding();
        View inflate = layoutInflater.inflate(R.layout.f91002131494327, viewGroup, false);
        View inflate2 = layoutInflater.inflate(R.layout.f90992131494326, viewGroup, false);
        View inflate3 = layoutInflater.inflate(R.layout.f90982131494325, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this.IconCompatParcelizer, inflate);
        ButterKnife.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, inflate2);
        ScbsProductAdapter scbsProductAdapter = new ScbsProductAdapter(getContext(), inflate2, inflate3);
        scbsProductAdapter.read = inflate;
        scbsProductAdapter.MediaBrowserCompat$SearchResultReceiver = new ActivityBuilder_BindRewardsHomeActivity(this);
        return scbsProductAdapter;
    }

    public void onDestroy() {
        this.scbsAccountDetailPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer.accountNumberTextView.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.accountCashBalanceLayout.setVisibility(z ? 0 : 8);
    }

    public final void read(String str, String str2) {
        this.IconCompatParcelizer.cashBalanceTextView.setText(R.string.scbs_account_detail_screen_cash);
        this.IconCompatParcelizer.cashBalanceNumberTextView.setText(String.format("%s %s", new Object[]{str, str2}));
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.IconCompatParcelizer.cashBalanceTextView.setText(R.string.scbs_account_detail_screen_liquidation_value);
        this.IconCompatParcelizer.cashBalanceNumberTextView.setText(String.format("%s %s", new Object[]{str, str2}));
    }

    public final void read(boolean z) {
        this.IconCompatParcelizer.arrowCashOffshoreImageView.setVisibility(z ? 0 : 8);
    }

    public final void write(boolean z) {
        this.IconCompatParcelizer.disclaimerTextView.setVisibility(z ? 0 : 8);
    }

    public final void write(String str) {
        this.IconCompatParcelizer.disclaimerTextView.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.IconCompatParcelizer.symbolListTextView.setText(str);
    }

    public final void IconCompatParcelizer(List<getMarkerFile> list) {
        write(list);
    }

    public final void RatingCompat(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.disclaimerDateTextView.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.caseDepositButton.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.tradeNowButton.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver(valueOrNull valueornull) {
        SCBSProductDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), valueornull);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(jsonToUserData jsontouserdata) {
        OffshoreCurrencyActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), jsontouserdata);
    }

    public final void read(String str) {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaBrowserCompat$ItemReceiver(context, str);
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
    }

    public class HeaderBinding {
        @BindView
        LinearLayout accountCashBalanceLayout;
        @BindView
        TextView accountNumberTextView;
        @BindView
        ImageView arrowCashOffshoreImageView;
        @BindView
        TextView cashBalanceNumberTextView;
        @BindView
        TextView cashBalanceTextView;
        @BindView
        TextView disclaimerTextView;
        @BindView
        TextView symbolListTextView;

        public HeaderBinding() {
        }

        @OnClick
        public void arrowCashOffshoreClick() {
            ScbsAccountDetailPresenter scbsAccountDetailPresenter = ScbsAccountDetailFragment.this.scbsAccountDetailPresenter;
            getImageType getimagetype = new getImageType(new jsonToUserData(scbsAccountDetailPresenter.read.MediaBrowserCompat$SearchResultReceiver, scbsAccountDetailPresenter.read.MediaBrowserCompat$MediaItem, scbsAccountDetailPresenter.read.ParcelableVolumeInfo, scbsAccountDetailPresenter.read.Keep));
            if (scbsAccountDetailPresenter.RatingCompat != null) {
                getimagetype.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
            }
        }
    }

    public class FooterBinding {
        @BindView
        Button caseDepositButton;
        @BindView
        TextView disclaimerDateTextView;
        @BindView
        Button tradeNowButton;

        public FooterBinding() {
        }

        @OnClick
        public void cashDepositClick() {
            ScbsAccountDetailFragment scbsAccountDetailFragment = ScbsAccountDetailFragment.this;
            boolean z = true;
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "SCBS_account_detail")};
            if (scbsAccountDetailFragment.getActivity() != null) {
                ((BaseActivity) scbsAccountDetailFragment.getActivity()).scbAnalytics.write(" scbsonboard_cash_deposit", zsyr2kArr);
            }
            ScbsAccountDetailPresenter scbsAccountDetailPresenter = ScbsAccountDetailFragment.this.scbsAccountDetailPresenter;
            getWscClientType getwscclienttype = getWscClientType.IconCompatParcelizer;
            if (scbsAccountDetailPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getwscclienttype.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
            }
            include include = scbsAccountDetailPresenter.billPaymentCase;
            include.read(include.MediaBrowserCompat$ItemReceiver(scbsAccountDetailPresenter.read.IconCompatParcelizer), new isAborted(scbsAccountDetailPresenter), new toSoapObjectForWscRequest(scbsAccountDetailPresenter));
        }

        @OnClick
        public void tradeNowClick() {
            forEachDst foreachdst = new forEachDst();
            foreachdst.read("source", "SCBS_account_detail");
            ScbsAccountDetailFragment scbsAccountDetailFragment = ScbsAccountDetailFragment.this;
            if (scbsAccountDetailFragment.getActivity() != null) {
                foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) scbsAccountDetailFragment.getActivity()).scbAnalytics, "trade_now");
            }
            ScbsAccountDetailPresenter scbsAccountDetailPresenter = ScbsAccountDetailFragment.this.scbsAccountDetailPresenter;
            setDone setdone = new setDone(scbsAccountDetailPresenter);
            if (scbsAccountDetailPresenter.RatingCompat != null) {
                setdone.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
            }
        }
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution execution) {
        Intent write = ScbsInputActivity.write(getContext(), execution);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
