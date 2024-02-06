package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.C5986x77d984aa;
import com.scb.phone.view.fragment.hml.HmlDocumentUploadGuidelineFragment;
import java.util.HashMap;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.VisibilityAwareImageButton;
import p040o.ZHER2K;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public class HmlDocumentUploadGuidelineActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final C5604xec6fa9b8 MediaMetadataCompat = new C5604xec6fa9b8((byte) 0);
    private HashMap MediaBrowserCompat$SearchResultReceiver;

    public View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$SearchResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$SearchResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int MediaSessionCompat$Token() {
        return R.layout.f77962131493021;
    }

    public final String au_() {
        return "";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Toolbar) MediaBrowserCompat$ItemReceiver(ZHER2K.write.toolbar)).setBackgroundColor(setLastBaselineToBottomHeight.read(getBaseContext(), R.color.f70982131100254));
        setContentView();
    }

    /* access modifiers changed from: protected */
    public void setContentView() {
        this.scbAnalytics.write("document_submission_guideline", new ZSYR2K("user_type", "etb"), new ZSYR2K("feature", "resubmitDocument"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: AppCompatActivity */
    public HmlDocumentUploadGuidelineFragment mo13702x50fd9e4a() {
        C5986x77d984aa hmlDocumentUploadGuidelineFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentUploadGuidelineFragment.IconCompatParcelizer;
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("EXTRA_TYPE", -1);
        VisibilityAwareImageButton visibilityAwareImageButton = intExtra >= 0 ? VisibilityAwareImageButton.values()[intExtra] : null;
        if (visibilityAwareImageButton == null) {
            visibilityAwareImageButton = VisibilityAwareImageButton.NORMAL;
        }
        String stringExtra = getIntent().getStringExtra("DEEPLINK_ID");
        onGetStartedClick.write((Object) visibilityAwareImageButton, "documentsType");
        HmlDocumentUploadGuidelineFragment hmlDocumentUploadGuidelineFragment = new HmlDocumentUploadGuidelineFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TYPE", visibilityAwareImageButton.ordinal());
        bundle.putString("DEEPLINK_ID", stringExtra);
        hmlDocumentUploadGuidelineFragment.setArguments(bundle);
        return hmlDocumentUploadGuidelineFragment;
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, HmlDocumentUploadGuidelineActivity.class);
    }
}
