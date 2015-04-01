package com.rmqclustermgr.rest.httpclient.deserializers;

import com.google.gson.*;
import com.rmqclustermgr.rest.mgmt.model.Parameter;
import com.rmqclustermgr.rest.mgmt.model.Parameters;

import java.lang.reflect.Type;

import org.springframework.stereotype.Component;


@Component
public class ParameterDeserializer implements JsonDeserializer<Parameter> {

    static Gson gson = new Gson();

    @Override
    public Parameter deserialize(
            JsonElement jsonElement,
            Type type,
            JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {

        JsonObject obj = jsonElement.getAsJsonObject();

        JsonElement value = obj.get("value");

        if (value.isJsonObject()){

            return gson.fromJson(jsonElement, Parameters.MapParameter.class);
        }

        return gson.fromJson(jsonElement, Parameters.StringParameter.class);
    }
}
