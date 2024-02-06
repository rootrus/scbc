package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.easycash.AdditionDocumentTypeAdapter;
import java.util.List;
import p040o.C1159x62a8e1df;
import p040o.C7343pE;
import p040o.HmlPinActivity;
import p040o.ImageProcessor;
import p040o.closeOrLog;
import p040o.setAutoFocusEnabled;

public class EasycashAdditionalDocumentTypeActivity extends BaseActivity implements C1159x62a8e1df {
    @HmlPinActivity
    public ImageProcessor.ProcessProgressListener documentTypePresenter;
    @BindView
    RecyclerView rvDocument;

    public static Intent read(Context context, String str, setAutoFocusEnabled.IconCompatParcelizer iconCompatParcelizer) {
        Intent intent = new Intent(context, EasycashAdditionalDocumentTypeActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE", str);
        intent.putExtra("com.scb.phone.view.activity.easycash.FLOW_TYPE", iconCompatParcelizer);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77502131492975);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.documentTypePresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ImageProcessor.ProcessProgressListener processProgressListener = this.documentTypePresenter;
            String string = extras.getString("com.scb.phone.view.activity.easycash.PRODUCT_TYPE");
            setAutoFocusEnabled.IconCompatParcelizer iconCompatParcelizer = (setAutoFocusEnabled.IconCompatParcelizer) extras.get("com.scb.phone.view.activity.easycash.FLOW_TYPE");
            if (processProgressListener.RatingCompat != null) {
                processProgressListener.RatingCompat.AlertController$RecycleListView();
            }
            setAutoFocusEnabled setautofocusenabled = processProgressListener.read;
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer = setAutoFocusEnabled.IconCompatParcelizer.DEFAULT;
            }
            setautofocusenabled.MediaBrowserCompat$CustomActionResultReceiver(string, iconCompatParcelizer);
            processProgressListener.read.IconCompatParcelizer(new ImageProcessor.ProcessProgressListener.read(processProgressListener, (byte) 0));
        }
        setStackedBackground();
        this.rvDocument.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvDocument.setNestedScrollingEnabled(false);
    }

    public final void write(List<closeOrLog> list) {
        this.rvDocument.setAdapter(new AdditionDocumentTypeAdapter(list, new C7343pE(this)));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        setTitle(R.string.addition_document_type_title);
        setTabContainer();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
