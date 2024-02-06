package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.view.View;
import com.scb.phone.view.fragment.hml.HmlNTBDocumentUploadGuidelineFragment;
import java.util.HashMap;
import p040o.VisibilityAwareImageButton;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;

public final class HmlNTBDocumentUploadGuidelineActivity extends HmlDocumentUploadGuidelineActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private HashMap MediaBrowserCompat$SearchResultReceiver;

    public final View MediaBrowserCompat$ItemReceiver(int i) {
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

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void setContentView() {
        this.scbAnalytics.write("document_submission_guideline", new ZSYR2K("user_type", "ntb"), new ZSYR2K("feature", "resubmitDocument"));
    }

    /* access modifiers changed from: private */
    /* renamed from: AppCompatDelegateImpl$ListMenuDecorView */
    public HmlNTBDocumentUploadGuidelineFragment mo13702x50fd9e4a() {
        HmlNTBDocumentUploadGuidelineFragment.write write = HmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("EXTRA_TYPE", -1);
        VisibilityAwareImageButton visibilityAwareImageButton = intExtra >= 0 ? VisibilityAwareImageButton.values()[intExtra] : null;
        if (visibilityAwareImageButton == null) {
            visibilityAwareImageButton = VisibilityAwareImageButton.NORMAL;
        }
        return HmlNTBDocumentUploadGuidelineFragment.write.MediaBrowserCompat$CustomActionResultReceiver(visibilityAwareImageButton, getIntent().getStringExtra("DEEPLINK_ID"));
    }
}
