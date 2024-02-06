package com.thunderhead.android.infrastructure.server.entitys;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p040o.MyECouponActivity_ViewBinding;

public class OptimizationActions {
    public Action[] actions;

    public Action[] getActions() {
        return this.actions;
    }

    public static class Action {
        public Asset asset;
        public String name;
        public Proposition proposition;

        public String getName() {
            return this.name;
        }

        public Asset getAsset() {
            return this.asset;
        }

        public Proposition getProposition() {
            return this.proposition;
        }

        public static class Asset {
            public String content;
            public Content contentObject = null;
            public String contentUrl;
            public String mimeType;
            public Response[] responses;

            @Retention(RetentionPolicy.SOURCE)
            public @interface AssetType {
                public static final int IDENTITY_TRANSFER = 2;
                public static final int NOTIFICATION = 1;
                public static final int UNKNOWN = -1;
            }

            public int type() {
                Content contentObject2 = getContentObject();
                if (contentObject2 == null) {
                    return -1;
                }
                return !TextUtils.isEmpty(contentObject2.getWebOneTagUrl()) ? 2 : 1;
            }

            public String getMimeType() {
                return this.mimeType;
            }

            public String getContent() {
                return this.content;
            }

            public String getContentUrl() {
                return this.contentUrl;
            }

            public Response[] getResponses() {
                return this.responses;
            }

            public int responsesLength() {
                Response[] responseArr = this.responses;
                if (responseArr == null) {
                    return -1;
                }
                return responseArr.length;
            }

            public Content getContentObject() {
                if (this.contentObject == null) {
                    this.contentObject = createContentObject();
                }
                return this.contentObject;
            }

            public Content createContentObject() {
                try {
                    return (Content) new Gson().fromJson(this.content.replace("&quot;", "\""), Content.class);
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    e.printStackTrace();
                    return null;
                }
            }

            public static class Response {
                public String code;
                public String imageUrl;
                public String label;
                public String sentiment;
                public String target;
                public String targetUrl;

                public String getTargetUrl() {
                    return this.targetUrl;
                }

                public String getImageUrl() {
                    return this.imageUrl;
                }

                public String getTarget() {
                    return this.target;
                }

                public String getCode() {
                    return this.code;
                }

                public String getSentiment() {
                    return this.sentiment;
                }

                public String getLabel() {
                    return this.label;
                }
            }
        }

        public static class Proposition {
            public String code;

            public String getCode() {
                return this.code;
            }
        }
    }
}
