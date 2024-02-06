package com.scb.phone.view.activity;

import p040o.CodedOutputStream;
import p040o.CodedOutputStream.OutOfSpaceException;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlETBPersonalInfoActivity;
import p040o.TestActivity;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.BasePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5557x651a8694<P extends CodedOutputStream.OutOfSpaceException<?>, A extends TestActivity<?, ?>> {
    final A MediaBrowserCompat$CustomActionResultReceiver;
    final P MediaBrowserCompat$ItemReceiver;

    public C5557x651a8694(P p, A a) {
        onGetStartedClick.write((Object) p, "presenter");
        onGetStartedClick.write((Object) a, "searchResultAdapter");
        this.MediaBrowserCompat$ItemReceiver = p;
        this.MediaBrowserCompat$CustomActionResultReceiver = a;
    }

    /* renamed from: com.scb.phone.view.activity.BasePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver$write */
    public static final class write extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private /* synthetic */ C5557x651a8694 MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ HmlETBPersonalInfoActivity read;

        write(C5557x651a8694 basePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver, HmlETBPersonalInfoActivity hmlETBPersonalInfoActivity) {
            this.MediaBrowserCompat$ItemReceiver = basePartialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.read = hmlETBPersonalInfoActivity;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.read.onNext(String.valueOf(charSequence));
            A a = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            String valueOf = String.valueOf(charSequence);
            onGetStartedClick.write((Object) valueOf, "highlight");
            a.read = valueOf;
            P p = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            String valueOf2 = String.valueOf(charSequence);
            onGetStartedClick.write((Object) valueOf2, "keyword");
            p.MediaBrowserCompat$ItemReceiver();
            boolean z = true;
            if (valueOf2.length() == 0) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = CodedOutputStream.OutOfSpaceException.IconCompatParcelizer.read;
                if (p.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(p.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = CodedOutputStream.OutOfSpaceException.read.IconCompatParcelizer;
            if (p.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(p.RatingCompat);
            }
        }
    }
}
