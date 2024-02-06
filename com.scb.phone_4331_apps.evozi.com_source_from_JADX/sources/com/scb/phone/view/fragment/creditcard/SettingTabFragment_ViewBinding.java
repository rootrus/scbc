package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SettingTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private SettingTabFragment write;

    public SettingTabFragment_ViewBinding(final SettingTabFragment settingTabFragment, View view) {
        super(settingTabFragment, view);
        this.write = settingTabFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.card_lock_toggle, "field 'switchCardStatus' and method 'onTempBlockToggleChanged'");
        settingTabFragment.switchCardStatus = (SwitchCompat) onStart.write(IconCompatParcelizer2, R.id.card_lock_toggle, "field 'switchCardStatus'", SwitchCompat.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        ((CompoundButton) IconCompatParcelizer2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingTabFragment.this.onTempBlockToggleChanged(compoundButton, z);
            }
        });
        settingTabFragment.layoutCardStatus = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_card_status, "field 'layoutCardStatus'", ConstraintLayout.class);
        settingTabFragment.layoutCardError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cardblock_error, "field 'layoutCardError'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_temp_limit_increase, "field 'layoutTempLimitIncrease' and method 'onTempLimitIncreaseClick'");
        settingTabFragment.layoutTempLimitIncrease = (ViewGroup) onStart.write(IconCompatParcelizer3, R.id.layout_temp_limit_increase, "field 'layoutTempLimitIncrease'", ViewGroup.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SettingTabFragment.this.onTempLimitIncreaseClick();
            }
        });
        settingTabFragment.txvTempLimitIncrease = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_temp_limit_increase, "field 'txvTempLimitIncrease'", TextView.class);
        settingTabFragment.imvTempLimit = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_temp_limit, "field 'imvTempLimit'", ImageView.class);
        settingTabFragment.imvTempLimitArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_temp_limit_arrow, "field 'imvTempLimitArrow'", ImageView.class);
        settingTabFragment.txvOngoingTempLimitMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_ongoing_temp_limit_message, "field 'txvOngoingTempLimitMessage'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.layout_installment_plan, "field 'layoutDeejungInstallments' and method 'handleClickOfDeejungInstallments'");
        settingTabFragment.layoutDeejungInstallments = (ViewGroup) onStart.write(IconCompatParcelizer4, R.id.layout_installment_plan, "field 'layoutDeejungInstallments'", ViewGroup.class);
        this.MediaDescriptionCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SettingTabFragment.this.handleClickOfDeejungInstallments();
            }
        });
        settingTabFragment.txvDeejungInstallments = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_installment_plan, "field 'txvDeejungInstallments'", TextView.class);
        settingTabFragment.imvDeejungInstallments = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_installment_plan, "field 'imvDeejungInstallments'", ImageView.class);
        settingTabFragment.imvDeejungInstallmentsArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_txv_installment_plan_arrow, "field 'imvDeejungInstallmentsArrow'", ImageView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.layout_deejung_transfer, "field 'layoutDeejungTransfer' and method 'handleClickOfDeejungTransfer'");
        settingTabFragment.layoutDeejungTransfer = (ViewGroup) onStart.write(IconCompatParcelizer5, R.id.layout_deejung_transfer, "field 'layoutDeejungTransfer'", ViewGroup.class);
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SettingTabFragment.this.handleClickOfDeejungTransfer();
            }
        });
        settingTabFragment.txvDeejungTransferLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deejung_transfer_label, "field 'txvDeejungTransferLabel'", TextView.class);
        settingTabFragment.imvDeejungTransfer = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_deejung_transfer, "field 'imvDeejungTransfer'", ImageView.class);
        settingTabFragment.imvDeejungTransferArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_txv_deejung_transfer_arrow, "field 'imvDeejungTransferArrow'", ImageView.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.layout_e_statement, "field 'layoutEStatement' and method 'handleClickingOfEStatement'");
        settingTabFragment.layoutEStatement = (ViewGroup) onStart.write(IconCompatParcelizer6, R.id.layout_e_statement, "field 'layoutEStatement'", ViewGroup.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SettingTabFragment.this.handleClickingOfEStatement();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.layout_statement_channel, "field 'layoutStatementChannel' and method 'handleClickingOfStatementChannel'");
        settingTabFragment.layoutStatementChannel = (ViewGroup) onStart.write(IconCompatParcelizer7, R.id.layout_statement_channel, "field 'layoutStatementChannel'", ViewGroup.class);
        this.MediaMetadataCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SettingTabFragment.this.handleClickingOfStatementChannel();
            }
        });
        settingTabFragment.llContentViewLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_content_view_layout, "field 'llContentViewLayout'", LinearLayout.class);
        settingTabFragment.llErrorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root_error_layout, "field 'llErrorLayout'", LinearLayout.class);
        settingTabFragment.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_title, "field 'tvErrorTitle'", TextView.class);
        settingTabFragment.tvErrorDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_generic_error, "field 'tvErrorDesc'", TextView.class);
        settingTabFragment.ivErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_error_icon, "field 'ivErrorIcon'", ImageView.class);
    }

    public final void read() {
        SettingTabFragment settingTabFragment = this.write;
        if (settingTabFragment != null) {
            this.write = null;
            settingTabFragment.switchCardStatus = null;
            settingTabFragment.layoutCardStatus = null;
            settingTabFragment.layoutCardError = null;
            settingTabFragment.layoutTempLimitIncrease = null;
            settingTabFragment.txvTempLimitIncrease = null;
            settingTabFragment.imvTempLimit = null;
            settingTabFragment.imvTempLimitArrow = null;
            settingTabFragment.txvOngoingTempLimitMessage = null;
            settingTabFragment.layoutDeejungInstallments = null;
            settingTabFragment.txvDeejungInstallments = null;
            settingTabFragment.imvDeejungInstallments = null;
            settingTabFragment.imvDeejungInstallmentsArrow = null;
            settingTabFragment.layoutDeejungTransfer = null;
            settingTabFragment.txvDeejungTransferLabel = null;
            settingTabFragment.imvDeejungTransfer = null;
            settingTabFragment.imvDeejungTransferArrow = null;
            settingTabFragment.layoutEStatement = null;
            settingTabFragment.layoutStatementChannel = null;
            settingTabFragment.llContentViewLayout = null;
            settingTabFragment.llErrorLayout = null;
            settingTabFragment.tvErrorTitle = null;
            settingTabFragment.tvErrorDesc = null;
            settingTabFragment.ivErrorIcon = null;
            ((CompoundButton) this.MediaBrowserCompat$ItemReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
