package me.koba1.wynntilsapi;

import org.json.JSONObject;

public class Wynntils {

    public static JSONObject getGatheringSpots() {
        return request.get("gatheringSpots");
    }

    public static JSONObject getIngredientList() {
        return request.get("ingredientList");
    }

    public static JSONObject getItemList() {
        return request.get("itemList");
    }

    public static JSONObject getLeaderboard() {
        return request.get("leaderboard");
    }

    public static JSONObject getMapLocations() {
        return request.get("mapLocations");
    }

    public static JSONObject getServerList() {
        return request.get("serverList");
    }
    public static JSONObject getTerritoryList() {
        return request.get("territoryList");
    }
}


