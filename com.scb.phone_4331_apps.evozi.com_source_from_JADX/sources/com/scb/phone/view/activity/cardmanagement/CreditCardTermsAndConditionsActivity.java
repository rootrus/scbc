package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C6404xb2f77424;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.fromByteBuffer;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class CreditCardTermsAndConditionsActivity extends BaseActivityWithFragment implements C6404xb2f77424, FragmentBuilder_BindCustomizeYourPageFragment {
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver;
    public static final write MediaMetadataCompat = new write((byte) 0);
    @HmlPinActivity
    public fromByteBuffer mPresenter;

    public static final Intent IconCompatParcelizer(Context context, String str) {
        return write.MediaBrowserCompat$ItemReceiver(context, str);
    }

    public final void IconCompatParcelizer(String str) {
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final void write(String str) {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "type");
            Intent putExtra = new Intent(context, CreditCardTermsAndConditionsActivity.class).putExtra(CreditCardTermsAndConditionsActivity.MediaBrowserCompat$SearchResultReceiver, str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CreditCa…YPE_FOR_REDEMPTION, type)");
            return putExtra;
        }
    }

    public final void onStart() {
        super.onStart();
        fromByteBuffer frombytebuffer = this.mPresenter;
        if (frombytebuffer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        frombytebuffer.MediaBrowserCompat$ItemReceiver(this);
        fromByteBuffer frombytebuffer2 = this.mPresenter;
        if (frombytebuffer2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        String stringExtra = getIntent().getStringExtra(MediaBrowserCompat$SearchResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(EXTRA_TYPE_FOR_REDEMPTION)");
        onGetStartedClick.write((Object) stringExtra, "type");
        writeUInt64NoTag.IconCompatParcelizer read = new fromByteBuffer.read(frombytebuffer2, stringExtra);
        if (frombytebuffer2.RatingCompat != null) {
            read.IconCompatParcelizer(frombytebuffer2.RatingCompat);
        }
    }

    public final String au_() {
        String string = getString(R.string.terms_and_conditions_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.terms_and_conditions_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void setContentView() {
        finish();
    }
}
