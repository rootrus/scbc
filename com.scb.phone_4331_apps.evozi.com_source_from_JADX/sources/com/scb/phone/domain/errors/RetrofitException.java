package com.scb.phone.domain.errors;

import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.Request;
import okhttp3.Response;
import p039io.beid.beidk.definitions.SCBHeader;
import p040o.ILocationSourceDelegate;
import p040o.onCheckBoxClick;
import p040o.snapshotForTest;
import retrofit2.Retrofit;

public class RetrofitException extends RuntimeException {
    private static Response MediaBrowserCompat$CustomActionResultReceiver;
    private static Request read;
    public final ILocationSourceDelegate IconCompatParcelizer;
    public final snapshotForTest MediaBrowserCompat$ItemReceiver;
    public final read write;

    public enum read {
        NETWORK,
        HTTP,
        UNEXPECTED,
        TIME_OUT,
        API_ERROR,
        SESSION_EXPIRED,
        TRANSACTION_TOKEN_INVALID,
        OTP_FAILED,
        OTP_REACH_MAX_LIMIT,
        OTP_EXPIRED,
        REQUIRED_OTP,
        NON_FASTPAY,
        SERVER_ERROR
    }

    public static RetrofitException MediaBrowserCompat$CustomActionResultReceiver(retrofit2.Response response, Retrofit retrofit) {
        snapshotForTest IconCompatParcelizer2 = IconCompatParcelizer("http_");
        StringBuilder sb = new StringBuilder();
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        String obj = sb.toString();
        try {
            return new RetrofitException(obj, retrofit.responseBodyConverter(ILocationSourceDelegate.class, new Annotation[0]).convert(response.errorBody()), read.HTTP, (Throwable) null, IconCompatParcelizer2);
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "API returns an invalid httpError", new Object[0]);
            return new RetrofitException(obj, (ILocationSourceDelegate) null, read.UNEXPECTED, (Throwable) null, IconCompatParcelizer2);
        }
    }

    public static RetrofitException MediaBrowserCompat$ItemReceiver(retrofit2.Response response, Retrofit retrofit) {
        snapshotForTest IconCompatParcelizer2 = IconCompatParcelizer("http_");
        StringBuilder sb = new StringBuilder();
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        String obj = sb.toString();
        try {
            return new RetrofitException(obj, retrofit.responseBodyConverter(ILocationSourceDelegate.class, new Annotation[0]).convert(response.errorBody()), read.SERVER_ERROR, (Throwable) null, IconCompatParcelizer2);
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "API returns an invalid httpError", new Object[0]);
            return new RetrofitException(obj, (ILocationSourceDelegate) null, read.UNEXPECTED, (Throwable) null, IconCompatParcelizer2);
        }
    }

    private static snapshotForTest IconCompatParcelizer(String str) {
        if (read == null) {
            return new snapshotForTest();
        }
        int i = -1;
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            if ("http_".equalsIgnoreCase(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http_");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.code());
                str = sb.toString();
            }
            i = MediaBrowserCompat$CustomActionResultReceiver.code();
        }
        snapshotForTest snapshotfortest = new snapshotForTest(str, read.header(SCBHeader.SCB_REQ_HEADER_REQUEST_ID), read.url().uri().getPath(), i);
        if (!(str == "generic" && MediaBrowserCompat$CustomActionResultReceiver == null)) {
            read = null;
            MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        return snapshotfortest;
    }

    public static void IconCompatParcelizer(Request request) {
        read = request;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Response response) {
        MediaBrowserCompat$CustomActionResultReceiver = response;
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        read = null;
        MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public static RetrofitException read(IOException iOException) {
        return new RetrofitException(iOException.getMessage(), (ILocationSourceDelegate) null, read.TIME_OUT, iOException, IconCompatParcelizer("timeout"));
    }

    public static RetrofitException IconCompatParcelizer(IOException iOException) {
        return new RetrofitException(iOException.getMessage(), (ILocationSourceDelegate) null, read.NETWORK, iOException, IconCompatParcelizer("no_internet"));
    }

    public static RetrofitException IconCompatParcelizer(Throwable th) {
        return new RetrofitException(th.getMessage(), (ILocationSourceDelegate) null, read.UNEXPECTED, th, IconCompatParcelizer("generic"));
    }

    public static RetrofitException read(Throwable th) {
        return new RetrofitException(th.getMessage(), (ILocationSourceDelegate) null, read.UNEXPECTED, th, IconCompatParcelizer("json_parsing"));
    }

    public static RetrofitException MediaBrowserCompat$CustomActionResultReceiver(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.API_ERROR, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException MediaMetadataCompat(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.SESSION_EXPIRED, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException MediaBrowserCompat$MediaItem(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.TRANSACTION_TOKEN_INVALID, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException MediaBrowserCompat$SearchResultReceiver(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.REQUIRED_OTP, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException IconCompatParcelizer(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.OTP_FAILED, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException write(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.OTP_EXPIRED, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException read(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.OTP_REACH_MAX_LIMIT, (Throwable) null, IconCompatParcelizer("generic"));
    }

    public static RetrofitException MediaBrowserCompat$ItemReceiver(ILocationSourceDelegate iLocationSourceDelegate) {
        return new RetrofitException((String) null, iLocationSourceDelegate, read.NON_FASTPAY, (Throwable) null, IconCompatParcelizer("generic"));
    }

    private RetrofitException(String str, ILocationSourceDelegate iLocationSourceDelegate, read read2, Throwable th, snapshotForTest snapshotfortest) {
        super(str, th);
        this.IconCompatParcelizer = iLocationSourceDelegate;
        this.write = read2;
        this.MediaBrowserCompat$ItemReceiver = snapshotfortest;
    }
}
