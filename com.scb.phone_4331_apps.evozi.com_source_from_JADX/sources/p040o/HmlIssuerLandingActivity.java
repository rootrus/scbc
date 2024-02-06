package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import p040o.HmlNTBLoanReviewActivity;

/* renamed from: o.HmlIssuerLandingActivity */
public final class HmlIssuerLandingActivity extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public HmlIssuerLandingActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        C6890x2027e421 hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = (C6890x2027e421) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 266);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, 363);
        Class cls2 = Long.TYPE;
        Long valueOf2 = Long.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        validatedagrecurse.read(jsonWriter, 290);
        Class cls3 = Long.TYPE;
        Long valueOf3 = Long.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        validatedagrecurse.read(jsonWriter, 629);
        Class cls4 = Long.TYPE;
        Long valueOf4 = Long.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls4, (Object) valueOf4).write(jsonWriter, valueOf4);
        validatedagrecurse.read(jsonWriter, 141);
        Class cls5 = Long.TYPE;
        Long valueOf5 = Long.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.read);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls5, (Object) valueOf5).write(jsonWriter, valueOf5);
        if (hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver != hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 328);
            HmlNTBLaserIdAboutActivity hmlNTBLaserIdAboutActivity = new HmlNTBLaserIdAboutActivity();
            Map<String, HmlNTBLoanReviewActivity.read> map = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) hmlNTBLaserIdAboutActivity, (Object) map).write(jsonWriter, map);
        }
        if (hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver != hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 556);
            HmlNTBExternalInstructionActivity hmlNTBExternalInstructionActivity = new HmlNTBExternalInstructionActivity();
            Map<String, HmlNTBLoanReviewActivity.read> map2 = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) hmlNTBExternalInstructionActivity, (Object) map2).write(jsonWriter, map2);
        }
        if (hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver != hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 562);
            HmlNTBManageEmailVerificationActivity hmlNTBManageEmailVerificationActivity = new HmlNTBManageEmailVerificationActivity();
            Map<String, String> map3 = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) hmlNTBManageEmailVerificationActivity, (Object) map3).write(jsonWriter, map3);
        }
        validatedagrecurse.read(jsonWriter, 112);
        Class cls6 = Boolean.TYPE;
        Boolean valueOf6 = Boolean.valueOf(hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls6, (Object) valueOf6).write(jsonWriter, valueOf6);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        C6890x2027e421 hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6890x2027e421();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = true;
            boolean z2 = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 50) {
                if (write2 != 250) {
                    if (write2 != 450) {
                        if (write2 != 465) {
                            if (write2 != 593) {
                                if (jsonReader.peek() == JsonToken.NULL) {
                                    z = false;
                                }
                                if (write2 != 4) {
                                    if (write2 != 172) {
                                        if (write2 != 229) {
                                            if (write2 != 617) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = (Map) gson.getAdapter(new HmlNTBLaserIdAboutActivity()).read(jsonReader);
                                            } else {
                                                hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = null;
                                            }
                                        } else if (z) {
                                            hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                                        }
                                    } else if (z) {
                                        hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = (Map) gson.getAdapter(new HmlNTBManageEmailVerificationActivity()).read(jsonReader);
                                    } else {
                                        hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = null;
                                    }
                                } else if (z) {
                                    hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = (Map) gson.getAdapter(new HmlNTBExternalInstructionActivity()).read(jsonReader);
                                } else {
                                    hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = null;
                                }
                                jsonReader.nextNull();
                            } else if (z2) {
                                hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Long.class).read(jsonReader).longValue();
                            }
                        } else if (z2) {
                            hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = gson.getAdapter(Long.class).read(jsonReader).longValue();
                        }
                    } else if (z2) {
                        hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.write = gson.getAdapter(Long.class).read(jsonReader).longValue();
                    }
                } else if (z2) {
                    hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.read = gson.getAdapter(Long.class).read(jsonReader).longValue();
                }
            } else if (z2) {
                hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(Long.class).read(jsonReader).longValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver;
    }
}
