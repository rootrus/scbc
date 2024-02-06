package com.scb.phone.view.fragment.investment.select;

import android.view.View;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SelectInvestmentFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private SelectInvestmentFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public SelectInvestmentFragment_ViewBinding(final SelectInvestmentFragment selectInvestmentFragment, View view) {
        super(selectInvestmentFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = selectInvestmentFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.debenture_layout, "field 'debentureLayout' and method 'onClickDebenture'");
        selectInvestmentFragment.debentureLayout = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.debenture_layout, "field 'debentureLayout'", RelativeLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickDebenture();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rl_purchase_bond_scb_layout, "field 'purchaseBondScbLayout' and method 'onClickPurchaseBondScb'");
        selectInvestmentFragment.purchaseBondScbLayout = (RelativeLayout) onStart.write(IconCompatParcelizer3, R.id.rl_purchase_bond_scb_layout, "field 'purchaseBondScbLayout'", RelativeLayout.class);
        this.MediaMetadataCompat = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickPurchaseBondScb();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.rl_purchase_bond_dlt_layout, "field 'purchaseBondDltLayout' and method 'onClickPurchaseBondDlt'");
        selectInvestmentFragment.purchaseBondDltLayout = (RelativeLayout) onStart.write(IconCompatParcelizer4, R.id.rl_purchase_bond_dlt_layout, "field 'purchaseBondDltLayout'", RelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickPurchaseBondDlt();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.mutual_fund_layout, "method 'onClickMutualFund'");
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickMutualFund();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.scbs_investment_layout, "method 'onClickScbsInvestment'");
        this.RatingCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickScbsInvestment();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.robo_advisor_layout, "method 'onClickRoboAdvisor'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectInvestmentFragment.this.onClickRoboAdvisor();
            }
        });
    }

    public final void read() {
        SelectInvestmentFragment selectInvestmentFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (selectInvestmentFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            selectInvestmentFragment.debentureLayout = null;
            selectInvestmentFragment.purchaseBondScbLayout = null;
            selectInvestmentFragment.purchaseBondDltLayout = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
