package com.timelesskeeper.additionalweapon.api.data.lang;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import net.minecraft.resources.ResourceLocation;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class LangBuilder {
    private Map<String, String> descriptions;

    public LangBuilder() {
        descriptions = new HashMap<>();
    }

    public LangBuilder description(String name, String description) {
        this.descriptions.put(name, description);
        return this;
    }

    public LangBuilder descriptions(Map<String, String> descriptions) {
        descriptions.forEach((name, description) -> {
            this.descriptions.put(name, description);
        });
        return this;
    }

    public void save(Consumer<FinishedLang> pFinishedLangConsumer, ResourceLocation pRecipeId) {
        pFinishedLangConsumer.accept(new LangBuilder.Result(pRecipeId, this.descriptions));
    }

    public static class Result implements FinishedLang {
        public final ResourceLocation id;
        private Map<String, String> descriptions;

        public Result(ResourceLocation pId, Map<String, String> pDescriptions) {
            this.id = pId;
            this.descriptions = pDescriptions;
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public JsonObject serialize() {
            Gson gson = new Gson();
            Type gsonType = new TypeToken<HashMap>(){}.getType();
            return (JsonObject)gson.toJsonTree(this.descriptions, gsonType);
        }
    }
}
