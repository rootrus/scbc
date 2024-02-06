package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.Iterator;
import java.util.List;
import p040o.AbstractSpiCall;
import p040o.getPerformPaymentWithReferer;
import p040o.onGetStartedClick;
import p040o.overrideProtocolAndHost;

public final class BusinessAndMaritalInfoRadioChoiceViewHolder extends RecyclerView.setContentView {
    @BindView
    public View paddingBottom;
    @BindView
    public RadioGroup radioGroup;
    @BindView
    public RadioButton rbFirst;
    @BindView
    public RadioButton rbSecond;
    @BindView
    public TextView tvTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessAndMaritalInfoRadioChoiceViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void read(AbstractSpiCall abstractSpiCall, getPerformPaymentWithReferer.write write, boolean z) {
        Object obj;
        onGetStartedClick.write((Object) abstractSpiCall, "display");
        onGetStartedClick.write((Object) write, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        TextView textView = this.tvTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
        }
        textView.setText(abstractSpiCall.write);
        List<overrideProtocolAndHost> list = abstractSpiCall.read;
        if (!list.isEmpty()) {
            int i = 0;
            for (Object next : list) {
                if (i >= 0) {
                    overrideProtocolAndHost overrideprotocolandhost = (overrideProtocolAndHost) next;
                    if (i == 0) {
                        RadioButton radioButton = this.rbFirst;
                        if (radioButton == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbFirst");
                        }
                        radioButton.setText(overrideprotocolandhost.MediaBrowserCompat$CustomActionResultReceiver);
                    } else if (i == 1) {
                        RadioButton radioButton2 = this.rbSecond;
                        if (radioButton2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbSecond");
                        }
                        radioButton2.setText(overrideprotocolandhost.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
        RadioGroup radioGroup2 = this.radioGroup;
        if (radioGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
        }
        Integer num = null;
        radioGroup2.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((overrideProtocolAndHost) obj).IconCompatParcelizer, (Object) abstractSpiCall.MediaBrowserCompat$CustomActionResultReceiver)) {
                break;
            }
        }
        onGetStartedClick.write((Object) list, "$this$indexOf");
        int indexOf = list.indexOf(obj);
        if (indexOf == 0) {
            RadioGroup radioGroup3 = this.radioGroup;
            if (radioGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
            }
            radioGroup3.check(R.id.rb_first);
        } else if (indexOf != 1) {
            RadioGroup radioGroup4 = this.radioGroup;
            if (radioGroup4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
            }
            radioGroup4.clearCheck();
        } else {
            RadioGroup radioGroup5 = this.radioGroup;
            if (radioGroup5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
            }
            radioGroup5.check(R.id.rb_second);
        }
        radioGroup2.setOnCheckedChangeListener(new IconCompatParcelizer(list, abstractSpiCall, write));
        View view = this.paddingBottom;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("paddingBottom");
        }
        if (z) {
            num = 0;
        }
        view.setVisibility(num != null ? num.intValue() : 8);
    }

    static final class IconCompatParcelizer implements RadioGroup.OnCheckedChangeListener {
        private /* synthetic */ AbstractSpiCall MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ getPerformPaymentWithReferer.write MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ List write;

        IconCompatParcelizer(List list, AbstractSpiCall abstractSpiCall, getPerformPaymentWithReferer.write write2) {
            this.write = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = abstractSpiCall;
            this.MediaBrowserCompat$ItemReceiver = write2;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            String str;
            if (i == R.id.rb_first) {
                str = ((overrideProtocolAndHost) this.write.get(0)).IconCompatParcelizer;
            } else if (i == R.id.rb_second) {
                str = ((overrideProtocolAndHost) this.write.get(1)).IconCompatParcelizer;
            } else {
                str = "";
            }
            AbstractSpiCall abstractSpiCall = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str, "<set-?>");
            abstractSpiCall.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str);
        }
    }
}
