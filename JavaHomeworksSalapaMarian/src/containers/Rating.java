/*
 * Class Rating
 */
package containers;

/**
 *
 * @author MMM
 */
class Rating {
    float stars;
    int user_id;
    String description;

    public Rating(float stars, int user_id, String description) {
        this.stars = stars;
        this.user_id = user_id;
        this.description = description;
    }

    public float getStars() {
        return stars;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
