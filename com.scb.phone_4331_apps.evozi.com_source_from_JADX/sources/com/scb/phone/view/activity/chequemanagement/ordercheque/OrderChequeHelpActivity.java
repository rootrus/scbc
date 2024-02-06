package com.scb.phone.view.activity.chequemanagement.ordercheque;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.contactus.ContactUsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class OrderChequeHelpActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77092131492934);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.order_cheque_title);
        setTabContainer();
        MediaSessionCompat$Token();
        mo13676d_("orderchq_faq");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.order_cheque_title);
        setTabContainer();
        MediaSessionCompat$Token();
    }

    private void MediaSessionCompat$Token() {
        String string = getString(R.string.order_cheque_heading1);
        String string2 = getString(R.string.order_cheque_heading1_contact_us);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(string2);
        String obj = sb.toString();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                Intent intent = new Intent(OrderChequeHelpActivity.this, ContactUsActivity.class);
                OrderChequeHelpActivity orderChequeHelpActivity = OrderChequeHelpActivity.this;
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(orderChequeHelpActivity, intent).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(orderChequeHelpActivity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    orderChequeHelpActivity.startActivity(read);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(-11890462);
            }
        }, string.length(), obj.length(), 33);
        TextView textView = (TextView) findViewById(R.id.tv_cheque_order_heading1);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
