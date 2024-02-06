package com.scb.phone.view.fragment.common;

import android.util.MalformedJsonException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import org.json.JSONException;
import p040o.C3875x6eb12ce8;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesTopUpInformationFragment;
import p040o.FragmentBuilder_BindEasycashLoanAccountFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.TreeTypeAdapter;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.common.PrintSlipWebFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5895x73737e64 extends CheckEligibilityActivity implements FundActionsSuccessActivity<FragmentBuilder_BindEasycashLoanAccountFragment> {
    final /* synthetic */ PrintSlipWebFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5895x73737e64(PrintSlipWebFragment printSlipWebFragment) {
        super(0);
        this.read = printSlipWebFragment;
    }

    public final /* synthetic */ Object invoke() {
        return new FragmentBuilder_BindEasycashLoanAccountFragment(new FragmentBuilder_BindEasycashFeaturesTopUpInformationFragment((FundFactSheetActivity<Object, ? extends Object>) new FundFactSheetActivity<Object, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C5895x73737e64 read;

            {
                this.read = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                TreeTypeAdapter.SingleTypeFactory singleTypeFactory = this.read.read.mPresenter;
                if (singleTypeFactory == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
                }
                singleTypeFactory.MediaBrowserCompat$ItemReceiver(obj);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }), new FragmentBuilder_BindEasycashFeaturesTopUpInformationFragment((FundFactSheetActivity<Object, ? extends Object>) new FundFactSheetActivity<Object, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C5895x73737e64 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                TreeTypeAdapter.SingleTypeFactory singleTypeFactory = this.IconCompatParcelizer.read.mPresenter;
                if (singleTypeFactory == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
                }
                if (obj == null || !(obj instanceof String)) {
                    singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                } else {
                    try {
                        JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj.toString(), JsonObject.class);
                        if (jsonObject.has("rquid")) {
                            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new TreeTypeAdapter.SingleTypeFactory.IconCompatParcelizer(jsonObject);
                            if (singleTypeFactory.RatingCompat != null) {
                                iconCompatParcelizer.IconCompatParcelizer(singleTypeFactory.RatingCompat);
                            }
                        } else {
                            singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                        }
                    } catch (NullPointerException unused) {
                        singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                    } catch (JsonParseException unused2) {
                        singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                    } catch (JSONException unused3) {
                        singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                    } catch (MalformedJsonException unused4) {
                        singleTypeFactory.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(singleTypeFactory));
                    }
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }));
    }
}
