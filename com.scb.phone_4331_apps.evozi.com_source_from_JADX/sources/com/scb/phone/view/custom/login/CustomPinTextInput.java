package com.scb.phone.view.custom.login;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.MerchantService;
import p040o.getOrderChequeLanding;
import p040o.getOrderChequeVerification;
import p040o.getStopChequeDetail;
import p040o.show;

public class CustomPinTextInput extends LinearLayout implements getOrderChequeVerification {
    public StringBuilder IconCompatParcelizer = new StringBuilder();
    private Handler MediaBrowserCompat$CustomActionResultReceiver = new Handler();
    private TextView[] MediaBrowserCompat$ItemReceiver;
    public MerchantService read;
    @BindView
    TextView textInput1;
    @BindView
    TextView textInput2;
    @BindView
    TextView textInput3;
    @BindView
    TextView textInput4;
    @BindView
    TextView textInput5;
    @BindView
    TextView textInput6;

    public CustomPinTextInput(Context context) {
        super(context);
        IconCompatParcelizer();
    }

    public CustomPinTextInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        IconCompatParcelizer();
    }

    public CustomPinTextInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        inflate(getContext(), R.layout.f84352131493661, this);
        ButterKnife.IconCompatParcelizer(this);
        this.MediaBrowserCompat$ItemReceiver = new TextView[]{this.textInput1, this.textInput2, this.textInput3, this.textInput4, this.textInput5, this.textInput6};
    }

    public void setPinInputListener(MerchantService merchantService) {
        this.read = merchantService;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        StringBuilder sb = this.IconCompatParcelizer;
        sb.delete(0, sb.length());
        show IconCompatParcelizer2 = show.IconCompatParcelizer((T[]) this.MediaBrowserCompat$ItemReceiver);
        getStopChequeDetail getstopchequedetail = getStopChequeDetail.write;
        while (IconCompatParcelizer2.IconCompatParcelizer.hasNext()) {
            getstopchequedetail.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.IconCompatParcelizer.next());
        }
    }

    public final void read(char c) {
        if (this.IconCompatParcelizer.length() < 6) {
            this.IconCompatParcelizer.append(c);
            TextView textView = this.MediaBrowserCompat$ItemReceiver[this.IconCompatParcelizer.length() - 1];
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toString(c));
            sb.append(" ");
            textView.setText(sb.toString());
            if (this.IconCompatParcelizer.length() == 1) {
                this.read.al_();
            }
            if (this.IconCompatParcelizer.length() == 6 && this.read != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.post(new getOrderChequeLanding(this));
            }
        }
    }

    public final void read() {
        if (this.IconCompatParcelizer.length() > 0) {
            int length = this.IconCompatParcelizer.length() - 1;
            this.IconCompatParcelizer.deleteCharAt(length);
            this.MediaBrowserCompat$ItemReceiver[length].setText("_ ");
        }
    }
}
