package com.scb.phone.view.fragment.chequemanagement;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.chequemanagement.ChequeReviewActivity;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeHelpActivity;
import com.scb.phone.view.custom.common.CustomAddressItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ComponentRegistrar;
import p040o.ComponentRuntime$$Lambda$5;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getICheckDeserializerRtti;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class BaseChequeReviewFragment extends BaseFragment {
    private setUuidFromUtf8Bytes IconCompatParcelizer;
    /* access modifiers changed from: private */
    public Context MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView detailText;
    @BindView
    CustomTransferAndPayTarget feeDetail;
    @BindView
    CustomAddressItem mailingAddressDetail;
    @BindView
    CustomTransferAndPayTarget quantityDetail;
    @BindView
    CustomTransferAndPaySource sourceDetail;
    @BindView
    CustomTransferAndPayTarget targetDetail;

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, View view, Context context) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
        if (setuuidfromutf8bytes instanceof ComponentRegistrar) {
            ComponentRegistrar componentRegistrar = (ComponentRegistrar) setuuidfromutf8bytes;
            String str = componentRegistrar.read;
            StringBuilder sb = new StringBuilder();
            sb.append(componentRegistrar.MediaMetadataCompat);
            sb.append(" - ");
            sb.append(componentRegistrar.MediaBrowserCompat$CustomActionResultReceiver);
            setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
            this.IconCompatParcelizer = componentRegistrar;
            MediaBrowserCompat$CustomActionResultReceiver();
            write();
            IconCompatParcelizer(str);
            if (getActivity() != null && (getActivity() instanceof ChequeReviewActivity)) {
                IconCompatParcelizer("activatechq_review", new ZSYR2K[0]);
            }
        } else if (setuuidfromutf8bytes instanceof ComponentRuntime$$Lambda$5) {
            ComponentRuntime$$Lambda$5 componentRuntime$$Lambda$5 = (ComponentRuntime$$Lambda$5) setuuidfromutf8bytes;
            String str2 = componentRuntime$$Lambda$5.IconCompatParcelizer;
            MediaBrowserCompat$CustomActionResultReceiver();
            IconCompatParcelizer(str2);
            String str3 = componentRuntime$$Lambda$5.read;
            this.feeDetail.setVisibility(0);
            this.feeDetail.setTargetName(str3);
            this.feeDetail.setReferenceNumbersVisible(false);
            this.feeDetail.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.order_cheque_review_fee));
            read(componentRuntime$$Lambda$5.write);
            if (this.detailText != null) {
                String string = getString(R.string.order_cheque_review_description);
                String string2 = getString(R.string.order_cheque_review_find_out_more);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(string2);
                String obj = sb2.toString();
                SpannableString spannableString = new SpannableString(obj);
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        Intent intent = new Intent(BaseChequeReviewFragment.this.MediaBrowserCompat$CustomActionResultReceiver, OrderChequeHelpActivity.class);
                        BaseChequeReviewFragment baseChequeReviewFragment = BaseChequeReviewFragment.this;
                        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                        try {
                            FragmentActivity activity = baseChequeReviewFragment.getActivity();
                            if (activity != null) {
                                intent = setTapText.write(activity, intent).read();
                            }
                            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                            sb.append(intent.getData());
                            sb.append("\n with context ");
                            sb.append(activity.hashCode());
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                            baseChequeReviewFragment.startActivity(intent);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }

                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        BaseChequeReviewFragment.this.getResources();
                        textPaint.setColor(-9031231);
                    }
                }, string.length(), obj.length(), 33);
                this.detailText.setText(spannableString);
                this.detailText.setMovementMethod(LinkMovementMethod.getInstance());
                this.detailText.setHighlightColor(0);
                this.detailText.setVisibility(0);
            }
            if (getActivity() != null && (getActivity() instanceof ChequeReviewActivity)) {
                IconCompatParcelizer("orderchq_review", new ZSYR2K("quantity", str2));
            }
        } else {
            MediaBrowserCompat$CustomActionResultReceiver();
            write();
            if (getActivity() != null && (getActivity() instanceof ChequeReviewActivity)) {
                IconCompatParcelizer("stopchq_review", new ZSYR2K[0]);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        this.sourceDetail.setSourceName(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        this.sourceDetail.setAccountNumber(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver());
        this.sourceDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
    }

    private void write() {
        this.targetDetail.setVisibility(0);
        this.targetDetail.setTargetName(this.IconCompatParcelizer.IconCompatParcelizer());
        this.targetDetail.setReferenceNumbersVisible(false);
        this.targetDetail.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.cheque_no));
    }

    private void IconCompatParcelizer(String str) {
        this.quantityDetail.setVisibility(0);
        this.quantityDetail.setTargetName(str);
        this.quantityDetail.setReferenceNumbersVisible(false);
        this.quantityDetail.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.no_of_quantity));
    }

    private void read(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
            sb.append(" ");
        }
        this.mailingAddressDetail.setVisibility(0);
        this.mailingAddressDetail.setText(sb.toString());
        this.mailingAddressDetail.setTitle(this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.order_cheque_review_mailing_address));
    }
}
