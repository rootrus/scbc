package com.thunderhead.connectivity.transport.retrofitv2.oauth;

import okhttp3.Request;
import p040o.PartnerDiscoverWebViewActivity;
import p040o.PartnerLandingActivity;

public class Retrofit2HttpOAuthConsumer extends PartnerDiscoverWebViewActivity {
    private static final long serialVersionUID = 1;

    public Retrofit2HttpOAuthConsumer(String str, String str2) {
        super(str, str2);
    }

    public PartnerLandingActivity wrap(Object obj) {
        if (obj instanceof Request) {
            return new HttpRequestAdapter((Request) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This consumer expects requests of type ");
        sb.append(Request.class.getCanonicalName());
        throw new IllegalArgumentException(sb.toString());
    }
}
