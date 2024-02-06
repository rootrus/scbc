package com.scb.phone.view.fragment.ebillsubscription;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CrashlyticsReport;
import p040o.getICheckDeserializerRtti;
import p040o.setUuidFromUtf8Bytes;

public class BaseEBillSubscriptionReviewFragment extends BaseFragment {
    @BindView
    CustomTransferAndPaySource sourceDetail;
    @BindView
    CustomTransferAndPayTarget targetDetail;

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes, CrashlyticsReport.Session.Event.Application.Execution execution, View view) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.sourceDetail.setText(getString(R.string.promptpay_id));
        if (TextUtils.equals("MOB", setuuidfromutf8bytes.MenuItemImpl)) {
            this.sourceDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.icon_prompt_pay_mobile).toString());
        } else if (TextUtils.equals("CID", setuuidfromutf8bytes.MenuItemImpl)) {
            this.sourceDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.icon_prompt_pay_cid).toString());
        }
        this.sourceDetail.mAccountNumberTextView.setVisibility(8);
        this.sourceDetail.setSourceName(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes.MenuItemImpl, setuuidfromutf8bytes.setVisibility));
        this.targetDetail.setText(getString(R.string.billers_detail));
        this.targetDetail.setTargetName(execution.read());
        this.targetDetail.setReferenceNumbers(execution.MediaDescriptionCompat);
        if (execution.MediaBrowserCompat$CustomActionResultReceiver() == null || Uri.EMPTY.toString().equals(execution.MediaBrowserCompat$CustomActionResultReceiver())) {
            this.targetDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
        } else {
            this.targetDetail.setAvatar(execution.MediaBrowserCompat$CustomActionResultReceiver());
        }
        String str = execution.setForceShowIcon;
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.targetDetail.setReferenceNo1(getString(R.string.ebill_selected_reference, execution.setIcon, execution.setPopupCallback));
        } else if (c == 1) {
            this.targetDetail.setReferenceNo1(getString(R.string.ebill_selected_reference, execution.setIcon, execution.setPopupCallback));
            this.targetDetail.setReferenceNo2(getString(R.string.ebill_selected_reference, execution.setPadding, execution.setGroupDividerEnabled));
        } else if (c == 2) {
            this.targetDetail.setReferenceNo1(getString(R.string.ebill_selected_reference, execution.setIcon, execution.setPopupCallback));
            this.targetDetail.setReferenceNo2(getString(R.string.ebill_selected_reference, execution.setPadding, execution.setGroupDividerEnabled));
            this.targetDetail.setReferenceNo3(getString(R.string.ebill_selected_reference, execution.setItemInvoker, execution.ExpandedMenuView));
        }
    }
}
