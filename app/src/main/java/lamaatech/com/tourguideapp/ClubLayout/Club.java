package lamaatech.com.tourguideapp.ClubLayout;


class Club {
    Integer clubImage;
    String clubName;
    String details;

    Club(Integer clubImage, String clubName, String details) {
        this.clubImage = clubImage;
        this.clubName = clubName;
        this.details = details;
    }

    @Override
    public String toString() {
        return clubName;
    }
}
