package com.scb.phone.view.activity.ntb.fatca;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;

public class FatcaHelpActivity extends BaseActivity {
    @BindView
    TextView helpTextView;

    public static Intent read(Context context, String str) {
        Intent intent = new Intent(context, FatcaHelpActivity.class);
        intent.putExtra("EXTRA_FATCA_HTML", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77902131493015);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        setTitle(R.string.fatca_question_title);
        this.helpTextView.setText(Html.fromHtml(getIntent().getExtras().getString("EXTRA_FATCA_HTML", "")));
        this.helpTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
