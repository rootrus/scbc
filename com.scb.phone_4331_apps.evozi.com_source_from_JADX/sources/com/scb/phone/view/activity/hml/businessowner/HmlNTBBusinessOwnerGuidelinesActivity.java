package com.scb.phone.view.activity.hml.businessowner;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlDocumentUploadGuidelineFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerGuidelinesFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlNTBBusinessOwnerGuidelinesFragment;
import java.util.HashMap;

public final class HmlNTBBusinessOwnerGuidelinesActivity extends HmlBusinessOwnerGuidelinesActivity {
    public static final C5627xaa70db4c MediaBrowserCompat$MediaItem = new C5627xaa70db4c((byte) 0);
    private HashMap MediaDescriptionCompat;

    public final View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new HashMap();
        }
        View view = (View) this.MediaDescriptionCompat.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaDescriptionCompat.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlNTBBusinessOwnerGuidelinesFragment.write write = HmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat;
        return new HmlNTBBusinessOwnerGuidelinesFragment();
    }

    public final /* synthetic */ HmlDocumentUploadGuidelineFragment AppCompatActivity() {
        HmlNTBBusinessOwnerGuidelinesFragment.write write = HmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat;
        return new HmlNTBBusinessOwnerGuidelinesFragment();
    }

    public final /* synthetic */ HmlBusinessOwnerGuidelinesFragment AppCompatDelegateImpl$ListMenuDecorView() {
        HmlNTBBusinessOwnerGuidelinesFragment.write write = HmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat;
        return new HmlNTBBusinessOwnerGuidelinesFragment();
    }
}
