package p040o;

/* renamed from: o.loadRotate */
final class loadRotate extends Long4 {
    private final Integer IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String read;
    private final String write;

    /* renamed from: o.loadRotate$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends Long4$MediaBrowserCompat$ItemReceiver {
        private String IconCompatParcelizer;
        private Integer MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        private String MediaBrowserCompat$SearchResultReceiver;
        private String RatingCompat;
        private String read;
        private String write;

        public final Long4$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(Integer num) {
            this.MediaBrowserCompat$CustomActionResultReceiver = num;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(String str) {
            this.read = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat(String str) {
            this.write = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver RatingCompat(String str) {
            this.MediaBrowserCompat$MediaItem = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver read(String str) {
            this.MediaBrowserCompat$SearchResultReceiver = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver write(String str) {
            this.RatingCompat = str;
            return this;
        }

        public final Long4$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public final Long4 read() {
            return new loadRotate(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$MediaItem, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* synthetic */ loadRotate(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.MediaMetadataCompat = str5;
        this.MediaDescriptionCompat = str6;
        this.RatingCompat = str7;
    }

    public final String IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.MediaMetadataCompat;
    }

    public final Integer MediaBrowserCompat$SearchResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final String MediaMetadataCompat() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Long4)) {
            return false;
        }
        Integer num = this.IconCompatParcelizer;
        if (num != null ? num.equals(((loadRotate) obj).IconCompatParcelizer) : ((loadRotate) obj).IconCompatParcelizer == null) {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null ? str.equals(((loadRotate) obj).MediaBrowserCompat$CustomActionResultReceiver) : ((loadRotate) obj).MediaBrowserCompat$CustomActionResultReceiver == null) {
                String str2 = this.read;
                if (str2 != null ? str2.equals(((loadRotate) obj).read) : ((loadRotate) obj).read == null) {
                    String str3 = this.MediaBrowserCompat$ItemReceiver;
                    if (str3 != null ? str3.equals(((loadRotate) obj).MediaBrowserCompat$ItemReceiver) : ((loadRotate) obj).MediaBrowserCompat$ItemReceiver == null) {
                        String str4 = this.write;
                        if (str4 != null ? str4.equals(((loadRotate) obj).write) : ((loadRotate) obj).write == null) {
                            String str5 = this.MediaMetadataCompat;
                            if (str5 != null ? str5.equals(((loadRotate) obj).MediaMetadataCompat) : ((loadRotate) obj).MediaMetadataCompat == null) {
                                String str6 = this.MediaDescriptionCompat;
                                if (str6 != null ? str6.equals(((loadRotate) obj).MediaDescriptionCompat) : ((loadRotate) obj).MediaDescriptionCompat == null) {
                                    String str7 = this.RatingCompat;
                                    if (str7 == null) {
                                        if (((loadRotate) obj).RatingCompat == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(((loadRotate) obj).RatingCompat)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.MediaMetadataCompat;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.MediaDescriptionCompat;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i;
    }

    public final String read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidClientInfo{sdkVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", model=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hardware=");
        sb.append(this.read);
        sb.append(", device=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", product=");
        sb.append(this.write);
        sb.append(", osBuild=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", manufacturer=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fingerprint=");
        sb.append(this.RatingCompat);
        sb.append("}");
        return sb.toString();
    }

    public final String write() {
        return this.read;
    }
}
