package com.scb.phone.view.activity.additionaldocument;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.additionaldocument.DocumentInstructionsFragment;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.onGetStartedClick;
import p040o.zzwd;

public class DocumentInstructionsActivity extends BaseActivityWithFragment {
    public static final C5560x96251bfc MediaMetadataCompat = new C5560x96251bfc((byte) 0);

    public final String au_() {
        return "";
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        DocumentInstructionsFragment.read read = DocumentInstructionsFragment.read.MediaBrowserCompat$ItemReceiver;
        boolean booleanExtra = getIntent().getBooleanExtra("SHOW_NEXT_BUTTON_KEY", false);
        Intent intent = getIntent();
        FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.Companion;
        String stringExtra = intent.getStringExtra(FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Do…ructionsViewStrategy.KEY)");
        Serializable serializableExtra = getIntent().getSerializableExtra("UPLOAD_METHOD");
        if (serializableExtra != null) {
            return DocumentInstructionsFragment.read.write(booleanExtra, stringExtra, (zzwd) serializableExtra);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod");
    }
}
