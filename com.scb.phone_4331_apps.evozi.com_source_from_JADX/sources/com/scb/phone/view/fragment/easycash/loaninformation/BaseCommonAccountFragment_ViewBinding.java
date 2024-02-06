package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseCommonAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseCommonAccountFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public BaseCommonAccountFragment_ViewBinding(final BaseCommonAccountFragment baseCommonAccountFragment, View view) {
        super(baseCommonAccountFragment, view);
        this.IconCompatParcelizer = baseCommonAccountFragment;
        baseCommonAccountFragment.container = onStart.IconCompatParcelizer(view, R.id.layout_account_container, "field 'container'");
        baseCommonAccountFragment.accountSelector = (CustomAccountSelector) onStart.IconCompatParcelizer(view, R.id.account_selector, "field 'accountSelector'", CustomAccountSelector.class);
        baseCommonAccountFragment.layoutRepayAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_repay_account, "field 'layoutRepayAccount'", LinearLayout.class);
        baseCommonAccountFragment.accountRepaySelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_repay_selector, "field 'accountRepaySelector'", CustomAccountSelector.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnNext' and method 'onNextButtonClicked'");
        baseCommonAccountFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_action, "field 'btnNext'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseCommonAccountFragment.this.onNextButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rdb_direct_debit, "field 'radioButtonDirectDebit' and method 'directDebitOptionCheckedChange'");
        baseCommonAccountFragment.radioButtonDirectDebit = (RadioButton) onStart.write(IconCompatParcelizer3, R.id.rdb_direct_debit, "field 'radioButtonDirectDebit'", RadioButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BaseCommonAccountFragment.this.directDebitOptionCheckedChange(z);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.rdb_cash, "field 'radioButtonCash' and method 'cashOptionCheckedChange'");
        baseCommonAccountFragment.radioButtonCash = (RadioButton) onStart.write(IconCompatParcelizer4, R.id.rdb_cash, "field 'radioButtonCash'", RadioButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        ((CompoundButton) IconCompatParcelizer4).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BaseCommonAccountFragment.this.cashOptionCheckedChange(z);
            }
        });
    }

    public void read() {
        BaseCommonAccountFragment baseCommonAccountFragment = this.IconCompatParcelizer;
        if (baseCommonAccountFragment != null) {
            this.IconCompatParcelizer = null;
            baseCommonAccountFragment.container = null;
            baseCommonAccountFragment.accountSelector = null;
            baseCommonAccountFragment.layoutRepayAccount = null;
            baseCommonAccountFragment.accountRepaySelector = null;
            baseCommonAccountFragment.btnNext = null;
            baseCommonAccountFragment.radioButtonDirectDebit = null;
            baseCommonAccountFragment.radioButtonCash = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            ((CompoundButton) this.MediaBrowserCompat$CustomActionResultReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
