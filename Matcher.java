/**
 * Created by Grant on 10/7/2017.
 */
public class Matcher {
    /* PQ of Profile objects that have at least 1 mutual match to Profile conducting search */
    private ArrayHeap<Profile> matches;

    Matcher(long[] ISBNList) {
        this.matches = new ArrayHeap<>();
    }

    /**
     * Returns a PQ of profiles with at least 1 mutual match to the Profile conducting a search,
     * ordered by the number of books a Profile is offering on the user Profile's want list, and
     * sub-ordered by the absolute value of the difference of the number of books each Profile has
     * for the other.
     * @param profiles - pool of all profiles in the database
     * @param user - profile of user looking for a match
     * @return
     */
    MaxPQ<Profile> findMatches(Profile[] profiles, Profile user) {
        for (Profile profile : profiles) {
            if (profile.equals(user)) {
                continue;
            }
            boolean inserted = false; //indicates whether a profile has already been added to the PQ
            for (long ISBN : profile.getWantList()) {
                if ()
            }
        }

        return
    }
}
