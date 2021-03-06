package kr.co.tjeit.facebookcopy.data;

/**
 * Created by user on 2017-08-08.
 */

public class FriendRequestData {

    private String imagePath;
    private int commonFriendsCount;
    private String name;

    public FriendRequestData() {

    }

    public FriendRequestData(String imagePath, int commonFriendsCount, String name) {
        this.imagePath = imagePath;
        this.commonFriendsCount = commonFriendsCount;
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCommonFriendsCount() {
        return commonFriendsCount;
    }

    public void setCommonFriendsCount(int commonFriendsCount) {
        this.commonFriendsCount = commonFriendsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
