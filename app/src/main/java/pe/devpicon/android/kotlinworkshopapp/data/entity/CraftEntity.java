package pe.devpicon.android.kotlinworkshopapp.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Armando on 5/5/2017.
 */

public class CraftEntity {
    @SerializedName("name")
    public String name;
    @SerializedName("creator")
    public String creator;
    @SerializedName("quantity")
    public String quantity;
    @SerializedName("state")
    public String state;
    @SerializedName("country")
    public String country;
    @SerializedName("imageUrl")
    public String imageUrl;
    @SerializedName("story")
    public String story;
}
