package p040o;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

/* renamed from: o.PartnerDiscoverWebViewActivity */
public abstract class PartnerDiscoverWebViewActivity implements Serializable {
    private static final long serialVersionUID = 1;
    private onAllowClick additionalParameters;
    private String consumerKey;
    private String consumerSecret;
    private PartnerLandingAdapter$PartnerGroupTitleHolder messageSigner;
    private final Random random = new Random(System.nanoTime());
    private onAllowClick requestParameters;
    private boolean sendEmptyTokens;
    private PartnerLandingAdapter$PartnerTileHolder signingStrategy;
    private String token;

    /* access modifiers changed from: protected */
    public abstract PartnerLandingActivity wrap(Object obj);

    public PartnerDiscoverWebViewActivity(String str, String str2) {
        this.consumerKey = str;
        this.consumerSecret = str2;
        setMessageSigner(new PartnerLandingAdapter$PartnerGroupTitleHolder_ViewBinding());
        setSigningStrategy(new PartnerLandingActivity_ViewBinding());
    }

    /* access modifiers changed from: protected */
    public void collectBodyParameters(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) throws IOException {
        String contentType = partnerLandingActivity.getContentType();
        if (contentType != null && contentType.startsWith("application/x-www-form-urlencoded")) {
            onallowclick.IconCompatParcelizer((Map<? extends String, ? extends SortedSet<String>>) PartnerConsentActivity_ViewBinding.write(partnerLandingActivity.getMessagePayload()), true);
        }
    }

    /* access modifiers changed from: protected */
    public void collectHeaderParameters(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) {
        onallowclick.IconCompatParcelizer((Map<? extends String, ? extends SortedSet<String>>) PartnerConsentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(partnerLandingActivity.getHeader("Authorization")), false);
    }

    /* access modifiers changed from: protected */
    public void collectQueryParameters(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) {
        String requestUrl = partnerLandingActivity.getRequestUrl();
        int indexOf = requestUrl.indexOf(63);
        if (indexOf >= 0) {
            onallowclick.IconCompatParcelizer((Map<? extends String, ? extends SortedSet<String>>) PartnerConsentActivity_ViewBinding.read(requestUrl.substring(indexOf + 1)), true);
        }
    }

    /* access modifiers changed from: protected */
    public void completeOAuthParameters(onAllowClick onallowclick) {
        if (!onallowclick.containsKey("oauth_consumer_key")) {
            onallowclick.write("oauth_consumer_key", this.consumerKey, true);
        }
        if (!onallowclick.containsKey("oauth_signature_method")) {
            onallowclick.write("oauth_signature_method", this.messageSigner.read(), true);
        }
        if (!onallowclick.containsKey("oauth_timestamp")) {
            onallowclick.write("oauth_timestamp", generateTimestamp(), true);
        }
        if (!onallowclick.containsKey("oauth_nonce")) {
            onallowclick.write("oauth_nonce", generateNonce(), true);
        }
        if (!onallowclick.containsKey("oauth_version")) {
            onallowclick.write("oauth_version", "1.0", true);
        }
        if (!onallowclick.containsKey("oauth_token")) {
            String str = this.token;
            if ((str != null && !str.equals("")) || this.sendEmptyTokens) {
                onallowclick.write("oauth_token", this.token, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String generateNonce() {
        return Long.toString(this.random.nextLong());
    }

    /* access modifiers changed from: protected */
    public String generateTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    public String getConsumerKey() {
        return this.consumerKey;
    }

    public String getConsumerSecret() {
        return this.consumerSecret;
    }

    public onAllowClick getRequestParameters() {
        return this.requestParameters;
    }

    public String getToken() {
        return this.token;
    }

    public String getTokenSecret() {
        return this.messageSigner.MediaBrowserCompat$ItemReceiver;
    }

    public void setAdditionalParameters(onAllowClick onallowclick) {
        this.additionalParameters = onallowclick;
    }

    public void setMessageSigner(PartnerLandingAdapter$PartnerGroupTitleHolder partnerLandingAdapter$PartnerGroupTitleHolder) {
        this.messageSigner = partnerLandingAdapter$PartnerGroupTitleHolder;
        partnerLandingAdapter$PartnerGroupTitleHolder.read = this.consumerSecret;
    }

    public void setSendEmptyTokens(boolean z) {
        this.sendEmptyTokens = z;
    }

    public void setSigningStrategy(PartnerLandingAdapter$PartnerTileHolder partnerLandingAdapter$PartnerTileHolder) {
        this.signingStrategy = partnerLandingAdapter$PartnerTileHolder;
    }

    public void setTokenWithSecret(String str, String str2) {
        this.token = str;
        this.messageSigner.MediaBrowserCompat$ItemReceiver = str2;
    }

    public String sign(String str) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
        String requestUrl;
        synchronized (this) {
            PartnerConsentActivity partnerConsentActivity = new PartnerConsentActivity(str);
            PartnerLandingAdapter$PartnerTileHolder partnerLandingAdapter$PartnerTileHolder = this.signingStrategy;
            this.signingStrategy = new PartnerLandingAdapter$PartnerHighlightHolder();
            sign((PartnerLandingActivity) partnerConsentActivity);
            this.signingStrategy = partnerLandingAdapter$PartnerTileHolder;
            requestUrl = partnerConsentActivity.getRequestUrl();
        }
        return requestUrl;
    }

    public PartnerLandingActivity sign(Object obj) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
        PartnerLandingActivity sign;
        synchronized (this) {
            sign = sign(wrap(obj));
        }
        return sign;
    }

    public PartnerLandingActivity sign(PartnerLandingActivity partnerLandingActivity) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
        synchronized (this) {
            if (this.consumerKey == null) {
                throw new OAuthExpectationFailedException("consumer key not set");
            } else if (this.consumerSecret != null) {
                onAllowClick onallowclick = new onAllowClick();
                this.requestParameters = onallowclick;
                try {
                    if (this.additionalParameters != null) {
                        onallowclick.IconCompatParcelizer((Map<? extends String, ? extends SortedSet<String>>) this.additionalParameters, false);
                    }
                    collectHeaderParameters(partnerLandingActivity, this.requestParameters);
                    collectQueryParameters(partnerLandingActivity, this.requestParameters);
                    collectBodyParameters(partnerLandingActivity, this.requestParameters);
                    completeOAuthParameters(this.requestParameters);
                    this.requestParameters.MediaBrowserCompat$CustomActionResultReceiver.remove("oauth_signature");
                    String IconCompatParcelizer = this.messageSigner.IconCompatParcelizer(partnerLandingActivity, this.requestParameters);
                    PartnerConsentActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("signature", IconCompatParcelizer);
                    this.signingStrategy.write(IconCompatParcelizer, partnerLandingActivity, this.requestParameters);
                    PartnerConsentActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("Request URL", partnerLandingActivity.getRequestUrl());
                } catch (IOException e) {
                    throw new OAuthCommunicationException(e);
                }
            } else {
                throw new OAuthExpectationFailedException("consumer secret not set");
            }
        }
        return partnerLandingActivity;
    }
}
