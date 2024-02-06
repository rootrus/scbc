package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.NetworkOperationCallback;
import p040o.FragmentBuilder_BindMerchantWalletSelectorFragment;
import p040o.MyECouponActivity_ViewBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

abstract class Retrofit2Transport {
    ServiceInterfaceProvider serviceInterfaceProvider;

    Retrofit2Transport(ServiceInterfaceProvider serviceInterfaceProvider2) {
        this.serviceInterfaceProvider = serviceInterfaceProvider2;
    }

    static class BypassCallback<T> implements Callback<T> {
        private final FragmentBuilder_BindMerchantWalletSelectorFragment code;
        NetworkOperationCallback<T> networkOperationCallback;

        BypassCallback(NetworkOperationCallback<T> networkOperationCallback2) {
            this(networkOperationCallback2, (FragmentBuilder_BindMerchantWalletSelectorFragment) null);
        }

        BypassCallback(NetworkOperationCallback<T> networkOperationCallback2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
            this.networkOperationCallback = networkOperationCallback2;
            this.code = fragmentBuilder_BindMerchantWalletSelectorFragment;
        }

        public void onResponse(Call<T> call, Response<T> response) {
            boolean z;
            String str;
            int i;
            if (this.code != null) {
                if (response != null) {
                    i = response.code();
                    if (response.isSuccessful()) {
                        str = response.body().toString();
                    } else {
                        str = response.errorBody().toString();
                    }
                    z = response.isSuccessful();
                } else {
                    str = "";
                    i = 0;
                    z = false;
                }
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.code, Boolean.valueOf(z), Integer.valueOf(i), str);
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("Request execution result. Status ");
            sb.append(response.code());
            sb.append(". Body: ");
            sb.append((response.isSuccessful() ? response.body() : response.errorBody()).toString());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            if (this.networkOperationCallback != null) {
                if (response.isSuccessful()) {
                    this.networkOperationCallback.onSuccess(response.body());
                } else {
                    this.networkOperationCallback.onFailure(new Rv2NetworkOperationError((Response) response));
                }
            }
        }

        public void onFailure(Call<T> call, Throwable th) {
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("Request execution failed. Reason: ");
            sb.append(th.getMessage());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            NetworkOperationCallback<T> networkOperationCallback2 = this.networkOperationCallback;
            if (networkOperationCallback2 != null) {
                networkOperationCallback2.onFailure(new Rv2NetworkOperationError(th));
            }
        }
    }
}
