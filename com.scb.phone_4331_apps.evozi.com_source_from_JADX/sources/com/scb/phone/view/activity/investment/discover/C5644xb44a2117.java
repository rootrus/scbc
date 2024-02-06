package com.scb.phone.view.activity.investment.discover;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.ImageButton;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.setRequestUserName;

/* renamed from: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5644xb44a2117 extends CheckEligibilityActivity implements FundActionsSuccessActivity<BaseDiscoverSearchActivity.write> {
    final /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5644xb44a2117(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = baseDiscoverSearchActivity;
    }

    public final /* synthetic */ Object invoke() {
        return new BaseDiscoverSearchActivity.write(new FundFactSheetActivity<Editable, HmlVerifyPhoneValidateOtpActivity>(this) {
            final /* synthetic */ C5644xb44a2117 MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                final Editable editable = (Editable) obj;
                if (!TextUtils.isEmpty(editable)) {
                    long j = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat ? 1000 : 0;
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = true;
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper();
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setHasDecor = new Runnable(this) {
                        private /* synthetic */ C56452 IconCompatParcelizer;

                        {
                            this.IconCompatParcelizer = r1;
                        }

                        public final void run() {
                            setRequestUserName setrequestusername = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.presenter;
                            if (setrequestusername == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                            }
                            Editable editable = editable;
                            String obj = editable != null ? editable.toString() : null;
                            if (obj == null) {
                                obj = "";
                            }
                            setRequestUserName.MediaBrowserCompat$CustomActionResultReceiver(setrequestusername, obj, 0, (String) null, (String) null, 14);
                        }
                    };
                    BaseDiscoverSearchActivity.write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver).postDelayed(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setHasDecor, j);
                    ImageButton imageButton = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.btClear;
                    if (imageButton == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
                    }
                    imageButton.setVisibility(0);
                } else {
                    ImageButton imageButton2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.btClear;
                    if (imageButton2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
                    }
                    imageButton2.setVisibility(8);
                    BaseDiscoverSearchActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        });
    }
}
