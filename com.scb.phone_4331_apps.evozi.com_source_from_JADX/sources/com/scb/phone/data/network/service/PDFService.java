package com.scb.phone.data.network.service;

import okhttp3.ResponseBody;
import p040o.DebitCardResetOtpActivity;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface PDFService {
    @Streaming
    @GET
    DebitCardResetOtpActivity<Response<ResponseBody>> downloadPdfFile(@Url String str);
}
