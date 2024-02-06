package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.GenericNetworkResponse;
import com.thunderhead.connectivity.NetworkOperationError;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import p040o.MyECouponActivity_ViewBinding;
import retrofit2.Response;

class Retrofit2GenericResponse<T> implements GenericNetworkResponse<T> {
    private NetworkOperationError error;
    private Response<T> originalResponse;
    private okhttp3.Response rawResponse;

    Retrofit2GenericResponse(Response<T> response) {
        this.originalResponse = response;
    }

    Retrofit2GenericResponse(okhttp3.Response response) {
        this.rawResponse = response;
    }

    Retrofit2GenericResponse(Rv2NetworkOperationError rv2NetworkOperationError) {
        this.error = rv2NetworkOperationError;
    }

    public T getDataBody() {
        Response<T> response = this.originalResponse;
        if (response == null) {
            return null;
        }
        return response.body();
    }

    public Map<String, List<String>> getHeaders() {
        Headers headers;
        Response<T> response = this.originalResponse;
        if (response != null) {
            headers = response.headers();
        } else {
            okhttp3.Response response2 = this.rawResponse;
            headers = response2 != null ? response2.headers() : null;
        }
        if (headers != null) {
            return headers.toMultimap();
        }
        return null;
    }

    public String getMessage() {
        Response<T> response = this.originalResponse;
        if (response != null) {
            return response.message();
        }
        okhttp3.Response response2 = this.rawResponse;
        if (response2 != null) {
            return response2.message();
        }
        return null;
    }

    public int getStatus() {
        Response<T> response = this.originalResponse;
        if (response != null) {
            return response.code();
        }
        okhttp3.Response response2 = this.rawResponse;
        if (response2 != null) {
            return response2.code();
        }
        NetworkOperationError networkOperationError = this.error;
        if (networkOperationError != null) {
            return networkOperationError.getHttpStatusCode();
        }
        return -1;
    }

    public InputStream getBodyAsStream() {
        Response<T> response = this.originalResponse;
        if (response != null) {
            return response.raw().body().byteStream();
        }
        okhttp3.Response response2 = this.rawResponse;
        if (response2 != null) {
            return response2.body().byteStream();
        }
        return null;
    }

    public boolean isSuccessful() {
        Response<T> response = this.originalResponse;
        if (response != null) {
            return response.isSuccessful();
        }
        okhttp3.Response response2 = this.rawResponse;
        return response2 != null && response2.isSuccessful();
    }

    public NetworkOperationError getError() {
        return this.error;
    }

    public void close() {
        okhttp3.Response response = this.rawResponse;
        if (response != null) {
            try {
                response.close();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }
}
