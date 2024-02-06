package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.juristic.JuristicRequestFormFragment;
import p040o.CardView;
import p040o.onGetStartedClick;

public final class JuristicRequestFormActivity extends BaseActivity {

    public static final class read {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final int MediaDescriptionCompat;
        public final String read;
        public final String write;

        private read() {
        }

        public read(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "descriptionTH");
            onGetStartedClick.write((Object) str3, "descriptionEN");
            onGetStartedClick.write((Object) str4, Name.MARK);
            onGetStartedClick.write((Object) str5, "remarksTH");
            onGetStartedClick.write((Object) str6, "remarksEN");
            this.MediaDescriptionCompat = i;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.read = str3;
            this.write = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78482131493073);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.juristic_request_form_title);
        CardView read2 = getSupportFragmentManager().read();
        JuristicRequestFormFragment.IconCompatParcelizer iconCompatParcelizer = JuristicRequestFormFragment.IconCompatParcelizer;
        read2.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, new JuristicRequestFormFragment()).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.juristic_request_form_title);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void RatingCompat(boolean z) {
        super.RatingCompat(z);
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, JuristicRequestFormActivity.class);
    }
}
