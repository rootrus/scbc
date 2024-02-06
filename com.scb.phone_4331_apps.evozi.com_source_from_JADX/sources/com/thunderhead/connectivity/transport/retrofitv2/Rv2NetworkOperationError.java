package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.NetworkOperationError;
import java.io.IOException;
import okhttp3.MediaType;
import retrofit2.Response;

class Rv2NetworkOperationError extends NetworkOperationError {
    Rv2NetworkOperationError(Response response) {
        this.kind = NetworkOperationError.Kind.HTTP;
        this.httpStatusCode = response.code();
        this.message = response.message();
        this.body = new NetworkOperationError.Body();
        MediaType contentType = response.errorBody().contentType();
        if (contentType != null) {
            this.body.setMimeType(contentType.toString());
        }
        try {
            this.body.setRawBody(response.errorBody().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Rv2NetworkOperationError(Throwable th) {
        this.kind = NetworkOperationError.Kind.INTERNAL;
        this.message = th.getMessage();
        this.f3121ex = th;
    }
}
