package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.List;

public class ProgressStateBar extends LinearLayout {
    private List<String> IconCompatParcelizer;
    @BindView
    LinearLayout viewProgressState;

    public ProgressStateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84462131493672, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setStates(List<String> list) {
        this.IconCompatParcelizer = list;
    }

    public void setCurrentState(int i) {
        this.viewProgressState.removeAllViews();
        List<String> list = this.IconCompatParcelizer;
        if (list != null && !list.isEmpty()) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.f84472131493673, (ViewGroup) null, false);
                TextView textView = (TextView) linearLayout.findViewById(R.id.text_state_number);
                View findViewById = linearLayout.findViewById(R.id.view_left_line);
                View findViewById2 = linearLayout.findViewById(R.id.view_right_line);
                ((TextView) linearLayout.findViewById(R.id.text_state_label)).setText(this.IconCompatParcelizer.get(i2));
                if (i == i2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2 + 1);
                    textView.setText(sb.toString());
                    textView.setBackgroundResource(R.drawable.progress_state_current);
                } else {
                    textView.setText("");
                    if (i2 < i) {
                        textView.setBackgroundResource(R.drawable.progress_state_previous);
                    } else {
                        textView.setBackgroundResource(R.drawable.progress_state_next);
                    }
                }
                if (i2 == 0) {
                    findViewById.setVisibility(4);
                }
                if (i2 == this.IconCompatParcelizer.size() - 1) {
                    findViewById2.setVisibility(4);
                }
                this.viewProgressState.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
                linearLayout.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                if (i == i2) {
                    layoutParams2.width = (int) (displayMetrics.density * 30.0f);
                    layoutParams2.height = (int) (displayMetrics.density * 30.0f);
                } else {
                    layoutParams2.width = (int) (displayMetrics.density * 10.0f);
                    layoutParams2.height = (int) (displayMetrics.density * 10.0f);
                }
                textView.setLayoutParams(layoutParams2);
            }
        }
    }
}
