package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlDocumentUploadGuidelineActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerGuidelinesFragment;
import java.util.HashMap;
import p040o.onGetStartedClick;

public class HmlBusinessOwnerGuidelinesActivity extends HmlDocumentUploadGuidelineActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);
    private HashMap MediaBrowserCompat$MediaItem;

    public View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$MediaItem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$MediaItem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setContentView() {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: AppCompatDelegateImpl$ListMenuDecorView */
    public HmlBusinessOwnerGuidelinesFragment mo13702x50fd9e4a() {
        HmlBusinessOwnerGuidelinesFragment.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerGuidelinesFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlBusinessOwnerGuidelinesFragment();
    }

    public void onBackPressed() {
        if (!getIntent().getBooleanExtra("SHOW_BACK_POP_UP", false)) {
            super.onBackPressed();
            return;
        }
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.hml_business_go_back_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.hml_business_go_back_text);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(getString(R.string.hml_occupation_back_dialog_confirm), new read(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_occupation_back_dialog_cancel), C5623x518bff1a.IconCompatParcelizer).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlBusinessOwnerGuidelinesActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(HmlBusinessOwnerGuidelinesActivity hmlBusinessOwnerGuidelinesActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerGuidelinesActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.MediaBrowserCompat$CustomActionResultReceiver.finish();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
