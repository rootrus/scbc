package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.additionaldocument.C5851x6234a1cc;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;
import p040o.zzwd;
import p040o.zzwf;

public class HmlApiBasedDocumentInstructionsActivity extends BaseActivityWithFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public final String au_() {
        return "";
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent write(Context context, boolean z, zzwd zzwd, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) zzwd, "uploadMethod");
            onGetStartedClick.write((Object) str, "documentCode");
            Intent intent = new Intent(context, HmlApiBasedDocumentInstructionsActivity.class);
            intent.putExtra("SHOW_NEXT_BUTTON_KEY", z);
            intent.putExtra("UPLOAD_METHOD", zzwd);
            intent.putExtra("DOCUMENT_CODE", str);
            return intent;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        C5851x6234a1cc hmlApiBasedDocumentInstructionsFragment$MediaBrowserCompat$ItemReceiver = C5851x6234a1cc.IconCompatParcelizer;
        boolean booleanExtra = getIntent().getBooleanExtra("SHOW_NEXT_BUTTON_KEY", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("UPLOAD_METHOD");
        if (serializableExtra != null) {
            String stringExtra = getIntent().getStringExtra("DOCUMENT_CODE");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(DOCUMENT_CODE)");
            return C5851x6234a1cc.MediaBrowserCompat$CustomActionResultReceiver(booleanExtra, (zzwd) serializableExtra, stringExtra, zzwf.NATIVE);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod");
    }
}
